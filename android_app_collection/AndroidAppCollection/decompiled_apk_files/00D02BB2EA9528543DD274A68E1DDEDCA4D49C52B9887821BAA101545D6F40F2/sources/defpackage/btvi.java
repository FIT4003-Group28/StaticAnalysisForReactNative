package defpackage;

import java.net.URL;
/* compiled from: PG */
/* renamed from: btvi  reason: default package */
/* loaded from: classes4.dex */
public final class btvi {
    public static final void a(URL url) {
        if (url.getProtocol().equals("https")) {
            return;
        }
        String valueOf = String.valueOf(url);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("Insecure server URLs are not allowed: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }
}
