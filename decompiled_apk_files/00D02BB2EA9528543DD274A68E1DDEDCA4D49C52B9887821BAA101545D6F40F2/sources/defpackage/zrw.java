package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zrw  reason: default package */
/* loaded from: classes7.dex */
public final class zrw implements vtk {
    final /* synthetic */ zry a;

    public zrw(zry zryVar) {
        this.a = zryVar;
    }

    @Override // defpackage.vtk
    public final void a(cqtd cqtdVar) {
        zry zryVar = this.a;
        zryVar.a = cqtdVar;
        cqkx.p(zryVar);
        zrx zrxVar = this.a.b;
        if (zrxVar != null) {
            atse atseVar = (atse) zrxVar;
            atsh atshVar = atseVar.c;
            atshVar.q = atshVar.f(atseVar.a, atseVar.b);
            cqkx.p(atseVar.c);
        }
    }
}
