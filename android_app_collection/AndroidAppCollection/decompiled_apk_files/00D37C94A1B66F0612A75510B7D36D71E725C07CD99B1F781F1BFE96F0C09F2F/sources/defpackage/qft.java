package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: qft  reason: default package */
/* loaded from: classes4.dex */
public final class qft implements qfv {
    static qfv a;
    private static final Object b = new Object();
    private final Context c;
    private final ExecutorService d;
    private final VersionInfoParcel e;

    protected qft(Context context) {
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(213380000);
        new WeakHashMap();
        rqt rqtVar = rfl.a;
        this.d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.c = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.e = versionInfoParcel;
    }

    public static qfv a(Context context) {
        synchronized (b) {
            if (a == null) {
                if (((Boolean) qdi.d.c()).booleanValue() && !((Boolean) qdb.y.e()).booleanValue()) {
                    a = new qft(context);
                } else {
                    a = new qfu();
                }
            }
        }
        return a;
    }

    @Override // defpackage.qfv
    public final void b(Throwable th, String str) {
        boolean z;
        String str2;
        if (qga.b(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        if (Math.random() >= 1.0d) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        try {
            z = qyr.b(this.c).e();
        } catch (Throwable th2) {
            qfl.d("Error fetching instant app info", th2);
            z = false;
        }
        try {
            str2 = this.c.getPackageName();
        } catch (Throwable unused) {
            qfl.e("Cannot obtain package name, proceeding.");
            str2 = "unknown";
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        if (!str4.startsWith(str3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            str4 = sb.toString();
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.e.a).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", qdb.a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "392523279").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(1)).appendQueryParameter("pb_tm", String.valueOf(qdi.b.c()));
        if (((Boolean) qdb.a.e()).booleanValue()) {
            int i = qrr.c;
            appendQueryParameter2.appendQueryParameter("gmscv", String.valueOf(qse.a(this.c))).appendQueryParameter("lite", true != this.e.e ? "0" : "1");
        }
        arrayList.add(appendQueryParameter2.toString());
        for (final String str5 : arrayList) {
            this.d.execute(new Runnable() { // from class: qfs
                @Override // java.lang.Runnable
                public final void run() {
                    qzv.m(str5);
                }
            });
        }
    }
}
