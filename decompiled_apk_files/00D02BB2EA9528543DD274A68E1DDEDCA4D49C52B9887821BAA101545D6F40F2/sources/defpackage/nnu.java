package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: nnu  reason: default package */
/* loaded from: classes7.dex */
final class nnu implements btzi<dwnn, dwnp> {
    final /* synthetic */ nnw a;

    public nnu(nnw nnwVar) {
        this.a = nnwVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwnn> btzrVar, btzy btzyVar) {
        c(null, btzyVar.p);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwnn> btzrVar, dwnp dwnpVar) {
        c(dwnpVar, null);
    }

    private final void c(@dzsi dwnp dwnpVar, @dzsi bttq bttqVar) {
        if (bttqVar != null || dwnpVar == null) {
            this.a.d.k();
        } else if (dwnpVar.a.size() > 0) {
            dwnl dwnlVar = dwnpVar.a.get(0);
            if (dwnlVar.b != this.a.c.a.a()) {
                long j = dwnlVar.b;
                return;
            } else {
                this.a.m(dwnlVar.l);
                this.a.d.j(dwnlVar.h);
            }
        } else {
            nnw nnwVar = this.a;
            nnwVar.d.i(nnwVar.a.d.getString(R.string.TRAFFIC_INCIDENT_CLEARED_UP));
            this.a.d.j("");
        }
        this.a.k();
    }
}
