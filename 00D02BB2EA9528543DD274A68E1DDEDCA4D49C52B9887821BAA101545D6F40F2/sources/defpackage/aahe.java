package defpackage;
/* compiled from: PG */
/* renamed from: aahe  reason: default package */
/* loaded from: classes2.dex */
public class aahe implements aahd {
    @dzsi
    public cqkp a;
    public boolean b = true;
    public boolean c;
    private final dxio<aajr> d;

    public aahe(dxio<aajr> dxioVar) {
        this.d = dxioVar;
    }

    @Override // defpackage.aahd
    public final Boolean a() {
        boolean z = true;
        if (!this.b && !this.c) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aahd
    public final void b() {
        this.b = true;
        this.c = false;
        cqkp cqkpVar = this.a;
        if (cqkpVar != null) {
            cqkx.p(cqkpVar);
        }
        this.d.a().a();
    }

    @Override // defpackage.aahd
    public final Runnable c() {
        return null;
    }
}
