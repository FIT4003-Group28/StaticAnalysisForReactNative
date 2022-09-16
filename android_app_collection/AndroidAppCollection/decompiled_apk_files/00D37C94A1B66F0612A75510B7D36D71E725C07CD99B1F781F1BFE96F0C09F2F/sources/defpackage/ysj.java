package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: ysj  reason: default package */
/* loaded from: classes4.dex */
public abstract class ysj {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ysj(String str) {
        this.a = String.valueOf(str).concat(" gzip");
    }

    protected abstract boolean a(String str);

    public final void b(UrlRequest.Builder builder, Collection collection) {
        Iterator it = collection.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (a(str)) {
                builder.mo563addHeader(str, (String) entry.getValue());
            }
            if (z && "User-Agent".equals(str)) {
                z = false;
            }
        }
        if (z) {
            builder.mo563addHeader("User-Agent", this.a);
        }
    }
}
