package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.support.v4.graphics.drawable.IconCompat;
/* compiled from: PG */
/* renamed from: ff  reason: default package */
/* loaded from: classes3.dex */
public final class ff {
    final Bundle a;
    public final fs[] b;
    public boolean c;
    boolean d;
    @Deprecated
    public int e;
    public CharSequence f;
    public PendingIntent g;
    private IconCompat h;

    public ff(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i == 0 ? null : IconCompat.f(i), charSequence, pendingIntent, new Bundle(), null, true, true);
    }

    public final IconCompat a() {
        int i;
        if (this.h == null && (i = this.e) != 0) {
            this.h = IconCompat.f(i);
        }
        return this.h;
    }

    public ff(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, fs[] fsVarArr, boolean z, boolean z2) {
        this.d = true;
        this.h = iconCompat;
        if (iconCompat != null && iconCompat.b() == 2) {
            this.e = iconCompat.a();
        }
        this.f = fi.d(charSequence);
        this.g = pendingIntent;
        this.a = bundle;
        this.b = fsVarArr;
        this.c = z;
        this.d = z2;
    }
}
