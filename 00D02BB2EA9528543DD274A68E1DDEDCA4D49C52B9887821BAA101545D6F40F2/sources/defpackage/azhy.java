package defpackage;
/* compiled from: PG */
/* renamed from: azhy  reason: default package */
/* loaded from: classes3.dex */
final class azhy {
    final /* synthetic */ azhz a;

    public azhy(azhz azhzVar) {
        this.a = azhzVar;
    }

    private final synchronized void i(String str, dbsz<azvz> dbszVar) {
        try {
            azvz i = b(str).i();
            dbszVar.NU(i);
            j(i.b());
        } catch (axxc unused) {
        }
    }

    private final synchronized void j(azwa azwaVar) {
        this.a.a.g(azxm.i, azwaVar);
        this.a.c.a().a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dcdc<azwa> a() {
        return this.a.a.a(azxm.i);
    }

    final synchronized azwa b(String str) {
        dbsg b = this.a.a.b(azxm.i, str);
        if (b.a()) {
            return (azwa) b.b();
        }
        doka bZ = dokb.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dokb dokbVar = (dokb) bZ.b;
        str.getClass();
        dokbVar.a |= 1;
        dokbVar.b = str;
        return new azvz(bZ.bK()).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(String str, final String str2) {
        i(str, new dbsz(str2) { // from class: azhs
            private final String a;

            {
                this.a = str2;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                final String str3 = this.a;
                ((azvz) obj).c(new dbsz(str3) { // from class: azvt
                    private final String a;

                    {
                        this.a = str3;
                    }

                    @Override // defpackage.dbsz
                    public final void NU(Object obj2) {
                        String str4 = this.a;
                        doka dokaVar = (doka) obj2;
                        if (dokaVar.c) {
                            dokaVar.bF();
                            dokaVar.c = false;
                        }
                        dokb dokbVar = (dokb) dokaVar.b;
                        dokb dokbVar2 = dokb.i;
                        str4.getClass();
                        dokbVar.a |= 2;
                        dokbVar.c = str4;
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(String str, final int i) {
        i(str, new dbsz(i) { // from class: azht
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                int i2 = this.a;
                azvz azvzVar = (azvz) obj;
                dnij bZ = dnik.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnik dnikVar = (dnik) bZ.b;
                dnikVar.a |= 1;
                dnikVar.b = i2;
                final dnik bK = bZ.bK();
                if (!azvzVar.a.g.contains(bK)) {
                    azvzVar.c(new dbsz(bK) { // from class: azvu
                        private final dnik a;

                        {
                            this.a = bK;
                        }

                        @Override // defpackage.dbsz
                        public final void NU(Object obj2) {
                            dnik dnikVar2 = this.a;
                            doka dokaVar = (doka) obj2;
                            if (dokaVar.c) {
                                dokaVar.bF();
                                dokaVar.c = false;
                            }
                            dokb dokbVar = (dokb) dokaVar.b;
                            dokb dokbVar2 = dokb.i;
                            dnikVar2.getClass();
                            dokbVar.c();
                            dokbVar.g.add(dnikVar2);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(String str, final int i) {
        i(str, new dbsz(i) { // from class: azhu
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                int i2 = this.a;
                azvz azvzVar = (azvz) obj;
                dnij bZ = dnik.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnik dnikVar = (dnik) bZ.b;
                dnikVar.a |= 1;
                dnikVar.b = i2;
                final int indexOf = azvzVar.a.g.indexOf(bZ.bK());
                if (indexOf != -1) {
                    azvzVar.c(new dbsz(indexOf) { // from class: azvv
                        private final int a;

                        {
                            this.a = indexOf;
                        }

                        @Override // defpackage.dbsz
                        public final void NU(Object obj2) {
                            int i3 = this.a;
                            doka dokaVar = (doka) obj2;
                            if (dokaVar.c) {
                                dokaVar.bF();
                                dokaVar.c = false;
                            }
                            dokb dokbVar = (dokb) dokaVar.b;
                            dokb dokbVar2 = dokb.i;
                            dokbVar.c();
                            dokbVar.g.remove(i3);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(String str, final int i) {
        i(str, new dbsz(i) { // from class: azhv
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                int i2 = this.a;
                azvz azvzVar = (azvz) obj;
                dnij bZ = dnik.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnik dnikVar = (dnik) bZ.b;
                dnikVar.a |= 1;
                dnikVar.b = i2;
                final dnik bK = bZ.bK();
                if (!azvzVar.a.f.contains(bK)) {
                    azvzVar.c(new dbsz(bK) { // from class: azvw
                        private final dnik a;

                        {
                            this.a = bK;
                        }

                        @Override // defpackage.dbsz
                        public final void NU(Object obj2) {
                            dnik dnikVar2 = this.a;
                            doka dokaVar = (doka) obj2;
                            if (dokaVar.c) {
                                dokaVar.bF();
                                dokaVar.c = false;
                            }
                            dokb dokbVar = (dokb) dokaVar.b;
                            dokb dokbVar2 = dokb.i;
                            dnikVar2.getClass();
                            dokbVar.b();
                            dokbVar.f.add(dnikVar2);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(String str, final int i) {
        i(str, new dbsz(i) { // from class: azhw
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                int i2 = this.a;
                azvz azvzVar = (azvz) obj;
                dnij bZ = dnik.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnik dnikVar = (dnik) bZ.b;
                dnikVar.a |= 1;
                dnikVar.b = i2;
                final int indexOf = azvzVar.a.f.indexOf(bZ.bK());
                if (indexOf != -1) {
                    azvzVar.c(new dbsz(indexOf) { // from class: azvx
                        private final int a;

                        {
                            this.a = indexOf;
                        }

                        @Override // defpackage.dbsz
                        public final void NU(Object obj2) {
                            int i3 = this.a;
                            doka dokaVar = (doka) obj2;
                            if (dokaVar.c) {
                                dokaVar.bF();
                                dokaVar.c = false;
                            }
                            dokb dokbVar = (dokb) dokaVar.b;
                            dokb dokbVar2 = dokb.i;
                            dokbVar.b();
                            dokbVar.f.remove(i3);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h(String str, final String str2) {
        i(str, new dbsz(str2) { // from class: azhx
            private final String a;

            {
                this.a = str2;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                final String str3 = this.a;
                ((azvz) obj).c(new dbsz(str3) { // from class: azvy
                    private final String a;

                    {
                        this.a = str3;
                    }

                    @Override // defpackage.dbsz
                    public final void NU(Object obj2) {
                        String str4 = this.a;
                        doka dokaVar = (doka) obj2;
                        if (dokaVar.c) {
                            dokaVar.bF();
                            dokaVar.c = false;
                        }
                        dokb dokbVar = (dokb) dokaVar.b;
                        dokb dokbVar2 = dokb.i;
                        str4.getClass();
                        dokbVar.a |= 8;
                        dokbVar.e = str4;
                    }
                });
            }
        });
    }
}
