package defpackage;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qt  reason: default package */
/* loaded from: classes4.dex */
public final class qt implements Runnable {
    final /* synthetic */ qu a;

    public qt(qu quVar) {
        this.a = quVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qy a = this.a.a.a();
        while (a != null) {
            int i = a.b;
            int i2 = 0;
            rb rbVar = null;
            if (i == 1) {
                ra raVar = this.a.b;
                int i3 = a.c;
                int i4 = a.d;
                qh qhVar = (qh) raVar;
                if (qhVar.a(i3)) {
                    ql qlVar = qhVar.a;
                    qlVar.l = i4;
                    qlVar.d.a.mr();
                    ql qlVar2 = qhVar.a;
                    qlVar2.m = qlVar2.n;
                    int i5 = 0;
                    while (i5 < qhVar.a.e.b.size()) {
                        ql qlVar3 = qhVar.a;
                        qz qzVar = qlVar3.g;
                        rc rcVar = qlVar3.e;
                        qzVar.b((i5 < 0 || i5 >= rcVar.b.size()) ? null : (rb) rcVar.b.valueAt(i5));
                        i5++;
                    }
                    qhVar.a.e.b.clear();
                    ql qlVar4 = qhVar.a;
                    qlVar4.k = false;
                    qlVar4.b();
                }
            } else if (i == 2) {
                Object obj = a.h;
                qh qhVar2 = (qh) this.a.b;
                if (!qhVar2.a(a.c)) {
                    qhVar2.a.g.b((rb) obj);
                } else {
                    rc rcVar2 = qhVar2.a.e;
                    rb rbVar2 = (rb) obj;
                    int indexOfKey = rcVar2.b.indexOfKey(rbVar2.b);
                    if (indexOfKey < 0) {
                        rcVar2.b.put(rbVar2.b, obj);
                    } else {
                        rbVar = (rb) rcVar2.b.valueAt(indexOfKey);
                        rcVar2.b.setValueAt(indexOfKey, obj);
                        if (rcVar2.c == rbVar) {
                            rcVar2.c = rbVar2;
                        }
                    }
                    if (rbVar != null) {
                        Log.e("AsyncListUtil", "duplicate tile @" + rbVar.b);
                        qhVar2.a.g.b(rbVar);
                    }
                    int i6 = rbVar2.b + rbVar2.c;
                    while (i2 < qhVar2.a.o.size()) {
                        int keyAt = qhVar2.a.o.keyAt(i2);
                        if (rbVar2.b > keyAt || keyAt >= i6) {
                            i2++;
                        } else {
                            qhVar2.a.o.removeAt(i2);
                            qhVar2.a.d.a.ok(keyAt);
                        }
                    }
                }
            } else if (i != 3) {
                Log.e("ThreadUtil", "Unsupported message, what=" + a.b);
            } else {
                ra raVar2 = this.a.b;
                int i7 = a.c;
                int i8 = a.d;
                qh qhVar3 = (qh) raVar2;
                if (qhVar3.a(i7)) {
                    rc rcVar3 = qhVar3.a.e;
                    rb rbVar3 = (rb) rcVar3.b.get(i8);
                    if (rcVar3.c == rbVar3) {
                        rcVar3.c = null;
                    }
                    rcVar3.b.delete(i8);
                    if (rbVar3 == null) {
                        Log.e("AsyncListUtil", "tile not found @" + i8);
                    } else {
                        qhVar3.a.g.b(rbVar3);
                    }
                }
            }
            a = this.a.a.a();
        }
    }
}
