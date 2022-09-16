package defpackage;
/* compiled from: PG */
/* renamed from: apgc  reason: default package */
/* loaded from: classes2.dex */
public final class apgc {
    public final dzsj<gga> a;

    public apgc(dzsj<gga> dzsjVar) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
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
