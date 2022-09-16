package defpackage;

import android.net.Uri;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: adbl  reason: default package */
/* loaded from: classes.dex */
public final class adbl implements adbu {
    public static final String a;
    private static final amuk c = amuk.A(0, 1000, 1000, 1000, 1000, 1000, 2000, 2000, 2000, 2000, 2000, 5000, 10000, 15000, 20000);
    final adbi b;
    private final yqh d;
    private final azqb e;
    private final adtt f;
    private final ankt g;
    private final int h;
    private final String i;
    private final String j;
    private final String k;
    private final amuk l;

    static {
        String valueOf = String.valueOf(adbl.class.getCanonicalName());
        a = zep.a(valueOf.length() != 0 ? "MDX.".concat(valueOf) : new String("MDX."));
    }

    public adbl(adka adkaVar, yqh yqhVar, azqb azqbVar, int i, adtt adttVar, ankt anktVar, String str, String str2, acwu acwuVar) {
        this.d = yqhVar;
        this.e = azqbVar;
        this.f = adttVar;
        this.g = anktVar;
        this.h = i;
        this.i = str;
        this.j = str2;
        if (TextUtils.isEmpty("")) {
            this.k = "package:com.google.android.youtube";
        } else {
            this.k = "";
        }
        if (acwuVar.W.isEmpty()) {
            this.l = c;
        } else {
            this.l = acwuVar.W;
        }
        HandlerThread handlerThread = new HandlerThread(getClass().getName(), 10);
        handlerThread.start();
        this.b = new adbi(handlerThread.getLooper(), adkaVar, this.l);
    }

    @Override // defpackage.adbu
    public final void a() {
        this.b.removeMessages(1);
    }

    @Override // defpackage.adbu
    public final void b(Uri uri) {
        String uri2 = uri.toString();
        yqu a2 = yqv.a();
        a2.c = 4;
        a2.a = uri2;
        a2.c("Origin", "package:com.google.android.youtube");
        adyf.d(this.d, a2.a(), new adbh());
    }

    @Override // defpackage.adbu
    public final void c(Uri uri, adnl adnlVar, String str, String str2, adqe adqeVar) {
        adit aditVar = new adit(UUID.randomUUID().toString());
        yqu c2 = yqv.c(uri.toString());
        c2.c("Content-Type", "text/plain; charset=\"utf-8\"");
        c2.c("Origin", this.k);
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("pairingCode", aditVar.c);
        builder.appendQueryParameter("theme", str);
        if (this.h == 1) {
            builder.appendQueryParameter("rUrl", this.f.g());
            builder.appendQueryParameter("rId", (String) ylx.g(this.g, 1L, TimeUnit.SECONDS, ""));
            this.f.d(new adbk(adqeVar, this.b, str2));
        }
        if (adnlVar.g()) {
            builder.appendQueryParameter("dialLaunch", "watch");
        } else {
            builder.appendQueryParameter("dialLaunch", "browse");
        }
        StringBuilder sb = new StringBuilder(builder.build().toString().replaceFirst("\\?", ""));
        sb.append(((advz) this.e.get()).i);
        if (!TextUtils.isEmpty(this.i)) {
            String str3 = this.i;
            if (str3.length() != 0) {
                "Using receiverLoader: ".concat(str3);
            }
            sb.append(this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            String str4 = this.j;
            if (str4.length() != 0) {
                "Using additionalParams: ".concat(str4);
            }
            sb.append("&");
            sb.append(this.j);
        }
        try {
            String sb2 = sb.toString();
            String str5 = "UTF-8";
            if (true == TextUtils.isEmpty(str5)) {
                str5 = "ISO-8859-1";
            }
            c2.b = yqt.e(sb2.getBytes(str5), str5.length() != 0 ? "text/plain; charset=".concat(str5) : new String("text/plain; charset="));
            adyf.d(this.d, c2.a(), new adbg(this, aditVar, adqeVar));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error setting body for request", e);
        }
    }
}
