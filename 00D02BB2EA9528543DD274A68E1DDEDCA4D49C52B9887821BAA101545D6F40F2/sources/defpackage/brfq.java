package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brfq  reason: default package */
/* loaded from: classes4.dex */
public class brfq implements bzml {
    @dzsi
    public View a;
    private final Activity b;
    private final bzmm c;
    private final jlp d;

    public brfq(Activity activity, bzmm bzmmVar, jlp jlpVar) {
        this.b = activity;
        this.c = bzmmVar;
        this.d = jlpVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.ELECTRIC_VEHICLE_PIVOT_TOOLTIP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        if (this.a != null) {
            int d = this.c.d(dqkc.ELECTRIC_VEHICLE_PIVOT_TOOLTIP);
            long c = this.c.c(dqkc.ELECTRIC_VEHICLE_PIVOT_TOOLTIP);
            if (d == 0 || c < 0) {
                return true;
            }
            return d <= 3 && new eaow(new eapd(c), eapd.a()).b >= eaow.a(1L).b;
        }
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar != bzmk.VISIBLE) {
            return false;
        }
        int a = jmj.a(this.b, 6);
        jlp jlpVar = this.d;
        String string = this.b.getString(R.string.EV_PROFILE_PIVOT_TOOLTIP_TEXT_V2);
        View view = this.a;
        dbsk.s(view);
        jlo a2 = jlpVar.a(string, view);
        a2.k();
        a2.l(a);
        a2.o(true);
        a2.p();
        a2.t(jln.GM2_BLUE);
        a2.a();
        return true;
    }
}
