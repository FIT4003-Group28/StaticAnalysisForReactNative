package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dbrc  reason: default package */
/* loaded from: classes5.dex */
public final class dbrc {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("ISO-8859-1");
    public static final Charset c = Charset.forName("UTF-8");
    public static final Charset d;

    static {
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        d = Charset.forName("UTF-16");
    }
}
