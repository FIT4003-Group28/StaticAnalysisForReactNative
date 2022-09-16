package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ahr  reason: default package */
/* loaded from: classes.dex */
public final class ahr extends aid {
    ArrayList a;
    private int b;

    public ahr(ahh ahhVar, int i) {
        super(ahhVar);
        ahh ahhVar2;
        this.a = new ArrayList();
        this.g = i;
        ahh ahhVar3 = this.d;
        ahh n = ahhVar3.n(i);
        while (true) {
            ahh ahhVar4 = n;
            ahhVar2 = ahhVar3;
            ahhVar3 = ahhVar4;
            if (ahhVar3 == null) {
                break;
            }
            n = ahhVar3.n(this.g);
        }
        this.d = ahhVar2;
        this.a.add(ahhVar2.o(this.g));
        ahh m = ahhVar2.m(this.g);
        while (m != null) {
            this.a.add(m.o(this.g));
            m = m.m(this.g);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            aid aidVar = (aid) arrayList.get(i2);
            int i3 = this.g;
            if (i3 == 0) {
                aidVar.d.f = this;
            } else if (i3 == 1) {
                aidVar.d.g = this;
            }
        }
        if (this.g == 0 && ((ahi) this.d.T).d && this.a.size() > 1) {
            ArrayList arrayList2 = this.a;
            this.d = ((aid) arrayList2.get(arrayList2.size() - 1)).d;
        }
        this.b = this.g == 0 ? this.d.ai : this.d.aj;
    }

    private final ahh g() {
        for (int i = 0; i < this.a.size(); i++) {
            ahh ahhVar = ((aid) this.a.get(i)).d;
            if (ahhVar.ag != 8) {
                return ahhVar;
            }
        }
        return null;
    }

    private final ahh n() {
        ahh ahhVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            ahhVar = ((aid) this.a.get(size)).d;
        } while (ahhVar.ag == 8);
        return ahhVar;
    }

    @Override // defpackage.aid
    public final long a() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            aid aidVar = (aid) this.a.get(i);
            j = j + aidVar.i.e + aidVar.a() + aidVar.j.e;
        }
        return j;
    }

    @Override // defpackage.aid
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((aid) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        ahh ahhVar = ((aid) this.a.get(0)).d;
        ahh ahhVar2 = ((aid) this.a.get(size2 - 1)).d;
        if (this.g == 0) {
            ahg ahgVar = ahhVar.f46J;
            ahg ahgVar2 = ahhVar2.L;
            ahu l = l(ahgVar, 0);
            int b = ahgVar.b();
            ahh g = g();
            if (g != null) {
                b = g.f46J.b();
            }
            if (l != null) {
                j(this.i, l, b);
            }
            ahu l2 = l(ahgVar2, 0);
            int b2 = ahgVar2.b();
            ahh n = n();
            if (n != null) {
                b2 = n.L.b();
            }
            if (l2 != null) {
                j(this.j, l2, -b2);
            }
        } else {
            ahg ahgVar3 = ahhVar.K;
            ahg ahgVar4 = ahhVar2.M;
            ahu l3 = l(ahgVar3, 1);
            int b3 = ahgVar3.b();
            ahh g2 = g();
            if (g2 != null) {
                b3 = g2.K.b();
            }
            if (l3 != null) {
                j(this.i, l3, b3);
            }
            ahu l4 = l(ahgVar4, 1);
            int b4 = ahgVar4.b();
            ahh n2 = n();
            if (n2 != null) {
                b4 = n2.M.b();
            }
            if (l4 != null) {
                j(this.j, l4, -b4);
            }
        }
        this.i.a = this;
        this.j.a = this;
    }

    @Override // defpackage.aid
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((aid) this.a.get(i)).c();
        }
    }

    @Override // defpackage.aid
    public final void d() {
        this.e = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((aid) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.aid
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((aid) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x03ce, code lost:
        r10 = r10 - r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    @Override // defpackage.aid, defpackage.ahs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahr.f():void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.g == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("<");
            sb.append((aid) arrayList.get(i));
            sb.append("> ");
        }
        return sb.toString();
    }
}
