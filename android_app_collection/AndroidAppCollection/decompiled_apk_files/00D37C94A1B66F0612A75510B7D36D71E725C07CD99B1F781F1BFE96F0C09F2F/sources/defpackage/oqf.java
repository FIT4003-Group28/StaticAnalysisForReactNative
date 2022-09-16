package defpackage;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oqf  reason: default package */
/* loaded from: classes4.dex */
public final class oqf implements ooo {
    public final String a;
    public final Bundle b;
    public final agp c;

    public oqf(agp agpVar, String str, Bundle bundle) {
        this.c = agpVar;
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.ooo
    public final void a(final ooh oohVar) {
        ((oon) oohVar).f.I().execute(new Runnable() { // from class: oqe
            @Override // java.lang.Runnable
            public final void run() {
                oqf oqfVar = oqf.this;
                oqfVar.c.c(yln.e(((oon) oohVar).f.n().a(oqfVar.a, oqfVar.b)));
            }
        });
    }

    @Override // defpackage.ooo
    public final void b(Exception exc) {
        this.c.c(adz.h());
    }
}
