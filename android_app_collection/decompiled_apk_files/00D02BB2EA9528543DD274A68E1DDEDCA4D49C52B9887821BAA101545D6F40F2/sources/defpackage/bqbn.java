package defpackage;
/* compiled from: PG */
/* renamed from: bqbn  reason: default package */
/* loaded from: classes4.dex */
public final class bqbn {
    public final dzsj<bpyk> a;
    public final dzsj<bnyd> b;
    public final dzsj<ff> c;
    public final dzsj<jmx> d;
    public final dzsj<eeu> e;
    public final dzsj<bptg> f;
    public final dzsj<bpto> g;
    public final dzsj<booa> h;

    public bqbn(dzsj<bpyk> dzsjVar, dzsj<bnyd> dzsjVar2, dzsj<ff> dzsjVar3, dzsj<jmx> dzsjVar4, dzsj<eeu> dzsjVar5, dzsj<bptg> dzsjVar6, dzsj<bpto> dzsjVar7, dzsj<booa> dzsjVar8) {
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
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
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
