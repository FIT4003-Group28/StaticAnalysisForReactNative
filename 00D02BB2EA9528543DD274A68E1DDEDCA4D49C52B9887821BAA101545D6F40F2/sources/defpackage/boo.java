package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: boo  reason: default package */
/* loaded from: classes3.dex */
final class boo {
    static final bph a = bph.a("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<bpt<T>> a(bpj bpjVar, bis bisVar, float f, bpe<T> bpeVar) {
        ArrayList arrayList = new ArrayList();
        if (bpjVar.r() == 6) {
            bisVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        bpjVar.f();
        while (bpjVar.h()) {
            if (bpjVar.j(a) == 0) {
                if (bpjVar.r() == 1) {
                    bpjVar.d();
                    if (bpjVar.r() != 7) {
                        while (bpjVar.h()) {
                            arrayList.add(bon.a(bpjVar, bisVar, f, bpeVar, true));
                        }
                    } else {
                        arrayList.add(bon.a(bpjVar, bisVar, f, bpeVar, false));
                    }
                    bpjVar.e();
                } else {
                    arrayList.add(bon.a(bpjVar, bisVar, f, bpeVar, false));
                }
            } else {
                bpjVar.p();
            }
        }
        bpjVar.g();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends bpt<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            bpt<T> bptVar = list.get(i2);
            i2++;
            bpt<T> bptVar2 = list.get(i2);
            bptVar.f = Float.valueOf(bptVar2.e);
            if (bptVar.c == null && (t = bptVar2.b) != null) {
                bptVar.c = t;
                if (bptVar instanceof blj) {
                    ((blj) bptVar).a();
                }
            }
        }
        bpt<T> bptVar3 = list.get(i);
        if ((bptVar3.b == null || bptVar3.c == null) && list.size() > 1) {
            list.remove(bptVar3);
        }
    }
}
