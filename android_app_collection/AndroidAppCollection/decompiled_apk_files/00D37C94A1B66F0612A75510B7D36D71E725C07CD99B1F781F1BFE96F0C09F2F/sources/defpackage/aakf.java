package defpackage;
/* compiled from: PG */
/* renamed from: aakf  reason: default package */
/* loaded from: classes.dex */
public final class aakf extends aakh {
    private final aadd b;

    public aakf(snc sncVar, aadd aaddVar) {
        super(sncVar);
        this.b = aaddVar;
    }

    @Override // defpackage.aakh, defpackage.aaki
    public final synchronized void a(String str, String str2) {
        arhd a = this.b.a();
        if (a != null) {
            asxp asxpVar = a.e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if (asxpVar.I) {
                super.a(str, str2);
                return;
            }
        }
        this.a.clear();
    }
}
