package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: yig  reason: default package */
/* loaded from: classes7.dex */
public final class yig extends gen {
    public cqkj a;
    public yoi b;
    private douz c = douz.g;
    private yoh d;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf c = this.a.c(new yjn(), viewGroup);
        c.e(this.d);
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        yiv yivVar = yiv.e;
        if (bundle == null) {
            bundle = this.o;
        }
        if (bundle != null) {
            yivVar = (yiv) dsuv.c(bundle, "modePreferences", yiv.e, dsqa.b());
            this.c = (douz) dsuv.c(bundle, "relevantOptions", douz.g, dsqa.b());
        }
        yiv yivVar2 = yivVar;
        yoi yoiVar = this.b;
        douz douzVar = this.c;
        yiw yiwVar = new yiw(this) { // from class: yif
            private final yig a;

            {
                this.a = this;
            }

            @Override // defpackage.yiw
            public final void a(yiv yivVar3) {
                this.a.Ra(yivVar3);
            }
        };
        Activity activity = (Activity) ((dxjd) yoiVar.a).a;
        yoi.a(activity, 1);
        cqhn a = yoiVar.b.a();
        yoi.a(a, 2);
        cqhu a2 = yoiVar.c.a();
        yoi.a(a2, 3);
        vwv a3 = yoiVar.d.a();
        yoi.a(a3, 4);
        yon a4 = yoiVar.e.a();
        yoi.a(a4, 5);
        yos a5 = yoiVar.f.a();
        yoi.a(a5, 6);
        yoi.a(yivVar2, 7);
        yoi.a(douzVar, 8);
        yoi.a(yiwVar, 9);
        this.d = new yoh(activity, a, a2, a3, a4, a5, yivVar2, douzVar, yiwVar);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.ej;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        dsuv.d(bundle, "modePreferences", this.d.j());
        dsuv.d(bundle, "relevantOptions", this.c);
    }
}
