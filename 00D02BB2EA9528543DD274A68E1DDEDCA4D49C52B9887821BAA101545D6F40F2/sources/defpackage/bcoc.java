package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bcoc  reason: default package */
/* loaded from: classes3.dex */
public class bcoc extends bcnv implements bcmf {
    boolean a;
    @dzsi
    Runnable p;
    private final String q;
    private final String r;
    private final View.OnClickListener s;
    @dzsi
    private final bclp t;
    private final cjtd u;
    private final bcoa v;
    private final bcnz w;
    @dzsi
    private apnj x;
    private boolean y;

    public bcoc(bcnu bcnuVar, apqe apqeVar, dwfl dwflVar, int i, @dzsi ilo iloVar, dwen dwenVar) {
        super(bcnuVar, dwflVar, i, iloVar, dwenVar);
        String str;
        this.w = new bcnz(this);
        dkea dkeaVar = dwflVar.j;
        if ((dkeaVar == null ? dkea.d : dkeaVar).c.size() > 0) {
            dkea dkeaVar2 = dwflVar.j;
            str = (dkeaVar2 == null ? dkea.d : dkeaVar2).c.get(0).e;
        } else {
            str = "";
        }
        this.q = str;
        dkea dkeaVar3 = dwflVar.j;
        this.r = apqeVar.a((dkeaVar3 == null ? dkea.d : dkeaVar3).b);
        this.s = new bcny(bcnuVar, i);
        this.v = new bcoa();
        cjta b = cjtd.b();
        b.d = dtxy.ci;
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        b.i(i);
        this.u = b.a();
        if (cknv.k(dwflVar).isEmpty()) {
            this.t = null;
            return;
        }
        cjta b2 = cjtd.b();
        b2.d = dtxy.cg;
        b2.b = dwflVar.b;
        b2.g(dwflVar.c);
        final cjtd a = b2.a();
        this.t = new bclp(a) { // from class: bcnx
            private final cjtd a;

            {
                this.a = a;
            }

            @Override // defpackage.bclp
            public cjtd a() {
                return this.a;
            }
        };
    }

    @Override // defpackage.apns
    public int QL() {
        return this.l;
    }

    @Override // defpackage.apns
    public void QM(@dzsi Runnable runnable) {
        this.p = runnable;
    }

    @Override // defpackage.apns
    public void QN(boolean z) {
        this.y = z;
        if (!z) {
            this.a = false;
        }
        cqkx.p(this);
    }

    @Override // defpackage.apns
    public void QO() {
        bcoa bcoaVar = this.v;
        bcoaVar.a = true;
        bcoaVar.a();
    }

    @Override // defpackage.apns
    public Boolean QP() {
        bcnz bcnzVar = this.w;
        View view = bcnzVar.c;
        boolean z = false;
        if (view != null && view.getHeight() != 0 && view.getGlobalVisibleRect(bcnzVar.b) && bcnzVar.b.height() > view.getHeight() / 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.apns
    public void QQ(@dzsi apnr apnrVar) {
        this.w.a = apnrVar;
    }

    @Override // defpackage.bcnv, defpackage.bcdh
    public void a(cqiv cqivVar) {
        if (this.m.c()) {
            cqivVar.a(new bcib(), this);
        } else {
            cqivVar.a(new bckc(), this);
        }
    }

    @Override // defpackage.bcnv, defpackage.bcdh
    public View.OnClickListener e() {
        return this.s;
    }

    @Override // defpackage.bcnv, defpackage.bcdh
    public cjtd f() {
        return this.u;
    }

    @Override // defpackage.bcnv, defpackage.bcdh
    public Boolean i() {
        boolean z = false;
        if (this.n.a && this.t == null && !this.y) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bcmf
    public String m() {
        return this.q;
    }

    @Override // defpackage.bcmf
    public String n() {
        return b().a;
    }

    @Override // defpackage.bcmf
    public String o() {
        return this.r;
    }

    @Override // defpackage.bcmf
    public Boolean p() {
        return Boolean.valueOf(this.y);
    }

    @Override // defpackage.bcmf
    public Boolean q() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.bcmf
    public apnj r() {
        if (this.x == null) {
            this.x = new bcob(this);
        }
        return this.x;
    }

    @Override // defpackage.bcmf
    public View.OnAttachStateChangeListener s() {
        return this.w;
    }

    @Override // defpackage.bcmf
    public apnk u() {
        return this.v;
    }

    @Override // defpackage.bcmf
    @dzsi
    public bclp v() {
        return this.t;
    }
}
