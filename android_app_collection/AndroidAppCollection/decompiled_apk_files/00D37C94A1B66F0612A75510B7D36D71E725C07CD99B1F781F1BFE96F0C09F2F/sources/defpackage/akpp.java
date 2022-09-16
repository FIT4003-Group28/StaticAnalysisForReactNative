package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: akpp  reason: default package */
/* loaded from: classes.dex */
public final class akpp {
    public final ajsf a;
    public final List b;
    public final List c;
    public int d;
    private final ajsm e;

    public akpp(Context context, aafo aafoVar, acti actiVar, dh dhVar, int i, yni yniVar) {
        context.getClass();
        aafoVar.getClass();
        actiVar.getClass();
        aqxo.p(i > 0);
        izn iznVar = new izn(3);
        ajqw ajqwVar = new ajqw();
        ajqwVar.f(akpl.class, new akpm(aafoVar, actiVar, dhVar, yniVar));
        ajsm ajsmVar = new ajsm();
        this.e = ajsmVar;
        ajqwVar.f(ajqo.class, new ajqz(context, iznVar, ajqwVar));
        ajqwVar.f(akpq.class, new weo(context, 5, (int[]) null));
        ajsf ajsfVar = new ajsf(ajqwVar);
        this.a = ajsfVar;
        ajsfVar.h(ajsmVar);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = i;
    }

    public final void a() {
        this.e.clear();
        Iterator it = new akpo(this.b, this.d).iterator();
        while (it.hasNext()) {
            ajsm ajsmVar = this.e;
            ajqn a = ajqo.a();
            a.a = this.d;
            a.b = (List) it.next();
            ajsmVar.add(a.a());
        }
        if (!this.b.isEmpty() && !this.c.isEmpty()) {
            this.e.add(new akpq());
        }
        Iterator it2 = new akpo(this.c, this.d).iterator();
        while (it2.hasNext()) {
            ajsm ajsmVar2 = this.e;
            ajqn a2 = ajqo.a();
            a2.a = this.d;
            a2.b = (List) it2.next();
            ajsmVar2.add(a2.a());
        }
    }
}
