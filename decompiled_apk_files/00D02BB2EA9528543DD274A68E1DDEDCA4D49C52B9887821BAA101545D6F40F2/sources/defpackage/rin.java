package defpackage;
/* compiled from: PG */
/* renamed from: rin  reason: default package */
/* loaded from: classes7.dex */
public final class rin {
    public static final rim a(dnlm dnlmVar) {
        if (dnlmVar != null) {
            return new rim(dnlmVar);
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
