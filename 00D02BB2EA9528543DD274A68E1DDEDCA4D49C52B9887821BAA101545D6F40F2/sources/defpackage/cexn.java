package defpackage;
/* compiled from: PG */
/* renamed from: cexn  reason: default package */
/* loaded from: classes4.dex */
public class cexn {
    public final dzsj<gga> a;

    public cexn(dzsj<gga> dzsjVar) {
        a(dzsjVar);
        this.a = dzsjVar;
    }

    public static <T> void a(T t) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
