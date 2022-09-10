package defpackage;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
/* compiled from: PG */
/* renamed from: blvv  reason: default package */
/* loaded from: classes3.dex */
public final class blvv {
    private static final dcqe f = dcqe.c("blvv");
    public final Queue<blvu> a;
    @dzsi
    public blvu b;
    @dzsi
    public blvu c;
    @dzsi
    public blvu d;
    public int e;
    private final Set<dspd> g = new HashSet();
    private final blwn h;

    public blvv(List list, blwn blwnVar) {
        this.a = new ArrayDeque(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.g.add(((blvu) it.next()).c);
        }
        this.h = blwnVar;
        c();
        this.d = this.b;
    }

    private final void c() {
        this.b = null;
        this.c = null;
        this.e = 0;
        for (blvu blvuVar : this.a) {
            blwn blwnVar = this.h;
            dgjw dgjwVar = dgjw.UNKNOWN;
            int ordinal = blvuVar.e.ordinal();
            if (ordinal != 0) {
                if (ordinal == 5) {
                    dgju e = blvuVar.f.e((dssr) dgju.c.cu(7), dgju.c);
                    blwh blwhVar = blwnVar.a;
                    dspd dspdVar = e.a;
                    dspd dspdVar2 = e.b;
                    blwhVar.a();
                    dspd dspdVar3 = blwhVar.a.get(dspdVar);
                    if (!(dspdVar3 != null && dspdVar3.equals(dspdVar2))) {
                    }
                }
                this.e++;
                if (this.b == null) {
                    this.b = blvuVar;
                } else if (this.c == null) {
                    this.c = blvuVar;
                }
            }
        }
    }

    public final void a(blvu blvuVar) {
        if (!blvuVar.equals(this.b)) {
            Object[] objArr = new Object[2];
            objArr[0] = blvuVar.m;
            blvu blvuVar2 = this.b;
            objArr[1] = blvuVar2 != null ? blvuVar2.m : "";
            bvoo.h("The question targeted for removal ['%s'] does not match the current question ['%s'].", objArr);
        }
        blvu blvuVar3 = this.b;
        this.d = blvuVar3;
        this.a.remove(blvuVar3);
        c();
    }

    public final void b(List<blvu> list) {
        bvrj.UI_THREAD.c();
        for (blvu blvuVar : list) {
            if (!this.g.contains(blvuVar.c)) {
                this.a.add(blvuVar);
                this.g.add(blvuVar.c);
            }
        }
        c();
    }
}
