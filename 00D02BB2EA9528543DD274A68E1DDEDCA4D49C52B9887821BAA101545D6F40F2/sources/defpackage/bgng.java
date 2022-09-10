package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bgng  reason: default package */
/* loaded from: classes3.dex */
public class bgng {
    private final akfa a;
    private final dxio<afha> b;
    private final cplz c;
    private final gga d;
    private final dxio<afef> e;

    public bgng(gga ggaVar, akfa akfaVar, dxio<afha> dxioVar, cplz cplzVar, dxio<afef> dxioVar2) {
        this.d = ggaVar;
        this.a = akfaVar;
        this.b = dxioVar;
        this.c = cplzVar;
        this.e = dxioVar2;
    }

    public final void a(dipk dipkVar) {
        String o = this.a.o();
        if (!btlu.n(this.a.j())) {
            if (dbsj.d(o)) {
                return;
            }
            cplz cplzVar = this.c;
            cplzVar.a = "GMB_LOCAL_POSTS";
            cplzVar.c(o);
            dioz diozVar = dipkVar.n;
            if (diozVar == null) {
                diozVar = dioz.d;
            }
            cplzVar.b(diozVar.c);
            cplzVar.b = Locale.getDefault().getLanguage();
            gga ggaVar = this.d;
            this.b.a().f(ggaVar, this.c.a(ggaVar), 4);
            return;
        }
        afdt afdtVar = afdt.a;
        this.e.a().r();
    }
}
