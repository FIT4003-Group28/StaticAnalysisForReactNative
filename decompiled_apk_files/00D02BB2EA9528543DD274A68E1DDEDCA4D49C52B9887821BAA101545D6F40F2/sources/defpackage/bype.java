package defpackage;
/* compiled from: PG */
/* renamed from: bype  reason: default package */
/* loaded from: classes4.dex */
final class bype {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(long j, String str) {
        int hashCode = str.hashCode();
        StringBuilder sb = new StringBuilder(32);
        sb.append(j);
        sb.append("_");
        sb.append(hashCode);
        return sb.toString();
    }
}
