package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* compiled from: PG */
/* renamed from: dgvv  reason: default package */
/* loaded from: classes6.dex */
final class dgvv extends dgtl<AtomicIntegerArray> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ AtomicIntegerArray a(dgxe dgxeVar) {
        ArrayList arrayList = new ArrayList();
        dgxeVar.a();
        while (dgxeVar.e()) {
            try {
                arrayList.add(Integer.valueOf(dgxeVar.m()));
            } catch (NumberFormatException e) {
                throw new dgtj(e);
            }
        }
        dgxeVar.b();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, AtomicIntegerArray atomicIntegerArray) {
        AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
        dgxgVar.a();
        int length = atomicIntegerArray2.length();
        for (int i = 0; i < length; i++) {
            dgxgVar.g(atomicIntegerArray2.get(i));
        }
        dgxgVar.c();
    }
}
