package defpackage;
/* compiled from: PG */
/* renamed from: bgeg  reason: default package */
/* loaded from: classes3.dex */
public final class bgeg {
    public final dzsj<btpc> a;
    public final dzsj<buqn> b;
    public final dzsj<avnt> c;
    public final dzsj<cqat> d;
    public final dzsj<bvrb> e;
    public final dzsj<ckmp> f;
    public final dzsj<btvo> g;

    public bgeg(dzsj<btpc> dzsjVar, dzsj<buqn> dzsjVar2, dzsj<avnt> dzsjVar3, dzsj<cqat> dzsjVar4, dzsj<bvrb> dzsjVar5, dzsj<ckmp> dzsjVar6, dzsj<btvo> dzsjVar7) {
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
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
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