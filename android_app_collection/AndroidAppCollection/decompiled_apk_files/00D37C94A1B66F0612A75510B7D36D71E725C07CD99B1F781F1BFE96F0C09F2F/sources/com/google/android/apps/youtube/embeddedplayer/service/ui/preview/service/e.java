package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e {
    public final Handler a;
    public final abdo b;
    public final ajmy c;
    public a d;
    public final g e;
    private final yrj f;

    public e(g gVar, abdo abdoVar, ajmy ajmyVar, yrj yrjVar) {
        gVar.getClass();
        this.e = gVar;
        this.a = new Handler(Looper.getMainLooper());
        this.b = abdoVar;
        this.c = ajmyVar;
        this.f = yrjVar;
    }

    public static avhn a(asea aseaVar) {
        asec asecVar;
        asdy asdyVar = aseaVar.c;
        if (asdyVar == null) {
            asdyVar = asdy.a;
        }
        if (asdyVar.b != 87079103) {
            return avhn.a;
        }
        asdy asdyVar2 = aseaVar.c;
        if (asdyVar2 == null) {
            asdyVar2 = asdy.a;
        }
        if (asdyVar2.b == 87079103) {
            asecVar = (asec) asdyVar2.c;
        } else {
            asecVar = asec.a;
        }
        avhn avhnVar = asecVar.b;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public final void b() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.d();
        }
        this.d = null;
    }

    public final void c() {
        int i = 1;
        if (true != this.f.o()) {
            i = 2;
        }
        f(i);
    }

    public final boolean d() {
        a aVar = this.d;
        return aVar != null && aVar.j();
    }

    public final boolean e() {
        a aVar = this.d;
        return aVar != null && aVar.k();
    }

    public final void f(int i) {
        b();
        g gVar = this.e;
        String str = i != 1 ? i != 2 ? "UNKNOWN" : "INTERNAL_ERROR" : "NETWORK_ERROR";
        boolean e = e();
        boolean d = d();
        alyq alyqVar = gVar.a;
        if (alyqVar != null) {
            try {
                Parcel pv = alyqVar.pv();
                pv.writeString(str);
                dve.e(pv, e);
                dve.e(pv, d);
                alyqVar.px(2, pv);
            } catch (RemoteException unused) {
            }
        }
    }
}
