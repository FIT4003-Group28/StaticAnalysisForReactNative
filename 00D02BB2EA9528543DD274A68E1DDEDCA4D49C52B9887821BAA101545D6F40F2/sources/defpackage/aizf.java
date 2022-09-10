package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.gms.location.LocationServices;
/* compiled from: PG */
/* renamed from: aizf  reason: default package */
/* loaded from: classes2.dex */
public final class aizf extends hxf {
    public cqkj b;
    public efg c;
    public aizy d;
    private cokf e;
    private aizs f;

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        this.e = LocationServices.getFusedLocationProviderClient(context);
        super.Qi(context);
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz a = jhz.a();
        a.a = "Edit Location Alerts";
        a.f(new aize());
        return a.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, Bundle bundle) {
        cqkj cqkjVar = this.b;
        if (cqkjVar == null) {
            dzvx.a("viewHierarchyFactory");
        }
        cqkf e = cqkjVar.e(new aizr());
        aizs aizsVar = this.f;
        if (aizsVar == null) {
            dzvx.a("editLocationAlertsViewModel");
        }
        e.e(aizsVar);
        dzvx.b(e, "viewHierarchyFactory.cre…ocationAlertsViewModel) }");
        return e.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        aizy aizyVar = this.d;
        if (aizyVar == null) {
            dzvx.a("editLocationAlertsViewModelImplFactory");
        }
        cokf cokfVar = this.e;
        if (cokfVar == null) {
            dzvx.a("fusedLocationClient");
        }
        ahya a = aizyVar.a.a();
        aizy.a(a, 1);
        cqhn a2 = aizyVar.b.a();
        aizy.a(a2, 2);
        aizy.a(cokfVar, 3);
        this.f = new aizx(a, a2, cokfVar);
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        egjVar.x(egr.a);
        egjVar.k(false);
        egjVar.ad(false);
        egjVar.f(false);
        efg efgVar = this.c;
        if (efgVar == null) {
            dzvx.a("uiTransitionStateApplier");
        }
        efgVar.a(egjVar.a());
    }
}
