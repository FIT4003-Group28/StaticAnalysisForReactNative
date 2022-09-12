package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dzbf  reason: default package */
/* loaded from: classes6.dex */
public final class dzbf implements dzak, dzbc {
    List<dzak> a;
    volatile boolean b;

    @Override // defpackage.dzak
    public final void SQ() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            List<dzak> list = this.a;
            ArrayList arrayList = null;
            this.a = null;
            if (list == null) {
                return;
            }
            for (dzak dzakVar : list) {
                try {
                    dzakVar.SQ();
                } catch (Throwable th) {
                    dzas.a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw dzfo.a((Throwable) arrayList.get(0));
            }
            throw new dzar(arrayList);
        }
    }

    @Override // defpackage.dzbc
    public final boolean b(dzak dzakVar) {
        dzbm.a(dzakVar, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List list = this.a;
                    if (list == null) {
                        list = new LinkedList();
                        this.a = list;
                    }
                    list.add(dzakVar);
                    return true;
                }
            }
        }
        dzakVar.SQ();
        return false;
    }

    @Override // defpackage.dzbc
    public final boolean c(dzak dzakVar) {
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            List<dzak> list = this.a;
            if (list != null && list.remove(dzakVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.dzbc
    public final void d(dzak dzakVar) {
        if (c(dzakVar)) {
            dzakVar.SQ();
        }
    }
}
