package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ajqi  reason: default package */
/* loaded from: classes2.dex */
public final class ajqi extends v<ajqa> {
    final /* synthetic */ dzaa g;
    private dzak h;

    public ajqi(dzaa dzaaVar) {
        this.g = dzaaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.v
    public final void i() {
        dzak dzakVar = this.h;
        if (dzakVar != null) {
            dzbd.e((AtomicReference) dzakVar);
        }
        dzaa dzaaVar = this.g;
        dzbu dzbuVar = new dzbu(new ajqh(this), dzbl.d);
        dzaaVar.f(dzbuVar);
        this.h = dzbuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.v
    public final void j() {
        dzak dzakVar = this.h;
        if (dzakVar != null) {
            dzbd.e((AtomicReference) dzakVar);
        }
    }
}
