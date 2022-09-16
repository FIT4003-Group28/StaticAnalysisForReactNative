package defpackage;
/* compiled from: PG */
/* renamed from: aywo  reason: default package */
/* loaded from: classes2.dex */
final class aywo extends aywp {
    private static final long serialVersionUID = 2587302975077663557L;
    final bame a;

    public aywo(bame bameVar, Object[] objArr) {
        super(objArr);
        this.a = bameVar;
    }

    @Override // defpackage.aywp
    public final void b() {
        Object[] objArr = this.b;
        int length = objArr.length;
        bame bameVar = this.a;
        for (int i = this.c; i != length; i++) {
            if (this.d) {
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                bameVar.c(obj);
            } else {
                StringBuilder sb = new StringBuilder(40);
                sb.append("The element at index ");
                sb.append(i);
                sb.append(" is null");
                bameVar.b(new NullPointerException(sb.toString()));
                return;
            }
        }
        if (this.d) {
            return;
        }
        bameVar.sm();
    }

    @Override // defpackage.aywp
    public final void f(long j) {
        Object[] objArr = this.b;
        int length = objArr.length;
        int i = this.c;
        bame bameVar = this.a;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j || i == length) {
                    if (i == length) {
                        if (this.d) {
                            return;
                        }
                        bameVar.sm();
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
                        bameVar.c(obj);
                        j2++;
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder(40);
                        sb.append("The element at index ");
                        sb.append(i);
                        sb.append(" is null");
                        bameVar.b(new NullPointerException(sb.toString()));
                        return;
                    }
                }
            }
        } while (j != 0);
    }
}
