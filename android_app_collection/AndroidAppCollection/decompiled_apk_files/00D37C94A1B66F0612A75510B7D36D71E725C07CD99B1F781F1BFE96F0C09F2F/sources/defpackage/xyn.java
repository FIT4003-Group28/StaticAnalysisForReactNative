package defpackage;

import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: xyn  reason: default package */
/* loaded from: classes4.dex */
public final class xyn implements yiu {
    public final afvn a;
    final Set b = new HashSet();
    final Set c = new HashSet();
    public final acrr d;
    public aoob e;
    public aoob f;
    public final yjk g;

    public xyn(yjk yjkVar, afvn afvnVar, acrr acrrVar) {
        this.g = yjkVar;
        this.a = afvnVar;
        this.d = acrrVar;
    }

    public final void a(xyk xykVar) {
        this.b.add(xykVar);
    }

    public final void c(xyl xylVar) {
        this.c.add(xylVar);
    }

    public final void d(xyl xylVar) {
        this.c.remove(xylVar);
    }

    @Override // defpackage.yiu
    public final void kC(int i, int i2, Intent intent) {
        if (i != 2000) {
            if (i != 2001) {
                return;
            }
            if (this.f != null) {
                acrr acrrVar = this.d;
                xyq xyqVar = new xyq();
                xyqVar.a = this.f;
                arrf a = arrh.a();
                awhj a2 = xyqVar.a();
                a.copyOnWrite();
                ((arrh) a.instance).es(a2);
                acrrVar.c((arrh) a.mo39build());
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                xyl xylVar = (xyl) it.next();
                xylVar.d(intent == null ? false : intent.getBooleanExtra("familyChanged", false));
                if (xylVar.g()) {
                    it.remove();
                }
            }
        } else if (intent == null || !intent.getBooleanExtra("familyChanged", false)) {
            if (this.e != null) {
                acrr acrrVar2 = this.d;
                xyp xypVar = new xyp();
                xypVar.a = this.e;
                arrf a3 = arrh.a();
                awhi a4 = xypVar.a();
                a3.copyOnWrite();
                ((arrh) a3.instance).eo(a4);
                acrrVar2.c((arrh) a3.mo39build());
            }
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                xyk xykVar = (xyk) it2.next();
                xykVar.d();
                xykVar.g();
                it2.remove();
            }
        } else {
            if (this.e != null) {
                acrr acrrVar3 = this.d;
                xyp xypVar2 = new xyp();
                xypVar2.a = this.e;
                arrf a5 = arrh.a();
                awhi a6 = xypVar2.a();
                a5.copyOnWrite();
                ((arrh) a5.instance).eq(a6);
                acrrVar3.c((arrh) a5.mo39build());
            }
            Iterator it3 = this.b.iterator();
            while (it3.hasNext()) {
                xyk xykVar2 = (xyk) it3.next();
                xykVar2.e();
                xykVar2.g();
                it3.remove();
            }
        }
    }
}
