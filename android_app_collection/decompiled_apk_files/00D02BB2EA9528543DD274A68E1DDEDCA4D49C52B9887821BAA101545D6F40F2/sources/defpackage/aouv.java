package defpackage;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: aouv  reason: default package */
/* loaded from: classes2.dex */
public final class aouv<K extends Comparable<? super K>, D extends Serializable> implements angu<K, D> {
    public final List<angt<K, D>> a = new CopyOnWriteArrayList();
    public final K b;
    public angs<D> c;
    private final bvrb d;

    public aouv(bvrb bvrbVar, K k, angs<D> angsVar) {
        this.d = bvrbVar;
        this.b = k;
        this.c = angsVar;
    }

    @Override // defpackage.angu
    public final K a() {
        return this.b;
    }

    @Override // defpackage.angu
    public final angs<D> b() {
        return this.c;
    }

    @Override // defpackage.angu
    public final void c(angt<K, D> angtVar) {
        this.a.add(angtVar);
        e(angtVar);
    }

    @Override // defpackage.angu
    public final void d(angt<K, D> angtVar) {
        this.a.remove(angtVar);
    }

    public final void e(final angt<K, D> angtVar) {
        Runnable runnable = new Runnable(this, angtVar) { // from class: aouu
            private final aouv a;
            private final angt b;

            {
                this.a = this;
                this.b = angtVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aouv aouvVar = this.a;
                angt angtVar2 = this.b;
                if (aouvVar.a.contains(angtVar2)) {
                    angtVar2.a(aouvVar);
                }
            }
        };
        if (bvrj.UI_THREAD.b()) {
            runnable.run();
        } else {
            this.d.b(runnable, bvrj.UI_THREAD);
        }
    }
}
