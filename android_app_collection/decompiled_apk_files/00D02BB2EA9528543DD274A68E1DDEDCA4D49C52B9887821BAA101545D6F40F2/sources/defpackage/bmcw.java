package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bmcw  reason: default package */
/* loaded from: classes3.dex */
public class bmcw extends bmcy {
    protected static final dgkw a;
    protected static final dgkw b;
    protected bmcm c;
    protected final dnfc d;

    static {
        dgkv bZ = dgkw.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgkw dgkwVar = (dgkw) bZ.b;
        dgkwVar.a |= 1;
        dgkwVar.b = true;
        a = bZ.bK();
        dgkv bZ2 = dgkw.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgkw dgkwVar2 = (dgkw) bZ2.b;
        dgkwVar2.a |= 1;
        dgkwVar2.b = false;
        b = bZ2.bK();
    }

    public bmcw(dglo dgloVar, bmcm bmcmVar, Resources resources) {
        super(dgloVar, resources);
        dgkw dgkwVar;
        bmct bmctVar;
        dnfc bZ = dnfd.d.bZ();
        this.d = bZ;
        this.c = bmcmVar;
        String str = dgloVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfd dnfdVar = (dnfd) bZ.b;
        str.getClass();
        dnfdVar.a |= 1;
        dnfdVar.b = str;
        dglu dgluVar = dgloVar.d;
        if ((dgluVar == null ? dglu.e : dgluVar).b != 3) {
            this.h = bmct.NOT_SET;
            return;
        }
        dglu dgluVar2 = dgloVar.d;
        dgluVar2 = dgluVar2 == null ? dglu.e : dgluVar2;
        if (dgluVar2.b == 3) {
            dgkwVar = (dgkw) dgluVar2.c;
        } else {
            dgkwVar = dgkw.f;
        }
        if (dgkwVar.b) {
            bmctVar = bmct.ON;
        } else {
            bmctVar = bmct.OFF;
        }
        this.h = bmctVar;
        dglu dgluVar3 = dgloVar.d;
        dgluVar3 = dgluVar3 == null ? dglu.e : dgluVar3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfd dnfdVar2 = (dnfd) bZ.b;
        dgluVar3.getClass();
        dnfdVar2.c = dgluVar3;
        dnfdVar2.a |= 2;
    }

    @Override // defpackage.bmcy, defpackage.bmcu
    public String a() {
        return this.e.c;
    }

    @Override // defpackage.bmcu
    public cqkl b() {
        bmct bmctVar = this.h;
        bmct[] values = bmct.values();
        this.h = values[(bmctVar.ordinal() + 1) % values.length];
        dglt bZ = dglu.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dglu dgluVar = (dglu) bZ.b;
        dgluVar.d = 1;
        dgluVar.a |= 1;
        int ordinal = this.h.ordinal();
        if (ordinal == 1) {
            dnfc dnfcVar = this.d;
            dgkw dgkwVar = a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dglu dgluVar2 = (dglu) bZ.b;
            dgkwVar.getClass();
            dgluVar2.c = dgkwVar;
            dgluVar2.b = 3;
            if (dnfcVar.c) {
                dnfcVar.bF();
                dnfcVar.c = false;
            }
            dnfd dnfdVar = (dnfd) dnfcVar.b;
            dglu bK = bZ.bK();
            dnfd dnfdVar2 = dnfd.d;
            bK.getClass();
            dnfdVar.c = bK;
            dnfdVar.a |= 2;
        } else if (ordinal != 2) {
            dnfc dnfcVar2 = this.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dglu dgluVar3 = (dglu) bZ.b;
            if (dgluVar3.b == 3) {
                dgluVar3.b = 0;
                dgluVar3.c = null;
            }
            if (dnfcVar2.c) {
                dnfcVar2.bF();
                dnfcVar2.c = false;
            }
            dnfd dnfdVar3 = (dnfd) dnfcVar2.b;
            dglu bK2 = bZ.bK();
            dnfd dnfdVar4 = dnfd.d;
            bK2.getClass();
            dnfdVar3.c = bK2;
            dnfdVar3.a |= 2;
        } else {
            dnfc dnfcVar3 = this.d;
            dgkw dgkwVar2 = b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dglu dgluVar4 = (dglu) bZ.b;
            dgkwVar2.getClass();
            dgluVar4.c = dgkwVar2;
            dgluVar4.b = 3;
            if (dnfcVar3.c) {
                dnfcVar3.bF();
                dnfcVar3.c = false;
            }
            dnfd dnfdVar5 = (dnfd) dnfcVar3.b;
            dglu bK3 = bZ.bK();
            dnfd dnfdVar6 = dnfd.d;
            bK3.getClass();
            dnfdVar5.c = bK3;
            dnfdVar5.a |= 2;
        }
        bmcm bmcmVar = this.c;
        if (bmcmVar != null) {
            bmcmVar.RD(this.d.bK());
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bmcu
    public acli g() {
        return acli.a(dtxo.X);
    }
}
