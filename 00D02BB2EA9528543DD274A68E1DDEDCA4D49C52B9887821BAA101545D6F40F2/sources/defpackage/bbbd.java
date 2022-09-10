package defpackage;
/* compiled from: PG */
/* renamed from: bbbd  reason: default package */
/* loaded from: classes3.dex */
public final class bbbd {
    private final dzsj<gga> a;
    private final dzsj<cklf> b;
    private final dzsj<bzqa> c;

    public bbbd(dzsj<gga> dzsjVar, dzsj<cklf> dzsjVar2, dzsj<bzqa> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bbbc a(boolean z, boolean z2, boolean z3) {
        gga a = this.a.a();
        b(a, 1);
        cklf a2 = this.b.a();
        b(a2, 2);
        bzqa a3 = this.c.a();
        b(a3, 3);
        return new bbbc(a, a2, a3, z, z2, z3);
    }
}
