package defpackage;

import android.content.SharedPreferences;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fmz  reason: default package */
/* loaded from: classes3.dex */
public final class fmz implements akev {
    final /* synthetic */ awaj a;
    final /* synthetic */ atoo b;
    final /* synthetic */ fna c;

    public fmz(fna fnaVar, awaj awajVar, atoo atooVar) {
        this.c = fnaVar;
        this.a = awajVar;
        this.b = atooVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfi akfiVar = (akfi) obj;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfi akfiVar = (akfi) obj;
        this.c.b.u(new acte(this.a.d), null);
        this.c.b.u(new acte(this.b.e), null);
        fna fnaVar = this.c;
        SharedPreferences.Editor edit = fnaVar.d.edit();
        edit.putLong(ymf.VIDEO_QUALITY_PROMO_LAST_DISPLAYED, fnaVar.c.c());
        edit.apply();
    }
}
