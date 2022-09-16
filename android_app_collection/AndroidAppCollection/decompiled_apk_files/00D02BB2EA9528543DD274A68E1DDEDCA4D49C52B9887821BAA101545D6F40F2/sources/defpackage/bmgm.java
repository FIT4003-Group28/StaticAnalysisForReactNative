package defpackage;
/* compiled from: PG */
/* renamed from: bmgm  reason: default package */
/* loaded from: classes3.dex */
public final class bmgm {
    public final dzsj<bmgw> a;
    public final dzsj<bmfg> b;
    public final dzsj<gga> c;
    public final dzsj<ckmc> d;
    public final dzsj<afha> e;
    public final dzsj<cqhn> f;
    public final dzsj<bvrb> g;

    public bmgm(dzsj<bmgw> dzsjVar, dzsj<bmfg> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<ckmc> dzsjVar4, dzsj<afha> dzsjVar5, dzsj<cqhn> dzsjVar6, dzsj<bvrb> dzsjVar7) {
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
