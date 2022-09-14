package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: biag  reason: default package */
/* loaded from: classes3.dex */
public class biag implements bhzv {
    private static final View.OnClickListener e = new biae();
    protected final decq b;
    private final String f;
    private final amfi g;
    private final biac h;
    final amfq a = new biaf(this);
    private Boolean i = false;
    public Boolean c = false;
    @dzsi
    public cqtd d = null;

    public biag(decq decqVar, String str, amfi amfiVar, biac biacVar) {
        this.b = decqVar;
        this.f = str;
        this.g = amfiVar;
        this.h = biacVar;
    }

    @Override // defpackage.bhzv
    @dzsi
    public cqtd a() {
        return this.d;
    }

    @Override // defpackage.bhzv
    public decq b() {
        return this.b;
    }

    @Override // defpackage.bhzv
    public void c(Boolean bool) {
        this.i = bool;
    }

    @Override // defpackage.bhzv
    public Boolean d() {
        return this.i;
    }

    @Override // defpackage.bhzv
    public Boolean e() {
        return true;
    }

    @Override // defpackage.bhzv
    public View.OnClickListener f() {
        return e;
    }

    @Override // defpackage.bhzv
    public Boolean g() {
        return this.c;
    }

    @Override // defpackage.bhzv
    public String h() {
        return this.f;
    }

    @Override // defpackage.bhzv
    public String i() {
        return this.h.p(this.f);
    }

    @Override // defpackage.bhzv
    public cjtd j() {
        return cjtd.a(dtxj.ak);
    }

    public void k() {
        if (this.b.equals(decq.a)) {
            this.c = true;
            this.d = cqrt.g(2131231562, irg.H());
            return;
        }
        this.a.a(this.g.h(bhzs.a(this.b), biag.class.getName(), this.a));
    }

    public biac l() {
        return this.h;
    }
}
