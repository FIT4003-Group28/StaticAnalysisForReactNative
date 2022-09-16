package defpackage;
/* compiled from: PG */
/* renamed from: bljr  reason: default package */
/* loaded from: classes3.dex */
public class bljr {
    private final dzsj<blji> a;
    private final dzsj<bljt> b;
    private final dzsj<bljv> c;
    private final dzsj<btvo> d;

    public bljr(dzsj<blji> dzsjVar, dzsj<bljt> dzsjVar2, dzsj<bljv> dzsjVar3, dzsj<btvo> dzsjVar4) {
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

    public final bljq a(int i) {
        blji a = this.a.a();
        b(a, 1);
        bljt a2 = this.b.a();
        b(a2, 2);
        bljv a3 = this.c.a();
        b(a3, 3);
        btvo a4 = this.d.a();
        b(a4, 4);
        return new bljq(a, a2, a3, a4, i);
    }
}
