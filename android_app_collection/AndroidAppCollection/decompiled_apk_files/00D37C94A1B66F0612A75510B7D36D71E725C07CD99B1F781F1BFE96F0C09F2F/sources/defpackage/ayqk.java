package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayqk  reason: default package */
/* loaded from: classes2.dex */
public final class ayqk implements aypg, ayqh {
    List a;
    volatile boolean b;

    @Override // defpackage.ayqh
    public final boolean d(aypg aypgVar) {
        ayrd.b(aypgVar, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List list = this.a;
                    if (list == null) {
                        list = new LinkedList();
                        this.a = list;
                    }
                    list.add(aypgVar);
                    return true;
                }
            }
        }
        aypgVar.qr();
        return false;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.ayqh
    public final boolean f(aypg aypgVar) {
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            List list = this.a;
            if (list != null && list.remove(aypgVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.ayqh
    public final void i(aypg aypgVar) {
        if (f(aypgVar)) {
            aypgVar.qr();
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            List<aypg> list = this.a;
            ArrayList arrayList = null;
            this.a = null;
            if (list == null) {
                return;
            }
            for (aypg aypgVar : list) {
                try {
                    aypgVar.qr();
                } catch (Throwable th) {
                    bapv.j(th);
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
                throw azom.b((Throwable) arrayList.get(0));
            }
            throw new aypo(arrayList);
        }
    }
}
