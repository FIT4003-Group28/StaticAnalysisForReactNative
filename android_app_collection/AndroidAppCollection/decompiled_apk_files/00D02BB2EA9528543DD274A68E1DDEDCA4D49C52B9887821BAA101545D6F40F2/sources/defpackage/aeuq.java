package defpackage;

import android.graphics.Point;
/* compiled from: PG */
/* renamed from: aeuq  reason: default package */
/* loaded from: classes2.dex */
public final class aeuq extends aeux {
    private final arbx e;
    private final akpm f;

    public aeuq(akpm akpmVar, arbx arbxVar) {
        this.f = akpmVar;
        this.e = arbxVar;
    }

    @Override // defpackage.aeux
    @dzsi
    public final Point d() {
        alrh alrhVar = new alrh(this.f.l());
        akra akraVar = new akra();
        if (this.e.f(akraVar)) {
            return alrhVar.b(akraVar.S());
        }
        return null;
    }
}
