package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: xc  reason: default package */
/* loaded from: classes4.dex */
final class xc extends xd {
    public xc(xw xwVar) {
        super(xwVar);
    }

    @Override // defpackage.xd
    public final int a(View view) {
        return xw.bw(view) + ((xx) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.xd
    public final int b(View view) {
        xx xxVar = (xx) view.getLayoutParams();
        return xw.bj(view) + xxVar.topMargin + xxVar.bottomMargin;
    }

    @Override // defpackage.xd
    public final int c(View view) {
        xx xxVar = (xx) view.getLayoutParams();
        return xw.bk(view) + xxVar.leftMargin + xxVar.rightMargin;
    }

    @Override // defpackage.xd
    public final int d(View view) {
        return xw.bz(view) - ((xx) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.xd
    public final int e() {
        return this.a.I;
    }

    @Override // defpackage.xd
    public final int f() {
        xw xwVar = this.a;
        return xwVar.I - xwVar.getPaddingBottom();
    }

    @Override // defpackage.xd
    public final int g() {
        return this.a.getPaddingBottom();
    }

    @Override // defpackage.xd
    public final int h() {
        return this.a.G;
    }

    @Override // defpackage.xd
    public final int i() {
        return this.a.F;
    }

    @Override // defpackage.xd
    public final int j() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.xd
    public final int k() {
        xw xwVar = this.a;
        return (xwVar.I - xwVar.getPaddingTop()) - this.a.getPaddingBottom();
    }

    @Override // defpackage.xd
    public final int l(View view) {
        this.a.bp(view, this.c);
        return this.c.bottom;
    }

    @Override // defpackage.xd
    public final int m(View view) {
        this.a.bp(view, this.c);
        return this.c.top;
    }

    @Override // defpackage.xd
    public final void n(int i) {
        this.a.aL(i);
    }
}
