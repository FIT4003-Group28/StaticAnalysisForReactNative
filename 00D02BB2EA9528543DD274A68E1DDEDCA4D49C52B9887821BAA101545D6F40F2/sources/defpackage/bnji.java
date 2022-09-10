package defpackage;
/* compiled from: PG */
/* renamed from: bnji  reason: default package */
/* loaded from: classes3.dex */
public abstract class bnji implements jaz {
    public static bnjh n() {
        bnio bnioVar = new bnio();
        bnioVar.g = true;
        bnioVar.h = 2;
        bnioVar.i = 0;
        bnioVar.d(dcdc.e());
        bnioVar.b(bnjg.a);
        return bnioVar;
    }

    @Override // defpackage.jaz
    @dzsi
    public abstract cqtd a();

    @Override // defpackage.jaz
    @dzsi
    public abstract String b();

    @Override // defpackage.jaz
    @dzsi
    public abstract cqtd c();

    @Override // defpackage.jaz
    public Boolean d() {
        return Boolean.valueOf(c() != null);
    }

    @Override // defpackage.jaz
    @dzsi
    public abstract CharSequence e();

    @Override // defpackage.jaz
    @dzsi
    public abstract CharSequence f();

    @Override // defpackage.jaz
    public abstract dcdc<cqix<?>> g();

    @Override // defpackage.jaz
    @dzsi
    public abstract cjtd h();

    @Override // defpackage.jaz
    public abstract Boolean i();

    @Override // defpackage.jaz
    public abstract Integer j();

    @Override // defpackage.jaz
    public cqkl k() {
        m().run();
        return cqkl.a;
    }

    @Override // defpackage.jaz
    public abstract Integer l();

    public abstract Runnable m();
}
