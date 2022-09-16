package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aaxw  reason: default package */
/* loaded from: classes.dex */
final class aaxw implements afzf {
    final /* synthetic */ aaxu a;

    public aaxw(aaxu aaxuVar) {
        this.a = aaxuVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        aaxu aaxuVar = this.a;
        if (aaxuVar != null) {
            aaxuVar.e(true);
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        boolean z;
        arkk arkkVar = (arkk) obj;
        if (this.a != null) {
            if (arkkVar.c.size() != 0) {
                Iterator it = arkkVar.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    asue asueVar = ((arki) it.next()).b;
                    if (asueVar == null) {
                        asueVar = asue.a;
                    }
                    if (!asueVar.e) {
                        z = false;
                        break;
                    }
                }
                this.a.e(z);
                return;
            }
            this.a.j();
        }
    }
}
