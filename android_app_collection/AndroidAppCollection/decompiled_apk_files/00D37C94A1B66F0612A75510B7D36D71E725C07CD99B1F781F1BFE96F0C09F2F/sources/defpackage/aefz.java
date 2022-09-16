package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.io.IOException;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aefz  reason: default package */
/* loaded from: classes.dex */
public final class aefz implements Callable, pcl {
    public final Handler a = new Handler(Looper.getMainLooper());
    public aanm b;
    public final afdd c;
    private final afjm d;
    private final PlayerConfigModel e;
    private final aega f;
    private int g;

    public aefz(afjm afjmVar, PlayerConfigModel playerConfigModel, aega aegaVar, afdd afddVar) {
        this.d = afjmVar;
        this.e = playerConfigModel;
        this.f = aegaVar;
        this.c = afddVar;
    }

    public static void d() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override // defpackage.pcl
    public final void a(final IOException iOException) {
        ylr.b();
        afki afkiVar = afki.ABR;
        int i = this.g + 1;
        this.g = i;
        if (i < 2) {
            try {
                Thread.sleep(2500L);
                c();
                return;
            } catch (InterruptedException unused) {
                return;
            }
        }
        if (this.c != null) {
            this.a.post(new Runnable() { // from class: aefw
                @Override // java.lang.Runnable
                public final void run() {
                    aefz aefzVar = aefz.this;
                    aefzVar.c.a(iOException);
                }
            });
        }
        d();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public final aanm call() {
        ylr.b();
        afln aflnVar = new afln(this.d.a());
        aegf aegfVar = new aegf(this.f.a);
        zgp b = zgp.b(this.f.c);
        if (!TextUtils.isEmpty(this.f.b)) {
            b.h("cpn", this.f.b);
        }
        apfm apfmVar = this.e.c.j;
        if (apfmVar == null) {
            apfmVar = apfm.a;
        }
        int i = apfmVar.h;
        if (i == 0) {
            i = 5;
        }
        b.k("mpd_version", i);
        String uri = b.a().toString();
        aqwu aqwuVar = this.e.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int i2 = aqwuVar.aL;
        if (i2 == 0) {
            i2 = 3;
        }
        this.b = new aanm(uri, aflnVar, aegfVar, i2);
        aefy aefyVar = new aefy(this);
        aefyVar.start();
        try {
            aefyVar.join();
        } catch (InterruptedException e) {
            if (this.c != null) {
                this.a.post(new Runnable() { // from class: aefx
                    @Override // java.lang.Runnable
                    public final void run() {
                        aefz aefzVar = aefz.this;
                        aefzVar.c.a(e);
                    }
                });
            }
        }
        return this.b;
    }

    public final void c() {
        aanm aanmVar = this.b;
        pcn pcnVar = new pcn(aanmVar, new pcc(aanmVar.d, aanmVar.b, aanmVar.a), Looper.myLooper(), this);
        pcnVar.d = SystemClock.elapsedRealtime();
        pcnVar.c.e(pcnVar.b, pcnVar.a, pcnVar);
    }
}
