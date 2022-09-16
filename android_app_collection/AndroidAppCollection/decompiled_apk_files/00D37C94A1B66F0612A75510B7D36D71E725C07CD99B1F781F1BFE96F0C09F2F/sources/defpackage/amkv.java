package defpackage;
/* compiled from: PG */
/* renamed from: amkv  reason: default package */
/* loaded from: classes.dex */
final class amkv extends IllegalStateException {
    public amkv(String str) {
        super(a(null, str));
    }

    private static String a(String str, String str2) {
        String concat;
        if (str == null) {
            concat = "";
        } else {
            concat = str.length() != 0 ? ": ".concat(str) : new String(": ");
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 131 + String.valueOf(concat).length());
        sb.append("Starting new trace ");
        sb.append(str2);
        sb.append(" when already associated with a trace");
        sb.append(concat);
        sb.append(". For more help, see http://go/tiktok-tracing#fixing-duplicate-trace-issues");
        return sb.toString();
    }

    public amkv(String str, String str2, Throwable th) {
        super(a(str, str2), th);
    }
}
