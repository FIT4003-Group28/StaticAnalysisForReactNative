package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: adfb  reason: default package */
/* loaded from: classes.dex */
public final class adfb extends bgj {
    private static final String a = zep.a("MDX.RouteController");
    private final azqb b;
    private final adig c;
    private final azqb d;
    private final String e;

    public adfb(azqb azqbVar, adig adigVar, azqb azqbVar2, String str) {
        azqbVar.getClass();
        this.b = azqbVar;
        this.c = adigVar;
        azqbVar2.getClass();
        this.d = azqbVar2;
        this.e = str;
    }

    @Override // defpackage.bgj
    public final void b(int i) {
        String str = a;
        StringBuilder sb = new StringBuilder(32);
        sb.append("set volume on route: ");
        sb.append(i);
        zep.h(str, sb.toString());
        ((adof) this.d.get()).b(i);
    }

    @Override // defpackage.bgj
    public final void c(int i) {
        String str = a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("update volume on route: ");
        sb.append(i);
        zep.h(str, sb.toString());
        if (i > 0) {
            adof adofVar = (adof) this.d.get();
            if (adofVar.e()) {
                adofVar.d(3);
                return;
            } else {
                zep.c(adof.a, "Remote control is not connected, cannot change volume");
                return;
            }
        }
        adof adofVar2 = (adof) this.d.get();
        if (adofVar2.e()) {
            adofVar2.d(-3);
        } else {
            zep.c(adof.a, "Remote control is not connected, cannot change volume");
        }
    }

    @Override // defpackage.bgj
    public final void g() {
        String str = a;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("route selected screen:");
        sb.append(valueOf);
        zep.h(str, sb.toString());
        adfi adfiVar = (adfi) this.b.get();
        adig adigVar = this.c;
        String str2 = this.e;
        adfg adfgVar = (adfg) adfiVar.b.get();
        aqxo.p(!TextUtils.isEmpty(str2));
        adfc a2 = adfd.a();
        synchronized (adfgVar.c) {
            ampr amprVar = adfgVar.b;
            if (amprVar != null && adgl.c((String) amprVar.a, str2)) {
                adnl adnlVar = ((adfd) adfgVar.b.b).a;
                if (adnlVar == null) {
                    adnlVar = adnl.a;
                }
                a2.a = adnlVar;
                adfgVar.b = null;
            }
            a2.a = adfgVar.a.c(adfgVar.d.a());
            adfgVar.b = null;
        }
        ((adfh) adfiVar.c.get()).p(adigVar, a2.a().a);
        ((adfg) adfiVar.b.get()).b(str2, null);
    }

    @Override // defpackage.bgj
    public final void i(int i) {
        String str = a;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("route unselected screen:");
        sb.append(valueOf);
        sb.append(" with reason:");
        sb.append(i);
        zep.h(str, sb.toString());
        adfi adfiVar = (adfi) this.b.get();
        String str2 = this.e;
        ampq j = ampq.j(Integer.valueOf(i));
        adff a2 = ((adfg) adfiVar.b.get()).a(str2);
        boolean z = a2.a;
        String str3 = adfi.a;
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Unselect route, is user initiated: ");
        sb2.append(z);
        zep.h(str3, sb2.toString());
        ((adfh) adfiVar.c.get()).b(a2, j);
    }
}
