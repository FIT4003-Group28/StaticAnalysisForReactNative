package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aebg  reason: default package */
/* loaded from: classes2.dex */
public class aebg implements aebb {
    private final dxio<aebc> a;
    private final aeaz b;
    private final List<dxio<? extends aczy<? extends aczr>>> c;
    private awwb d;

    public aebg(aebd aebdVar, dxio<aebc> dxioVar, aeba aebaVar, cqhn cqhnVar) {
        this.a = dxioVar;
        this.b = aebaVar.a(ckfh.l);
        this.c = aebdVar.a;
    }

    @Override // defpackage.aebb
    public dktk a() {
        return dktk.INFORMAL_TRANSIT;
    }

    @Override // defpackage.aebb
    public cjtd b() {
        return cjtd.a(dtxr.ac);
    }

    @Override // defpackage.aebb
    public ddho c() {
        return dtxr.ae;
    }

    @Override // defpackage.aebb
    public ddho d() {
        return dtxr.ac;
    }

    @Override // defpackage.aebb
    public dvum e() {
        return dvum.INFORMAL_TRANSIT_TAB;
    }

    @Override // defpackage.aebb
    public synchronized List<cqix<?>> f() {
        this.a.a().c();
        return this.a.a().a(dchl.k(this.c, aebe.a), this.d, ckfh.n);
    }

    @Override // defpackage.aebb
    public synchronized Set<awvv<?>> g() {
        return h();
    }

    @Override // defpackage.aebb
    public synchronized Set<awvv<?>> h() {
        return adaa.b(this.c);
    }

    @Override // defpackage.aebb
    public void i(awwb awwbVar, awwp awwpVar) {
        this.d = awwbVar;
        this.b.a(awwbVar, h());
        this.a.a().b(awwbVar, adaa.a(dchl.k(this.c, aebf.a)), awwpVar.a());
        cqkx.p(this);
    }

    @Override // defpackage.aebb
    public boolean j() {
        return true;
    }

    @Override // defpackage.aebb
    public Float k() {
        return Float.valueOf(0.4f);
    }

    @Override // defpackage.aebb
    public void l(boolean z, @dzsi ckfe ckfeVar) {
    }

    @Override // defpackage.aebb
    public void m(Bundle bundle) {
    }

    @Override // defpackage.aebb
    public void n(Bundle bundle) {
    }
}
