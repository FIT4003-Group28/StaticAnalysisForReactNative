package defpackage;

import android.util.SparseArray;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: nuo  reason: default package */
/* loaded from: classes3.dex */
public final class nuo implements nun {
    public final SparseArray a = new SparseArray();
    public final HashSet b = new HashSet();
    public final HashSet c = new HashSet();
    public nun d;

    @Override // defpackage.nun
    public final nva f(int i) {
        nun nunVar = this.d;
        if (nunVar != null) {
            return nunVar.f(i);
        }
        nva nvaVar = (nva) this.a.get(i);
        if (nvaVar != null) {
            this.a.remove(i);
        }
        return nvaVar;
    }

    @Override // defpackage.nun
    public final void g(int i, boolean z) {
        nun nunVar = this.d;
        if (nunVar != null) {
            nunVar.g(0, false);
        }
    }

    @Override // defpackage.nun
    public final void h(nva nvaVar) {
        nun nunVar = this.d;
        if (nunVar != null) {
            nunVar.h(nvaVar);
        } else {
            this.a.put(((nue) nvaVar).a, nvaVar);
        }
    }

    @Override // defpackage.nun
    public final void i(nul nulVar) {
        nun nunVar = this.d;
        if (nunVar != null) {
            nunVar.i(nulVar);
        } else {
            this.b.add(nulVar);
        }
    }

    @Override // defpackage.nun
    public final void j(num numVar) {
        nun nunVar = this.d;
        if (nunVar != null) {
            nunVar.j(numVar);
        } else {
            this.c.add(numVar);
        }
    }

    @Override // defpackage.nun
    public final void k(nul nulVar) {
        nun nunVar = this.d;
        if (nunVar != null) {
            nunVar.k(nulVar);
        } else {
            this.b.remove(nulVar);
        }
    }
}
