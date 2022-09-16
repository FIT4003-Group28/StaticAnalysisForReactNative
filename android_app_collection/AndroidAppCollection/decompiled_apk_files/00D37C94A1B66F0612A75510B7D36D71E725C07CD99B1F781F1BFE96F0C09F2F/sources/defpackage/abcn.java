package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: abcn  reason: default package */
/* loaded from: classes.dex */
public final class abcn {
    public final ascp a;
    public List b;
    public Object c;
    private List d;
    private List e;

    public abcn(ascp ascpVar) {
        this.a = ascpVar;
    }

    private static final List c(Object[] objArr, ampg ampgVar) {
        List q = amuk.q();
        if (objArr != null && (r1 = objArr.length) > 0) {
            q = new ArrayList();
            for (Object obj : objArr) {
                q.addAll((Collection) ampgVar.apply(obj));
            }
        }
        return q;
    }

    public final List a() {
        if (this.d == null) {
            this.b = new ArrayList();
            this.d = c((ascu[]) this.a.c.toArray(new ascu[0]), new ampg() { // from class: abcm
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    return abir.d((ascu) obj, abcn.this.b);
                }
            });
        }
        return this.d;
    }

    public final List b() {
        if (this.e == null) {
            this.e = c((ascq[]) this.a.d.toArray(new ascq[0]), aapz.i);
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof abcn) {
            abcn abcnVar = (abcn) obj;
            int size = a().size();
            int size2 = b().size();
            if (size == abcnVar.a().size() && size2 == abcnVar.b().size() && a().equals(abcnVar.a()) && b().equals(abcnVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((a().isEmpty() ? 0 : a().hashCode()) + 527) * 31;
        if (!b().isEmpty()) {
            i = b().hashCode();
        }
        return hashCode + i;
    }
}
