package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
/* compiled from: PG */
/* renamed from: qpt  reason: default package */
/* loaded from: classes4.dex */
public final class qpt {
    public static final twx a = new twx();
    public static final twx b = new twx();
    public static final twx c = new twx();

    static {
        try {
            Charset.forName("UTF-8");
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
        }
        qpl.c("com.google.cast.multizone");
    }
}
