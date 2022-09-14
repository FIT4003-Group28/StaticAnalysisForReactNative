package defpackage;
/* compiled from: PG */
/* renamed from: twh  reason: default package */
/* loaded from: classes7.dex */
public class twh {
    public static final twg a(wuv wuvVar) {
        c(wuvVar);
        return new twg(wuvVar);
    }

    public static final twg b(amuk amukVar) {
        c(amukVar);
        return new twg(amukVar);
    }

    private static <T> void c(T t) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
