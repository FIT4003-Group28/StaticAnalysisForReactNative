package defpackage;

import java.util.HashMap;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: kpr  reason: default package */
/* loaded from: classes3.dex */
public final class kpr extends ajyq implements ynl {
    public final HashSet a;
    public final HashMap b;

    public kpr(ajyi ajyiVar, yni yniVar, yzj yzjVar, aari aariVar, acti actiVar, akam akamVar) {
        super(aariVar, ajyiVar, yniVar, yzjVar, actiVar, akamVar, new ajsm());
        this.a = new HashSet();
        this.b = new HashMap();
        this.i.mG(new kpo(this));
        L(new kpq(this));
    }

    @Override // defpackage.ajyq, defpackage.ajxl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        kpp kppVar;
        if (cls == kpr.class) {
            boolean z = false;
            if (i == -1) {
                return new Class[]{kqe.class};
            }
            if (i == 0) {
                audo a = ((kqe) obj).a();
                aunb aunbVar = a.b;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                aueq aueqVar = (aueq) aunbVar.qm(auet.a);
                int size = aueqVar.d.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= this.i.size()) {
                        i2 = 0;
                        break;
                    } else if (a.equals(this.i.get(i2))) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    return null;
                }
                if (this.a.add(a)) {
                    this.i.h(i2 + 1, size);
                } else {
                    this.a.remove(a);
                    amuf amufVar = new amuf();
                    for (aues auesVar : aueqVar.d) {
                        auex auexVar = auesVar.c;
                        if (auexVar == null) {
                            auexVar = auex.a;
                        }
                        amufVar.h(auexVar);
                    }
                    E(amufVar.g(), i2 + 1);
                }
                if (!this.b.containsKey(a) || (kppVar = (kpp) this.b.get(a)) == null) {
                    return null;
                }
                this.a.contains(a);
                kppVar.a();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return super.ky(cls, obj, i);
    }
}
