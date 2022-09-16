package com.google.ads.mediation.customevent;

import android.os.RemoteException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CustomEventAdapter implements dpe, dpf {
    dpk a;
    dpl b;

    private static Object h() {
        try {
            return Class.forName(null).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder("null".length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: null. ");
            sb.append(message);
            qfl.e(sb.toString());
            return null;
        }
    }

    @Override // defpackage.dpd
    public final Class a() {
        return qgw.class;
    }

    @Override // defpackage.dpd
    public final Class b() {
        return dpm.class;
    }

    @Override // defpackage.dpd
    public final void c() {
        dpk dpkVar = this.a;
        if (dpkVar != null) {
            dpkVar.a();
        }
        dpl dplVar = this.b;
        if (dplVar != null) {
            dplVar.a();
        }
    }

    @Override // defpackage.dpe
    public final void d() {
    }

    @Override // defpackage.dpe
    public final /* bridge */ /* synthetic */ void e(qfd qfdVar, dpi dpiVar, qgw qgwVar) {
        dpm dpmVar = (dpm) dpiVar;
        String str = dpmVar.b;
        dpk dpkVar = (dpk) h();
        this.a = dpkVar;
        if (dpkVar == null) {
            dnj dnjVar = dnj.INTERNAL_ERROR;
            String.valueOf(String.valueOf(dnjVar)).length();
            qar.c();
            if (!qga.f()) {
                qfl.g("#008 Must be called on the main UI thread.");
                qga.a.post(new qfc(qfdVar, dnjVar, 1));
                return;
            }
            try {
                qfdVar.a.g(ptx.i(dnjVar));
                return;
            } catch (RemoteException e) {
                qfl.h("#007 Could not call remote method.", e);
                return;
            }
        }
        if (qgwVar != null) {
            String str2 = dpmVar.a;
            qgwVar.a();
        }
        dpk dpkVar2 = this.a;
        String str3 = dpmVar.a;
        String str4 = dpmVar.c;
        dpkVar2.b();
    }

    @Override // defpackage.dpf
    public final void f() {
        this.b.b();
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void g(qfd qfdVar, dpi dpiVar, qgw qgwVar) {
        dpm dpmVar = (dpm) dpiVar;
        String str = dpmVar.b;
        dpl dplVar = (dpl) h();
        this.b = dplVar;
        if (dplVar == null) {
            dnj dnjVar = dnj.INTERNAL_ERROR;
            String.valueOf(String.valueOf(dnjVar)).length();
            qar.c();
            if (!qga.f()) {
                qfl.g("#008 Must be called on the main UI thread.");
                qga.a.post(new qfc(qfdVar, dnjVar));
                return;
            }
            try {
                qfdVar.a.g(ptx.i(dnjVar));
                return;
            } catch (RemoteException e) {
                qfl.h("#007 Could not call remote method.", e);
                return;
            }
        }
        if (qgwVar != null) {
            String str2 = dpmVar.a;
            qgwVar.a();
        }
        dpl dplVar2 = this.b;
        String str3 = dpmVar.a;
        String str4 = dpmVar.c;
        dplVar2.c();
    }
}
