package defpackage;

import android.content.DialogInterface;
import androidx.preference.TwoStatePreference;
/* compiled from: PG */
/* renamed from: btej  reason: default package */
/* loaded from: classes4.dex */
final class btej implements DialogInterface.OnClickListener {
    final /* synthetic */ TwoStatePreference a;
    final /* synthetic */ btem b;

    public btej(btem btemVar, TwoStatePreference twoStatePreference) {
        this.b = btemVar;
        this.a = twoStatePreference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.ag.d.edit().putBoolean("remember_monthly_nav_stats", false).commit();
        this.a.m(false);
        btsp c = btsp.c(this.b.ag);
        ((bvjj) c.a()).W(bvjk.eV, 0);
        ((bvjj) c.a()).W(bvjk.eW, 0);
        ((bvjj) c.a()).W(bvjk.eY, 0);
        ((bvjj) c.a()).W(bvjk.eX, 0);
        this.b.ao.i(cjtd.a(dtxw.cC));
        this.b.ao.i(cjqg.a(false, cjtd.a(dtxw.cD)));
    }
}
