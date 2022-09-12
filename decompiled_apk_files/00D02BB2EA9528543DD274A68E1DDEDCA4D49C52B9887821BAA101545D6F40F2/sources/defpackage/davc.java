package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
/* compiled from: PG */
/* renamed from: davc  reason: default package */
/* loaded from: classes5.dex */
public final class davc {
    private static final davd c = new dave("-_.*", true);
    private static final davd d = new dave("-_.!~*'()@:$&,;=", false);
    public static final davd a = new dave("-_.!~*'()@:$&,;=+/?", false);
    public static final davd b = new dave("-_.!~*'():$&,;=", false);
    private static final davd e = new dave("-_.!~*'()@:$,;/?:", false);

    public static String a(String str) {
        return c.a(str);
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String c(String str) {
        return d.a(str);
    }

    public static String d(String str) {
        return e.a(str);
    }
}
