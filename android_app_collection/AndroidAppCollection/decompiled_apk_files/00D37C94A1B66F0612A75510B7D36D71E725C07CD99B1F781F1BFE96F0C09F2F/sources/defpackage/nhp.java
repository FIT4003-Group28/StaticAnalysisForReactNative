package defpackage;

import android.view.MenuItem;
import j$.util.Optional;
import j$.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nhp  reason: default package */
/* loaded from: classes3.dex */
public final class nhp extends fse {
    public final aten a;
    final /* synthetic */ nhr b;
    private final lyb c;

    public nhp(nhr nhrVar, aten atenVar, lya lyaVar) {
        this.b = nhrVar;
        this.a = atenVar;
        this.c = lyaVar.b();
    }

    @Override // defpackage.fse
    public final int b() {
        return this.c.a;
    }

    @Override // defpackage.fse
    public final CharSequence c() {
        return abgc.h(this.a);
    }

    @Override // defpackage.fry
    public final int g() {
        return this.c.a();
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return false;
    }

    @Override // defpackage.fry
    public final boolean m() {
        aoob aoobVar;
        acti actiVar = this.b.g;
        aten atenVar = this.a;
        ateo ateoVar = atenVar.c;
        if (ateoVar == null) {
            ateoVar = ateo.a;
        }
        if ((ateoVar.b & 16) != 0) {
            ateo ateoVar2 = atenVar.c;
            if (ateoVar2 == null) {
                ateoVar2 = ateo.a;
            }
            aoobVar = ateoVar2.f;
        } else {
            ater aterVar = atenVar.d;
            if (aterVar == null) {
                aterVar = ater.a;
            }
            if ((aterVar.b & 64) != 0) {
                ater aterVar2 = atenVar.d;
                if (aterVar2 == null) {
                    aterVar2 = ater.a;
                }
                aoobVar = aterVar2.g;
            } else {
                ateq ateqVar = atenVar.e;
                if (ateqVar == null) {
                    ateqVar = ateq.a;
                }
                if ((ateqVar.b & 4) != 0) {
                    ateq ateqVar2 = atenVar.e;
                    if (ateqVar2 == null) {
                        ateqVar2 = ateq.a;
                    }
                    aoobVar = ateqVar2.c;
                } else {
                    atex atexVar = atenVar.f;
                    if (atexVar == null) {
                        atexVar = atex.a;
                    }
                    if ((atexVar.b & 2048) != 0) {
                        atex atexVar2 = atenVar.f;
                        if (atexVar2 == null) {
                            atexVar2 = atex.a;
                        }
                        aoobVar = atexVar2.j;
                    } else {
                        atej atejVar = atenVar.g;
                        if (atejVar == null) {
                            atejVar = atej.a;
                        }
                        if ((atejVar.b & 16) != 0) {
                            atej atejVar2 = atenVar.g;
                            if (atejVar2 == null) {
                                atejVar2 = atej.a;
                            }
                            aoobVar = atejVar2.f;
                        } else {
                            atek atekVar = atenVar.h;
                            if (atekVar == null) {
                                atekVar = atek.a;
                            }
                            if ((atekVar.b & 16) != 0) {
                                atek atekVar2 = atenVar.h;
                                if (atekVar2 == null) {
                                    atekVar2 = atek.a;
                                }
                                aoobVar = atekVar2.f;
                            } else {
                                avrr avrrVar = atenVar.j;
                                if (avrrVar == null) {
                                    avrrVar = avrr.a;
                                }
                                if ((avrrVar.b & 1024) != 0) {
                                    avrr avrrVar2 = atenVar.j;
                                    if (avrrVar2 == null) {
                                        avrrVar2 = avrr.a;
                                    }
                                    aoobVar = avrrVar2.c;
                                } else {
                                    avrs avrsVar = atenVar.k;
                                    if (avrsVar == null) {
                                        avrsVar = avrs.a;
                                    }
                                    if ((avrsVar.b & 1024) != 0) {
                                        avrs avrsVar2 = atenVar.k;
                                        if (avrsVar2 == null) {
                                            avrsVar2 = avrs.a;
                                        }
                                        aoobVar = avrsVar2.c;
                                    } else {
                                        atet atetVar = atenVar.l;
                                        if (atetVar == null) {
                                            atetVar = atet.a;
                                        }
                                        if ((atetVar.b & 4) != 0) {
                                            atet atetVar2 = atenVar.l;
                                            if (atetVar2 == null) {
                                                atetVar2 = atet.a;
                                            }
                                            aoobVar = atetVar2.d;
                                        } else {
                                            avqs avqsVar = atenVar.m;
                                            if (avqsVar == null) {
                                                avqsVar = avqs.a;
                                            }
                                            if ((avqsVar.b & 128) != 0) {
                                                avqs avqsVar2 = atenVar.m;
                                                if (avqsVar2 == null) {
                                                    avqsVar2 = avqs.a;
                                                }
                                                aoobVar = avqsVar2.g;
                                            } else {
                                                atef atefVar = atenVar.n;
                                                if (atefVar == null) {
                                                    atefVar = atef.a;
                                                }
                                                if ((atefVar.b & 8) != 0) {
                                                    atef atefVar2 = atenVar.n;
                                                    if (atefVar2 == null) {
                                                        atefVar2 = atef.a;
                                                    }
                                                    aoobVar = atefVar2.c;
                                                } else {
                                                    aqtb aqtbVar = atenVar.p;
                                                    if (aqtbVar == null) {
                                                        aqtbVar = aqtb.a;
                                                    }
                                                    if ((aqtbVar.b & 8) != 0) {
                                                        aqtb aqtbVar2 = atenVar.p;
                                                        if (aqtbVar2 == null) {
                                                            aqtbVar2 = aqtb.a;
                                                        }
                                                        aoobVar = aqtbVar2.e;
                                                    } else {
                                                        aoobVar = aoob.b;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        actiVar.H(3, new acte(aoobVar.I()), null);
        Optional.ofNullable((apzg) Optional.ofNullable(abgc.d(this.a)).orElseGet(new Supplier() { // from class: nho
            @Override // j$.util.function.Supplier
            /* renamed from: get */
            public final Object mo515get() {
                return abgc.e(nhp.this.a);
            }
        })).ifPresent(new agau(this.b.f, 1));
        return true;
    }
}
