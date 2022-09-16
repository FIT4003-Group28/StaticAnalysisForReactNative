package defpackage;

import com.google.android.gms.cast.MediaQueueItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: qnk  reason: default package */
/* loaded from: classes4.dex */
public final class qnk extends tqj {
    final /* synthetic */ qnl a;

    public qnk(qnl qnlVar) {
        this.a = qnlVar;
    }

    @Override // defpackage.tqj
    public final void a(int[] iArr) {
        List f = qpl.f(iArr);
        if (this.a.d.equals(f)) {
            return;
        }
        this.a.e();
        this.a.f.evictAll();
        this.a.g.clear();
        qnl qnlVar = this.a;
        qnlVar.d = f;
        qnlVar.f();
        this.a.d();
        this.a.c();
    }

    @Override // defpackage.tqj
    public final void b(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = this.a.d.size();
        } else {
            i2 = this.a.e.get(i, -1);
            if (i2 == -1) {
                this.a.g();
                return;
            }
        }
        this.a.e();
        this.a.d.addAll(i2, qpl.f(iArr));
        this.a.f();
        Iterator it = this.a.k.iterator();
        if (it.hasNext()) {
            qnm qnmVar = (qnm) it.next();
            throw null;
        } else {
            this.a.c();
        }
    }

    @Override // defpackage.tqj
    public final void c(MediaQueueItem[] mediaQueueItemArr) {
        HashSet hashSet = new HashSet();
        this.a.g.clear();
        for (MediaQueueItem mediaQueueItem : mediaQueueItemArr) {
            int i = mediaQueueItem.b;
            this.a.f.put(Integer.valueOf(i), mediaQueueItem);
            int i2 = this.a.e.get(i, -1);
            if (i2 != -1) {
                hashSet.add(Integer.valueOf(i2));
            } else {
                this.a.g();
                return;
            }
        }
        for (Integer num : this.a.g) {
            int i3 = this.a.e.get(num.intValue(), -1);
            if (i3 != -1) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        this.a.g.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.a.e();
        qnl qnlVar = this.a;
        qpl.k(arrayList);
        qnlVar.i();
        this.a.c();
    }

    @Override // defpackage.tqj
    public final void d(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            this.a.f.remove(Integer.valueOf(i));
            int i2 = this.a.e.get(i, -1);
            if (i2 != -1) {
                this.a.e.delete(i);
                arrayList.add(Integer.valueOf(i2));
            } else {
                this.a.g();
                return;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        this.a.e();
        this.a.d.removeAll(qpl.f(iArr));
        this.a.f();
        qnl qnlVar = this.a;
        qpl.k(arrayList);
        Iterator it = qnlVar.k.iterator();
        if (it.hasNext()) {
            qnm qnmVar = (qnm) it.next();
            throw null;
        }
        this.a.c();
    }

    @Override // defpackage.tqj
    public final void e(List list, List list2, int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            this.a.d.size();
        } else if (list2.isEmpty()) {
            this.a.a.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]);
        } else if (this.a.e.get(i, -1) == -1) {
            this.a.e.get(((Integer) list2.get(0)).intValue(), -1);
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i2 = this.a.e.get(((Integer) it.next()).intValue(), -1);
            if (i2 != -1) {
                arrayList.add(Integer.valueOf(i2));
            } else {
                this.a.g();
                return;
            }
        }
        this.a.e();
        qnl qnlVar = this.a;
        qnlVar.d = list;
        qnlVar.f();
        for (qnm qnmVar : this.a.k) {
        }
        this.a.c();
    }

    @Override // defpackage.tqj
    public final void f(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            this.a.f.remove(Integer.valueOf(i));
            int i2 = this.a.e.get(i, -1);
            if (i2 != -1) {
                arrayList.add(Integer.valueOf(i2));
            } else {
                this.a.g();
                return;
            }
        }
        Collections.sort(arrayList);
        this.a.e();
        qnl qnlVar = this.a;
        qpl.k(arrayList);
        qnlVar.i();
        this.a.c();
    }

    @Override // defpackage.tqj
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.tqj
    public final void h() {
        long a = this.a.a();
        qnl qnlVar = this.a;
        if (a != qnlVar.b) {
            qnlVar.b = a;
            qnlVar.b();
            qnl qnlVar2 = this.a;
            if (qnlVar2.b == 0) {
                return;
            }
            qnlVar2.g();
        }
    }
}
