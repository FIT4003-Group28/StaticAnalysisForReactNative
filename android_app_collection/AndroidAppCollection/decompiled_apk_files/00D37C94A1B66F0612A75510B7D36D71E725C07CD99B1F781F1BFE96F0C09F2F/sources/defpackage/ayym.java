package defpackage;
/* compiled from: PG */
/* renamed from: ayym  reason: default package */
/* loaded from: classes2.dex */
public final class ayym extends aynx {
    final aypt b;
    ayyk c;

    public ayym(aypt ayptVar) {
        this.b = ayptVar;
    }

    static final void ar(ayyk ayykVar) {
        aypg aypgVar = ayykVar.b;
    }

    final void a(ayyk ayykVar) {
        aypt ayptVar = this.b;
        if (ayptVar instanceof aypg) {
            ((aypg) ayptVar).qr();
        } else if (!(ayptVar instanceof ayql)) {
        } else {
            ((ayql) ayptVar).sr((aypg) ayykVar.get());
        }
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        ayyk ayykVar;
        boolean z;
        synchronized (this) {
            ayykVar = this.c;
            if (ayykVar == null) {
                ayykVar = new ayyk(this);
                this.c = ayykVar;
            }
            long j = ayykVar.c + 1;
            ayykVar.c = j;
            z = true;
            if (ayykVar.d || j != 1) {
                z = false;
            } else {
                ayykVar.d = true;
            }
        }
        this.b.ac(new ayyl(bameVar, this, ayykVar));
        if (z) {
            this.b.ar(ayykVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ayyk ayykVar) {
        synchronized (this) {
            if (this.b instanceof ayyg) {
                ayyk ayykVar2 = this.c;
                if (ayykVar2 != null && ayykVar2 == ayykVar) {
                    this.c = null;
                    ar(ayykVar);
                }
                long j = ayykVar.c - 1;
                ayykVar.c = j;
                if (j == 0) {
                    a(ayykVar);
                }
            } else {
                ayyk ayykVar3 = this.c;
                if (ayykVar3 != null && ayykVar3 == ayykVar) {
                    ar(ayykVar);
                    long j2 = ayykVar.c - 1;
                    ayykVar.c = j2;
                    if (j2 == 0) {
                        this.c = null;
                        a(ayykVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(ayyk ayykVar) {
        synchronized (this) {
            if (ayykVar.c == 0 && ayykVar == this.c) {
                this.c = null;
                aypg aypgVar = (aypg) ayykVar.get();
                ayqi.c(ayykVar);
                aypt ayptVar = this.b;
                if (!(ayptVar instanceof aypg)) {
                    if (ayptVar instanceof ayql) {
                        if (aypgVar != null) {
                            ((ayql) ayptVar).sr(aypgVar);
                        } else {
                            ayykVar.e = true;
                        }
                    }
                } else {
                    ((aypg) ayptVar).qr();
                }
            }
        }
    }
}
