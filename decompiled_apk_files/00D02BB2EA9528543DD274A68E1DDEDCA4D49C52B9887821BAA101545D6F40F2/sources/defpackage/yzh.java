package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: yzh  reason: default package */
/* loaded from: classes7.dex */
public final class yzh {
    @dzsi
    public amvh a = null;
    public dqvj b = dqvj.DRIVE;
    public Set<afhq> c = EnumSet.noneOf(afhq.class);
    public afhv d = afhv.DEFAULT;
    private final Activity e;
    private final List<amvh> f;

    public yzh(Activity activity, List<amvh> list) {
        this.e = activity;
        this.f = list;
    }

    @dzsi
    public final Intent a() {
        Uri d = afhd.d(this.b, yzi.j(this.a), (amvh[]) this.f.toArray(new amvh[0]), this.d, ddjr.DIRECTIONS_WIDGET, this.c, this.e.getResources(), true);
        ddho ddhoVar = null;
        if (d == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW", d);
        intent.setClassName(this.e.getPackageName(), "com.google.android.maps.MapsActivity");
        dqvj dqvjVar = this.b;
        dqvj dqvjVar2 = dqvj.DRIVE;
        int ordinal = dqvjVar.ordinal();
        if (ordinal == 0) {
            ddhoVar = dtxn.dh;
        } else if (ordinal == 1) {
            ddhoVar = dtxn.df;
        } else if (ordinal == 2) {
            ddhoVar = dtxn.dm;
        } else if (ordinal == 3) {
            ddhoVar = dtxn.dl;
        }
        if (ddhoVar != null) {
            intent.putExtra("ve_type", ((dtxi) ddhoVar).a);
        }
        return intent;
    }
}
