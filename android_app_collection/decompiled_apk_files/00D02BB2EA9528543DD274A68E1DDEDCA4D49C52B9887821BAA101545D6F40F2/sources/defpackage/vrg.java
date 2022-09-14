package defpackage;
/* compiled from: PG */
/* renamed from: vrg  reason: default package */
/* loaded from: classes7.dex */
public final class vrg {
    public final dzsj<cqhn> a;
    public final dzsj<cklf> b;
    public final dzsj<vpd> c;
    public final dzsj<btrm> d;

    public vrg(dzsj<cqhn> dzsjVar, dzsj<cklf> dzsjVar2, dzsj<vpd> dzsjVar3, dzsj<btrm> dzsjVar4) {
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
