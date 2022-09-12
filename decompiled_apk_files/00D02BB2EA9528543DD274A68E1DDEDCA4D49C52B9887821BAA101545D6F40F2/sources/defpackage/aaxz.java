package defpackage;
/* compiled from: PG */
/* renamed from: aaxz  reason: default package */
/* loaded from: classes2.dex */
public final class aaxz {
    public static final aaxy a(djso djsoVar, boolean z) {
        if (djsoVar != null) {
            return new aaxy(djsoVar, z);
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
