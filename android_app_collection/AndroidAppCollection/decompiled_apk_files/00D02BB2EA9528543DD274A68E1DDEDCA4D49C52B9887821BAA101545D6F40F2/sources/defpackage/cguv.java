package defpackage;
/* compiled from: PG */
/* renamed from: cguv  reason: default package */
/* loaded from: classes4.dex */
public final class cguv {
    public static final cguu a(dhjx dhjxVar) {
        if (dhjxVar != null) {
            return new cguu(dhjxVar);
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
