package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: asdi  reason: default package */
/* loaded from: classes2.dex */
public class asdi implements asdj {
    private final ddom a;
    @dzsi
    private final dowa b;
    private final bvsl c;
    private final Resources d;

    public asdi(ddom ddomVar, @dzsi dowa dowaVar, bvsl bvslVar, Resources resources) {
        this.a = ddomVar;
        this.b = dowaVar;
        this.c = bvslVar;
        this.d = resources;
    }

    private static long a(long j) {
        return TimeUnit.SECONDS.toMinutes(j + 30);
    }

    @Override // defpackage.asdj
    public Boolean O() {
        ddom ddomVar = this.a;
        boolean z = false;
        if (ddomVar.o != 0 && ddomVar.t != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.asdj
    public CharSequence P() {
        return bvtb.f(this.d, this.a.o, bvsz.ABBREVIATED, new bvsw());
    }

    @Override // defpackage.asdj
    public CharSequence Q() {
        return this.d.getString(R.string.NAVIGATION_SESSION_DURATION_ACCESSIBILITY, P());
    }

    @Override // defpackage.asdj
    @dzsi
    public CharSequence R() {
        int i;
        ddom ddomVar = this.a;
        if ((ddomVar.a & 262144) == 0 || (i = ddomVar.t) <= 50) {
            return this.c.c(0, this.b, true, true);
        }
        return this.c.c(i, this.b, true, true);
    }

    @Override // defpackage.asdj
    @dzsi
    public CharSequence S() {
        CharSequence R = R();
        if (R == null) {
            return null;
        }
        return this.d.getString(R.string.NAVIGATION_SESSION_DISTANCE_ACCESSIBILITY, R);
    }

    @Override // defpackage.asdj
    @dzsi
    public CharSequence U() {
        CharSequence T = T();
        if (T == null) {
            return null;
        }
        return this.d.getString(R.string.NAVIGATION_SESSION_AVERAGE_SPEED_ACCESSIBILITY, T);
    }

    @Override // defpackage.asdj
    @dzsi
    public CharSequence T() {
        int i;
        int i2;
        ddom ddomVar = this.a;
        int i3 = ddomVar.a;
        if ((262144 & i3) == 0 || (i = ddomVar.t) <= 50 || (i3 & 2048) == 0 || (i2 = ddomVar.o) <= 0) {
            return this.c.j(0.0f, this.b).toString();
        }
        return this.c.j(i / i2, this.b).toString();
    }

    @Override // defpackage.asdj
    @dzsi
    public CharSequence V() {
        ddom ddomVar = this.a;
        int i = ddomVar.a;
        int i2 = i & 8;
        if (i2 == 0 && (i & 4) == 0) {
            return null;
        }
        int i3 = ddomVar.o - (i2 != 0 ? ddomVar.g : ddomVar.f);
        int i4 = i & 4096;
        if (i4 != 0) {
            i3 -= ddomVar.p;
        }
        if (i2 != 0) {
            int i5 = ddomVar.g;
        }
        if ((i & 4) != 0) {
            int i6 = ddomVar.f;
        }
        if (i4 != 0) {
            int i7 = ddomVar.p;
        }
        if (a(i3) > 0 || this.a.o < 60) {
            return null;
        }
        int i8 = -i3;
        if (a(i8) > 0) {
            Resources resources = this.d;
            return resources.getString(R.string.ETA_ACCURACY_EARLIER, bvtb.e(resources, i8, bvsz.ABBREVIATED).toString());
        }
        return this.d.getString(R.string.ETA_ACCURACY_EXACT);
    }
}
