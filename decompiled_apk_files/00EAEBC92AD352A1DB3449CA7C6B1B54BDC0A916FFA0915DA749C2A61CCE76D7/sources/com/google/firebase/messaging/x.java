package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
final class x {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f9498d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private final String f9499a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9500b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9501c;

    private x(String str, String str2) {
        this.f9499a = a(str2, str);
        this.f9500b = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.f9501c = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length == 2) {
            return new x(split[0], split[1]);
        }
        return null;
    }

    private static String a(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f9498d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static x b(String str) {
        return new x("S", str);
    }

    public static x c(String str) {
        return new x("U", str);
    }

    public final String a() {
        return this.f9500b;
    }

    public final String b() {
        return this.f9499a;
    }

    public final String c() {
        return this.f9501c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f9499a.equals(xVar.f9499a) && this.f9500b.equals(xVar.f9500b);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.a(this.f9500b, this.f9499a);
    }
}
