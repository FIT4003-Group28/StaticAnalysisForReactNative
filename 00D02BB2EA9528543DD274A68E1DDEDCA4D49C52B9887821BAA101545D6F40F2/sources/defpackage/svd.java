package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: svd  reason: default package */
/* loaded from: classes7.dex */
public final class svd implements suu {
    private final Activity a;
    private final dxio<vzi> b;
    private final dxio<ascb> c;
    private final bwqv d;
    private final bvjj e;
    private final ahjq f;
    private final vwv g;
    private final byyp h;
    private final tnv i;

    public svd(Activity activity, dxio<vzi> dxioVar, dxio<ascb> dxioVar2, bwqv bwqvVar, bvjj bvjjVar, ahjq ahjqVar, vwv vwvVar, byyp byypVar, tnv tnvVar) {
        this.a = activity;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = bwqvVar;
        this.e = bvjjVar;
        this.f = ahjqVar;
        this.g = vwvVar;
        this.h = byypVar;
        this.i = tnvVar;
    }

    @Override // defpackage.suu
    public final void a(tlv tlvVar, amve amveVar) {
        dbsg<Integer> w = tlvVar.w(amveVar);
        if (!w.a()) {
            return;
        }
        dqvj b = vyb.b(amveVar);
        if (b != null) {
            this.i.b(b);
        }
        if (b(tlvVar, amveVar)) {
            if (b == dqvj.TRANSIT) {
                this.h.b(tlvVar.B(this.a), tlvVar.x(w.b().intValue()).b().intValue(), byyo.DIRECTIONS_LIST);
                return;
            } else {
                this.c.a().a(tlvVar.B(this.a), tlvVar.x(w.b().intValue()).b().intValue(), asca.DIRECTIONS, false);
                return;
            }
        }
        this.b.a().a(this.d, tlvVar.B(this.a), tlvVar.x(w.b().intValue()).b().intValue(), 0);
    }

    @Override // defpackage.suu
    public final boolean b(tlv tlvVar, amve amveVar) {
        dbsg<Integer> w = tlvVar.w(amveVar);
        if (!w.a()) {
            return false;
        }
        if (vyb.b(amveVar) == dqvj.TRANSIT) {
            return zba.f(tlvVar.A(amveVar, this.a).b(), this.f, this.e, this.g);
        }
        Activity activity = this.a;
        return zba.d(activity, this.e, this.f, tlvVar.B(activity), tlvVar.x(w.b().intValue()).b().intValue(), this.g);
    }
}
