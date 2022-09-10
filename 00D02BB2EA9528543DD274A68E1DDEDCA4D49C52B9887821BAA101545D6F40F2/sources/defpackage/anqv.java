package defpackage;
/* compiled from: PG */
/* renamed from: anqv  reason: default package */
/* loaded from: classes2.dex */
public class anqv {
    static final dwjd b;
    public boolean a;
    private final anhp c;

    static {
        dwjc bZ = dwjd.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjd dwjdVar = (dwjd) bZ.b;
        int i = dwjdVar.a | 2;
        dwjdVar.a = i;
        dwjdVar.b = 15;
        dwjdVar.a = i | 4;
        dwjdVar.c = 15;
        dwjd.c(dwjdVar);
        b = bZ.bK();
    }

    public anqv(anhp anhpVar) {
        this.c = anhpVar;
    }

    public final void a(akqq akqqVar, anqu anquVar) {
        this.a = true;
        this.c.a(b, akqqVar, 4, new anqt(this, anquVar));
    }
}
