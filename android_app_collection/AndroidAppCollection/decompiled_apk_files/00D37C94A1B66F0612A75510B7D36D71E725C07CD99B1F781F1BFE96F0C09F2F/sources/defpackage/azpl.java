package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azpl  reason: default package */
/* loaded from: classes2.dex */
public final class azpl implements aypg, azog {
    final ayom a;
    final azpm b;
    boolean c;
    boolean d;
    azoh e;
    boolean f;
    volatile boolean g;
    long h;

    public azpl(ayom ayomVar, azpm azpmVar) {
        this.a = ayomVar;
        this.b = azpmVar;
    }

    @Override // defpackage.azog, defpackage.ayqf
    public final boolean a(Object obj) {
        return this.g || azoq.e(obj, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Object obj, long j) {
        if (this.g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                if (this.h == j) {
                    return;
                }
                if (this.d) {
                    azoh azohVar = this.e;
                    if (azohVar == null) {
                        azohVar = new azoh();
                        this.e = azohVar;
                    }
                    azohVar.a(obj);
                    return;
                }
                this.c = true;
                this.f = true;
            }
        }
        a(obj);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.g;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.g) {
            this.g = true;
            this.b.aK(this);
        }
    }
}
