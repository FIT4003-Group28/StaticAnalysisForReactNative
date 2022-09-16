package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: sdc  reason: default package */
/* loaded from: classes4.dex */
public final class sdc extends scz {
    public sdc(Context context) {
        super(context, ser.a());
        l(new sel());
        this.b = new sdd();
        this.c = new sdf(1);
    }

    @Override // defpackage.scz
    protected final sek a() {
        return ((sel) this.a).g();
    }

    @Override // defpackage.scz
    protected final void d(List list) {
        sel selVar = (sel) this.a;
        if (!selVar.p() || list.size() < 2) {
            return;
        }
        Iterator it = list.iterator();
        double doubleValue = ((Double) ((sdi) it.next()).a).doubleValue();
        double d = doubleValue;
        while (it.hasNext()) {
            double doubleValue2 = ((Double) ((sdi) it.next()).a).doubleValue();
            if (doubleValue2 > d) {
                d = doubleValue2;
            } else if (doubleValue2 < doubleValue) {
                doubleValue = doubleValue2;
            }
        }
        sek g = ((sel) this.a).g();
        selVar.a.e = new sek(Double.valueOf(Math.min(((Double) g.a).doubleValue(), doubleValue)), Double.valueOf(Math.max(((Double) g.b).doubleValue(), d))).a();
        seo seoVar = selVar.a;
        seoVar.f = seoVar.e != null;
        selVar.b = true;
    }

    @Override // defpackage.scz
    protected final boolean h() {
        return ((sel) this.a).p();
    }

    public final void m() {
        ((sel) this.a).a.b = false;
    }
}
