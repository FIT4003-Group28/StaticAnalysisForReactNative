package defpackage;
/* compiled from: PG */
/* renamed from: aeil  reason: default package */
/* loaded from: classes.dex */
public final class aeil extends aflh {
    private final afgz b;
    private final aeub c;

    public aeil(ati atiVar, aeub aeubVar, afgz afgzVar) {
        super(atiVar);
        this.c = aeubVar;
        this.b = afgzVar;
    }

    private final void c(ate ateVar) {
        String sb;
        afkn b = this.b.b(ateVar);
        if (ateVar.getCause() == null) {
            sb = "";
        } else {
            String valueOf = String.valueOf(ateVar.getCause().getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 3);
            sb2.append(";c.");
            sb2.append(valueOf);
            sb = sb2.toString();
        }
        String i = b.i();
        int i2 = ateVar.c;
        StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 16 + String.valueOf(sb).length());
        sb3.append("e.");
        sb3.append(i);
        sb3.append(";t.");
        sb3.append(i2);
        sb3.append(sb);
        this.c.i("fberr", sb3.toString());
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        try {
            return super.g(bArr, i, i2);
        } catch (ate e) {
            c(e);
            throw e;
        }
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.asv
    public final long h(asy asyVar) {
        try {
            return super.h(asyVar);
        } catch (ate e) {
            c(e);
            throw e;
        }
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.asv
    public final void j() {
        try {
            super.j();
        } catch (ate e) {
            c(e);
            throw e;
        }
    }
}
