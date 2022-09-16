package defpackage;

import android.util.DisplayMetrics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayeh  reason: default package */
/* loaded from: classes3.dex */
public final class ayeh implements dbty<Integer> {
    final /* synthetic */ ayen a;

    public ayeh(ayen ayenVar) {
        this.a = ayenVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ Integer a() {
        int i;
        if (this.a.aT()) {
            ayen ayenVar = this.a;
            if (ayenVar.aD) {
                DisplayMetrics displayMetrics = ayenVar.Rn().getDisplayMetrics();
                i = Math.round(displayMetrics.heightPixels - ((true != btpf.c(this.a.a).f ? 230 : 155) * displayMetrics.density));
                return Integer.valueOf(i);
            }
        }
        i = 0;
        return Integer.valueOf(i);
    }
}
