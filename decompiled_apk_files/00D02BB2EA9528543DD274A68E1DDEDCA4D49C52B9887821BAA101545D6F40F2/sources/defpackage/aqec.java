package defpackage;
/* compiled from: PG */
/* renamed from: aqec  reason: default package */
/* loaded from: classes2.dex */
public abstract class aqec implements aqea {
    public static aqeb p() {
        return new aqdk();
    }

    @Override // defpackage.aqea
    @dzsi
    public abstract CharSequence a();

    @Override // defpackage.aqea
    @dzsi
    public abstract CharSequence b();

    @Override // defpackage.aqea
    public abstract CharSequence c();

    @Override // defpackage.aqea
    @dzsi
    public abstract cqtd d();

    @dzsi
    public abstract Runnable e();

    @Override // defpackage.aqea
    @dzsi
    public abstract cjtd f();

    @Override // defpackage.aqea
    @dzsi
    public abstract CharSequence g();

    @Override // defpackage.aqea
    @dzsi
    public abstract cqtd h();

    @dzsi
    public abstract Runnable i();

    @Override // defpackage.aqea
    @dzsi
    public abstract cjtd j();

    @Override // defpackage.aqea
    @dzsi
    public abstract cjtd k();

    @Override // defpackage.aqea
    public Boolean l() {
        return true;
    }

    @Override // defpackage.aqea
    public cqkl m() {
        Runnable e = e();
        if (e != null) {
            e.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.aqea
    public Boolean n() {
        return Boolean.valueOf(i() != null);
    }

    @Override // defpackage.aqea
    public cqkl o() {
        Runnable i = i();
        if (i != null) {
            i.run();
        }
        return cqkl.a;
    }
}
