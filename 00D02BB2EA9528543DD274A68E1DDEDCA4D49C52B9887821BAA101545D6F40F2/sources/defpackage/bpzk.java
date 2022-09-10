package defpackage;
/* compiled from: PG */
/* renamed from: bpzk  reason: default package */
/* loaded from: classes4.dex */
public final class bpzk {
    public final dzsj<ff> a;
    public final dzsj<zzn> b;
    public final dzsj<cqhn> c;
    public final dzsj<bvrb> d;
    public final dzsj<jlp> e;
    public final dzsj<cztz> f;
    public final dzsj<afwr> g;

    public bpzk(dzsj<ff> dzsjVar, dzsj<zzn> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<bvrb> dzsjVar4, dzsj<jlp> dzsjVar5, dzsj<cztz> dzsjVar6, dzsj<afwr> dzsjVar7) {
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
