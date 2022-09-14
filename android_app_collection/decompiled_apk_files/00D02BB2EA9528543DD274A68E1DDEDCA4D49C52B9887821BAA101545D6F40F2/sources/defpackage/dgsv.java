package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
/* compiled from: PG */
/* renamed from: dgsv  reason: default package */
/* loaded from: classes6.dex */
final class dgsv extends dgtl<AtomicLongArray> {
    final /* synthetic */ dgtl a;

    public dgsv(dgtl dgtlVar) {
        this.a = dgtlVar;
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ AtomicLongArray a(dgxe dgxeVar) {
        ArrayList arrayList = new ArrayList();
        dgxeVar.a();
        while (dgxeVar.e()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(dgxeVar)).longValue()));
        }
        dgxeVar.b();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, AtomicLongArray atomicLongArray) {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        dgxgVar.a();
        int length = atomicLongArray2.length();
        for (int i = 0; i < length; i++) {
            this.a.b(dgxgVar, Long.valueOf(atomicLongArray2.get(i)));
        }
        dgxgVar.c();
    }
}
