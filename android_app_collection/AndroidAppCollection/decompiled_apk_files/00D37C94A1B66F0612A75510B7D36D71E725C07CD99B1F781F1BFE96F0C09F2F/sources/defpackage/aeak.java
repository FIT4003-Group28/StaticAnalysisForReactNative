package defpackage;
/* compiled from: PG */
/* renamed from: aeak  reason: default package */
/* loaded from: classes.dex */
public final class aeak implements axd {
    private final aeai a;
    private final axd b;
    private asy c;

    public aeak(byte[] bArr, axd axdVar, byte[] bArr2, aeai aeaiVar) {
        this.b = new ayj(bArr, axdVar, bArr2);
        this.a = aeaiVar;
    }

    @Override // defpackage.axd
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.axd
    public final void b(asy asyVar) {
        this.b.b(asyVar);
        this.c = asyVar;
    }

    @Override // defpackage.axd
    public final void c(byte[] bArr, int i, int i2) {
        this.b.c(bArr, i, i2);
        String str = this.c.i;
        if (str != null) {
            aeai.i(this.a.e, str);
        }
    }
}
