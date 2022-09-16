package defpackage;
/* compiled from: PG */
/* renamed from: aywn  reason: default package */
/* loaded from: classes2.dex */
final class aywn extends aywp {
    private static final long serialVersionUID = 2587302975077663557L;
    final ayre a;

    public aywn(ayre ayreVar, Object[] objArr) {
        super(objArr);
        this.a = ayreVar;
    }

    @Override // defpackage.aywp
    public final void b() {
        Object[] objArr = this.b;
        int length = objArr.length;
        ayre ayreVar = this.a;
        for (int i = this.c; i != length; i++) {
            if (this.d) {
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                ayreVar.e(obj);
            } else {
                StringBuilder sb = new StringBuilder(40);
                sb.append("The element at index ");
                sb.append(i);
                sb.append(" is null");
                ayreVar.b(new NullPointerException(sb.toString()));
                return;
            }
        }
        if (this.d) {
            return;
        }
        ayreVar.sm();
    }

    @Override // defpackage.aywp
    public final void f(long j) {
        Object[] objArr = this.b;
        int length = objArr.length;
        int i = this.c;
        ayre ayreVar = this.a;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j || i == length) {
                    if (i == length) {
                        if (this.d) {
                            return;
                        }
                        ayreVar.sm();
                        return;
                    }
                    j = get();
                    if (j2 == j) {
                        this.c = i;
                        j = addAndGet(-j2);
                    }
                } else if (this.d) {
                    return;
                } else {
                    Object obj = objArr[i];
                    if (obj != null) {
                        if (ayreVar.e(obj)) {
                            j2++;
                        }
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder(40);
                        sb.append("The element at index ");
                        sb.append(i);
                        sb.append(" is null");
                        ayreVar.b(new NullPointerException(sb.toString()));
                        return;
                    }
                }
            }
        } while (j != 0);
    }
}
