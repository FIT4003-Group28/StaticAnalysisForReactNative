package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dywi  reason: default package */
/* loaded from: classes6.dex */
public final class dywi implements dykh {
    final /* synthetic */ dywk a;

    public dywi(dywk dywkVar) {
        this.a = dywkVar;
    }

    @Override // defpackage.dykh
    public final void a(dyhw dyhwVar, byte[] bArr) {
        int i = dyzn.a;
        String str = this.a.b.b;
        String concat = str.length() != 0 ? "/".concat(str) : new String("/");
        dywj dywjVar = this.a.h;
        int i2 = dywj.x;
        synchronized (dywjVar.a) {
            dywj dywjVar2 = this.a.h;
            dywk dywkVar = dywjVar2.w;
            dywjVar2.b = dywb.a(dyhwVar, concat, dywkVar.e, dywkVar.c, dywkVar.i, dywjVar2.i.t == null);
            dywr dywrVar = dywjVar2.i;
            dywk dywkVar2 = dywjVar2.w;
            dyjb dyjbVar = dywrVar.p;
            if (dyjbVar != null) {
                dywkVar2.h.i(dyjbVar, dylt.REFUSED, true, new dyhw());
            } else if (dywrVar.k.size() >= dywrVar.u) {
                dywrVar.v.add(dywkVar2);
                dywrVar.p(dywkVar2);
            } else {
                dywrVar.b(dywkVar2);
            }
        }
    }

    @Override // defpackage.dykh
    public final void b(dyvs dyvsVar, boolean z, boolean z2, int i) {
        eaiz eaizVar;
        int i2 = dyzn.a;
        if (dyvsVar == null) {
            eaizVar = dywk.a;
        } else {
            eaizVar = ((dywz) dyvsVar).a;
            int i3 = (int) eaizVar.b;
            if (i3 > 0) {
                this.a.x(i3);
            }
        }
        dywj dywjVar = this.a.h;
        int i4 = dywj.x;
        synchronized (dywjVar.a) {
            dywj dywjVar2 = this.a.h;
            if (!dywjVar2.f) {
                if (dywjVar2.u) {
                    dywjVar2.c.a(eaizVar, (int) eaizVar.b);
                    dywjVar2.d |= z;
                    dywjVar2.e |= z2;
                } else {
                    dbsk.m(dywjVar2.w.g != -1, "streamId should be set");
                    dywjVar2.h.a(z, dywjVar2.w.g, eaizVar, z2);
                }
            }
            dyvr dyvrVar = this.a.s;
            if (i != 0) {
                dyvrVar.g += i;
                dyvrVar.b.a();
            }
        }
    }

    @Override // defpackage.dykh
    public final void c(dyjb dyjbVar) {
        int i = dyzn.a;
        dywj dywjVar = this.a.h;
        int i2 = dywj.x;
        synchronized (dywjVar.a) {
            this.a.h.q(dyjbVar, true, null);
        }
    }
}
