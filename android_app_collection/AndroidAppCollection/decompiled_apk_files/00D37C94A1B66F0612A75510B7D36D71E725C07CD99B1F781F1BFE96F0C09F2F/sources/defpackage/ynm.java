package defpackage;

import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ynm  reason: default package */
/* loaded from: classes4.dex */
final class ynm implements ynj {
    private final WeakReference a;
    private final Class b;
    private final Class[] c;
    private final int d;

    public ynm(ynl ynlVar, Class cls, Class[] clsArr) {
        this.a = new WeakReference(ynlVar);
        this.b = cls;
        this.c = clsArr;
        this.d = Arrays.hashCode(new Object[]{ynlVar, Integer.valueOf(Arrays.hashCode(clsArr))});
    }

    @Override // defpackage.ynj
    public final void a(Object obj) {
        ynl ynlVar = (ynl) this.a.get();
        if (ynlVar == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        Class cls2 = this.b;
        Class<?>[] clsArr = this.c;
        int length = clsArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (clsArr[i] == cls) {
                    length = i;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        ynlVar.ky(cls2, obj, length);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ynm) {
            ynm ynmVar = (ynm) obj;
            if (ynmVar.a.get() == this.a.get() && Arrays.equals(this.c, ynmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }
}
