package defpackage;
/* compiled from: PG */
/* renamed from: bbpm  reason: default package */
/* loaded from: classes3.dex */
public class bbpm implements bbma {
    public static final bbpl b(String str, cqtd cqtdVar, cjtd cjtdVar, Runnable runnable) {
        c(str, 1);
        c(cqtdVar, 2);
        c(cjtdVar, 3);
        c(runnable, 4);
        return new bbpl(str, cqtdVar, cjtdVar, runnable, false);
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @Override // defpackage.bbma
    public final /* bridge */ /* synthetic */ bblz a(String str, cqtd cqtdVar, cjtd cjtdVar, Runnable runnable) {
        return b(str, cqtdVar, cjtdVar, runnable);
    }
}
