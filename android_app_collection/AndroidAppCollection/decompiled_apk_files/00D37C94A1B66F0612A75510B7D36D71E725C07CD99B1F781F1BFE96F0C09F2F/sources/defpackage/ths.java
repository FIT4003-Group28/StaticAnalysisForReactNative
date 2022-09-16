package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ths  reason: default package */
/* loaded from: classes4.dex */
final class ths {
    private final Object a = new Object();
    private volatile long b = 0;
    private volatile boolean c = false;
    private final List d = new ArrayList(15);
    private final List e = new ArrayList(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List a(String str, tho thoVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this.a) {
            arrayList = new ArrayList(this.d);
            arrayList2 = new ArrayList(this.e);
            this.d.clear();
            this.e.clear();
        }
        thn thnVar = null;
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = i % 3;
            if (i2 == 0) {
                thnVar = thr.a();
                thoVar.b(((Long) arrayList.get(i)).intValue());
            } else if (i2 == 1) {
                thnVar.a = (Long) arrayList.get(i);
            } else {
                thnVar.b(str);
                thnVar.b = (Long) arrayList.get(i);
                thoVar.h = (akvy) arrayList2.get(i / 3);
                thnVar.e = thoVar.a();
                arrayList3.add(thnVar);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (!this.c) {
            synchronized (this.a) {
                this.d.clear();
                this.e.clear();
                this.c = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        int size;
        if (!this.c) {
            synchronized (this.a) {
                if (!this.c && (size = this.d.size()) < 15 && size % 3 == 2) {
                    this.d.add(Long.valueOf(aolu.x()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        int size;
        if (!this.c) {
            synchronized (this.a) {
                if (!this.c && (size = this.d.size()) < 15 && size % 3 == 0) {
                    this.b++;
                    this.d.add(Long.valueOf(this.b));
                    this.d.add(Long.valueOf(aolu.x()));
                    this.e.add(thl.a());
                }
            }
        }
    }
}
