package defpackage;
/* compiled from: PG */
/* renamed from: cvht  reason: default package */
/* loaded from: classes5.dex */
enum cvht {
    PROD("navigationsdkusage.googleapis.com"),
    STAGING("staging-navigationsdkusage.sandbox.googleapis.com"),
    AUTOPUSH("autopush-navigationsdkusage.sandbox.googleapis.com"),
    EMPTY("");
    
    final String e;
    final String f;

    cvht(String str) {
        String str2;
        this.e = str;
        if (!str.isEmpty()) {
            StringBuilder sb = new StringBuilder(str.length() + 23);
            sb.append("https://");
            sb.append(str);
            sb.append("/v1:reportUsage");
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        this.f = str2;
    }
}
