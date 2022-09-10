package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.core.Experiments;
import defpackage.cybo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cybn  reason: default package */
/* loaded from: classes5.dex */
public abstract class cybn<T extends cybo> {
    protected cych b;
    protected Context c;
    protected ClientConfigInternal d;
    public ExecutorService e;
    protected Experiments f;
    public cyhd g;
    protected Locale h;
    public boolean i;
    protected ClientVersion j;
    protected Random k;
    protected cyfq l;
    protected dbug m;
    protected List<cyqx> n;
    public boolean o;

    protected abstract ConcurrentMap<String, dbty<T>> a();

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        String str;
        if (this.h == null) {
            Context context = this.c;
            Locale locale = Locale.getDefault();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && !dbsj.d(telephonyManager.getSimCountryIso())) {
                locale = new Locale(locale.getLanguage(), telephonyManager.getSimCountryIso());
            }
            this.h = locale;
        }
        if (this.e == null) {
            long a = dyat.a.a().a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            deip deipVar = new deip();
            deipVar.a = "AutocompleteBackground-%d";
            this.e = cyck.a(decl.b(a), timeUnit, deip.a(deipVar));
        }
        if (this.f == null) {
            this.f = Experiments.c().a();
        }
        ClientVersion clientVersion = this.j;
        if (clientVersion == null) {
            Context context2 = this.c;
            String name = this.d.g.name();
            if (name.equals(dhdj.CLIENT_UNSPECIFIED.name())) {
                name = context2.getPackageName();
            }
            try {
                str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = null;
            }
            if (str == null) {
                str = "0";
            }
            cybw cybwVar = new cybw();
            cybwVar.b = "0";
            if (name != null) {
                cybwVar.a = name;
                cybwVar.b = str;
                cybwVar.c = context2.getPackageName();
                cybwVar.d = 1;
                this.j = cybwVar.a();
            } else {
                throw new NullPointerException("Null clientName");
            }
        } else if (this.c != null) {
            cyek d = clientVersion.d();
            d.b(this.c.getPackageName());
            this.j = d.a();
        }
        if (this.k == null) {
            this.k = new Random();
        }
        if (this.l == null) {
            this.l = cyfs.b;
        }
        if (this.m == null) {
            this.m = dbpc.a;
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T c();

    public final T d() {
        String format;
        b();
        if (this.i) {
            dbsk.s(this.d);
            dbsk.s(this.b);
            dbsk.s(this.h);
            if (dyat.a.a().j()) {
                format = String.format("%s;%s;%s;%s", this.d.e, this.b.a, this.h, Boolean.valueOf(this.o));
            } else {
                dbsk.s(this.j);
                dbsk.s(this.f);
                format = String.format("%s;%s;%s;%s;%s;%s", this.d.e, this.b.a, this.h, this.j, this.f, Boolean.valueOf(this.o));
            }
            if (a().get(format) == null) {
                a().putIfAbsent(format, new cybm(this));
            }
            return a().get(format).a();
        }
        return c();
    }

    public final void e(String str, String str2) {
        this.b = new cych(str, str2, cycg.FAILED_NOT_LOGGED_IN, null);
    }

    public final void f(Context context) {
        cxju.c(context);
        this.c = context;
    }

    public final void g(cydz cydzVar) {
        dbsk.a(cydzVar instanceof ClientConfigInternal);
        this.d = (ClientConfigInternal) cydzVar;
    }
}
