package defpackage;
/* compiled from: PG */
/* renamed from: brpw  reason: default package */
/* loaded from: classes4.dex */
public final class brpw {
    public final dxio<brpq<dwiv, brps>> a;
    private final ckcw b;

    public brpw(dxio<brpq<dwiv, brps>> dxioVar, ckcw ckcwVar) {
        this.a = dxioVar;
        this.b = ckcwVar;
    }

    public static boolean b(brps brpsVar) {
        djmy djmyVar = brpsVar.a.b().K;
        if (djmyVar == null) {
            djmyVar = djmy.e;
        }
        djnk djnkVar = djmyVar.b;
        if (djnkVar == null) {
            djnkVar = djnk.f;
        }
        return djnkVar.c.isEmpty();
    }

    public final void a(ckha ckhaVar, long j) {
        ((ckcp) this.b.a(ckhaVar)).a(j);
    }
}
