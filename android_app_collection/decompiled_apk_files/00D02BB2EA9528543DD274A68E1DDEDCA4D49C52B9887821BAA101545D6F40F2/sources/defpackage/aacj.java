package defpackage;
/* compiled from: PG */
/* renamed from: aacj  reason: default package */
/* loaded from: classes2.dex */
public class aacj implements aadp {
    public Boolean a = Boolean.FALSE;
    public boolean b;
    private final dxio<caym> c;
    private final cbqg d;

    public aacj(dxio<caym> dxioVar, cbqg cbqgVar) {
        this.c = dxioVar;
        this.d = cbqgVar;
    }

    @Override // defpackage.aadp
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.aadp
    public Boolean b() {
        boolean z = false;
        if (this.d.a() && this.a.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aadp
    public cqkl c() {
        this.c.a().a();
        return cqkl.a;
    }
}
