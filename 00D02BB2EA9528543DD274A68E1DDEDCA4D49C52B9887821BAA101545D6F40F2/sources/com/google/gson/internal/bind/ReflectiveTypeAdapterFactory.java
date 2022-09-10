package com.google.gson.internal.bind;

import com.google.gson.internal.Excluder;
import java.lang.reflect.Field;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ReflectiveTypeAdapterFactory implements dgtm {
    private final dguk a;
    private final dgsr b;
    private final Excluder c;
    private final dgxb d = dgxb.a;

    public ReflectiveTypeAdapterFactory(dguk dgukVar, dgsr dgsrVar, Excluder excluder) {
        this.a = dgukVar;
        this.b = dgsrVar;
        this.c = excluder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v7, types: [dgvp] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    @Override // defpackage.dgtm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> defpackage.dgtl<T> a(defpackage.dgsx r33, defpackage.dgxd<T> r34) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a(dgsx, dgxd):dgtl");
    }

    public final boolean b(Field field, boolean z) {
        Excluder excluder = this.c;
        if (excluder.c(field.getType()) || excluder.g(z) || (excluder.c & field.getModifiers()) != 0 || ((excluder.b != -1.0d && !excluder.f((dgtp) field.getAnnotation(dgtp.class), (dgtq) field.getAnnotation(dgtq.class))) || field.isSynthetic() || ((!excluder.d && excluder.e(field.getType())) || excluder.d(field.getType())))) {
            return false;
        }
        List<dgso> list = z ? excluder.e : excluder.f;
        if (list.isEmpty()) {
            return true;
        }
        new dgsp(field);
        for (dgso dgsoVar : list) {
            if (dgsoVar.b()) {
                return false;
            }
        }
        return true;
    }
}
