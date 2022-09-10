package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aqvc  reason: default package */
/* loaded from: classes2.dex */
public class aqvc implements aqur {
    private final apsg a;
    private final aqut b;
    private final aqvv c;
    private aquw d = null;

    public aqvc(aqvv aqvvVar, final dxio<apyz> dxioVar, final apsg apsgVar) {
        this.c = aqvvVar;
        this.a = apsgVar;
        this.b = new aqvf(apsgVar.b(), apsgVar.c(), new View.OnClickListener(dxioVar, apsgVar) { // from class: aqvb
            private final dxio a;
            private final apsg b;

            {
                this.a = dxioVar;
                this.b = apsgVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxio dxioVar2 = this.a;
                apsg apsgVar2 = this.b;
                ((apyz) dxioVar2.a()).F(apsgVar2.a(), apsgVar2.b(), apsgVar2.c(), ddce.BUSINESS_SETTINGS_PAGE);
            }
        }, null);
    }

    @Override // defpackage.aqur
    public String a() {
        return this.a.b();
    }

    @Override // defpackage.aqur
    public aquw b() {
        if (this.d == null) {
            aqvu a = this.c.a(this.a.a(), ddce.BUSINESS_SETTINGS_PAGE);
            this.d = a;
            a.a();
        }
        aquw aquwVar = this.d;
        dbsk.s(aquwVar);
        return aquwVar;
    }

    @Override // defpackage.aqur
    public aquu c() {
        return this.b;
    }

    @Override // defpackage.aqur
    public void d() {
        aquw aquwVar = this.d;
        if (aquwVar != null) {
            aquwVar.e();
            this.d = null;
        }
    }
}
