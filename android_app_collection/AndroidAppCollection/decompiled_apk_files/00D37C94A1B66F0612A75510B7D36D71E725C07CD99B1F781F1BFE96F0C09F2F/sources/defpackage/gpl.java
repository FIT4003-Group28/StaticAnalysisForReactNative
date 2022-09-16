package defpackage;
/* compiled from: PG */
/* renamed from: gpl  reason: default package */
/* loaded from: classes3.dex */
public final class gpl extends sht {
    private final acti a;

    public gpl(acti actiVar) {
        this.a = actiVar;
    }

    private final void b(actj actjVar, aopa aopaVar) {
        if (actjVar == null) {
            return;
        }
        if (aopaVar == null) {
            aopaVar = asix.a.createBuilder();
        }
        aopa createBuilder = asjj.a.createBuilder();
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asix asixVar = (asix) aopaVar.mo39build();
        asixVar.getClass();
        asjjVar.s = asixVar;
        asjjVar.c |= 16;
        acum acumVar = new acum(this.a.c(), actjVar);
        this.a.n(acumVar);
        this.a.H(3, acumVar, (asjj) createBuilder.mo39build());
    }

    @Override // defpackage.sht
    public final void a(aopa aopaVar) {
        anvg c;
        anvu anvuVar = (anvu) aopaVar.instance;
        if (anvuVar.c == 3 && ((anvk) anvuVar.d).j()) {
            b(actj.AR_CAMERA_VIEW, null);
        }
        if (((anvu) aopaVar.instance).c == 5) {
            aopa createBuilder = asix.a.createBuilder();
            actj actjVar = actj.AR_CAMERA_EFFECT;
            anvu anvuVar2 = (anvu) aopaVar.instance;
            if (anvuVar2.c == 5) {
                c = (anvg) anvuVar2.d;
            } else {
                c = anvg.c();
            }
            String d = c.d();
            createBuilder.copyOnWrite();
            asix asixVar = (asix) createBuilder.instance;
            d.getClass();
            asixVar.b |= 1;
            asixVar.c = d;
            b(actjVar, createBuilder);
        }
    }
}
