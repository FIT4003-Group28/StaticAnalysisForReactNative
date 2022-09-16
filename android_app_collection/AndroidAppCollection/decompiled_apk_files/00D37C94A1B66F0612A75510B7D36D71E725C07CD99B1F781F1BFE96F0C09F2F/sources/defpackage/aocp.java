package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: aocp  reason: default package */
/* loaded from: classes.dex */
final class aocp {
    private static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public aocp(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            str3 = str2.substring(8);
        }
        if (str3 == null || !d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.a = str3;
        this.b = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.c = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aocp a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length == 2) {
            return new aocp(split[0], split[1]);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aocp)) {
            return false;
        }
        aocp aocpVar = (aocp) obj;
        return this.a.equals(aocpVar.a) && this.b.equals(aocpVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
