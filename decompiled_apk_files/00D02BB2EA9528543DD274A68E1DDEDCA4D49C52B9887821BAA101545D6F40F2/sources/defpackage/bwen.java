package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bwen  reason: default package */
/* loaded from: classes4.dex */
public final class bwen implements Serializable {
    private bvrt<dqhg> a;

    public bwen(dqhg dqhgVar) {
        this.a = bvrt.b(dqhgVar);
    }

    public final synchronized dqhg a() {
        bvrt<dqhg> bvrtVar;
        bvrtVar = this.a;
        dbsk.s(bvrtVar);
        return bvrtVar.e((dssr) dqhg.g.cu(7), dqhg.g);
    }

    @dzsi
    public final synchronized String b() {
        dqhg a = a();
        int a2 = dqhf.a(a.b);
        int i = a2 - 1;
        if (a2 != 0) {
            if (i == 0) {
                return a.e;
            } else if (i == 1) {
                if (a.b != 2) {
                    return "";
                }
                return (String) a.c;
            } else if (i != 2) {
                return null;
            } else {
                if (a.b != 3) {
                    return "";
                }
                return (String) a.c;
            }
        }
        throw null;
    }

    public final synchronized boolean c() {
        return dqhf.a(a().b) == 1;
    }

    public final synchronized boolean d() {
        return dqhf.a(a().b) == 2;
    }

    @dzsi
    public final synchronized drrp e() {
        drrp drrpVar;
        if (c()) {
            dqhg a = a();
            if (a.b == 1) {
                drrpVar = (drrp) a.c;
            } else {
                drrpVar = drrp.d;
            }
            return drrpVar;
        }
        return null;
    }

    public final synchronized void f(String str) {
        dqhg a = a();
        dqhe ca = dqhg.g.ca(a);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dqhg dqhgVar = (dqhg) ca.b;
        dqhgVar.a |= 32;
        dqhgVar.f = true;
        int a2 = dqhf.a(a.b);
        int i = a2 - 1;
        if (a2 == 0) {
            throw null;
        }
        if (i == 0) {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dqhg dqhgVar2 = (dqhg) ca.b;
            str.getClass();
            dqhgVar2.a |= 16;
            dqhgVar2.e = str;
        } else if (i == 1) {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dqhg dqhgVar3 = (dqhg) ca.b;
            str.getClass();
            dqhgVar3.b = 2;
            dqhgVar3.c = str;
        } else if (i == 2) {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dqhg dqhgVar4 = (dqhg) ca.b;
            str.getClass();
            dqhgVar4.b = 3;
            dqhgVar4.c = str;
        }
        this.a = bvrt.b(ca.bK());
    }

    public final synchronized boolean g() {
        dqhg a = a();
        return b() != null && !((a.a & 32) != 0 && a.f);
    }

    public final synchronized boolean h() {
        return (a().a & 1) != 0;
    }

    @dzsi
    public final synchronized String i() {
        return a().d;
    }

    public final synchronized String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        if (h()) {
            sb2.append(i());
            sb2.append('\n');
        }
        String b = b();
        if (dbsj.d(b)) {
            sb = sb2.toString();
        } else {
            sb2.append(b);
            sb = sb2.toString();
        }
        return sb;
    }
}
