package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acrw  reason: default package */
/* loaded from: classes.dex */
public final class acrw implements afzf {
    final /* synthetic */ aazo a;
    final /* synthetic */ List b;
    final /* synthetic */ String c;
    final /* synthetic */ afuq d;
    final /* synthetic */ afvm e;
    final /* synthetic */ acrx f;

    public acrw(acrx acrxVar, aazo aazoVar, List list, String str, afuq afuqVar, afvm afvmVar) {
        this.f = acrxVar;
        this.a = aazoVar;
        this.b = list;
        this.c = str;
        this.d = afuqVar;
        this.e = afvmVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        String valueOf = String.valueOf(arrk.class.getCanonicalName());
        zep.f("GEL_DELAYED_EVENT_DEBUG", valueOf.length() != 0 ? "Volley request failed for type ".concat(valueOf) : new String("Volley request failed for type "), cffVar);
        if (!this.f.b.a()) {
            return;
        }
        acrx acrxVar = this.f;
        String valueOf2 = String.valueOf(cffVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 25);
        sb.append("Encountered VolleyError: ");
        sb.append(valueOf2);
        acrxVar.d(sb.toString());
        this.f.d.a(2, new acru(this, cffVar));
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arrk arrkVar = (arrk) obj;
        String valueOf = String.valueOf(arrk.class.getCanonicalName());
        if (valueOf.length() != 0) {
            "Successful volley request for type ".concat(valueOf);
        }
        this.f.d.a(2, new acrv(this, arrkVar));
    }
}
