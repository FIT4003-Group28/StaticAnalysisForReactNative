package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zmf  reason: default package */
/* loaded from: classes7.dex */
public class zmf implements zda {
    private final vyp a;
    private final dcdc<amvh> b;
    private final long c;
    private final vyo d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final zcz i;
    private final boolean j;
    private final btpc k;

    public zmf(Resources resources, vyp vypVar, dcdc<amvh> dcdcVar, long j, vyo vyoVar, zcz zczVar, boolean z, btpc btpcVar) {
        this.a = vypVar;
        this.b = dcdcVar;
        this.c = j;
        this.d = vyoVar;
        this.e = resources.getString(R.string.FIND_PARKING);
        this.f = resources.getString(R.string.FIND_PARKING_NEAR_DESTINATION);
        this.g = resources.getString(R.string.EDIT_PARKING);
        this.h = resources.getString(R.string.SEE_MORE_PARKING_OPTIONS);
        this.i = zczVar;
        this.j = z;
        this.k = btpcVar;
    }

    @Override // defpackage.zda
    public Boolean a() {
        return Boolean.valueOf(this.k.i());
    }

    @Override // defpackage.zda
    public String b() {
        dpbl x;
        dcdc<amvh> dcdcVar = this.b;
        if (!dcdcVar.isEmpty() && ((amvh) dcft.s(dcdcVar)).y()) {
            return this.g;
        }
        dcdc<amvh> dcdcVar2 = this.b;
        if (!dcdcVar2.isEmpty() && (x = ((amvh) dcft.s(dcdcVar2)).x()) != null) {
            dpzi dpziVar = x.c;
            if (dpziVar == null) {
                dpziVar = dpzi.e;
            }
            dpzh b = dpzh.b(dpziVar.b);
            if (b == null) {
                b = dpzh.UNKNOWN_PARKING_PRESENCE;
            }
            if (b.equals(dpzh.HAS_PARKING)) {
                return this.h;
            }
        }
        return d().booleanValue() ? this.f : this.e;
    }

    @Override // defpackage.zda
    public cjtd c() {
        return cjtd.a(dtyb.dQ);
    }

    @Override // defpackage.zda
    public Boolean d() {
        return Boolean.valueOf(!this.j);
    }

    @Override // defpackage.jaf
    public Boolean e() {
        throw null;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        this.i.z();
        this.a.b();
        this.a.a(this.b, this.c, this.d);
        return cqkl.a;
    }
}
