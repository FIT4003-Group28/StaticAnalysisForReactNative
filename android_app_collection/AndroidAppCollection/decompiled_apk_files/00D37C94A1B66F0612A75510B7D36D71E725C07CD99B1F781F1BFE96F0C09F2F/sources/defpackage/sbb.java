package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: sbb  reason: default package */
/* loaded from: classes4.dex */
public final class sbb implements sbw, sbc {
    public final AccessibilityManager a;
    public sai b;
    public final Map c;
    final Map d;
    public Map e;
    final List f;
    public final saz g;
    private final sbs h;

    public sbb(Context context) {
        saz sazVar = new saz(context);
        this.h = new sax(this);
        this.c = shp.h();
        this.d = shp.h();
        this.f = sbv.d();
        this.g = sazVar;
        this.a = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // defpackage.sbc
    public final List a() {
        ArrayList e = sbv.e(this.d.keySet());
        Collections.sort(e);
        return e;
    }

    @Override // defpackage.sbw
    public final void b(sai saiVar) {
        sho.g(saiVar, "chart");
        sho.c(this.b == null, "Already attached to a chart");
        this.b = saiVar;
        saiVar.y(this.h);
    }

    @Override // defpackage.sbw
    public final void c(sai saiVar) {
        sai saiVar2 = this.b;
        if (saiVar2 != saiVar) {
            return;
        }
        saiVar2.z(this.h);
        this.b = null;
    }

    public final void d(Set set) {
        int i;
        Iterator it = this.b.l().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            sat satVar = (sat) it.next();
            sgp c = satVar.c();
            sgt sgtVar = satVar.a;
            for (Object obj : sgtVar.a) {
                set.add(c.a(obj, i, sgtVar));
                i++;
            }
        }
        for (Object obj2 : set) {
            Map map = this.c;
            Integer valueOf = Integer.valueOf(i);
            map.put(obj2, valueOf);
            this.d.put(valueOf, obj2);
            i++;
        }
    }

    @Override // defpackage.sbc
    public final sba e(int i) {
        return new sba(this, this.d.get(Integer.valueOf(i)), 0.0f);
    }

    @Override // defpackage.sbc
    public final sba f(float f, float f2) {
        int paddingLeft = ((int) f) - this.b.getPaddingLeft();
        int paddingTop = ((int) f2) - this.b.getPaddingTop();
        float f3 = Float.MAX_VALUE;
        Object obj = null;
        for (scd scdVar : this.f) {
            for (sgr sgrVar : scdVar.b(paddingLeft, paddingTop, true)) {
                float f4 = sgrVar.f;
                if (f4 < f3) {
                    obj = sgrVar.e;
                    f3 = f4;
                }
            }
        }
        if (obj == null) {
            return null;
        }
        return new sba(this, obj, f3);
    }
}
