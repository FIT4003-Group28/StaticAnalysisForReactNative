package defpackage;
/* compiled from: PG */
/* renamed from: avzm  reason: default package */
/* loaded from: classes3.dex */
public class avzm {
    private final avoo a;

    public avzm(avoo avooVar) {
        this.a = avooVar;
    }

    public final avzl a(dlug dlugVar) {
        return new avzl(this.a, dlugVar);
    }

    public final avzl b(akqs akqsVar) {
        avoo avooVar = this.a;
        dlub bZ = dluc.d.bZ();
        dwzj r = akqsVar.j().r();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dluc dlucVar = (dluc) bZ.b;
        r.getClass();
        dlucVar.b = r;
        dlucVar.a |= 1;
        dwzj r2 = akqsVar.k().r();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dluc dlucVar2 = (dluc) bZ.b;
        r2.getClass();
        dlucVar2.c = r2;
        dlucVar2.a |= 2;
        dluc bK = bZ.bK();
        dlud bZ2 = dlug.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dlug dlugVar = (dlug) bZ2.b;
        bK.getClass();
        dlugVar.b = bK;
        dlugVar.a = 1;
        return new avzl(avooVar, bZ2.bK());
    }
}
