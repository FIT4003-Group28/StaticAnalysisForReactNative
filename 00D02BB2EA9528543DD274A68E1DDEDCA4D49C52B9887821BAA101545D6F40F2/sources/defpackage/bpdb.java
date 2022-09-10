package defpackage;

import com.google.android.apps.gmm.majorevents.api.MajorEvent;
/* compiled from: PG */
/* renamed from: bpdb  reason: default package */
/* loaded from: classes3.dex */
final class bpdb implements degu<awwb> {
    final /* synthetic */ bpdc a;

    public bpdb(bpdc bpdcVar) {
        this.a = bpdcVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(awwb awwbVar) {
        dvhs dvhsVar;
        int a;
        awwb awwbVar2 = awwbVar;
        if (this.a.aD && (dvhsVar = (dvhs) awwbVar2.a(awvv.e).f()) != null && (a = drbt.a(dvhsVar.c)) != 0 && a == 2) {
            dccx F = dcdc.F();
            ditt c = this.a.b.c();
            if (c != null && this.a.i()) {
                F.g(akgc.b(c));
            }
            String str = c != null ? c.c : "";
            for (ditt dittVar : dvhsVar.b) {
                MajorEvent c2 = this.a.ag.a().c(dittVar.c);
                if (c2 != null && (c == null || !dittVar.c.equals(str))) {
                    F.g(c2);
                }
            }
            bpdc bpdcVar = this.a;
            dcdc<MajorEvent> f = F.f();
            bpvu d = bpdcVar.a.b().d(boxc.EVENT);
            if (f == null || f.size() <= 0 || d == null) {
                return;
            }
            d.d(f, bpdcVar.i());
        }
    }
}
