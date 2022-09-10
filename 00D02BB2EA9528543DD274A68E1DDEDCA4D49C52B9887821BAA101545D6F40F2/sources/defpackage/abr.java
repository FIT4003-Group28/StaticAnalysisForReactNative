package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abr  reason: default package */
/* loaded from: classes.dex */
public final class abr implements afh {
    final /* synthetic */ abs a;

    public abr(abs absVar) {
        this.a = absVar;
    }

    @Override // defpackage.afh
    public final View a(int i) {
        return this.a.aK(i);
    }

    @Override // defpackage.afh
    public final int b() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.afh
    public final int c() {
        abs absVar = this.a;
        return absVar.E - absVar.getPaddingBottom();
    }

    @Override // defpackage.afh
    public final int d(View view) {
        return abs.bD(view) - ((abt) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.afh
    public final int e(View view) {
        return abs.bA(view) + ((abt) view.getLayoutParams()).bottomMargin;
    }
}
