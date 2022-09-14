package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: devf  reason: default package */
/* loaded from: classes6.dex */
final class devf {
    private static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    private devf(String str, String str2) {
        String substring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (substring == null || !d.matcher(substring).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", substring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.a = substring;
        this.b = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.c = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static devf a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length == 2) {
            return new devf(split[0], split[1]);
        }
        return null;
    }

    public static devf subscribe(String str) {
        return new devf("S", str);
    }

    public static devf unsubscribe(String str) {
        return new devf("U", str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof devf)) {
            return false;
        }
        devf devfVar = (devf) obj;
        return this.a.equals(devfVar.a) && this.b.equals(devfVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
