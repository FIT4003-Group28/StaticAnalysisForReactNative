package defpackage;
/* compiled from: PG */
/* renamed from: axyr  reason: default package */
/* loaded from: classes3.dex */
public final class axyr {
    private final dzsj<gga> a;
    private final dzsj<bwqv> b;
    private final dzsj<fd> c;

    public axyr(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<fd> dzsjVar3) {
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

    public final axyq a(@dzsi baad baadVar, cjtd cjtdVar) {
        gga a = this.a.a();
        b(a, 1);
        bwqv a2 = this.b.a();
        b(a2, 2);
        fd fdVar = (fd) ((dxjd) this.c).a;
        b(fdVar, 3);
        b(cjtdVar, 6);
        return new axyq(a, a2, fdVar, baadVar, cjtdVar);
    }
}
