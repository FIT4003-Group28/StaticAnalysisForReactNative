package okhttp3;

import c.f;
import java.nio.charset.Charset;
import org.spongycastle.i18n.LocalizedMessage;
/* loaded from: classes.dex */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, Charset.forName(LocalizedMessage.DEFAULT_ENCODING));
    }

    public static String basic(String str, String str2, Charset charset) {
        String b2 = f.a((str + ":" + str2).getBytes(charset)).b();
        return "Basic " + b2;
    }
}
