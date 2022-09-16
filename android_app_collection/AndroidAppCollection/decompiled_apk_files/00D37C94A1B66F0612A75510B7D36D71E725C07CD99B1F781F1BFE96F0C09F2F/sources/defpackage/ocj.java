package defpackage;
/* compiled from: PG */
/* renamed from: ocj  reason: default package */
/* loaded from: classes3.dex */
public final class ocj {
    public final yye a;
    private final azpa b = azpa.as(nnh.NON_ENGAGEMENT_PANEL);

    public ocj(yye yyeVar) {
        this.a = yyeVar;
    }

    public final void a(nml nmlVar) {
        nni.a(nmlVar.h().m, nmlVar.h().c.c(), this.b.A().n()).n().Z(new ayqb() { // from class: oci
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                nni.b(ocj.this.a, ((Float) obj).floatValue());
            }
        });
    }

    public final void b(boolean z, boolean z2) {
        if (z2) {
            this.b.c(nnh.ENGAGEMENT_PANEL);
        } else if (z) {
            this.b.c(nnh.NON_ENGAGEMENT_PANEL);
            this.a.a(true, true);
        } else {
            this.b.c(nnh.NON_ENGAGEMENT_PANEL);
            this.a.a(false, true);
        }
    }
}
