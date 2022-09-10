package defpackage;
/* compiled from: PG */
/* renamed from: cazl  reason: default package */
/* loaded from: classes4.dex */
public class cazl {
    public final dzsj<cqkj> a;
    public final dzsj<cayn> b;
    public final dzsj<cbbc> c;
    public final dzsj<cqhn> d;
    public final dzsj<cbdi> e;
    public final dzsj<cbqd> f;

    public cazl(dzsj<cqkj> dzsjVar, dzsj<cayn> dzsjVar2, dzsj<cbbc> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<cbdi> dzsjVar5, dzsj<cbqd> dzsjVar6) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
