package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: datk  reason: default package */
/* loaded from: classes5.dex */
public final class datk {
    @Deprecated
    public static final Charset a;

    static {
        Charset.forName("ISO-8859-1");
        Charset.forName("US-ASCII");
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        a = Charset.forName("UTF-8");
    }
}
