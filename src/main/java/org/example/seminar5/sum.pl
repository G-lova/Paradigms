sum_list([], 0).
sum_list([X|Xs], Sum) :-
    sum_list(Xs, Rest),
    Sum is X + Rest.
?- sum_list([5,2,7,4,5], Sum).
