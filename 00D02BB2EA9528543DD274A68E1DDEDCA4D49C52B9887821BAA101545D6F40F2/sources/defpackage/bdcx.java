package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdcx  reason: default package */
/* loaded from: classes3.dex */
public final class bdcx implements bwrr<ilo> {
    final /* synthetic */ bdcy a;

    public bdcx(bdcy bdcyVar) {
        this.a = bdcyVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        bdcy bdcyVar = this.a;
        ilo c = bdcyVar.d.c();
        if (c != null && c.q && c.r) {
            ily g = c.g();
            g.t = bdcyVar.a.getString(R.string.UNRESOLVED_REVERSE_GEOCODE_OVERRIDE);
            g.n = false;
            bdcyVar.d.d(g.d());
        }
        bdcyVar.QR(bdcyVar.d);
        cqkx.p(bdcyVar);
    }
}
