package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yxa  reason: default package */
/* loaded from: classes4.dex */
public final class yxa {
    public final Executor a;
    volatile int e;
    volatile int f;
    volatile int g;
    volatile int h;
    volatile boolean i;
    volatile int j;
    public final snc k;
    final Deque c = new ArrayDeque();
    final List d = new ArrayList();
    public final azpo b = azpo.W();

    public yxa(Executor executor, snc sncVar) {
        this.a = executor;
        this.k = sncVar;
    }

    public final synchronized int a() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(ArrayList arrayList) {
        if (this.i) {
            this.j += arrayList.size();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yxb yxbVar = (yxb) arrayList.get(i);
            if (yxbVar.h) {
                this.c.addFirst(yxbVar);
            } else {
                this.c.addLast(yxbVar);
            }
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(int i) {
        this.h += i;
        h();
    }

    public final synchronized void d(List list) {
        list.addAll(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(int i) {
        this.e += i;
    }

    public final synchronized void f() {
        this.d.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        if (!this.i || this.f < this.e - this.j) {
            return;
        }
        this.b.sm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        ArrayList arrayList;
        yxb yxbVar;
        synchronized (this) {
            arrayList = null;
            while (this.g < this.h && (yxbVar = (yxb) this.c.pollFirst()) != null) {
                this.g++;
                if (arrayList == null) {
                    arrayList = new ArrayList(16);
                }
                arrayList.add(yxbVar);
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                yxb yxbVar2 = (yxb) arrayList.get(i);
                yxbVar2.b(this, true);
                this.a.execute(yxbVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i() {
        this.i = true;
        g();
    }
}
