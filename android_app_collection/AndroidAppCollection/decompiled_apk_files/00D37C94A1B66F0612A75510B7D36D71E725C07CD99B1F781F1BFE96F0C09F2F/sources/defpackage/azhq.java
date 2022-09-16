package defpackage;
/* compiled from: PG */
/* renamed from: azhq  reason: default package */
/* loaded from: classes2.dex */
public final class azhq extends ayoi {
    final azot a;
    azho b;

    public azhq(azot azotVar) {
        this.a = azotVar;
    }

    static final void d(azho azhoVar) {
        aypg aypgVar = azhoVar.b;
    }

    final void a(azho azhoVar) {
        azot azotVar = this.a;
        if (azotVar instanceof aypg) {
            ((aypg) azotVar).qr();
        } else if (!(azotVar instanceof ayql)) {
        } else {
            ((ayql) azotVar).sr((aypg) azhoVar.get());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(azho azhoVar) {
        synchronized (this) {
            if (this.a instanceof azhh) {
                azho azhoVar2 = this.b;
                if (azhoVar2 != null && azhoVar2 == azhoVar) {
                    this.b = null;
                    d(azhoVar);
                }
                long j = azhoVar.c - 1;
                azhoVar.c = j;
                if (j == 0) {
                    a(azhoVar);
                }
            } else {
                azho azhoVar3 = this.b;
                if (azhoVar3 != null && azhoVar3 == azhoVar) {
                    d(azhoVar);
                    long j2 = azhoVar.c - 1;
                    azhoVar.c = j2;
                    if (j2 == 0) {
                        this.b = null;
                        a(azhoVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(azho azhoVar) {
        synchronized (this) {
            if (azhoVar.c == 0 && azhoVar == this.b) {
                this.b = null;
                aypg aypgVar = (aypg) azhoVar.get();
                ayqi.c(azhoVar);
                azot azotVar = this.a;
                if (!(azotVar instanceof aypg)) {
                    if (azotVar instanceof ayql) {
                        if (aypgVar != null) {
                            ((ayql) azotVar).sr(aypgVar);
                        } else {
                            azhoVar.e = true;
                        }
                    }
                } else {
                    ((aypg) azotVar).qr();
                }
            }
        }
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        azho azhoVar;
        boolean z;
        synchronized (this) {
            azhoVar = this.b;
            if (azhoVar == null) {
                azhoVar = new azho(this);
                this.b = azhoVar;
            }
            long j = azhoVar.c + 1;
            azhoVar.c = j;
            z = true;
            if (azhoVar.d || j != 1) {
                z = false;
            } else {
                azhoVar.d = true;
            }
        }
        this.a.az(new azhp(ayomVar, this, azhoVar));
        if (z) {
            this.a.a(azhoVar);
        }
    }
}
