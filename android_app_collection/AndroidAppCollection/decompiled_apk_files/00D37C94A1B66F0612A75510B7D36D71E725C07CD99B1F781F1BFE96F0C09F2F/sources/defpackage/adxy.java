package defpackage;
/* compiled from: PG */
/* renamed from: adxy  reason: default package */
/* loaded from: classes.dex */
public final class adxy extends yjg {
    private final adxw a;
    private final aacz c;

    public adxy(aacz aaczVar, adxw adxwVar) {
        this.c = aaczVar;
        this.a = adxwVar;
    }

    @Override // defpackage.yjg
    protected final void a() {
        apyy b = this.c.b();
        apfz b2 = aeik.b(b);
        if (b2 == null || !b2.f) {
            return;
        }
        adxw adxwVar = this.a;
        apfp apfpVar = null;
        if (b != null) {
            apfo apfoVar = b.d;
            if (apfoVar == null) {
                apfoVar = apfo.a;
            }
            if ((apfoVar.b & 2) != 0) {
                apfo apfoVar2 = b.d;
                if (apfoVar2 == null) {
                    apfoVar2 = apfo.a;
                }
                if ((apfoVar2.b & 2) != 0) {
                    apfo apfoVar3 = b.d;
                    if (apfoVar3 == null) {
                        apfoVar3 = apfo.a;
                    }
                    apfpVar = apfoVar3.d;
                    if (apfpVar == null) {
                        apfpVar = apfp.a;
                    }
                }
            }
        }
        boolean z = true;
        if (apfpVar != null && (apfpVar.b & 1) != 0) {
            atnv atnvVar = apfpVar.c;
            if (atnvVar == null) {
                atnvVar = atnv.a;
            }
            if (!atnvVar.d) {
                z = false;
            }
        }
        adxwVar.a(z);
    }
}
