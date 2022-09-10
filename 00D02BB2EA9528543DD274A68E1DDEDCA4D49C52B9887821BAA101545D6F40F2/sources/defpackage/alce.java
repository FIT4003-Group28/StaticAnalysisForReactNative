package defpackage;
/* compiled from: PG */
/* renamed from: alce  reason: default package */
/* loaded from: classes2.dex */
public final class alce {
    private final dpcb a;
    private final douk b;

    public alce() {
        dpcb bZ = dpce.f.bZ();
        this.a = bZ;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpce dpceVar = (dpce) bZ.b;
        dpceVar.b = 2;
        dpceVar.a |= 1;
        this.b = doul.f.bZ();
    }

    public final dpce a() {
        dpcb dpcbVar = this.a;
        douk doukVar = this.b;
        if (dpcbVar.c) {
            dpcbVar.bF();
            dpcbVar.c = false;
        }
        dpce dpceVar = (dpce) dpcbVar.b;
        doul bK = doukVar.bK();
        dpce dpceVar2 = dpce.f;
        bK.getClass();
        dpceVar.c = bK;
        dpceVar.a |= 2;
        return dpcbVar.bK();
    }

    public final void b(String str) {
        douk doukVar = this.b;
        if (doukVar.c) {
            doukVar.bF();
            doukVar.c = false;
        }
        doul doulVar = (doul) doukVar.b;
        doul doulVar2 = doul.f;
        str.getClass();
        doulVar.a |= 1;
        doulVar.b = str;
    }

    public final void c(int i) {
        douk doukVar = this.b;
        String e = bvoa.e(i);
        if (doukVar.c) {
            doukVar.bF();
            doukVar.c = false;
        }
        doul doulVar = (doul) doukVar.b;
        doul doulVar2 = doul.f;
        e.getClass();
        doulVar.a |= 8;
        doulVar.e = e;
    }
}
