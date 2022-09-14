package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aaw  reason: default package */
/* loaded from: classes.dex */
final class aaw extends aax {
    public aaw(abs absVar) {
        super(absVar);
    }

    @Override // defpackage.aax
    public final int a() {
        abs absVar = this.a;
        return absVar.E - absVar.getPaddingBottom();
    }

    @Override // defpackage.aax
    public final int b() {
        return this.a.E;
    }

    @Override // defpackage.aax
    public final void c(int i) {
        this.a.aP(i);
    }

    @Override // defpackage.aax
    public final int d() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.aax
    public final int e(View view) {
        abt abtVar = (abt) view.getLayoutParams();
        return abs.bj(view) + abtVar.topMargin + abtVar.bottomMargin;
    }

    @Override // defpackage.aax
    public final int f(View view) {
        abt abtVar = (abt) view.getLayoutParams();
        return abs.bk(view) + abtVar.leftMargin + abtVar.rightMargin;
    }

    @Override // defpackage.aax
    public final int g(View view) {
        return abs.bA(view) + ((abt) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.aax
    public final int h(View view) {
        return abs.bD(view) - ((abt) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.aax
    public final int i(View view) {
        this.a.bp(view, this.c);
        return this.c.bottom;
    }

    @Override // defpackage.aax
    public final int j(View view) {
        this.a.bp(view, this.c);
        return this.c.top;
    }

    @Override // defpackage.aax
    public final int k() {
        abs absVar = this.a;
        return (absVar.E - absVar.getPaddingTop()) - this.a.getPaddingBottom();
    }

    @Override // defpackage.aax
    public final void l(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    @Override // defpackage.aax
    public final int m() {
        return this.a.getPaddingBottom();
    }

    @Override // defpackage.aax
    public final int n() {
        return this.a.C;
    }

    @Override // defpackage.aax
    public final int o() {
        return this.a.B;
    }
}
