package defpackage;
/* compiled from: PG */
/* renamed from: uex  reason: default package */
/* loaded from: classes7.dex */
final class uex {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final uew a(dcdc<amvh> dcdcVar) {
        if (dcdcVar != null) {
            return new uew(dcdcVar);
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
