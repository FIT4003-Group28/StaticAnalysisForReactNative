package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: cmom  reason: default package */
/* loaded from: classes5.dex */
public final class cmom {
    public final WindowManager a;
    public final cmol b;
    public final cmok c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public long l;

    public cmom() {
        this(null);
    }

    public final void a() {
        Display defaultDisplay = this.a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.d = j;
            this.e = (j * 80) / 100;
        }
    }

    public final boolean b(long j, long j2) {
        return Math.abs((j2 - this.j) - (j - this.k)) > 20000000;
    }

    public cmom(Context context) {
        DisplayManager displayManager;
        cmok cmokVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.a = (WindowManager) context.getSystemService("window");
        } else {
            this.a = null;
        }
        if (this.a != null) {
            if (cmny.a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                cmokVar = new cmok(this, displayManager);
            }
            this.c = cmokVar;
            this.b = cmol.b;
        } else {
            this.c = null;
            this.b = null;
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
    }
}
