package defpackage;

import android.content.Context;
import android.widget.NumberPicker;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awul  reason: default package */
/* loaded from: classes3.dex */
public class awul implements awtu {
    private static final long d = TimeUnit.DAYS.toMillis(32) - TimeUnit.MINUTES.toMillis(1);
    public int a;
    public int b;
    public int c;
    private final Context e;
    private List<String> f;
    private List<Long> g;
    private List<String> h;
    private List<Long> i;
    private List<String> j;
    private List<Long> k;

    public awul(Context context, long j) {
        int i;
        this.e = context;
        this.f = dcdc.e();
        this.g = dcdc.e();
        this.h = dcdc.e();
        this.i = dcdc.e();
        this.j = dcdc.e();
        this.k = dcdc.e();
        long millis = j / TimeUnit.DAYS.toMillis(1L);
        long millis2 = (j % TimeUnit.DAYS.toMillis(1L)) / TimeUnit.HOURS.toMillis(1L);
        long millis3 = (j % TimeUnit.HOURS.toMillis(1L)) / TimeUnit.MINUTES.toMillis(1L);
        millis3 = (j % TimeUnit.MINUTES.toMillis(1L)) / TimeUnit.SECONDS.toMillis(1L) >= 30 ? millis3 + 1 : millis3;
        if (millis3 >= TimeUnit.HOURS.toMinutes(1L)) {
            millis2++;
            millis3 -= TimeUnit.HOURS.toMinutes(1L);
        }
        if (millis2 >= TimeUnit.DAYS.toHours(1L)) {
            millis++;
            millis2 -= TimeUnit.DAYS.toHours(1L);
        }
        long min = Math.min(d, Math.max(TimeUnit.DAYS.toMillis(millis) + TimeUnit.HOURS.toMillis(millis2) + TimeUnit.MINUTES.toMillis(millis3), 0L));
        dbsk.s(context);
        this.f = dchl.f(32);
        this.g = dchl.f(32);
        for (int i2 = 0; i2 <= 31; i2++) {
            this.f.add(this.e.getResources().getQuantityString(R.plurals.DA_DAYS, i2, Integer.valueOf(i2)));
            this.g.add(Long.valueOf(TimeUnit.DAYS.toMillis(i2)));
        }
        this.a = (int) (min / TimeUnit.DAYS.toMillis(1L));
        dbsk.s(this.e);
        this.h = dchl.f(24);
        this.i = dchl.f(24);
        for (int i3 = 0; i3 < 24; i3++) {
            this.h.add(this.e.getResources().getQuantityString(R.plurals.DA_HOURS_ABBREVIATED, i3, Integer.valueOf(i3)));
            this.i.add(Long.valueOf(TimeUnit.HOURS.toMillis(i3)));
        }
        this.b = (int) ((min % TimeUnit.DAYS.toMillis(1L)) / TimeUnit.HOURS.toMillis(1L));
        dbsk.s(this.e);
        long millis4 = (min % TimeUnit.HOURS.toMillis(1L)) / TimeUnit.MINUTES.toMillis(1L);
        int i4 = (int) millis4;
        int i5 = i4 / 5;
        if (millis4 % 5 != 0) {
            i5++;
            i = 13;
        } else {
            i = 12;
        }
        this.j = dchl.f(i);
        this.k = dchl.f(i);
        for (int i6 = 0; i6 < 12; i6++) {
            int i7 = i6 * 5;
            this.j.add(this.e.getResources().getQuantityString(R.plurals.DA_MINUTES_ABBREVIATED, i7, Integer.valueOf(i7)));
            long j2 = i7;
            this.k.add(Long.valueOf(TimeUnit.MINUTES.toMillis(j2)));
            if (j2 < millis4 && (i6 + 1) * 5 > millis4) {
                this.j.add(this.e.getResources().getQuantityString(R.plurals.DA_MINUTES_ABBREVIATED, i4, Integer.valueOf(i4)));
                this.k.add(Long.valueOf(TimeUnit.MINUTES.toMillis(i4)));
            }
        }
        this.c = i5;
    }

    @Override // defpackage.awtu
    public Integer a() {
        return Integer.valueOf(this.f.size() - 1);
    }

    @Override // defpackage.awtu
    public Integer b() {
        return Integer.valueOf(this.h.size() - 1);
    }

    @Override // defpackage.awtu
    public Integer c() {
        return Integer.valueOf(this.j.size() - 1);
    }

    @Override // defpackage.awtu
    public Integer d() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.awtu
    public Integer e() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.awtu
    public Integer f() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.awtu
    public List<String> g() {
        return this.f;
    }

    @Override // defpackage.awtu
    public List<String> h() {
        return this.h;
    }

    @Override // defpackage.awtu
    public List<String> i() {
        return this.j;
    }

    @Override // defpackage.awtu
    public NumberPicker.OnValueChangeListener j() {
        return new awui(this);
    }

    @Override // defpackage.awtu
    public NumberPicker.OnValueChangeListener k() {
        return new awuj(this);
    }

    @Override // defpackage.awtu
    public NumberPicker.OnValueChangeListener l() {
        return new awuk(this);
    }

    @Override // defpackage.awtu
    public Boolean m() {
        return false;
    }

    public long n() {
        return this.g.get(this.a).longValue() + this.i.get(this.b).longValue() + this.k.get(this.c).longValue();
    }
}
