package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aigi  reason: default package */
/* loaded from: classes.dex */
public final class aigi implements jzi {
    public final ajqm a;
    protected final ajsf b;
    public final Context c;
    public final acti d;
    public final aign e;
    public final ajzn f;
    protected RecyclerView g;
    public int h;
    public int i;
    public int j;
    public final jzj k;
    private final jzl l;

    public aigi(Context context, ajsg ajsgVar, jzf jzfVar, jzf jzfVar2, jzf jzfVar3, swq swqVar, ajjr ajjrVar, tdu tduVar, azqb azqbVar, acti actiVar, aign aignVar, jzj jzjVar, yni yniVar, ajyx ajyxVar, byte[] bArr) {
        ajrj ajrjVar = new ajrj();
        ajqw ajqwVar = new ajqw();
        ajqwVar.f(aquw.class, jzfVar);
        ajqwVar.f(aquv.class, jzfVar2);
        ajqwVar.f(ajyv.class, jzfVar3);
        ajsf a = ajsgVar.a(ajqwVar);
        akdb akdbVar = new akdb(swqVar, actiVar, ajjrVar, ajjrVar.a().a(ajkb.WATCH), tduVar, azqbVar);
        this.c = context;
        this.a = ajrjVar;
        this.b = a;
        this.d = actiVar;
        this.f = akdbVar;
        this.e = aignVar;
        this.k = jzjVar;
        jzjVar.a = this;
        jzl jzlVar = new jzl(this, yniVar, ajyxVar);
        this.l = jzlVar;
        jzlVar.a.m(jzlVar);
        jzlVar.a.i(jzlVar, jzlVar.d.k.u);
        a.g(jzlVar);
    }

    public final void a(Rect rect) {
        RecyclerView recyclerView = this.g;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setPadding(rect.left + this.h, this.g.getPaddingTop(), rect.right + this.i, rect.bottom + this.j);
        this.g.ab(0);
    }

    public final void b(aubk aubkVar) {
        boolean z;
        ajsm ajsmVar = new ajsm();
        for (aubm aubmVar : aubkVar.d) {
            int i = aubmVar.b;
            if ((i & 2) != 0) {
                aquv aquvVar = aubmVar.d;
                if (aquvVar == null) {
                    aquvVar = aquv.a;
                }
                ajsmVar.add(aquvVar);
            } else if ((i & 1) != 0) {
                aquw aquwVar = aubmVar.c;
                if (aquwVar == null) {
                    aquwVar = aquw.a;
                }
                ajsmVar.add(aquwVar);
            } else if ((i & 8) != 0) {
                aqtb aqtbVar = aubmVar.e;
                if (aqtbVar == null) {
                    aqtbVar = aqtb.a;
                }
                ajsmVar.add(ajhh.a(aqtbVar));
            }
        }
        ajrj ajrjVar = (ajrj) this.a;
        int i2 = ajrjVar.i(this.l.b);
        if (i2 == -1) {
            i2 = ((ajrj) this.a).h() - 1;
        }
        ajrjVar.n(i2, ajsmVar);
        jzj jzjVar = this.k;
        ArrayList arrayList = new ArrayList();
        Iterator it = aubkVar.e.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            aubl aublVar = (aubl) it.next();
            if ((1 & aublVar.b) != 0) {
                atof atofVar = aublVar.c;
                if (atofVar == null) {
                    atofVar = atof.a;
                }
                arrayList.add(ajna.g(atofVar));
            }
        }
        jzjVar.ls(arrayList);
        jzl jzlVar = this.l;
        boolean z2 = jzlVar.c != null || jzlVar.d.k.af(ajfy.NEXT);
        if (((ajrj) jzlVar.d.a).i(jzlVar.b) == -1) {
            z = false;
        }
        if (z2 != z) {
            if (z2) {
                ajrj ajrjVar2 = (ajrj) jzlVar.d.a;
                ajrjVar2.n(ajrjVar2.h(), jzlVar.b);
                if (!jzlVar.d.k.af(ajfy.NEXT)) {
                    return;
                }
                if (jzlVar.c == null) {
                    jzlVar.c = jzlVar.a(ajxe.a());
                }
                jzlVar.b(jzlVar.c.a);
                return;
            }
            ((ajrj) jzlVar.d.a).q(jzlVar.b);
        }
    }
}
