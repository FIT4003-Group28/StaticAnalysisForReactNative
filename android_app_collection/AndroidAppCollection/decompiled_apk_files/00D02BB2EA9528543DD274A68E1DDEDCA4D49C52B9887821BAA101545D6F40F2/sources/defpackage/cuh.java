package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cuh  reason: default package */
/* loaded from: classes5.dex */
final class cuh implements Runnable {
    final /* synthetic */ cui a;

    public cuh(cui cuiVar) {
        this.a = cuiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        cub cubVar = this.a.d;
        akvz a = cubVar.a();
        if (cubVar.b.isEmpty()) {
            return;
        }
        synchronized (cubVar.b) {
            arrayList = new ArrayList(cubVar.b);
        }
        cubVar.b.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a.j((aktg) arrayList.get(i));
        }
    }
}
