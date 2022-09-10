package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: gbg  reason: default package */
/* loaded from: classes6.dex */
class gbg implements gbc {
    public final String a;
    public final dxio<afha> b;
    private final String c;
    private final gga d;

    public gbg(dqsg dqsgVar, dxio<afha> dxioVar, gga ggaVar) {
        this.c = dqsgVar.c;
        dgbo dgboVar = dqsgVar.b;
        this.a = (dgboVar == null ? dgbo.e : dgboVar).c;
        this.b = dxioVar;
        this.d = ggaVar;
    }

    @Override // defpackage.gbc
    public String a() {
        return this.c;
    }

    @Override // defpackage.gbc
    public cqss b() {
        if (d()) {
            return ibm.p();
        }
        return ibm.x();
    }

    @Override // defpackage.gbc
    public View.OnClickListener c() {
        return new View.OnClickListener(this) { // from class: gbf
            private final gbg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gbg gbgVar = this.a;
                if (!gbgVar.d()) {
                    gbgVar.b.a().m(gbgVar.a, 1);
                }
            }
        };
    }

    public final boolean d() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.d.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }
}
