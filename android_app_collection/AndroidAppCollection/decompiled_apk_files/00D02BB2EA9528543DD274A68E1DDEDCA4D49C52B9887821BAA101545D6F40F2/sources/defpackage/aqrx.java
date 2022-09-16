package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
/* compiled from: PG */
/* renamed from: aqrx  reason: default package */
/* loaded from: classes2.dex */
public final class aqrx extends gen {
    public cqkj a;
    private crzp<aqcj> ad;
    public aqrp b;
    public dxio<aqsj> c;
    public dehq d;
    public aqsi e;
    private cqkf<aqsh> g;

    public static aqrx g(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("business_listing_id", str);
        aqrx aqrxVar = new aqrx();
        aqrxVar.B(bundle);
        return aqrxVar;
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        Dialog dialog = new Dialog(J());
        Window window = dialog.getWindow();
        dbsk.s(window);
        window.requestFeature(1);
        Window window2 = dialog.getWindow();
        dbsk.s(window2);
        window2.setBackgroundDrawable(new ColorDrawable(0));
        cqkf<aqsh> cqkfVar = this.g;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.e);
        cqkf<aqsh> cqkfVar2 = this.g;
        dbsk.s(cqkfVar2);
        dialog.setContentView(cqkfVar2.c());
        return dialog;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        String str = "";
        if (bundle2 != null) {
            str = bundle2.getString("business_listing_id", str);
        }
        String str2 = str;
        this.g = this.a.e(new aqsg());
        aqsj a = this.c.a();
        Runnable runnable = new Runnable(this) { // from class: aqrv
            private final aqrx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aT();
            }
        };
        Activity activity = (Activity) ((dxjd) a.a).a;
        aqsj.a(activity, 1);
        cqhn a2 = a.b.a();
        aqsj.a(a2, 2);
        auhi a3 = a.c.a();
        aqsj.a(a3, 3);
        apyx a4 = a.d.a();
        aqsj.a(a4, 4);
        auur a5 = a.e.a();
        aqsj.a(a5, 5);
        aqrl a6 = a.f.a();
        aqsj.a(a6, 6);
        aqrp a7 = a.g.a();
        aqsj.a(a7, 7);
        aqcl a8 = a.h.a();
        aqsj.a(a8, 8);
        aqsj.a(runnable, 9);
        aqsj.a(str2, 10);
        this.e = new aqsi(activity, a2, a3, a4, a5, a6, a7, a8, runnable, str2);
        this.ad = new crzp(this) { // from class: aqrw
            private final aqrx a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                aqrx aqrxVar = this.a;
                aqcj aqcjVar = (aqcj) crzmVar.l();
                if (aqcjVar == null) {
                    return;
                }
                aqsi aqsiVar = aqrxVar.e;
                dbsk.s(aqsiVar);
                if (aqsiVar.a == aqcjVar) {
                    return;
                }
                aqsiVar.a = aqcjVar;
                cqkx.p(aqsiVar);
            }
        };
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.b.a().d(this.ad, this.d);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        this.b.a().c(this.ad);
        super.u();
    }
}
