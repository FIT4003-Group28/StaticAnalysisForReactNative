package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aict  reason: default package */
/* loaded from: classes.dex */
public final class aict {
    public final aicn c;
    public final aafo d;
    public final azqb e;
    public boolean g;
    private final ajxz h;
    public boolean f = false;
    public final aics a = new aics(this);
    public final aicq b = new aicq(this);

    public aict(aicn aicnVar, aafo aafoVar, ajxz ajxzVar, azqb azqbVar) {
        this.c = aicnVar;
        this.d = aafoVar;
        this.h = ajxzVar;
        this.e = azqbVar;
    }

    public final void a(asaj asajVar) {
        final atuq atuqVar;
        arag aragVar;
        if ((asajVar.b & 134217728) == 0 || this.f) {
            return;
        }
        arzw arzwVar = asajVar.B;
        if (arzwVar == null) {
            arzwVar = arzw.a;
        }
        if (arzwVar.b == 130741768) {
            atuqVar = (atuq) arzwVar.c;
        } else {
            atuqVar = atuq.a;
        }
        this.c.rY(atuqVar.d);
        aicn aicnVar = this.c;
        if ((atuqVar.b & 1) != 0) {
            aragVar = atuqVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        aicnVar.g(ajgl.b(aragVar));
        final acte acteVar = new acte(atuqVar.h);
        ((acti) this.e.get()).u(acteVar, null);
        if ((atuqVar.b & 4) == 0) {
            this.c.f(null);
        } else {
            this.c.f(new View.OnClickListener() { // from class: aico
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aict aictVar = aict.this;
                    atuq atuqVar2 = atuqVar;
                    acum acumVar = acteVar;
                    aafo aafoVar = aictVar.d;
                    apzg apzgVar = atuqVar2.e;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.a(apzgVar);
                    ((acti) aictVar.e.get()).H(3, acumVar, null);
                }
            });
        }
        if ((atuqVar.b & 8) == 0) {
            this.c.e(0);
        } else {
            aicn aicnVar2 = this.c;
            ajxz ajxzVar = this.h;
            arhs arhsVar = atuqVar.f;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            aicnVar2.e(ajxzVar.a(b));
        }
        this.f = true;
        this.c.h();
    }
}
