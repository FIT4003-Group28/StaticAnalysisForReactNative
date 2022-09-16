package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wqo  reason: default package */
/* loaded from: classes7.dex */
final class wqo implements cqkn<wpo> {
    final /* synthetic */ wqq a;

    public wqo(wqq wqqVar) {
        this.a = wqqVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(wpo wpoVar, View view) {
        wpo wpoVar2 = wpoVar;
        if (!this.a.a.b() || !(wpoVar2 instanceof wqs)) {
            return;
        }
        wqs wqsVar = (wqs) wpoVar2;
        wqq wqqVar = this.a;
        akqi akqiVar = wqsVar.b;
        qdi qdiVar = wqsVar.a;
        if (wqqVar.g()) {
            wqqVar.e.d();
            wqqVar.e.b(akqiVar, qdiVar);
            wqqVar.h();
            String string = wqqVar.b.getString(R.string.TRANSIT_STATION_ACCESSIBILITY_ALL_OTHER_LINES);
            bvsi bvsiVar = new bvsi(wqqVar.b);
            bvsiVar.d(view.getContentDescription());
            bvsiVar.d(wqs.h(string, false, wqqVar.b));
            wqqVar.d.f(view, bvsiVar.toString());
        } else if (wqqVar.e.c() == 1 && wqqVar.e.a(wqsVar.g())) {
            wqqVar.f();
            wqqVar.h();
            wqqVar.d.f(view, wqs.h(wqqVar.b.getString(R.string.TRANSIT_STATION_ACCESSIBILITY_ALL_LINES), true, wqqVar.b));
        } else {
            if (!wqqVar.e.b(akqiVar, qdiVar)) {
                wsp wspVar = wqqVar.e;
                wspVar.a.remove(qdiVar);
                wspVar.b.remove(akqiVar);
            }
            wqqVar.h();
            wqqVar.d.f(view, view.getContentDescription());
        }
    }
}
