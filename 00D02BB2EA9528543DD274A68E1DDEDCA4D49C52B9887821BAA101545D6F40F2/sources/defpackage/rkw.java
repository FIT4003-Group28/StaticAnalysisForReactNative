package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rkw  reason: default package */
/* loaded from: classes7.dex */
public class rkw implements rkb {
    public final Activity a;
    public final Executor b;
    public final btvo c;
    public final dxio<qjk> d;
    public final dxio<ros> e;
    @dzsi
    public final quz f;
    @dzsi
    public final Runnable g;
    public boolean h;
    private final dcdc<rka> i;

    public rkw(Activity activity, Executor executor, btvo btvoVar, dxio<qjk> dxioVar, dxio<ros> dxioVar2, @dzsi quz quzVar, @dzsi Runnable runnable) {
        this.a = activity;
        this.b = executor;
        this.c = btvoVar;
        this.d = dxioVar;
        this.e = dxioVar2;
        domy domyVar = domy.DRIVE;
        String string = activity.getString(R.string.COMMUTE_TRAVEL_MODE_NUDGE_DRIVING_OPTION);
        cqtd n = sht.n(domy.DRIVE);
        dbsk.s(n);
        rkv rkvVar = new rkv(this, domyVar, string, n, cjtd.a(dtxl.bb));
        domy domyVar2 = domy.TRANSIT;
        String string2 = activity.getString(R.string.COMMUTE_TRAVEL_MODE_NUDGE_TRANSIT_OPTION);
        cqtd n2 = sht.n(domy.TRANSIT);
        dbsk.s(n2);
        this.i = dcdc.h(rkvVar, new rkv(this, domyVar2, string2, n2, cjtd.a(dtxl.bd)), new rkv(this, domy.UNKNOWN_TRAVEL_MODE, activity.getString(R.string.COMMUTE_TRAVEL_MODE_NUDGE_OTHER_OPTIONS), cqrt.f(2131232792), cjtd.a(dtxl.bc)));
        this.f = quzVar;
        this.g = runnable;
        this.h = false;
    }

    public static boolean f(donb donbVar) {
        return donbVar.equals(donb.DEFAULT);
    }

    @Override // defpackage.rkb
    public String a() {
        return this.a.getString(R.string.COMMUTE_TRAVEL_MODE_NUDGE_PROMPT_TITLE);
    }

    @Override // defpackage.rkb
    public String b() {
        return this.a.getString(R.string.COMMUTE_TRAVEL_MODE_NUDGE_PROMPT_DESCRIPTION);
    }

    @Override // defpackage.rkb
    public List<rka> c() {
        return this.i;
    }

    @Override // defpackage.rkb
    public cjtd d() {
        return cjtd.a(dtxl.ba);
    }

    public boolean e() {
        return this.h;
    }
}
