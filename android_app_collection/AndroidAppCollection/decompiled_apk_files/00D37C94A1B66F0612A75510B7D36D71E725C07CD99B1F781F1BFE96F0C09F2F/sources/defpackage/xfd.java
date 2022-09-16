package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: xfd  reason: default package */
/* loaded from: classes4.dex */
public final class xfd extends ajjh {
    private final wwm a;
    private Pattern b;
    private Pattern c;
    private Pattern d;

    public xfd(wwm wwmVar) {
        this.a = wwmVar;
    }

    private final boolean C(String str) {
        if (this.b == null) {
            this.b = Pattern.compile("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID)(?:\\]|%5D|%5d)");
        }
        Matcher matcher = this.b.matcher(str);
        return matcher.find() && matcher.groupCount() == 1;
    }

    private final boolean D(String str) {
        if (this.d == null) {
            this.d = Pattern.compile("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID_FOR_CONVERSION_TRACKING)(?:\\]|%5D|%5d)");
        }
        Matcher matcher = this.d.matcher(str);
        return matcher.find() && matcher.groupCount() == 1;
    }

    private final boolean E(String str) {
        if (this.c == null) {
            this.c = Pattern.compile("(?:\\[|%5B|%5b)(DEVICE_LAT)(?:\\]|%5D|%5d)");
        }
        Matcher matcher = this.c.matcher(str);
        return matcher.find() && matcher.groupCount() == 1;
    }

    @Override // defpackage.ajjh
    public final Uri a(Uri uri) {
        ylr.b();
        uri.getClass();
        String uri2 = uri.toString();
        if (!TextUtils.isEmpty(uri2)) {
            boolean C = C(uri2);
            boolean D = D(uri2);
            boolean E = E(uri2);
            if (!C && !D && !E) {
                return uri;
            }
            try {
                qaa a = this.a.a();
                boolean z = a.b;
                if (E) {
                    uri2 = uri2.replaceAll("(?:\\[|%5B|%5b)(DEVICE_LAT)(?:\\]|%5D|%5d)", true != z ? "0" : "1");
                }
                String str = a.a;
                if (str != null) {
                    if (C && !z) {
                        uri2 = uri2.replaceAll("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID)(?:\\]|%5D|%5d)", str);
                    }
                    if (D) {
                        uri2 = uri2.replaceAll("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID_FOR_CONVERSION_TRACKING)(?:\\]|%5D|%5d)", str);
                    }
                }
            } catch (Exception e) {
                zep.d("Failed to get advertising id", e);
            }
            try {
                return zgt.i(uri2);
            } catch (MalformedURLException unused) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Failed macro substitution for URI: ");
                sb.append(valueOf);
                zep.l(sb.toString());
            }
        }
        return uri;
    }

    @Override // defpackage.ajjh
    public final boolean b(Uri uri) {
        if (uri == null) {
            return false;
        }
        String uri2 = uri.toString();
        return D(uri2) || C(uri2) || E(uri2);
    }
}
