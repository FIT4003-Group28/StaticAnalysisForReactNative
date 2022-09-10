package defpackage;
/* compiled from: PG */
/* renamed from: aahu  reason: default package */
/* loaded from: classes2.dex */
public class aahu implements aahd {
    private final dxio<ahwf> a;
    private boolean b = false;
    private final btvo c;

    public aahu(dxio<ahwf> dxioVar, btvo btvoVar) {
        this.a = dxioVar;
        this.c = btvoVar;
    }

    @Override // defpackage.aahd
    public final Boolean a() {
        boolean z = false;
        if (this.b && this.c.getEnableFeatureParameters().z) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aahd
    public final void b() {
        if (!a().booleanValue()) {
            return;
        }
        this.a.a().l();
    }

    @Override // defpackage.aahd
    public final Runnable c() {
        return null;
    }

    public final void d(diwb diwbVar) {
        this.b = diwbVar.C;
    }
}
