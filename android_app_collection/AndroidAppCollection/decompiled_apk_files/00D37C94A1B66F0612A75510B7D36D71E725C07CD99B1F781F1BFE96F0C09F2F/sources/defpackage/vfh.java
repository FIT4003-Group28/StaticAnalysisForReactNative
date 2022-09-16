package defpackage;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* compiled from: PG */
/* renamed from: vfh  reason: default package */
/* loaded from: classes4.dex */
final class vfh {
    private static final anay b = anay.m("GlobMatcher");
    public final Pattern a;

    private vfh(String str, Pattern pattern) {
        str.getClass();
        this.a = pattern;
    }

    public static ampq a(String str) {
        vfg vfgVar = new vfg();
        StringBuilder sb = new StringBuilder();
        if (vfgVar.a(str.toCharArray(), sb, false)) {
            try {
                return ampq.j(new vfh(str, Pattern.compile(sb.toString(), 2)));
            } catch (PatternSyntaxException e) {
                ((anav) ((anav) ((anav) b.f()).h(e)).i("com/google/android/libraries/saferwebview/GlobMatcher", "create", 44, "GlobMatcher.java")).s("Internal error. Generated regex is invalid: %s", sb);
                return amon.a;
            }
        }
        ((anav) ((anav) b.f()).i("com/google/android/libraries/saferwebview/GlobMatcher", "create", 49, "GlobMatcher.java")).s("Internal error. Can't parse glob-pattern: %s", str);
        return amon.a;
    }
}
