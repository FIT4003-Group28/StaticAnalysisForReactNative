package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: aien  reason: default package */
/* loaded from: classes.dex */
public class aien implements aiev {
    public final SparseArray a;
    public final Set b;
    public int c;
    private final Set e;
    private final aieq f;

    public aien() {
        aieq aieqVar = new aieq();
        this.a = new SparseArray(2);
        this.b = new CopyOnWriteArraySet();
        this.e = new CopyOnWriteArraySet();
        this.f = aieqVar;
        for (int i = 0; i < 2; i++) {
            this.a.put(d[i], new ArrayList());
        }
        this.c = -1;
    }

    private final synchronized void a() {
        aqxo.y(this.f.a(this.c != -1 ? (fgh) ((List) this.a.get(0)).get(this.c) : null));
    }

    private final synchronized void o(int i, int i2) {
        int i3 = this.c;
        if (i3 != -1 && i <= i3) {
            this.c = i3 + i2;
            a();
        }
    }

    private final synchronized void s() {
        fgh a = aier.a(this);
        aieq aieqVar = this.f;
        if (!aieqVar.a(a)) {
            aieqVar.b = a;
            for (aiet aietVar : aieqVar.a) {
                aietVar.a(a);
            }
        }
    }

    @Override // defpackage.aiev
    public final synchronized int b(int i) {
        return ((List) this.a.get(i)).size();
    }

    @Override // defpackage.aiev
    public final synchronized int c() {
        return this.c;
    }

    public final synchronized void d(int i) {
        if (i != this.c) {
            for (aieu aieuVar : this.e) {
                aieuVar.d();
            }
        }
    }

    @Override // defpackage.aiev
    public final void e(aies aiesVar) {
        this.b.add(aiesVar);
    }

    @Override // defpackage.aiev
    public final void f(aiet aietVar) {
        this.f.a.add(aietVar);
    }

    @Override // defpackage.aiev
    public final void g(aieu aieuVar) {
        this.e.add(aieuVar);
    }

    public final synchronized void h(int i) {
        List list = (List) this.a.get(0);
        if (!list.isEmpty()) {
            zdk.a(i, list.size() - 1);
        } else if (i != -1) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = this.c;
        this.c = i;
        d(i2);
        s();
    }

    public final void i(int i, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        int size = collection.size();
        synchronized (this) {
            ((List) this.a.get(0)).addAll(i, collection);
            int i2 = this.c;
            o(i, size);
            for (aies aiesVar : this.b) {
                aiesVar.a(0, i, size);
            }
            d(i2);
        }
    }

    @Override // defpackage.aiev
    public final void j(aies aiesVar) {
        this.b.remove(aiesVar);
    }

    @Override // defpackage.aiev
    public final void k(aiet aietVar) {
        this.f.a.remove(aietVar);
    }

    @Override // defpackage.aiev
    public final void l(aieu aieuVar) {
        this.e.remove(aieuVar);
    }

    @Override // defpackage.aiev
    public final synchronized boolean m(PlaybackStartDescriptor playbackStartDescriptor) {
        fgh a = aier.a(this);
        if (a == null) {
            return false;
        }
        return aijn.c(a.a(), playbackStartDescriptor);
    }

    public final synchronized void n(int i) {
        int i2 = this.c;
        if (i2 != -1 && i2 >= 0) {
            if (i <= i2) {
                this.c = i2 - i;
                a();
                return;
            }
            this.c = Math.min(0, ((List) this.a.get(0)).size() - 1);
            s();
        }
    }

    @Override // defpackage.aiev
    public final synchronized int p(int i, fgh fghVar) {
        return ((List) this.a.get(i)).indexOf(fghVar);
    }

    @Override // defpackage.aiev
    public final synchronized int q(fgh fghVar) {
        int i;
        List list = (List) this.a.get(0);
        int indexOf = list.indexOf(fghVar);
        if (indexOf < 0) {
            int indexOf2 = ((List) this.a.get(1)).indexOf(fghVar);
            if (indexOf2 < 0) {
                indexOf = Math.max(0, this.c + 1);
                i(indexOf, Collections.singleton(fghVar));
            } else {
                int i2 = indexOf2 + 1;
                i = 0;
                while (i < i2) {
                    int size = list.size();
                    if (size == 0) {
                        size = 0;
                    }
                    synchronized (this) {
                        ((List) this.a.get(0)).add(size, (fgh) ((List) this.a.get(1)).remove(0));
                        int i3 = this.c;
                        o(size, 1);
                        for (aies aiesVar : this.b) {
                            aiesVar.b(size);
                        }
                        d(i3);
                    }
                }
                indexOf = list.size() - 1;
            }
        }
        h(indexOf);
        return c();
        i++;
    }

    @Override // defpackage.aiev
    public final synchronized fgh r(int i, int i2) {
        return (fgh) ((List) this.a.get(i)).get(i2);
    }
}
