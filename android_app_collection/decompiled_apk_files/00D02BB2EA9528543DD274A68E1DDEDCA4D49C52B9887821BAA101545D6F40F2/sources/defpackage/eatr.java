package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eatr  reason: default package */
/* loaded from: classes.dex */
public final class eatr implements eauj, eauf {
    public final eauj[] a;
    public final eauf[] b;
    private final int c;
    private final int d;

    public eatr(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof eatr) {
                f(arrayList, ((eatr) obj).a);
            } else {
                arrayList.add(obj);
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof eatr) {
                f(arrayList2, ((eatr) obj2).b);
            } else {
                arrayList2.add(obj2);
            }
        }
        if (arrayList.contains(null) || arrayList.isEmpty()) {
            this.a = null;
            this.c = 0;
        } else {
            int size2 = arrayList.size();
            this.a = new eauj[size2];
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                eauj eaujVar = (eauj) arrayList.get(i3);
                i2 += eaujVar.a();
                this.a[i3] = eaujVar;
            }
            this.c = i2;
        }
        if (arrayList2.contains(null) || arrayList2.isEmpty()) {
            this.b = null;
            this.d = 0;
            return;
        }
        int size3 = arrayList2.size();
        this.b = new eauf[size3];
        int i4 = 0;
        for (int i5 = 0; i5 < size3; i5++) {
            eauf eaufVar = (eauf) arrayList2.get(i5);
            i4 += eaufVar.d();
            this.b[i5] = eaufVar;
        }
        this.d = i4;
    }

    private static final void f(List<Object> list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.eauj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.eauf
    public final int d() {
        return this.d;
    }

    @Override // defpackage.eauf
    public final int e(eaui eauiVar, String str, int i) {
        eauf[] eaufVarArr = this.b;
        if (eaufVarArr != null) {
            int length = eaufVarArr.length;
            for (int i2 = 0; i2 < length && i >= 0; i2++) {
                i = eaufVarArr[i2].e(eauiVar, str, i);
            }
            return i;
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.eauj
    public final void b(StringBuffer stringBuffer, long j, eaok eaokVar, int i, eaou eaouVar, Locale locale) {
        eauj[] eaujVarArr = this.a;
        if (eaujVarArr == null) {
            throw new UnsupportedOperationException();
        }
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        for (eauj eaujVar : eaujVarArr) {
            eaujVar.b(stringBuffer, j, eaokVar, i, eaouVar, locale2);
        }
    }

    @Override // defpackage.eauj
    public final void c(StringBuffer stringBuffer, eapt eaptVar, Locale locale) {
        eauj[] eaujVarArr = this.a;
        if (eaujVarArr != null) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (eauj eaujVar : eaujVarArr) {
                eaujVar.c(stringBuffer, eaptVar, locale);
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
