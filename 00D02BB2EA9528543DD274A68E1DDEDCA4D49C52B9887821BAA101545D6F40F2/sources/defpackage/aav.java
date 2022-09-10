package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aav  reason: default package */
/* loaded from: classes.dex */
final class aav extends aax {
    public aav(abs absVar) {
        super(absVar);
    }

    @Override // defpackage.aax
    public final int a() {
        abs absVar = this.a;
        return absVar.D - absVar.getPaddingRight();
    }

    @Override // defpackage.aax
    public final int b() {
        return this.a.D;
    }

    @Override // defpackage.aax
    public final void c(int i) {
        this.a.aO(i);
    }

    @Override // defpackage.aax
    public final int d() {
        return this.a.getPaddingLeft();
    }

    @Override // defpackage.aax
    public final int e(View view) {
        abt abtVar = (abt) view.getLayoutParams();
        return abs.bk(view) + abtVar.leftMargin + abtVar.rightMargin;
    }

    @Override // defpackage.aax
    public final int f(View view) {
        abt abtVar = (abt) view.getLayoutParams();
        return abs.bj(view) + abtVar.topMargin + abtVar.bottomMargin;
    }

    @Override // defpackage.aax
    public final int g(View view) {
        return abs.bC(view) + ((abt) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.aax
    public final int h(View view) {
        return abs.bB(view) - ((abt) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.aax
    public final int i(View view) {
        this.a.bp(view, this.c);
        return this.c.right;
    }

    @Override // defpackage.aax
    public final int j(View view) {
        this.a.bp(view, this.c);
        return this.c.left;
    }

    @Override // defpackage.aax
    public final int k() {
        abs absVar = this.a;
        return (absVar.D - absVar.getPaddingLeft()) - this.a.getPaddingRight();
    }

    @Override // defpackage.aax
    public final void l(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    @Override // defpackage.aax
    public final int m() {
        return this.a.getPaddingRight();
    }

    @Override // defpackage.aax
    public final int n() {
        return this.a.B;
    }

    @Override // defpackage.aax
    public final int o() {
        return this.a.C;
    }
}
