package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.mapsactivity.locationhistory.events.webview.EventWebViewCallbacks;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aofd  reason: default package */
/* loaded from: classes2.dex */
public class aofd implements aofb {
    private final dcdc<aofc> a;
    private final Application b;
    private final aofk c;

    public aofd(dcdc<dprk> dcdcVar, akqi akqiVar, aofg aofgVar, Application application, aofk aofkVar) {
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dprk dprkVar = dcdcVar.get(i);
            aofg.a(dprkVar, 1);
            aofg.a(akqiVar, 2);
            aofk a = aofgVar.a.a();
            aofg.a(a, 3);
            F.g(new aoff(dprkVar, akqiVar, a));
        }
        this.a = F.f();
        this.b = application;
        this.c = aofkVar;
    }

    @Override // defpackage.aofb
    public CharSequence a() {
        return this.a.isEmpty() ? "" : this.b.getResources().getQuantityString(R.plurals.YOUR_MOVIE, this.a.size());
    }

    @Override // defpackage.aofb
    public dcdc<aofc> b() {
        return this.a;
    }

    @Override // defpackage.aofb
    public cqtd c() {
        return cqrt.g(2131231632, ibl.r());
    }

    @Override // defpackage.aofb
    public cqkl d() {
        aofk aofkVar = this.c;
        bvxn a = aofkVar.a();
        duyj duyjVar = aofkVar.d.getMapsActivitiesParameters().g;
        if (duyjVar == null) {
            duyjVar = duyj.c;
        }
        String str = duyjVar.b;
        if (a.c) {
            a.bF();
            a.c = false;
        }
        bvxu bvxuVar = (bvxu) a.b;
        bvxu bvxuVar2 = bvxu.A;
        str.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = str;
        bvxuVar.a = i | 64;
        bvxuVar.h = "aGMM.Timeline.Events.Onboarding";
        aofkVar.b.a().k(a.bK(), new EventWebViewCallbacks(), dtxv.M);
        return cqkl.a;
    }

    @Override // defpackage.aofb
    public CharSequence e() {
        return this.b.getResources().getString(R.string.MAPS_ACTIVITY_MOVIE_HELP_CONTENT_DESCRIPTION);
    }
}
