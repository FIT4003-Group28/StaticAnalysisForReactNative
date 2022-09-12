package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abq  reason: default package */
/* loaded from: classes.dex */
public final class abq implements afh {
    final /* synthetic */ abs a;

    public abq(abs absVar) {
        this.a = absVar;
    }

    @Override // defpackage.afh
    public final View a(int i) {
        return this.a.aK(i);
    }

    @Override // defpackage.afh
    public final int b() {
        return this.a.getPaddingLeft();
    }

    @Override // defpackage.afh
    public final int c() {
        abs absVar = this.a;
        return absVar.D - absVar.getPaddingRight();
    }

    @Override // defpackage.afh
    public final int d(View view) {
        return abs.bB(view) - ((abt) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.afh
    public final int e(View view) {
        return abs.bC(view) + ((abt) view.getLayoutParams()).rightMargin;
    }
}
