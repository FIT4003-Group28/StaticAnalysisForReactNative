package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: xb  reason: default package */
/* loaded from: classes4.dex */
final class xb extends xd {
    public xb(xw xwVar) {
        super(xwVar);
    }

    @Override // defpackage.xd
    public final int a(View view) {
        return xw.by(view) + ((xx) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.xd
    public final int b(View view) {
        xx xxVar = (xx) view.getLayoutParams();
        return xw.bk(view) + xxVar.leftMargin + xxVar.rightMargin;
    }

    @Override // defpackage.xd
    public final int c(View view) {
        xx xxVar = (xx) view.getLayoutParams();
        return xw.bj(view) + xxVar.topMargin + xxVar.bottomMargin;
    }

    @Override // defpackage.xd
    public final int d(View view) {
        return xw.bx(view) - ((xx) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.xd
    public final int e() {
        return this.a.H;
    }

    @Override // defpackage.xd
    public final int f() {
        xw xwVar = this.a;
        return xwVar.H - xwVar.getPaddingRight();
    }

    @Override // defpackage.xd
    public final int g() {
        return this.a.getPaddingRight();
    }

    @Override // defpackage.xd
    public final int h() {
        return this.a.F;
    }

    @Override // defpackage.xd
    public final int i() {
        return this.a.G;
    }

    @Override // defpackage.xd
    public final int j() {
        return this.a.getPaddingLeft();
    }

    @Override // defpackage.xd
    public final int k() {
        xw xwVar = this.a;
        return (xwVar.H - xwVar.getPaddingLeft()) - this.a.getPaddingRight();
    }

    @Override // defpackage.xd
    public final int l(View view) {
        this.a.bp(view, this.c);
        return this.c.right;
    }

    @Override // defpackage.xd
    public final int m(View view) {
        this.a.bp(view, this.c);
        return this.c.left;
    }

    @Override // defpackage.xd
    public final void n(int i) {
        this.a.aK(i);
    }
}
