package defpackage;
/* compiled from: PG */
/* renamed from: vrp  reason: default package */
/* loaded from: classes7.dex */
public final class vrp {
    public final dzsj<cklf> a;
    public final dzsj<vpd> b;
    public final dzsj<btrm> c;
    public final dzsj<vrr> d;
    public final dzsj<gga> e;
    public final dzsj<dxio<bsvm>> f;

    public vrp(dzsj<cklf> dzsjVar, dzsj<vpd> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<vrr> dzsjVar4, dzsj<gga> dzsjVar5, dzsj<dxio<bsvm>> dzsjVar6) {
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
