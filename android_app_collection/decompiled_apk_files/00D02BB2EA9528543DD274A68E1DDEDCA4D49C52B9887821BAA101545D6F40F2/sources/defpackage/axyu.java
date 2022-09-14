package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axyu  reason: default package */
/* loaded from: classes3.dex */
public final class axyu implements degu<List<dpre>> {
    final /* synthetic */ axyx a;
    final /* synthetic */ dpov b;
    final /* synthetic */ axyz c;

    public axyu(axyz axyzVar, axyx axyxVar, dpov dpovVar) {
        this.c = axyzVar;
        this.a = axyxVar;
        this.b = dpovVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof btpk) {
            btpk btpkVar = (btpk) th;
            if (btpkVar.a != dqhy.NOT_FOUND && btpkVar.a != dqhy.PERMISSION_DENIED) {
                return;
            }
            final axyx d = this.c.d(this.b);
            d.b(new bvqg(d) { // from class: axyt
                private final axyx a;

                {
                    this.a = d;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    axyx axyxVar = this.a;
                    axyy axyyVar = (axyy) obj;
                    axyyVar.b();
                    axyxVar.d(axyyVar);
                }
            });
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<dpre> list) {
        this.a.a(list);
    }
}
