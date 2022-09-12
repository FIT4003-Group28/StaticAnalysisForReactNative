package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zzn  reason: default package */
/* loaded from: classes7.dex */
public class zzn {
    @dzsi
    View a;
    private final Activity b;
    private final dxio<akzh> c;

    public zzn(Activity activity, dxio<akzh> dxioVar) {
        this.b = activity;
        this.c = dxioVar;
    }

    @dzsi
    public final akqq a() {
        View b = b();
        if (b != null) {
            akra s = akyx.s(bnuq.b() ? this.c.a() : this.c.a().b(), b.getX() + (b.getWidth() / 2.0f), b.getY() + (b.getHeight() / 2.0f), new float[8]);
            if (s != null) {
                return s.S();
            }
            return null;
        }
        return null;
    }

    @dzsi
    public final View b() {
        if (this.a == null) {
            this.a = this.b.findViewById(R.id.floating_crosshairs);
        }
        return this.a;
    }
}
