package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: yii  reason: default package */
/* loaded from: classes7.dex */
public final class yii extends yie<ynk> {
    public yon c;
    private douz d = douz.g;

    @Override // defpackage.yie
    protected final /* bridge */ /* synthetic */ ynk g(@dzsi Bundle bundle) {
        yis yisVar = yis.b;
        if (bundle != null) {
            yisVar = (yis) dsuv.c(bundle, "modePreferences", yis.b, dsqa.b());
            this.d = (douz) dsuv.c(bundle, "relevantOptions", douz.g, dsqa.b());
        }
        return this.c.a(yisVar, this.d, new yiw(this) { // from class: yih
            private final yii a;

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
        return dtyc.cJ;
    }

    @Override // defpackage.yie
    protected final cqiw<ynk> q() {
        return new yjt();
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        dsuv.d(bundle, "relevantOptions", this.d);
        yom yomVar = (yom) ((yie) this).b;
        if (yomVar != null) {
            dsuv.d(bundle, "modePreferences", yomVar.b());
        }
    }
}
