package defpackage;
/* compiled from: PG */
/* renamed from: adjm  reason: default package */
/* loaded from: classes.dex */
public final class adjm {
    private final dzsj<abfa> a;
    private final dzsj<acyr> b;
    private final dzsj<adjs> c;

    public adjm(dzsj<abfa> dzsjVar, dzsj<acyr> dzsjVar2, dzsj<adjs> dzsjVar3) {
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

    public final adjl a(@dzsi awvv<dviz> awvvVar, @dzsi awvv<dviz> awvvVar2, absg absgVar) {
        b(this.a.a(), 1);
        acyr a = this.b.a();
        b(a, 2);
        adjs a2 = this.c.a();
        b(a2, 3);
        b(absgVar, 6);
        return new adjl(a, a2, awvvVar, awvvVar2, absgVar);
    }
}
