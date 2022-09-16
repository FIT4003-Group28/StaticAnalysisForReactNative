package defpackage;
/* compiled from: PG */
/* renamed from: azgc  reason: default package */
/* loaded from: classes2.dex */
public final class azgc extends ayoi {
    final Object[] a;

    public azgc(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        azgb azgbVar = new azgb(ayomVar, this.a);
        ayomVar.sj(azgbVar);
        if (!azgbVar.d) {
            Object[] objArr = azgbVar.b;
            int length = objArr.length;
            for (int i = 0; i < length && !azgbVar.e; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    azgbVar.a.c(obj);
                } else {
                    ayom ayomVar2 = azgbVar.a;
                    StringBuilder sb = new StringBuilder(40);
                    sb.append("The element at index ");
                    sb.append(i);
                    sb.append(" is null");
                    ayomVar2.b(new NullPointerException(sb.toString()));
                    return;
                }
            }
            if (azgbVar.e) {
                return;
            }
            azgbVar.a.sm();
        }
    }
}
