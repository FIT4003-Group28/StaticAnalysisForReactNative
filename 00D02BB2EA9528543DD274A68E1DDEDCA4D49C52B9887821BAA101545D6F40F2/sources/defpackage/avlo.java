package defpackage;
/* compiled from: PG */
/* renamed from: avlo  reason: default package */
/* loaded from: classes3.dex */
public class avlo extends Exception {
    public final transient drte a;

    public avlo(drtc drtcVar) {
        dbsk.a(drtcVar != drtc.OK);
        drtd bZ = drte.g.bZ();
        int i = drtcVar.s;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drte drteVar = (drte) bZ.b;
        drteVar.a |= 8;
        drteVar.e = i;
        this.a = bZ.bK();
    }

    public avlo(drtc drtcVar, String str) {
        super(str);
        dbsk.a(drtcVar != drtc.OK);
        drtd bZ = drte.g.bZ();
        int i = drtcVar.s;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drte drteVar = (drte) bZ.b;
        int i2 = drteVar.a | 8;
        drteVar.a = i2;
        drteVar.e = i;
        str.getClass();
        drteVar.a = i2 | 4;
        drteVar.d = str;
        this.a = bZ.bK();
    }

    public avlo(drtc drtcVar, Throwable th) {
        super(th);
        dbsk.a(drtcVar != drtc.OK);
        drtd bZ = drte.g.bZ();
        int i = drtcVar.s;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drte drteVar = (drte) bZ.b;
        drteVar.a |= 8;
        drteVar.e = i;
        String th2 = th.toString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drte drteVar2 = (drte) bZ.b;
        th2.getClass();
        drteVar2.a |= 4;
        drteVar2.d = th2;
        this.a = bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public avlo(drte drteVar) {
        super((drteVar.a & 4) != 0 ? drteVar.d : null);
        this.a = drteVar;
    }
}
