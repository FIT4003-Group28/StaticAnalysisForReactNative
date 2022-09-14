package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zkt  reason: default package */
/* loaded from: classes7.dex */
public class zkt implements zcl {
    private final Application b;
    private final byyp c;
    private final Executor d;
    final bzgj a = new bzgj();
    private final bzgf e = new bzgf(this) { // from class: zks
        private final zkt a;

        {
            this.a = this;
        }

        @Override // defpackage.bzgf
        public final void a() {
            this.a.g();
        }
    };
    @dzsi
    private String f = null;
    private boolean h = false;
    private boolean i = false;
    private zfn g = zfn.CARDUI_DIRECTIONS_SUMMARY_COMPACT;

    public zkt(Application application, cqhn cqhnVar, byyp byypVar, Executor executor) {
        this.b = application;
        this.c = byypVar;
        this.d = executor;
    }

    @Override // defpackage.zcl
    public zfn a() {
        return this.g;
    }

    @Override // defpackage.zcl
    public Boolean b() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.zcl
    @dzsi
    public String c() {
        return this.f;
    }

    @Override // defpackage.zcl
    public Boolean d() {
        return false;
    }

    public void e(zfn zfnVar) {
        this.g = zfnVar;
    }

    public void f(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        if (z) {
            this.f = null;
            this.i = false;
            this.a.b();
            bzgg.b(this.e, this.c, this.a, this.d);
            g();
            return;
        }
        this.a.b();
    }

    public final void g() {
        String str;
        eaow q = this.c.c().q();
        boolean z = false;
        if (q == null) {
            str = null;
        } else if (q.q(eaow.c(1L))) {
            str = this.b.getString(R.string.GPS_SIGNAL_STATUS_NO_GPS_JUST_NOW);
        } else {
            Application application = this.b;
            str = application.getString(R.string.GPS_SIGNAL_STATUS_NO_GPS_DURATION, new Object[]{bvtb.e(application.getResources(), (int) q.g(), bvsz.ABBREVIATED)});
        }
        if (!dbsd.a(this.f, str)) {
            this.f = str;
            if (str == null) {
                z = true;
            }
            this.i = z;
            cqkx.p(this);
        }
    }
}
