package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: awpr  reason: default package */
/* loaded from: classes3.dex */
public final class awpr extends itb implements awps {
    private final btvo a;
    private final gga b;
    private final dxio<afha> c;
    private final dxio<awpl> d;

    public awpr(btvo btvoVar, gga ggaVar, dxio<afha> dxioVar, dxio<awpl> dxioVar2) {
        this.a = btvoVar;
        this.b = ggaVar;
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    @Override // defpackage.awps
    public final boolean e() {
        awpl a = this.d.a();
        GmmLocation a2 = a.c.a().a();
        if (a2 == null) {
            return false;
        }
        if (a.b.m(bvjk.jl, false)) {
            return true;
        }
        return a.a.h(dcvs.b(a2.getLatitude(), a2.getLongitude()).k());
    }

    @Override // defpackage.awps
    public final void f() {
        if (!awpl.a(this.a)) {
            return;
        }
        String str = this.a.getParkingPaymentParameters().b;
        debv debvVar = new debv();
        debvVar.c = str;
        this.c.a().f(this.b, new Intent("android.intent.action.VIEW", Uri.parse(debvVar.toString())), 2);
    }

    @Override // defpackage.awps
    public final dbsg<dfvu> i() {
        return dbpy.a;
    }
}
