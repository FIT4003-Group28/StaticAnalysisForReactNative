package defpackage;
/* compiled from: PG */
/* renamed from: rzs  reason: default package */
/* loaded from: classes7.dex */
public class rzs {
    public static final rzr a(rzq rzqVar) {
        if (rzqVar != null) {
            return new rzr(rzqVar);
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
