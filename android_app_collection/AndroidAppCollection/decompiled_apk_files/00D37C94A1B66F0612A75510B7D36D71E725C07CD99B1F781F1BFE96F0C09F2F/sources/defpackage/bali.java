package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bali  reason: default package */
/* loaded from: classes2.dex */
public final class bali implements balr, balq {
    private final balr[] a;
    private final balq[] b;

    public bali(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof balr) {
                if (obj instanceof bali) {
                    d(arrayList, ((bali) obj).a);
                } else {
                    arrayList.add(obj);
                }
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof balq) {
                if (obj2 instanceof bali) {
                    d(arrayList2, ((bali) obj2).b);
                } else {
                    arrayList2.add(obj2);
                }
            }
        }
        if (arrayList.size() <= 0) {
            this.a = null;
        } else {
            this.a = (balr[]) arrayList.toArray(new balr[arrayList.size()]);
        }
        if (arrayList2.size() <= 0) {
            this.b = null;
        } else {
            this.b = (balq[]) arrayList2.toArray(new balq[arrayList2.size()]);
        }
    }

    private static final void d(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.balr
    public final int a(baih baihVar) {
        balr[] balrVarArr = this.a;
        int length = balrVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length >= 0) {
                i += balrVarArr[length].a(baihVar);
            } else {
                return i;
            }
        }
    }

    @Override // defpackage.balr
    public final int b(baih baihVar, int i) {
        balr[] balrVarArr = this.a;
        int length = balrVarArr.length;
        int i2 = 0;
        while (i2 < i) {
            length--;
            if (length < 0) {
                break;
            }
            i2 += balrVarArr[length].b(baihVar, Integer.MAX_VALUE);
        }
        return i2;
    }

    @Override // defpackage.balr
    public final void c(StringBuffer stringBuffer, baih baihVar) {
        for (balr balrVar : this.a) {
            balrVar.c(stringBuffer, baihVar);
        }
    }
}
