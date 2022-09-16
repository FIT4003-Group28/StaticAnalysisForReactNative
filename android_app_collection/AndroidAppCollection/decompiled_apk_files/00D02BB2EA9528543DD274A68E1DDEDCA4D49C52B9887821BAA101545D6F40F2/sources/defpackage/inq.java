package defpackage;
/* compiled from: PG */
/* renamed from: inq  reason: default package */
/* loaded from: classes6.dex */
public final class inq {
    private final dzsj<akox> a;
    private final dzsj<cjqy> b;

    public inq(dzsj<akox> dzsjVar, dzsj<cjqy> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final inp a(ink inkVar, ddho ddhoVar) {
        akox a = this.a.a();
        b(a, 1);
        cjqy a2 = this.b.a();
        b(a2, 2);
        b(inkVar, 3);
        b(ddhoVar, 4);
        return new inp(a, a2, inkVar, ddhoVar);
    }
}
