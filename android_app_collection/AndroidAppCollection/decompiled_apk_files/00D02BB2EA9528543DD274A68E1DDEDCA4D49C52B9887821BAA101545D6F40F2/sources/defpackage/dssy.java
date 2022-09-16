package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dssy  reason: default package */
/* loaded from: classes.dex */
public final class dssy {
    public static final void a(dspd dspdVar, ArrayDeque arrayDeque) {
        if (dspdVar.g()) {
            int b = b(dspdVar.c());
            int h = dstb.h(b + 1);
            if (arrayDeque.isEmpty() || ((dspd) arrayDeque.peek()).c() >= h) {
                arrayDeque.push(dspdVar);
                return;
            }
            int h2 = dstb.h(b);
            dspd dspdVar2 = (dspd) arrayDeque.pop();
            while (!arrayDeque.isEmpty() && ((dspd) arrayDeque.peek()).c() < h2) {
                dspdVar2 = new dstb((dspd) arrayDeque.pop(), dspdVar2);
            }
            dstb dstbVar = new dstb(dspdVar2, dspdVar);
            while (!arrayDeque.isEmpty()) {
                if (((dspd) arrayDeque.peek()).c() >= dstb.h(b(dstbVar.d) + 1)) {
                    break;
                }
                dstbVar = new dstb((dspd) arrayDeque.pop(), dstbVar);
            }
            arrayDeque.push(dstbVar);
        } else if (dspdVar instanceof dstb) {
            dstb dstbVar2 = (dstb) dspdVar;
            int i = dstb.h;
            a(dstbVar2.e, arrayDeque);
            a(dstbVar2.f, arrayDeque);
        } else {
            String valueOf = String.valueOf(dspdVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Has a new type of ByteString been created? Found ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static final int b(int i) {
        int binarySearch = Arrays.binarySearch(dstb.a, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
