package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bakm  reason: default package */
/* loaded from: classes2.dex */
public final class bakm implements bale, bala {
    public final bale[] a;
    public final bala[] b;
    private final int c;
    private final int d;

    public bakm(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof bakm) {
                e(arrayList, ((bakm) obj).a);
            } else {
                arrayList.add(obj);
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof bakm) {
                e(arrayList2, ((bakm) obj2).b);
            } else {
                arrayList2.add(obj2);
            }
        }
        if (arrayList.contains(null) || arrayList.isEmpty()) {
            this.a = null;
            this.c = 0;
        } else {
            int size2 = arrayList.size();
            this.a = new bale[size2];
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                bale baleVar = (bale) arrayList.get(i3);
                i2 += baleVar.b();
                this.a[i3] = baleVar;
            }
            this.c = i2;
        }
        if (arrayList2.contains(null) || arrayList2.isEmpty()) {
            this.b = null;
            this.d = 0;
            return;
        }
        int size3 = arrayList2.size();
        this.b = new bala[size3];
        int i4 = 0;
        for (int i5 = 0; i5 < size3; i5++) {
            bala balaVar = (bala) arrayList2.get(i5);
            i4 += balaVar.a();
            this.b[i5] = balaVar;
        }
        this.d = i4;
    }

    private static final void e(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.bala
    public final int a() {
        return this.d;
    }

    @Override // defpackage.bale
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bala
    public final int c(bald baldVar, String str, int i) {
        bala[] balaVarArr = this.b;
        if (balaVarArr != null) {
            int length = balaVarArr.length;
            for (int i2 = 0; i2 < length && i >= 0; i2++) {
                i = balaVarArr[i2].c(baldVar, str, i);
            }
            return i;
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bale
    public final void d(StringBuffer stringBuffer, long j, bahl bahlVar, int i, baht bahtVar, Locale locale) {
        bale[] baleVarArr = this.a;
        if (baleVarArr == null) {
            throw new UnsupportedOperationException();
        }
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        for (bale baleVar : baleVarArr) {
            baleVar.d(stringBuffer, j, bahlVar, i, bahtVar, locale2);
        }
    }
}
