package defpackage;
/* compiled from: PG */
/* renamed from: sif  reason: default package */
/* loaded from: classes4.dex */
public final class sif implements skq, skw, skn {
    public anvh a = anvh.NOT_ASKED;
    public skn b;
    private final gpn c;

    public sif(gpn gpnVar, skn sknVar) {
        this.c = gpnVar;
        this.b = sknVar;
    }

    @Override // defpackage.skw
    public final void a() {
        if (this.c.a()) {
            this.a = anvh.PREVIOUSLY_GRANTED;
            skn sknVar = this.b;
            if (sknVar == null) {
                return;
            }
            sknVar.d();
            return;
        }
        gpn gpnVar = this.c;
        if (gpnVar.a()) {
            d();
            return;
        }
        aopa createBuilder = atvp.a.createBuilder();
        atvo atvoVar = gpnVar.b;
        createBuilder.copyOnWrite();
        atvp atvpVar = (atvp) createBuilder.instance;
        atvpVar.c = atvoVar.m;
        atvpVar.b |= 1;
        gpnVar.a.d((atvp) createBuilder.mo39build(), new gpm(this));
    }

    @Override // defpackage.skq
    public final void b() {
        this.b = null;
    }

    @Override // defpackage.skq
    public final void c(skr skrVar) {
    }

    @Override // defpackage.skn
    public final void d() {
        this.a = anvh.GRANTED;
        skn sknVar = this.b;
        if (sknVar != null) {
            sknVar.d();
        }
    }
}
