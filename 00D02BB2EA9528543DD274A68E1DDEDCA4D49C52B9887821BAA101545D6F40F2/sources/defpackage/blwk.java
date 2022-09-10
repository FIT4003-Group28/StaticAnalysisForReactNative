package defpackage;
/* compiled from: PG */
/* renamed from: blwk  reason: default package */
/* loaded from: classes3.dex */
public class blwk {
    private final dzsj<bvfv> a;
    private final dzsj<cjqy> b;
    private final dzsj<cqat> c;
    private final dzsj<bvjj> d;

    public blwk(dzsj<bvfv> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<bvjj> dzsjVar4) {
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

    public final blwj a(String str) {
        bvfv a = this.a.a();
        b(a, 1);
        cjqy a2 = this.b.a();
        b(a2, 2);
        cqat a3 = this.c.a();
        b(a3, 3);
        b(this.d.a(), 4);
        b(str, 5);
        return new blwj(a, a2, a3, str);
    }
}
