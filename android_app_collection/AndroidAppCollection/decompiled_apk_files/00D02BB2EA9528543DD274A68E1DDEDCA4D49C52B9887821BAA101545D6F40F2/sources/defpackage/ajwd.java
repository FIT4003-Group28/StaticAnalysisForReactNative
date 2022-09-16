package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import com.google.android.filament.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ajwd  reason: default package */
/* loaded from: classes2.dex */
public class ajwd implements ajwa {
    static final int[] a = {15, 30, 45, 60, R.styleable.AppCompatTheme_windowFixedHeightMajor, 180, 240, cpnx.a, 360, 420, 480, 540, 600, 660, 720, 1440, 2880, 4320};
    private final Context c;
    private final cqat d;
    private final boolean e;
    private final boolean g;
    @dzsi
    private final Runnable h;
    private final ajwc i;
    private boolean b = false;
    private boolean f = false;
    private int j = 3;

    public ajwd(Context context, cqat cqatVar, boolean z, cqhn cqhnVar, boolean z2, @dzsi Runnable runnable, ajwc ajwcVar) {
        this.c = context;
        this.d = cqatVar;
        this.e = z;
        this.g = z2;
        this.h = runnable;
        this.i = ajwcVar;
    }

    private final void v() {
        cqkx.p(this);
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.ajwa
    public Boolean a() {
        return Boolean.valueOf(this.j > 0);
    }

    @Override // defpackage.ajwa
    public Boolean b() {
        return Boolean.valueOf(this.j < 17);
    }

    @Override // defpackage.ajwa
    public Boolean c() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.ajwa
    public cjtd d() {
        return cjtd.a(((ajve) this.i).a);
    }

    @Override // defpackage.ajwa
    public cqkl e() {
        if (this.b || this.f) {
            this.b = false;
            this.f = false;
            v();
        }
        return cqkl.a;
    }

    @Override // defpackage.ajwa
    public cjtd f() {
        return cjtd.a(((ajve) this.i).b);
    }

    @Override // defpackage.ajwa
    public cqkl g() {
        if (!this.b && this.g) {
            this.b = true;
            this.f = false;
            v();
        }
        return cqkl.a;
    }

    @Override // defpackage.ajwa
    public String h() {
        long millis = TimeUnit.MINUTES.toMillis(a[this.j]);
        int days = (int) TimeUnit.MILLISECONDS.toDays(millis);
        long millis2 = millis - TimeUnit.DAYS.toMillis(days);
        int hours = (int) TimeUnit.MILLISECONDS.toHours(millis2);
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(millis2 - TimeUnit.HOURS.toMillis(hours));
        if (days > 0) {
            return bqq.b(this.c.getString(com.google.android.apps.maps.R.string.TEMPORARY_SHARE_DURATION_DAYS), "num_days", Integer.valueOf(days));
        }
        if (hours > 0) {
            return bqq.b(this.c.getString(com.google.android.apps.maps.R.string.TEMPORARY_SHARE_DURATION_HOURS), "num_hours", Integer.valueOf(hours));
        }
        return bqq.b(this.c.getString(com.google.android.apps.maps.R.string.TEMPORARY_SHARE_DURATION_MINUTES), "num_minutes", Integer.valueOf(minutes));
    }

    @Override // defpackage.ajwa
    public String i() {
        long b = this.d.b() + TimeUnit.MINUTES.toMillis(a[this.j]);
        return this.c.getString(com.google.android.apps.maps.R.string.TEMPORARY_SHARE_END_TIME, DateUtils.formatDateTime(this.c, b, true != DateUtils.isToday(b) ? 49155 : 16385));
    }

    @Override // defpackage.ajwa
    public String j() {
        return this.c.getString(com.google.android.apps.maps.R.string.PERSISTENT_DURATION);
    }

    @Override // defpackage.ajwa
    public cjtd k() {
        return cjtd.a(((ajve) this.i).c);
    }

    @Override // defpackage.ajwa
    public cqkl l() {
        this.j = Math.min(this.j + 1, 17);
        this.b = false;
        v();
        return cqkl.a;
    }

    @Override // defpackage.ajwa
    public cjtd m() {
        return cjtd.a(((ajve) this.i).d);
    }

    @Override // defpackage.ajwa
    public cqkl n() {
        this.j = Math.max(this.j - 1, 0);
        this.b = false;
        v();
        return cqkl.a;
    }

    @Override // defpackage.ajwa
    public int o() {
        return a[this.j];
    }

    @Override // defpackage.ajwa
    @dzsi
    public cjtd p() {
        ddho ddhoVar = ((ajve) this.i).e;
        if (ddhoVar != null) {
            return cjtd.a(ddhoVar);
        }
        return null;
    }

    @Override // defpackage.ajwa
    public cqkl q() {
        if (!this.e) {
            return cqkl.a;
        }
        this.b = false;
        this.f = !this.f;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.ajwa
    public Boolean r() {
        boolean z = false;
        if (this.f && this.e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ajwa
    public Boolean s() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.ajwa
    public Boolean t() {
        return Boolean.valueOf(this.g);
    }

    public void u(dqzv dqzvVar) {
        int a2 = dqzq.a(dqzvVar.d);
        boolean z = a2 != 0 && a2 == 2;
        this.b = z;
        if (!z) {
            long f = eaow.d(dqzvVar.f).k(eaow.e(this.d.b())).f();
            int i = 0;
            for (int i2 = 0; i2 <= 18 && a[i2] <= f; i2++) {
                i++;
            }
            this.j = i;
        }
    }
}
