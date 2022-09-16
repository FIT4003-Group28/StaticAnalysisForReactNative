package defpackage;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
/* compiled from: PG */
/* renamed from: apnh  reason: default package */
/* loaded from: classes2.dex */
public final class apnh {
    private final apng a;
    private final Queue<clot> b = new LinkedList();
    private final Set<apqb> c = new HashSet();
    private int d;

    public apnh(apng apngVar) {
        this.d = 0;
        this.a = apngVar;
        this.d = 0;
    }

    private final void c(clot clotVar) {
        this.d--;
        this.b.add(clotVar);
    }

    private final void d() {
        dcdc r = dcdc.r(this.c);
        int size = r.size();
        for (int i = 0; i < size; i++) {
            apqb apqbVar = (apqb) r.get(i);
            clot poll = this.b.poll();
            if (poll == null) {
                if (this.d < 2) {
                    clor clorVar = new clor(this.a.a);
                    cmmn.c(!clorVar.j);
                    clorVar.j = true;
                    poll = new clot(clorVar);
                } else {
                    poll = null;
                }
            }
            if (poll == null) {
                return;
            }
            this.c.remove(apqbVar);
            this.d++;
            if (!apqbVar.i(poll)) {
                c(poll);
            }
        }
    }

    public final void a(apqb apqbVar) {
        bvrj.UI_THREAD.c();
        this.c.add(apqbVar);
        d();
    }

    public final void b(clot clotVar) {
        bvrj.UI_THREAD.c();
        c(clotVar);
        d();
    }
}
