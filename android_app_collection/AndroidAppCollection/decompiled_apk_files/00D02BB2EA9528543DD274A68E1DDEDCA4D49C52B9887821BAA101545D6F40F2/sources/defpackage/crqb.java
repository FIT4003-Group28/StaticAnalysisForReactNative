package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: crqb  reason: default package */
/* loaded from: classes5.dex */
public class crqb extends crqy implements crqj {
    @dzsi
    public crqa a;
    public boolean c;
    @dzsi
    public final crjl d;
    @dzsi
    public final aryr e;
    public final int f;
    private final long h;

    public crqb(int i, @dzsi crqa crqaVar, @dzsi aryr aryrVar, @dzsi crjl crjlVar, long j, boolean z) {
        super(z);
        this.f = i;
        this.a = crqaVar;
        this.d = crjlVar;
        this.e = aryrVar;
        this.h = j;
    }

    public static crqb m(int i, crqa crqaVar, long j, @dzsi aryr aryrVar, @dzsi crjl crjlVar) {
        return new crqb(i, crqaVar, aryrVar, crjlVar, j, false);
    }

    @Override // defpackage.crqw
    public final crqv a() {
        if (this.f == 2) {
            return crqv.FREE_NAV_DESTINATION_EXPLICIT;
        }
        return crqv.FREE_NAV_DESTINATION_OPPORTUNISTIC;
    }

    @Override // defpackage.crqw
    public final boolean b() {
        return this.f == 2;
    }

    @Override // defpackage.crqw
    public final boolean c() {
        return true;
    }

    @Override // defpackage.crpu, defpackage.crqw
    public final long f() {
        return this.h;
    }

    @Override // defpackage.crqj
    public final boolean i() {
        return true;
    }

    @Override // defpackage.crqj
    @dzsi
    public final amuh j() {
        crqa crqaVar = this.a;
        if (crqaVar != null) {
            return ((crpt) crqaVar).b;
        }
        return null;
    }

    @Override // defpackage.crqj
    @dzsi
    public final amub k() {
        return null;
    }

    @Override // defpackage.crqj
    @dzsi
    public final amub l() {
        return null;
    }

    @Override // defpackage.crqy
    public final crqx n() {
        return new crqx(R.string.NO_ROUTE_FOUND, dtxp.aw, dtxp.ax);
    }

    @Override // defpackage.crqj
    public final dpfa d() {
        dpfh dpfhVar;
        crqa crqaVar = this.a;
        if (crqaVar != null && (dpfhVar = ((crpt) crqaVar).c) != null && (dpfhVar.a & 64) != 0) {
            dpfa dpfaVar = dpfhVar.i;
            return dpfaVar == null ? dpfa.e : dpfaVar;
        }
        dpez bZ = dpfa.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpfa dpfaVar2 = (dpfa) bZ.b;
        dpfaVar2.a |= 4;
        dpfaVar2.d = true;
        return bZ.bK();
    }
}
