//quickSort Sorting Algorithm

const array = [8, 2, 5, 3, 9, 4, 7, 6, 1];

console.log(array); //[8, 2, 5, 3, 9, 4, 7, 6, 1]

const quickSort = (array, start, end) => {

    if(end <= start) return;//base case

    const pivot = partition(array, start, end);

    //recursion case
    quickSort(array, start, pivot - 1);
    quickSort(array, pivot + 1, end);

}

function partition(array, start, end) {

    const pivot = array[end];
    let i = start -1;

    for(let j = start; j <= end -1; j++){
        if(array[j] < pivot){
            i++;
            let temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    //now to settle pivot
    i++;
    let temp = array[i];
    array[i] = array[end];
    array[end] = temp;

    return i;
}

quickSort(array, 0, array.length-1)
console.log(array);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
