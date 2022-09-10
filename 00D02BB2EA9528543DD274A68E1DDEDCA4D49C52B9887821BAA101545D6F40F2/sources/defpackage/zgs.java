package defpackage;
/* compiled from: PG */
/* renamed from: zgs  reason: default package */
/* loaded from: classes7.dex */
public final class zgs {
    public final dzsj<vpd> a;
    public final dzsj<gga> b;
    public final dzsj<ziq> c;

    public zgs(dzsj<vpd> dzsjVar, dzsj<gga> dzsjVar2, dzsj<ziq> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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
