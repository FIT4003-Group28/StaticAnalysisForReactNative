package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: yc  reason: default package */
/* loaded from: classes4.dex */
public final class yc {
    final SparseArray a = new SparseArray();
    public int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final long g(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    public final yb a(int i) {
        yb ybVar = (yb) this.a.get(i);
        if (ybVar == null) {
            yb ybVar2 = new yb();
            this.a.put(i, ybVar2);
            return ybVar2;
        }
        return ybVar;
    }

    public final yo b(int i) {
        yb ybVar = (yb) this.a.get(i);
        if (ybVar == null || ybVar.a.isEmpty()) {
            return null;
        }
        ArrayList arrayList = ybVar.a;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
        } while (((yo) arrayList.get(size)).r());
        return (yo) arrayList.remove(size);
    }

    public final void c() {
        this.b++;
    }

    public final void d() {
        for (int i = 0; i < this.a.size(); i++) {
            ((yb) this.a.valueAt(i)).a.clear();
        }
    }

    public final void e() {
        this.b--;
    }

    public final void f(yo yoVar) {
        int i = yoVar.f;
        ArrayList arrayList = a(i).a;
        int i2 = ((yb) this.a.get(i)).b;
        if (arrayList.size() >= 5) {
            return;
        }
        yoVar.l();
        arrayList.add(yoVar);
    }
}
