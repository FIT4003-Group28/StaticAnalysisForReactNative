package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import java.util.Set;
/* compiled from: PG */
/* renamed from: axrq  reason: default package */
/* loaded from: classes3.dex */
final class axrq implements View.OnClickListener {
    final /* synthetic */ Activity b;
    final /* synthetic */ axrs d;
    final /* synthetic */ String a = "android.permission.ACCESS_FINE_LOCATION";
    final /* synthetic */ String c = "no_access_location";

    public axrq(axrs axrsVar, Activity activity) {
        this.d = axrsVar;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a.equals("android.permission.ACCESS_FINE_LOCATION")) {
            this.d.d.i(cjtd.a(dtxu.cZ));
        }
        cklg cklgVar = this.d.g;
        final Activity activity = this.b;
        dzsj dzsjVar = new dzsj(activity) { // from class: cklc
            private final Activity a;

            {
                this.a = activity;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return new codt(this.a);
            }
        };
        cklg.a(activity, 1);
        dxio a = ((dxjh) cklgVar.a).a();
        cklg.a(a, 2);
        dbsg<dxio<afha>> a2 = cklgVar.b.a();
        cklg.a(a2, 3);
        cjqy a3 = cklgVar.c.a();
        cklg.a(a3, 4);
        gce a4 = cklgVar.d.a();
        cklg.a(a4, 5);
        Set<OfflineSuggestion> a5 = cklgVar.e.a();
        cklg.a(a5, 6);
        cklg.a(dzsjVar, 7);
        new cklf(activity, a, a2, a3, a4, a5, dzsjVar).a(this.c);
    }
}
