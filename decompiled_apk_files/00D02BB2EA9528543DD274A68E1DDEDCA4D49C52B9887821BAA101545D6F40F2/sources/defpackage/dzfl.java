package defpackage;
/* compiled from: PG */
/* renamed from: dzfl  reason: default package */
/* loaded from: classes6.dex */
public final class dzfl<T> {
    public final Object[] a;
    Object[] b;
    int c;

    public dzfl() {
        Object[] objArr = new Object[5];
        this.a = objArr;
        this.b = objArr;
    }

    public final void a(T t) {
        int i = this.c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
            i = 0;
        }
        this.b[i] = t;
        this.c = i + 1;
    }

    public final void b(T t) {
        this.a[0] = t;
    }

    public final void c(dzfk<? super T> dzfkVar) {
        Object obj;
        for (Object[] objArr = this.a; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (dzfkVar.a(obj)) {
                    return;
                }
            }
        }
    }
}
