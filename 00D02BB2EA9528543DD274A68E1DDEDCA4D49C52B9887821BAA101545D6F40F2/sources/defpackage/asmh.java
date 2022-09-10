package defpackage;
/* compiled from: PG */
/* renamed from: asmh  reason: default package */
/* loaded from: classes2.dex */
public final class asmh {
    public static final asmg a(Runnable runnable) {
        if (runnable != null) {
            return new asmg(runnable);
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
