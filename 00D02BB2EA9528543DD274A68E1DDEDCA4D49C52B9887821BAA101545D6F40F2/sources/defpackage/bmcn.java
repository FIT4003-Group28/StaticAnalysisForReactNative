package defpackage;
/* compiled from: PG */
/* renamed from: bmcn  reason: default package */
/* loaded from: classes3.dex */
public class bmcn {
    public final dodk a;
    public final aim<String, dnfd> b;
    private final aim<String, dnfd> c;
    private final aim<String, dodj> d;

    public bmcn(dodk dodkVar, bmcp bmcpVar) {
        aim<String, dnfd> aimVar;
        this.a = dodkVar;
        if (bmcpVar == null) {
            aimVar = new aim<>();
        } else {
            aim<String, dnfd> aimVar2 = new aim<>();
            for (dnfd dnfdVar : bmcpVar.a) {
                aimVar2.put(dnfdVar.b, dnfdVar);
            }
            aimVar = aimVar2;
        }
        this.b = aimVar;
        aim<String, dnfd> aimVar3 = new aim<>();
        for (dgls dglsVar : dodkVar.a) {
            for (dglo dgloVar : dglsVar.d) {
                dnfc bZ = dnfd.d.bZ();
                String str = dgloVar.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnfd dnfdVar2 = (dnfd) bZ.b;
                str.getClass();
                dnfdVar2.a |= 1;
                dnfdVar2.b = str;
                dglu dgluVar = dgloVar.d;
                dgluVar = dgluVar == null ? dglu.e : dgluVar;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnfd dnfdVar3 = (dnfd) bZ.b;
                dgluVar.getClass();
                dnfdVar3.c = dgluVar;
                dnfdVar3.a |= 2;
                aimVar3.put(dgloVar.b, bZ.bK());
            }
        }
        this.c = aimVar3;
        aim<String, dodj> aimVar4 = new aim<>();
        for (dodj dodjVar : dodkVar.b) {
            aimVar4.put(dodjVar.a, dodjVar);
        }
        this.d = aimVar4;
    }

    public final bmcp a() {
        bmco bZ = bmcp.b.bZ();
        int i = 0;
        while (true) {
            aim<String, dnfd> aimVar = this.b;
            if (i < aimVar.j) {
                bZ.a(aimVar.j(i));
                i++;
            } else {
                return bZ.bK();
            }
        }
    }

    public final dnfd b(String str) {
        return this.b.get(str);
    }

    public final dnfd c(String str) {
        if (this.c.get(str) == null) {
            return null;
        }
        return this.c.get(str);
    }

    public final void d(String str) {
        this.d.get(str);
    }
}
