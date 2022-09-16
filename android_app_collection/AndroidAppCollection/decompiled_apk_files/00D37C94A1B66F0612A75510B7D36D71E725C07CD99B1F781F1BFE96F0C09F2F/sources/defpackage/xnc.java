package defpackage;
/* compiled from: PG */
/* renamed from: xnc  reason: default package */
/* loaded from: classes4.dex */
public final class xnc implements afzf {
    private final ajuw a;
    private final yzj b;
    private final ajuf c;

    public xnc(ajuw ajuwVar, yzj yzjVar, ajuf ajufVar) {
        this.a = ajuwVar;
        this.b = yzjVar;
        this.c = ajufVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.b.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asbi asbiVar = (asbi) obj;
        aunm aunmVar = null;
        if (asbiVar != null) {
            asbj asbjVar = asbiVar.c;
            if (asbjVar == null) {
                asbjVar = asbj.a;
            }
            if (asbjVar.b == 113762946) {
                asbj asbjVar2 = asbiVar.c;
                if (asbjVar2 == null) {
                    asbjVar2 = asbj.a;
                }
                if (asbjVar2.b == 113762946) {
                    aunmVar = (aunm) asbjVar2.c;
                } else {
                    aunmVar = aunm.a;
                }
            }
        }
        if (aunmVar != null) {
            this.a.c(aunmVar, this.c);
        }
    }
}
