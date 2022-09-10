package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: akdu  reason: default package */
/* loaded from: classes2.dex */
public final class akdu implements Serializable, akee, afds {
    @dzsi
    public transient akfa a;
    @dzsi
    public transient akfc b;
    private final akes c;

    public akdu(akes akesVar) {
        this.c = akesVar;
    }

    @Override // defpackage.afds
    public final void Pn(gga ggaVar, boolean z) {
        a(ggaVar, z);
    }

    @Override // defpackage.akee
    public final void a(gga ggaVar, boolean z) {
        ((akbx) btsq.b(akbx.class, ggaVar)).wN(this);
        akfa akfaVar = this.a;
        dbsk.s(akfaVar);
        btlu j = akfaVar.j();
        aket a = this.c.a();
        if (z) {
            if (akdv.g(j, this.c.b())) {
                a.a(ggaVar, j);
                return;
            }
            akfc akfcVar = this.b;
            dbsk.s(akfcVar);
            akfcVar.b(this.c);
            return;
        }
        a.b(ggaVar, j);
    }
}
