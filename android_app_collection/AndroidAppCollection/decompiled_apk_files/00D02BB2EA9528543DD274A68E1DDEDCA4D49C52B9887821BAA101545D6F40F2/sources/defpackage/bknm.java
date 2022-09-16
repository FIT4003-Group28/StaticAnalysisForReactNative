package defpackage;
/* compiled from: PG */
/* renamed from: bknm  reason: default package */
/* loaded from: classes3.dex */
public final class bknm {
    public static final bknl a(String str, boolean z) {
        if (str != null) {
            return new bknl(str, z);
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
