import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[setmycolor]'
})
export class SetmycolorDirective {

  @Input('setmycolor') myfcolor:String;
  @Input('setmyscolor') myscolor:String;

  constructor(private element:ElementRef) {
    element.nativeElement.style.color = 'red';
  }

  @HostListener('mouseenter') setColorOnMouseEnter(){
    this.setMyColor(this.myfcolor);
  }

  @HostListener('mouseleave') setColorOnMouseLeave(){
      this.setMyColor(this.myscolor);
  }

  private setMyColor(mycolor:String){
    this.element.nativeElement.style.color = mycolor;
  }
}
