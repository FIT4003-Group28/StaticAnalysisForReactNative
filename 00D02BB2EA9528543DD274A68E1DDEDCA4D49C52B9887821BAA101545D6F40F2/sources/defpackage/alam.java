package defpackage;

import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: alam  reason: default package */
/* loaded from: classes.dex */
public final class alam implements akpj {
    private static final long b = TimeUnit.HOURS.toSeconds(1);
    @dzsi
    public final cjqy a;
    private final SharedPreferences c;
    private final cqat d;
    @dzsi
    private final bttf e;
    @dzsi
    private final eeu f;
    @dzsi
    private final dzsj<dvsb> g;
    private final Executor h;

    public alam(cqat cqatVar, bttf bttfVar, eeu eeuVar, dzsj dzsjVar, bvju bvjuVar, cjqy cjqyVar, Executor executor) {
        this.e = bttfVar;
        this.f = eeuVar;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
        this.c = bvjuVar.a("camera");
        StrictMode.setThreadPolicy(threadPolicy);
        this.d = cqatVar;
        this.g = dzsjVar;
        this.a = cjqyVar;
        this.h = executor;
    }

    @Override // defpackage.akpj
    public final void a(alad aladVar, boolean z) {
        alak alakVar = new alak(aladVar, z, this.d.b());
        SharedPreferences sharedPreferences = this.c;
        alad aladVar2 = alakVar.a;
        sharedPreferences.edit().putFloat("lat", (float) aladVar2.i.a).putFloat("lng", (float) aladVar2.i.b).putFloat("zoom", aladVar2.k).putFloat("tilt", aladVar2.l).putFloat("bearing", aladVar2.m).putBoolean("tracking", alakVar.b).putLong("timestamp", alakVar.c).apply();
    }

    @Override // defpackage.akpj
    public final void b() {
        this.c.edit().clear().apply();
    }

    @Override // defpackage.akpj
    public final int c(alaa alaaVar) {
        alak alakVar;
        int i;
        SharedPreferences sharedPreferences = this.c;
        String str = null;
        dvsb dvsbVar = null;
        try {
            alaa a = alad.a();
            a.c(new akqq(alan.a(sharedPreferences, "lat"), alan.a(sharedPreferences, "lng")));
            a.c = alan.a(sharedPreferences, "zoom");
            a.d = alan.a(sharedPreferences, "tilt");
            a.e = alan.a(sharedPreferences, "bearing");
            alakVar = new alak(a.a(), sharedPreferences.getBoolean("tracking", true), sharedPreferences.getLong("timestamp", 0L));
        } catch (ClassCastException | IllegalArgumentException unused) {
            alakVar = null;
        }
        if (alakVar != null) {
            alaaVar.b(alakVar.a);
            eeu eeuVar = this.f;
            dzsj<dvsb> dzsjVar = this.g;
            if (dzsjVar != null) {
                dvsbVar = dzsjVar.a();
            }
            long b2 = this.d.b();
            long j = alakVar.c;
            if (eeuVar != null && eeuVar.g()) {
                long j2 = b;
                if (dvsbVar != null && (dvsbVar.a & 8) != 0 && (i = dvsbVar.e) >= 0) {
                    j2 = i;
                }
                if (TimeUnit.MILLISECONDS.toSeconds(b2 - j) >= j2) {
                    return 2;
                }
            }
            return alakVar.b ? 2 : 3;
        }
        if (this.a != null) {
            this.h.execute(new Runnable(this) { // from class: alal
                private final alam a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cjqy cjqyVar = this.a.a;
                    cjsx i2 = cjsy.i();
                    i2.b(ddda.cP);
                    cjqyVar.k(i2.a());
                }
            });
        }
        bttf bttfVar = this.e;
        if (bttfVar != null) {
            str = bttfVar.a();
        }
        alaaVar.b(akzd.b(str));
        return 1;
    }
}
