package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: balp  reason: default package */
/* loaded from: classes2.dex */
public final class balp {
    public List b;
    private boolean d;
    private boolean e;
    private balk[] f;
    public int a = 1;
    private int c = 2;

    public balp() {
        List list = this.b;
        if (list == null) {
            this.b = new ArrayList();
        } else {
            list.clear();
        }
        this.d = false;
        this.e = false;
        this.f = new balk[10];
    }

    public static Object[] c(List list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return new Object[]{list.get(0), list.get(1)};
            }
            bali baliVar = new bali(list);
            return new Object[]{baliVar, baliVar};
        }
        return new Object[]{ball.a, ball.a};
    }

    public final balh a() {
        balh j = j(this.b, this.d, this.e);
        this.f = (balk[]) this.f.clone();
        return j;
    }

    public final void b(int i) {
        balk balkVar = new balk(this.a, this.c, i, this.f);
        d(balkVar, balkVar);
        this.f[i] = balkVar;
    }

    public final void d(balr balrVar, balq balqVar) {
        this.b.add(balrVar);
        this.b.add(balqVar);
        boolean z = true;
        this.d = (balrVar == null) | this.d;
        boolean z2 = this.e;
        if (balqVar != null) {
            z = false;
        }
        this.e = z2 | z;
    }

    public final void e() {
        b(4);
    }

    public final void f() {
        b(5);
    }

    public final void g() {
        b(6);
    }

    public final void h() {
        this.c = 4;
    }

    public final void i(String str) {
        Object obj;
        List list;
        List list2;
        List list3;
        List list4;
        balo baloVar = new balo(str);
        Object obj2 = null;
        if (this.b.size() > 0) {
            obj2 = this.b.get(list3.size() - 2);
            obj = this.b.get(list4.size() - 1);
        } else {
            obj = null;
        }
        if (obj2 == null || obj == null || obj2 != obj || !(obj2 instanceof balk)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        balk balkVar = new balk((balk) obj2, baloVar);
        this.b.set(list.size() - 2, balkVar);
        this.b.set(list2.size() - 1, balkVar);
        this.f[balkVar.a] = balkVar;
    }

    private static balh j(List list, boolean z, boolean z2) {
        if (!z || !z2) {
            int size = list.size();
            if (size >= 2 && (list.get(0) instanceof baln)) {
                baln balnVar = (baln) list.get(0);
                if (balnVar.b == null && balnVar.a == null) {
                    balh j = j(list.subList(2, size), z, z2);
                    balr balrVar = j.a;
                    balq balqVar = j.b;
                    balnVar.a = balrVar;
                    balnVar.b = balqVar;
                    return new balh(balnVar, balnVar);
                }
            }
            Object[] c = c(list);
            if (z) {
                return new balh(null, (balq) c[1]);
            }
            if (z2) {
                return new balh((balr) c[0], null);
            }
            return new balh((balr) c[0], (balq) c[1]);
        }
        throw new IllegalStateException("Builder has created neither a printer nor a parser");
    }
}
