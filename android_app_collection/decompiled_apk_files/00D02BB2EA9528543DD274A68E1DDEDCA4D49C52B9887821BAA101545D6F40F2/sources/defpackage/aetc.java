package defpackage;
/* compiled from: PG */
/* renamed from: aetc  reason: default package */
/* loaded from: classes2.dex */
public final class aetc {
    public final dzsj<aesb> a;
    public final dzsj<araj> b;
    public final dzsj<cqg> c;
    public final dzsj<bnjv> d;
    public final dzsj<axwq> e;
    public final dzsj<apkf> f;
    public final dzsj<ckcw> g;

    public aetc(dzsj<aesb> dzsjVar, dzsj<araj> dzsjVar2, dzsj<cqg> dzsjVar3, dzsj<bnjv> dzsjVar4, dzsj<axwq> dzsjVar5, dzsj<apkf> dzsjVar6, dzsj<ckcw> dzsjVar7) {
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
