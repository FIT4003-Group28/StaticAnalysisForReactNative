package defpackage;
/* compiled from: PG */
/* renamed from: vmx  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vmx implements anir {
    public final /* synthetic */ vne a;
    private final /* synthetic */ int b;

    public /* synthetic */ vmx(vne vneVar) {
        this.a = vneVar;
    }

    public /* synthetic */ vmx(vne vneVar, int i) {
        this.b = i;
        this.a = vneVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.b == 0) {
            vnd vndVar = (vnd) obj;
            return this.a.c.c();
        }
        Void r2 = (Void) obj;
        return this.a.d(vmh.p);
    }
}
