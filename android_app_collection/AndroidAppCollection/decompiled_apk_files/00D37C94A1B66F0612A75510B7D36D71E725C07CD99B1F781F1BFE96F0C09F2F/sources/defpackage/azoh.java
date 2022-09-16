package defpackage;
/* compiled from: PG */
/* renamed from: azoh  reason: default package */
/* loaded from: classes2.dex */
public final class azoh {
    public final Object[] a;
    Object[] b;
    int c;

    public azoh() {
        Object[] objArr = new Object[5];
        this.a = objArr;
        this.b = objArr;
    }

    public final void a(Object obj) {
        int i = this.c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
            i = 0;
        }
        this.b[i] = obj;
        this.c = i + 1;
    }

    public final void b(azog azogVar) {
        Object obj;
        for (Object[] objArr = this.a; objArr != null; objArr = (Object[]) objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (azogVar.a(obj)) {
                    return;
                }
            }
        }
    }

    public final void c(Object obj) {
        this.a[0] = obj;
    }

    public final boolean d(bame bameVar) {
        Object obj;
        Object[] objArr = this.a;
        while (true) {
            if (objArr != null) {
                for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                    if (obj != azoq.a) {
                        if (!(obj instanceof azoo)) {
                            if (obj instanceof azop) {
                                bameVar.f(((azop) obj).a);
                            } else {
                                bameVar.c(obj);
                            }
                        } else {
                            bameVar.b(((azoo) obj).a);
                            return true;
                        }
                    } else {
                        bameVar.sm();
                        return true;
                    }
                }
                objArr = (Object[]) objArr[4];
            } else {
                return false;
            }
        }
    }
}
