package defpackage;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;
/* compiled from: PG */
/* renamed from: gby  reason: default package */
/* loaded from: classes3.dex */
final class gby implements yze {
    public final Activity a;
    public final boolean b;
    int c;

    public gby(Activity activity) {
        this.a = activity;
        boolean z = true;
        if (Build.VERSION.SDK_INT <= 27 && !Build.VERSION.RELEASE.startsWith("P")) {
            z = false;
        }
        this.b = z;
    }

    public final int a() {
        return elk.i(this.a);
    }

    public final void d(int i) {
        this.a.setRequestedOrientation(i);
    }

    public final boolean e() {
        return Settings.System.getInt(this.a.getContentResolver(), "accelerometer_rotation", 0) == 0;
    }

    @Override // defpackage.yze
    public final void lE(boolean z, int i) {
        int i2 = 1;
        if (true == z) {
            i2 = 2;
        }
        this.c = i2;
    }

    @Override // defpackage.yze
    public final void lF(boolean z, int i) {
        lE(z, i);
    }
}
