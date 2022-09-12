package defpackage;
/* compiled from: PG */
/* renamed from: nnx  reason: default package */
/* loaded from: classes7.dex */
public final class nnx {
    public final dzsj<cjqy> a;
    public final dzsj<cjqq> b;
    public final dzsj<amfi> c;
    public final dzsj<jzp> d;
    public final dzsj<bvgl> e;

    public nnx(dzsj<cjqy> dzsjVar, dzsj<cjqq> dzsjVar2, dzsj<amfi> dzsjVar3, dzsj<jzp> dzsjVar4, dzsj<bvgl> dzsjVar5) {
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
