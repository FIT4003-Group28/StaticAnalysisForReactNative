package defpackage;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.graphics.drawable.IconCompat;
/* compiled from: PG */
/* renamed from: hy  reason: default package */
/* loaded from: classes6.dex */
public final class hy {
    final Bundle a;
    public final ip[] b;
    public final boolean c;
    boolean d;
    @Deprecated
    public int e;
    public final CharSequence f;
    public final PendingIntent g;
    private IconCompat h;

    public hy(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, ip[] ipVarArr, boolean z, boolean z2) {
        int i;
        this.d = true;
        this.h = iconCompat;
        if (iconCompat != null) {
            if (iconCompat.a == -1 && Build.VERSION.SDK_INT >= 23) {
                i = IconCompat.m((Icon) iconCompat.b);
            } else {
                i = iconCompat.a;
            }
            if (i == 2) {
                this.e = iconCompat.f();
            }
        }
        this.f = ib.c(charSequence);
        this.g = pendingIntent;
        this.a = bundle;
        this.b = ipVarArr;
        this.c = z;
        this.d = z2;
    }

    public final IconCompat a() {
        int i;
        if (this.h == null && (i = this.e) != 0) {
            this.h = IconCompat.b(null, "", i);
        }
        return this.h;
    }
}
