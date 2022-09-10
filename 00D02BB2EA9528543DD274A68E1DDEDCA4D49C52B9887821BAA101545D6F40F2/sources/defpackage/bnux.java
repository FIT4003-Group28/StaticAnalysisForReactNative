package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnux  reason: default package */
/* loaded from: classes.dex */
public final class bnux implements bnun {
    public final ArrayList<bnsa> a;
    @dzsi
    private final Comparator<bnsa> b;
    private boolean c;

    public bnux() {
        this(null);
    }

    @Override // defpackage.bnun
    public final void a(long j) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            this.a.get(i).a(j);
        }
    }

    @Override // defpackage.bnun
    public final void b(bnsa bnsaVar) {
        c();
    }

    public final void c() {
        if (this.b != null) {
            synchronized (this) {
                this.c = true;
            }
        }
    }

    @Override // defpackage.bnun
    public final void d(bnsa bnsaVar) {
        this.a.add(bnsaVar);
        c();
    }

    @Override // defpackage.bnun
    public final boolean e(bnsa bnsaVar) {
        return this.a.remove(bnsaVar);
    }

    @Override // defpackage.bnun
    public final void f() {
        ArrayList<bnsa> arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).E(true);
        }
    }

    @Override // defpackage.bnun
    public final List<bnsa> g(bntb bntbVar) {
        ArrayList a = dchl.a();
        ArrayList<bnsa> arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bnsa bnsaVar = arrayList.get(i);
            if (bnsaVar.y()) {
                bnsaVar.z(bntbVar);
            } else {
                a.add(bnsaVar);
            }
        }
        int size2 = a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.a.remove((bnsa) a.get(i2));
        }
        return a;
    }

    public final void h(bnrr bnrrVar) {
        int i = 0;
        if (this.b != null) {
            synchronized (this) {
                if (this.c) {
                    for (int i2 = 0; i2 < this.a.size(); i2++) {
                        this.a.get(i2).p();
                    }
                    Collections.sort(this.a, this.b);
                    this.c = false;
                }
            }
        }
        int size = this.a.size();
        while (i < size) {
            bnsa bnsaVar = null;
            bnsa bnsaVar2 = i == 0 ? null : this.a.get(i - 1);
            bnsa bnsaVar3 = this.a.get(i);
            if (i != this.a.size() - 1) {
                bnsaVar = this.a.get(i + 1);
            }
            if (bnsaVar3.C()) {
                bnsaVar3.b(bnsaVar2, bnsaVar, bnrrVar);
            }
            i++;
        }
    }

    public final String toString() {
        return "SortedRenderBin";
    }

    public bnux(@dzsi Comparator<bnsa> comparator) {
        this.a = dchl.a();
        this.c = false;
        this.b = comparator;
    }
}
