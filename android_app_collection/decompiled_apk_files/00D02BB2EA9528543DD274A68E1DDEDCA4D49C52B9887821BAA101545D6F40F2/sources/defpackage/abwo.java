package defpackage;

import android.app.Application;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: abwo  reason: default package */
/* loaded from: classes2.dex */
public final class abwo {
    private final gga a;
    private final bwqv b;

    public abwo(gga ggaVar, bwqv bwqvVar) {
        this.a = ggaVar;
        this.b = bwqvVar;
    }

    public final void a() {
        this.a.D(new abwn());
    }

    public final void b(acei aceiVar, int i) {
        Application application = this.a.getApplication();
        bwqv bwqvVar = this.b;
        dcdc<acej> c = aceiVar.c();
        bbuu bbuuVar = new bbuu();
        acdh acdhVar = new acdh();
        Bundle aV = acdh.aV(i);
        bwqvVar.c(aV, "LIGHTBOX_ITEMS", new bcqm(acdh.aS(c, eaol.a(), application)));
        bwqvVar.c(aV, "VOTE_MANAGER", bbuuVar);
        acdhVar.B(aV);
        this.a.D(acdhVar);
    }
}
