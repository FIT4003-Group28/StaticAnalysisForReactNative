package defpackage;
/* compiled from: PG */
/* renamed from: aniz  reason: default package */
/* loaded from: classes2.dex */
public class aniz {
    private final dzsj<cjyb> a;
    private final dzsj<aniv> b;
    private final dzsj<anix> c;
    private final dzsj<cjqy> d;

    public aniz(dzsj<cjyb> dzsjVar, dzsj<aniv> dzsjVar2, dzsj<anix> dzsjVar3, dzsj<cjqy> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final aniy a(anis anisVar, anit anitVar) {
        b(anisVar, 1);
        b(anitVar, 2);
        cjyb a = this.a.a();
        b(a, 3);
        aniv a2 = this.b.a();
        b(a2, 4);
        anix a3 = this.c.a();
        b(a3, 5);
        cjqy a4 = this.d.a();
        b(a4, 6);
        return new aniy(anisVar, anitVar, a, a2, a3, a4);
    }
}
