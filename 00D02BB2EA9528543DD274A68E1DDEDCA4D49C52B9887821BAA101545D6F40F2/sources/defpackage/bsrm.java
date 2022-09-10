package defpackage;
/* compiled from: PG */
/* renamed from: bsrm  reason: default package */
/* loaded from: classes4.dex */
public final class bsrm {
    public final dzsj<ixq> a;
    public final dzsj<cqhn> b;
    public final dzsj<dxio<ckrp>> c;
    public final dzsj<bsri> d;
    public final dzsj<dxio<afha>> e;

    public bsrm(dzsj<ixq> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<dxio<ckrp>> dzsjVar3, dzsj<bsri> dzsjVar4, dzsj<dxio<afha>> dzsjVar5) {
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
