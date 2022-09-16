package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acsb  reason: default package */
/* loaded from: classes.dex */
public final class acsb implements afzf {
    final /* synthetic */ afvm a;
    final /* synthetic */ acsc b;
    final /* synthetic */ aopa c;

    public acsb(acsc acscVar, aopa aopaVar, afvm afvmVar) {
        this.b = acscVar;
        this.c = aopaVar;
        this.a = afvmVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        String valueOf = String.valueOf(arrk.class.getCanonicalName());
        zep.d(valueOf.length() != 0 ? "Volley request retry failed for type ".concat(valueOf) : new String("Volley request retry failed for type "), cffVar);
        this.b.e.a(2, new acrz(this, cffVar));
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arrk arrkVar = (arrk) obj;
        String valueOf = String.valueOf(arrk.class.getCanonicalName());
        if (valueOf.length() != 0) {
            "Successful volley request retried for type ".concat(valueOf);
        }
        this.b.e.a(2, new acsa(this, arrkVar));
    }
}
