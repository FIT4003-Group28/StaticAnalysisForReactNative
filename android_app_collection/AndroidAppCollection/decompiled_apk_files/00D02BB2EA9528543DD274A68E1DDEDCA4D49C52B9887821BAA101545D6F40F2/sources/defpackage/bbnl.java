package defpackage;
/* compiled from: PG */
/* renamed from: bbnl  reason: default package */
/* loaded from: classes3.dex */
public class bbnl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final bbnk a(jic jicVar, cjtd cjtdVar, Runnable runnable, CharSequence charSequence) {
        b(jicVar, 1);
        b(cjtdVar, 2);
        b(runnable, 3);
        b(charSequence, 4);
        return new bbnk(jicVar, cjtdVar, runnable, charSequence);
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
