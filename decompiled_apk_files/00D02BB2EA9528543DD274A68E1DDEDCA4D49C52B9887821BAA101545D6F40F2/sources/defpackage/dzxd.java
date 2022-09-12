package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dzxd  reason: default package */
/* loaded from: classes6.dex */
public final class dzxd {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        dzvx.b(forName, "Charset.forName(\"UTF-8\")");
        a = forName;
        dzvx.b(Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        dzvx.b(Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        dzvx.b(Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        dzvx.b(Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        dzvx.b(Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }
}
