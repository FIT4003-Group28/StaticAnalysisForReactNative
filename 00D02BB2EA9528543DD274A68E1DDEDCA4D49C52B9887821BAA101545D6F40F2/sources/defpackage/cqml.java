package defpackage;
/* compiled from: PG */
/* renamed from: cqml  reason: default package */
/* loaded from: classes.dex */
public class cqml<T> implements cqnm<T> {
    public cqmp<T>[] c;
    public int d;

    public cqml(cqmp<T>... cqmpVarArr) {
        int i = 0;
        while (true) {
            int length = cqmpVarArr.length;
            if (i >= length) {
                this.c = cqmpVarArr;
                this.d = length;
                return;
            } else if (cqmpVarArr[i] == null) {
                StringBuilder sb = new StringBuilder(40);
                sb.append("Child node at index ");
                sb.append(i);
                sb.append(" was null");
                throw new NullPointerException(sb.toString());
            } else {
                i++;
            }
        }
    }

    private final void a(int i) {
        int i2 = this.d;
        cqmp<T>[] cqmpVarArr = this.c;
        int length = cqmpVarArr.length;
        if (i2 + i > length) {
            cqmp<T>[] cqmpVarArr2 = (cqmp[]) dclv.a(cqmpVarArr, length + i + 5);
            System.arraycopy(this.c, 0, cqmpVarArr2, 0, this.d);
            this.c = cqmpVarArr2;
        }
    }

    @dzsi
    public static cqjg i(cqmp<?>[] cqmpVarArr, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                cqmp<?> cqmpVar = cqmpVarArr[i];
                if (!(cqmpVar instanceof cqnl)) {
                    if (cqmpVar instanceof cqmn) {
                        cqmp<T>[] cqmpVarArr2 = ((cqmn) cqmpVar).a;
                        cqjg i2 = i(cqmpVarArr2, cqmpVarArr2.length);
                        if (i2 != null) {
                            return i2;
                        }
                    }
                } else {
                    return ((cqnl) cqmpVar).a;
                }
            } else {
                return null;
            }
        }
    }

    public void h(cqmp<T>... cqmpVarArr) {
        int i = 0;
        while (true) {
            int length = cqmpVarArr.length;
            if (i < length) {
                cqmp<T> cqmpVar = cqmpVarArr[i];
                StringBuilder sb = new StringBuilder(38);
                sb.append("Property at index ");
                sb.append(i);
                sb.append(" was null");
                dbsk.t(cqmpVar, sb.toString());
                i++;
            } else {
                a(length);
                System.arraycopy(cqmpVarArr, 0, this.c, this.d, length);
                this.d += length;
                return;
            }
        }
    }

    public final void j(cqmp<T> cqmpVar) {
        dbsk.s(cqmpVar);
        if (cqmpVar != cqmp.e) {
            a(1);
            cqmp<T>[] cqmpVarArr = this.c;
            int i = this.d;
            this.d = i + 1;
            cqmpVarArr[i] = cqmpVar;
        }
    }
}
