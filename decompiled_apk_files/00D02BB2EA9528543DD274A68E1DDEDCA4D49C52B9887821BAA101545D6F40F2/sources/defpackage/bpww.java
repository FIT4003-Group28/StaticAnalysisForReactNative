package defpackage;
/* compiled from: PG */
/* renamed from: bpww  reason: default package */
/* loaded from: classes4.dex */
public final class bpww {
    public final dzsj<gga> a;
    public final dzsj<bvvw> b;
    public final dzsj<dxio<boxa>> c;
    public final dzsj<bovv> d;

    public bpww(dzsj<gga> dzsjVar, dzsj<bvvw> dzsjVar2, dzsj<dxio<boxa>> dzsjVar3, dzsj<bovv> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
