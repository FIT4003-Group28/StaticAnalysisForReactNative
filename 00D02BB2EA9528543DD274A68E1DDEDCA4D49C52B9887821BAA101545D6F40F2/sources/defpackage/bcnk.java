package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bcnk  reason: default package */
/* loaded from: classes3.dex */
public class bcnk extends bcnv implements bcmb {
    private static final View.OnClickListener r = new bcnj();
    public final bdvc a;
    private final cqtd p;
    private final cjtd q;

    public bcnk(bcnu bcnuVar, btvo btvoVar, bdvd bdvdVar, dwfl dwflVar, int i, @dzsi ilo iloVar, dwen dwenVar) {
        super(bcnuVar, dwflVar, i, iloVar, dwenVar);
        dbsk.a(bdvc.a(dwflVar));
        this.p = cqrt.f(2131231803);
        cjta b = cjtd.b();
        b.d = dddv.j;
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        b.i(i);
        this.q = b.a();
        this.a = bdvdVar.a(dwflVar);
    }

    @Override // defpackage.bcnv, defpackage.bcdh
    public void a(cqiv cqivVar) {
        if (this.m.c()) {
            cqivVar.a(new bchj(), this);
        } else {
            cqivVar.a(new bcgn(), this);
        }
    }

    @Override // defpackage.bcnv, defpackage.bcdh
    public View.OnClickListener e() {
        return r;
    }

    @Override // defpackage.bcnv, defpackage.bcdh
    public Boolean h() {
        return true;
    }

    @Override // defpackage.bcmb
    public View.OnAttachStateChangeListener m() {
        return this.a.h;
    }

    @Override // defpackage.bcmb
    public cqtd n() {
        return this.p;
    }

    @Override // defpackage.bcmb
    public cjtd o() {
        return this.q;
    }
}
