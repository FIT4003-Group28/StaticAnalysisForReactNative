package defpackage;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: dln  reason: default package */
/* loaded from: classes6.dex */
final class dln implements dfkr {
    public final Object a = new Object();
    @dzsi
    public dyhi b = null;
    public int c = 0;
    private final Application d;
    private final dlk<?> e;
    private final dlj f;
    private final Executor g;
    private final dyhw h;

    public dln(dlm dlmVar, dlk<?> dlkVar) {
        String str;
        Application application = dlmVar.a;
        this.d = application;
        this.e = dlkVar;
        this.g = dlmVar.b;
        this.f = dlmVar.c;
        dyhw dyhwVar = new dyhw();
        this.h = dyhwVar;
        dyhwVar.i(dyhs.d("X-Android-Package", dyhw.b), dlmVar.d.c());
        dyhwVar.i(dyhs.d("X-Android-Cert", dyhw.b), dlmVar.d.b());
        dyhs d = dyhs.d("X-Goog-Api-Client", dyhw.b);
        String c = dlmVar.d.c();
        try {
            str = dbsj.e(application.getPackageManager().getPackageInfo("com.google.ar.core", 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            str = "unknown";
        }
        ArrayList arrayList = new ArrayList();
        String a = dfkw.a("com.google.ar.core");
        String b = dfkw.b(str);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(b).length());
        sb.append(a);
        sb.append("/");
        sb.append(b);
        arrayList.add(sb.toString());
        String valueOf = String.valueOf(Build.VERSION.RELEASE);
        arrayList.add(valueOf.length() != 0 ? "android/".concat(valueOf) : new String("android/"));
        if (c != null && c.startsWith("com.google.")) {
            String a2 = dfkw.a(c);
            String b2 = dfkw.b("10.55.4");
            StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 1 + String.valueOf(b2).length());
            sb2.append(a2);
            sb2.append("/");
            sb2.append(b2);
            arrayList.add(sb2.toString());
        }
        dyhwVar.i(d, dbrz.e(" ").g(arrayList));
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [dyhj] */
    @Override // defpackage.dfkr
    public final dll a() {
        dll dllVar;
        synchronized (this.a) {
            dyhi dyhiVar = this.b;
            if (this.c <= 0) {
                dbsk.l(dyhiVar == null);
                this.c = 0;
                dyhj d = this.e.a().e(new CronetEngine.Builder(this.d).getDefaultUserAgent()).f(this.f, dyzj.a(this.h)).d();
                d.o();
                dyhiVar = d.g(this.g).c();
                dyhiVar.b();
                this.b = dyhiVar;
            }
            this.c++;
            dbsk.s(dyhiVar);
            dllVar = new dll(this, dyhiVar);
        }
        return dllVar;
    }
}
