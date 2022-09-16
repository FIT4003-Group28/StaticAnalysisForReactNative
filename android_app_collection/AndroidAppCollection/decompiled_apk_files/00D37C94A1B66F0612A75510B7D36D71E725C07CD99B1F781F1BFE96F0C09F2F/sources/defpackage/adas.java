package defpackage;

import android.net.Uri;
import android.util.Xml;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import java.io.InputStream;
import org.xml.sax.ContentHandler;
/* compiled from: PG */
/* renamed from: adas  reason: default package */
/* loaded from: classes.dex */
public final class adas {
    public static final String a = zep.a("MDX.discovery");
    public final yqw b;
    public final String c;
    private final yqh d;

    public adas(yqh yqhVar, yqw yqwVar, String str) {
        this.d = yqhVar;
        this.b = yqwVar;
        this.c = str;
    }

    public static final void b(InputStream inputStream, ContentHandler contentHandler) {
        Xml.parse(inputStream, Xml.Encoding.UTF_8, contentHandler);
    }

    public final AppStatus a(Uri uri) {
        yqu b = yqv.b(uri.toString());
        b.c("Origin", "package:com.google.android.youtube");
        yqv a2 = b.a();
        adar adarVar = new adar(this, a2.a);
        adyf.d(this.d, a2, adarVar);
        return adarVar.a;
    }
}
