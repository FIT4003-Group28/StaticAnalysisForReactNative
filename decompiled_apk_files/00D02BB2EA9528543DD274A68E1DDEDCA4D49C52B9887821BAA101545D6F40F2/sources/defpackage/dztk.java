package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dztk  reason: default package */
/* loaded from: classes6.dex */
class dztk extends dztj {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> b(List<? extends T> list) {
        dzvx.c(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : dzti.a(list.get(0));
        }
        return dztu.a;
    }

    public static final void c() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
