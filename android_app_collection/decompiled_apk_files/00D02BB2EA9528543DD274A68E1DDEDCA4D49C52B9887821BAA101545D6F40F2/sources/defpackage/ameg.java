package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: ameg  reason: default package */
/* loaded from: classes.dex */
public final class ameg implements cap<cac, InputStream> {
    private final cap<cac, InputStream> a;
    private final btyh b = ((btyg) btsr.a(btyg.class)).sJ();

    public ameg(caz cazVar) {
        this.a = new btg(((amdt) btsr.a(amdt.class)).sK()).a(cazVar);
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(cac cacVar) {
        return true;
    }

    @Override // defpackage.cap
    @dzsi
    public final /* bridge */ /* synthetic */ cao<InputStream> b(cac cacVar, int i, int i2, bua buaVar) {
        cac cacVar2 = cacVar;
        if (this.b.b()) {
            return null;
        }
        return this.a.b(cacVar2, i, i2, buaVar);
    }
}
