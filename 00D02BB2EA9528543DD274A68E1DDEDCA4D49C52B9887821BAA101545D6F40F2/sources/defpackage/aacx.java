package defpackage;
/* compiled from: PG */
/* renamed from: aacx  reason: default package */
/* loaded from: classes2.dex */
public final class aacx {
    public final dzsj<aafv> a;
    public final dzsj<gga> b;
    public final dzsj<cqhn> c;
    public final dzsj<aadj> d;

    public aacx(dzsj<aafv> dzsjVar, dzsj<gga> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<aadj> dzsjVar4) {
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
