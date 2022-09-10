package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.libraries.surveys.SurveyData;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
/* compiled from: PG */
/* renamed from: czos  reason: default package */
/* loaded from: classes5.dex */
public final class czos {
    public final Context a;
    public final String b;
    public final String c;
    public czob d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final String f;
    private dyhi g;
    private String h;

    public czos(Context context, String str, String str2, String str3) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.f = str3;
    }

    static final dyhs<String> e() {
        return dyhs.d("Cookie", dyhw.b);
    }

    public final dyeu a(dbma dbmaVar) {
        try {
            int i = czph.a;
            if (TextUtils.isEmpty(this.h) && czpc.a.c != null) {
                this.h = czpc.a.c.a();
            }
            dyjw a = dyjw.a("scone-pa.googleapis.com", 443, czpc.a.b);
            dyey[] dyeyVarArr = new dyey[1];
            String str = this.h;
            dyhw dyhwVar = new dyhw();
            if (czov.b(dydx.a.a().b(czov.a))) {
                if (dbmaVar == null && !TextUtils.isEmpty(str)) {
                    dyhwVar.i(e(), str);
                }
            } else {
                dyhwVar.i(e(), str);
            }
            if (!TextUtils.isEmpty(this.f)) {
                dyhwVar.i(dyhs.d("X-Goog-Api-Key", dyhw.b), this.f);
            }
            String o = czph.o(this.a);
            if (!TextUtils.isEmpty(o)) {
                dyhwVar.i(dyhs.d("X-Android-Cert", dyhw.b), o);
            }
            String packageName = this.a.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                dyhwVar.i(dyhs.d("X-Android-Package", dyhw.b), packageName);
            }
            dyhwVar.i(dyhs.d("Authority", dyhw.b), "scone-pa.googleapis.com");
            dyeyVarArr[0] = dyzj.a(dyhwVar);
            a.p(dyeyVarArr);
            dyhi c = a.c();
            this.g = c;
            return c;
        } catch (Exception unused) {
            b();
            return null;
        }
    }

    public final void b() {
        dyhi dyhiVar = this.g;
        if (dyhiVar != null) {
            dyhiVar.f();
        }
    }

    public final dbma c() {
        if (TextUtils.isEmpty(this.c)) {
            return null;
        }
        int i = czph.a;
        try {
            return dbma.d(new dblw(cmrh.f(this.a, new Account(this.c, "com.google"), "oauth2:https://www.googleapis.com/auth/supportcontent"), null));
        } catch (UserRecoverableAuthException | Exception unused) {
            return null;
        }
    }

    public final SurveyData d(dtyx dtyxVar) {
        String str = this.b;
        String str2 = dtyxVar.e;
        dubf dubfVar = dtyxVar.b;
        if (dubfVar == null) {
            dubfVar = dubf.g;
        }
        czoi czoiVar = new czoi(str, str2, dubfVar);
        duch duchVar = dtyxVar.a;
        if (duchVar == null) {
            duchVar = duch.c;
        }
        czoiVar.d = duchVar;
        czoiVar.e = dtyxVar.c;
        czoiVar.f = System.currentTimeMillis();
        czoiVar.g = dcdc.r(dtyxVar.d);
        long j = czoiVar.f;
        if (j == 0) {
            throw new IllegalStateException("Trigger time is not set");
        }
        return new SurveyDataImpl(czoiVar.a, czoiVar.b, j, czoiVar.d, czoiVar.c, czoiVar.e, czoiVar.g);
    }

    public final void f(final int i) {
        if (this.d != null) {
            this.e.post(new Runnable(this, i) { // from class: czok
                private final czos a;
                private final int b;

                {
                    this.a = this;
                    this.b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
