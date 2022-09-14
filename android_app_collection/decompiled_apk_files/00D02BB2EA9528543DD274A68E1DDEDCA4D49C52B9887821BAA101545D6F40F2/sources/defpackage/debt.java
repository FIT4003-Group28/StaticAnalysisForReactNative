package defpackage;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: debt  reason: default package */
/* loaded from: classes6.dex */
public final class debt {
    public static final Pattern a = Pattern.compile("(?:.*?@)?([^:]+)(?::\\d+)?");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(debx debxVar) {
        return debxVar.i(debw.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(debx debxVar, Charset charset) {
        dbsk.s(charset);
        return debxVar.i(charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static debu c(String str) {
        return debu.b(str, debw.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static debx d(debu debuVar, String str) {
        return debx.g(str, debuVar.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static debv e(Charset charset) {
        return new debv(charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(String str) {
        return str.toLowerCase(Locale.ENGLISH);
    }
}
