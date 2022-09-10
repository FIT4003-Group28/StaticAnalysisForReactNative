package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: PG */
/* renamed from: bujj  reason: default package */
/* loaded from: classes.dex */
public final class bujj {
    private static final dcqe a = dcqe.c("bujj");

    public static final URL a() {
        try {
            URL url = new URL("https://www.google.com/maps/vt");
            if (!"https".equals(url.getProtocol())) {
                bvoo.h("Paint server URL should be an https URL: %s", "https://www.google.com/maps/vt");
            }
            return url;
        } catch (MalformedURLException e) {
            bvoo.h("Invalid paint service address: %s", "https://www.google.com/maps/vt");
            throw new IllegalArgumentException(e);
        }
    }
}
