package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xu  reason: default package */
/* loaded from: classes4.dex */
public final class xu implements aar {
    final /* synthetic */ xw a;
    private final /* synthetic */ int b;

    public xu(xw xwVar) {
        this.a = xwVar;
    }

    public xu(xw xwVar, int i) {
        this.b = i;
        this.a = xwVar;
    }

    @Override // defpackage.aar
    public final int c() {
        int i;
        int paddingBottom;
        if (this.b == 0) {
            xw xwVar = this.a;
            i = xwVar.I;
            paddingBottom = xwVar.getPaddingBottom();
        } else {
            xw xwVar2 = this.a;
            i = xwVar2.H;
            paddingBottom = xwVar2.getPaddingRight();
        }
        return i - paddingBottom;
    }

    @Override // defpackage.aar
    public final int d() {
        if (this.b == 0) {
            return this.a.getPaddingTop();
        }
        return this.a.getPaddingLeft();
    }

    @Override // defpackage.aar
    public final View e(int i) {
        if (this.b == 0) {
            return this.a.az(i);
        }
        return this.a.az(i);
    }

    @Override // defpackage.aar
    public final int a(View view) {
        int bw;
        int i;
        if (this.b == 0) {
            bw = xw.bw(view);
            i = ((xx) view.getLayoutParams()).bottomMargin;
        } else {
            bw = xw.by(view);
            i = ((xx) view.getLayoutParams()).rightMargin;
        }
        return bw + i;
    }

    @Override // defpackage.aar
    public final int b(View view) {
        int bz;
        int i;
        if (this.b == 0) {
            bz = xw.bz(view);
            i = ((xx) view.getLayoutParams()).topMargin;
        } else {
            bz = xw.bx(view);
            i = ((xx) view.getLayoutParams()).leftMargin;
        }
        return bz - i;
    }
}
