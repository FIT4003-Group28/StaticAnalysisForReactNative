package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjzb  reason: default package */
/* loaded from: classes4.dex */
final class cjzb implements cqjb<cjyw, Integer> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Integer a(cjyw cjywVar, Context context) {
        List<cjyv<?>> b = cjywVar.b();
        int i = 0;
        if (!b.isEmpty() && !((eev) btsq.c(eev.class, context)).f().a()) {
            HashMap hashMap = new HashMap();
            int i2 = 0;
            for (cjyv<?> cjyvVar : b) {
                dbsi dbsiVar = (dbsi) hashMap.get(cjyvVar.a);
                if (dbsiVar != null) {
                    dbqb<cqkp, cqkp> dbqbVar = cjyvVar.b.d;
                    T t = cjyvVar.c;
                    cqkp cqkpVar = (cqkp) dbsiVar.a;
                } else {
                    cqkf c = ((efb) btsq.c(efb.class, context)).g().g().c(new cjzd(), new FrameLayout(context));
                    c.e(new cjzg(cjyvVar));
                    View c2 = c.c();
                    int i3 = cjyvVar.b.c;
                    c2.measure(i3 > 0 ? View.MeasureSpec.makeMeasureSpec(cjzh.e(context, i3), 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredHeight = c2.getMeasuredHeight();
                    hashMap.put(cjyvVar.a, dbsi.a(cjyvVar.c, Integer.valueOf(measuredHeight)));
                    i2 = Math.max(i2, measuredHeight);
                }
            }
            i = i2;
        }
        return Integer.valueOf(i);
    }
}
