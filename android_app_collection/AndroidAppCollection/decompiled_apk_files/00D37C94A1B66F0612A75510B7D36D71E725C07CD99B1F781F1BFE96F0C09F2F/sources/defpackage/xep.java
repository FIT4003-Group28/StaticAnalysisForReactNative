package defpackage;
/* compiled from: PG */
/* renamed from: xep  reason: default package */
/* loaded from: classes4.dex */
public final class xep implements aasq {
    private final azqb a;

    public xep(azqb azqbVar) {
        azqbVar.getClass();
        this.a = azqbVar;
    }

    @Override // defpackage.aasq
    public final void a(aasr aasrVar) {
        wwz wwzVar = (wwz) this.a.get();
        aasrVar.A = aasr.g(wwzVar.a.b());
        aasrVar.w = wwzVar.a();
        aasrVar.y = wwzVar.b.a();
        aikh aikhVar = wwzVar.i;
        aiji aijiVar = wwzVar.f;
        synchronized (aikhVar) {
            aasrVar.z = aikhVar.a();
            aijiVar.d();
            aasrVar.x = aijiVar.d().d().i;
        }
        zah zahVar = wwzVar.e;
        if (zahVar != null) {
            aasrVar.v = zahVar.a();
        }
    }
}
