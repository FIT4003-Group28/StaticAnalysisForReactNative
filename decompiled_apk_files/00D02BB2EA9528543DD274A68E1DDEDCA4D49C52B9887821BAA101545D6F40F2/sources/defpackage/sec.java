package defpackage;
/* compiled from: PG */
/* renamed from: sec  reason: default package */
/* loaded from: classes7.dex */
public class sec {
    public static final seb a(cqtd cqtdVar, CharSequence charSequence) {
        b(cqtdVar, 1);
        b(charSequence, 2);
        return new seb(cqtdVar, charSequence, null);
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
