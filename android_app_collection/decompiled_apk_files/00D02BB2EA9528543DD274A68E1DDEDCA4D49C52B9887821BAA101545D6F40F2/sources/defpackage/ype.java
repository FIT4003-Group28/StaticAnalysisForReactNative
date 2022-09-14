package defpackage;

import java.io.Serializable;
import java.util.Calendar;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: ype  reason: default package */
/* loaded from: classes7.dex */
final class ype implements Serializable {
    public final Calendar a;
    boolean b;
    final /* synthetic */ yph c;

    public ype(yph yphVar, long j, boolean z) {
        this.c = yphVar;
        this.b = false;
        long d = vxb.d(j);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        this.a = calendar;
        calendar.clear();
        calendar.setTimeInMillis(d);
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2, int i3) {
        if (this.c.g) {
            return;
        }
        if (this.a.get(1) == i && this.a.get(2) == i2 && this.a.get(5) == i3) {
            return;
        }
        this.a.set(1, i);
        this.a.set(2, i2);
        this.a.set(5, i3);
        this.b = false;
        this.c.u();
    }

    public final int b() {
        return this.a.get(1);
    }

    public final int c() {
        return this.a.get(2);
    }

    public final int d() {
        return this.a.get(5);
    }

    public final int e() {
        return this.a.get(11);
    }

    public final int f() {
        return this.a.get(12);
    }
}
