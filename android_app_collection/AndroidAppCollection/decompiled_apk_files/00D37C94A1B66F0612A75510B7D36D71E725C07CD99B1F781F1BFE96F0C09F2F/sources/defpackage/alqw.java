package defpackage;

import android.app.PendingIntent;
/* compiled from: PG */
/* renamed from: alqw  reason: default package */
/* loaded from: classes.dex */
public final class alqw {
    public final int a;
    public final int b;
    public boolean c = false;
    private final long d;
    private final long e;
    private final PendingIntent f;
    private final PendingIntent g;
    private final PendingIntent h;
    private final PendingIntent i;

    public alqw(int i, int i2, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.a = i;
        this.b = i2;
        this.d = j;
        this.e = j2;
        this.f = pendingIntent;
        this.g = pendingIntent2;
        this.h = pendingIntent3;
        this.i = pendingIntent4;
    }

    private final boolean b(alrd alrdVar) {
        return alrdVar.b && this.d <= this.e;
    }

    public final PendingIntent a(alrd alrdVar) {
        int i = alrdVar.a;
        if (i == 0) {
            PendingIntent pendingIntent = this.g;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (!b(alrdVar)) {
                return null;
            }
            return this.i;
        }
        if (i == 1) {
            PendingIntent pendingIntent2 = this.f;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (b(alrdVar)) {
                return this.h;
            }
        }
        return null;
    }
}
