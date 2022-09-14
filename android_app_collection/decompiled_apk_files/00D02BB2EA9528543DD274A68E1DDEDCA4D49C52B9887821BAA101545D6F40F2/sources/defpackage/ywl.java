package defpackage;
/* renamed from: ywl  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ywl implements dbsl {
    static final dbsl a = new ywl();

    private ywl() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dood doodVar = (dood) obj;
        if (doodVar == null || doodVar.b != 1) {
            return false;
        }
        dooa dooaVar = (dooa) doodVar.c;
        if ((dooaVar.a & 2) == 0) {
            return false;
        }
        dgaw dgawVar = dooaVar.c;
        if (dgawVar == null) {
            dgawVar = dgaw.g;
        }
        return (dgawVar.a & 1) != 0;
    }
}
