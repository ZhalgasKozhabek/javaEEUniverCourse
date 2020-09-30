<style>

@media (max-width: 768px) {
.carousel-inner .carousel-item > div {
display: none;
}
.carousel-inner .carousel-item > div:first-child {
display: block;
}
}

.carousel-inner .carousel-item.active,
.carousel-inner .carousel-item-next,
.carousel-inner .carousel-item-prev {
display: flex;
}

/* display 3 */
@media (min-width: 768px) {

.carousel-inner .carousel-item-right.active,
.carousel-inner .carousel-item-next {
transform: translateX(33.333%);
}

.carousel-inner .carousel-item-left.active,
.carousel-inner .carousel-item-prev {
transform: translateX(-33.333%);
}
}

.carousel-inner .carousel-item-right,
.carousel-inner .carousel-item-left{
transform: translateX(0);
}

</style>
