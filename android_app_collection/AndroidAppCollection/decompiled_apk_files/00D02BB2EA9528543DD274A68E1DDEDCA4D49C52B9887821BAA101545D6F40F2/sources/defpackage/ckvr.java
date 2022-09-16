package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: ckvr  reason: default package */
/* loaded from: classes4.dex */
public final class ckvr extends gen {
    public awfh a;
    public ckvt b;
    cjkr c;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        cjkp B = cjkr.B();
        B.t(this.b.a.getZeroRatingParameters().g);
        ckvt ckvtVar = this.b;
        cjke cjkeVar = (cjke) B;
        cjkeVar.e = !ckvtVar.a() ? ckvtVar.a.getZeroRatingParameters().h : String.format("%s\n\n%s", ckvtVar.a.getZeroRatingParameters().h, ckvtVar.a.getZeroRatingParameters().k);
        cjkeVar.b = new ckvs(new Object[0]);
        cjkeVar.a = ibn.l();
        B.z(this.b.a.getZeroRatingParameters().i, null, cjtd.a(dtyh.b));
        B.y(this.b.a.getZeroRatingParameters().j, new View.OnClickListener(this) { // from class: ckvp
            private final ckvr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ckvr ckvrVar = this.a;
                gfk g = gfk.g(ckvrVar.b.a.getZeroRatingParameters().f, false);
                gga ggaVar = ckvrVar.aE;
                if (ggaVar != null) {
                    ggaVar.D(g);
                }
            }
        }, cjtd.a(dtyh.c));
        if (this.b.a()) {
            this.a.g(true);
            B.v(this.b.a.getZeroRatingParameters().l, new View.OnClickListener(this) { // from class: ckvq
                private final ckvr a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gga ggaVar = this.a.aE;
                    if (ggaVar != null) {
                        ggaVar.D(new awfw());
                    }
                }
            }, cjtd.a(dtyh.d));
        }
        cjkr u = B.u(J());
        this.c = u;
        return u.q();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyh.a;
    }
}
