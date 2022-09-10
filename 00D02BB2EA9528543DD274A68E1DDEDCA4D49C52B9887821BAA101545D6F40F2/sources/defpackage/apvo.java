package defpackage;
/* compiled from: PG */
/* renamed from: apvo  reason: default package */
/* loaded from: classes2.dex */
public final class apvo {
    public final dzsj<gga> a;
    public final dzsj<begg> b;
    public final dzsj<czsy> c;

    public apvo(dzsj<gga> dzsjVar, dzsj<begg> dzsjVar2, dzsj<czsy> dzsjVar3) {
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
