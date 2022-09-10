package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: yik  reason: default package */
/* loaded from: classes7.dex */
public final class yik extends yie<ynl> {
    public yos c;
    private douz d = douz.g;

    @Override // defpackage.yie
    protected final /* bridge */ /* synthetic */ ynl g(@dzsi Bundle bundle) {
        yiu yiuVar = yiu.c;
        if (bundle != null) {
            yiuVar = (yiu) dsuv.c(bundle, "routePreferences", yiu.c, dsqa.b());
            this.d = (douz) dsuv.c(bundle, "relevantOptions", douz.g, dsqa.b());
        }
        return this.c.a(this.d, yiuVar, new yiw(this) { // from class: yij
            private final yik a;

            {
                this.a = this;
            }

            @Override // defpackage.yiw
            public final void a(yiv yivVar) {
                this.a.Ra(yivVar);
            }
        });
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyc.cK;
    }

    @Override // defpackage.yie
    protected final cqiw<ynl> q() {
        return new yko();
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        dsuv.d(bundle, "relevantOptions", this.d);
        yor yorVar = (yor) ((yie) this).b;
        if (yorVar != null) {
            dsuv.d(bundle, "routePreferences", yorVar.c());
        }
    }
}
