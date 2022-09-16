package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aufg  reason: default package */
/* loaded from: classes2.dex */
public final class aufg implements auhg {
    private final auhq a;
    private final aujo b;
    private final auui c;
    private final aufm d;
    private final auhi e;
    private final btwr f;
    private final akfa g;
    private final cqat h;
    private final ahjq i;
    private final ausy j;

    public aufg(auhq auhqVar, aujo aujoVar, auui auuiVar, aufm aufmVar, auhi auhiVar, btwr btwrVar, akfa akfaVar, cqat cqatVar, ahjq ahjqVar, ausy ausyVar) {
        this.a = auhqVar;
        this.b = aujoVar;
        this.c = auuiVar;
        this.d = aufmVar;
        this.e = auhiVar;
        this.f = btwrVar;
        this.g = akfaVar;
        this.h = cqatVar;
        this.i = ahjqVar;
        this.j = ausyVar;
    }

    @Override // defpackage.auhg
    public final auhh a(@dzsi aujb aujbVar, @dzsi btlu btluVar, String str, int i, @dzsi akqi akqiVar, @dzsi String str2, int i2) {
        if (aujbVar == null || btluVar == null || TextUtils.isEmpty(str)) {
            return auhh.SUPPRESSED;
        }
        btlu.h(btluVar);
        btvo h = this.f.h();
        if (!aujbVar.e(h)) {
            return auhh.SUPPRESSED;
        }
        auug d = this.c.d(auuh.c(str2, i));
        ddos l = aujbVar.l(h);
        if (l != null && (i2 != 1 || d == null)) {
            if (this.b.a(l)) {
                ((ckco) this.a.a.a(ckfm.c)).a(aujbVar.a);
                return auhh.SUPPRESSED;
            } else if (akqiVar != null && this.b.b(l, akqiVar)) {
                ((ckco) this.a.a.a(ckfm.d)).a(aujbVar.a);
                return auhh.SUPPRESSED;
            }
        }
        if (btlu.i(this.g.j()) == btlt.INCOGNITO) {
            return auhh.SUPPRESSED;
        }
        if (this.i.e() || !this.j.b(aujbVar.a)) {
            if (!this.j.a(aujbVar.a)) {
                ((ckco) this.a.a.a(ckfm.e)).a(aujbVar.a);
                return auhh.SUPPRESSED;
            } else if (i2 == 1) {
                ((ckco) this.a.a.a(ckfm.f)).a(aujbVar.a);
                return auhh.SUPPRESSED;
            } else {
                aufs t = this.e.t(aujbVar.a);
                if (t == aufs.ENABLED || t == aufs.INBOX_ONLY) {
                    if (aujbVar.m(h)) {
                        ((ckco) this.a.a.a(ckfm.h)).a(aujbVar.a);
                        return auhh.SUPPRESSED_FOR_COUNTERFACTUAL;
                    }
                    return auhh.SHOWN;
                }
                ((ckco) this.a.a.a(ckfm.g)).a(aujbVar.a);
                return auhh.SUPPRESSED_FOR_OPTOUT;
            }
        }
        return auhh.SUPPRESSED;
    }

    @Override // defpackage.auhg
    public final auhh b(int i, @dzsi String str, @dzsi aujb aujbVar, @dzsi akqi akqiVar, long j, boolean z) {
        if (!this.a.a()) {
            ((ckco) this.a.a.a(ckht.b)).a(i);
            return auhh.SUPPRESSED;
        } else if (aujbVar == null || this.a.b(aujbVar)) {
            if (aujbVar == null || this.a.c(aujbVar)) {
                if (j > 0 && j < this.h.b()) {
                    this.a.f(i);
                    return auhh.SUPPRESSED;
                } else if (aujbVar == null) {
                    return auhh.SHOWN;
                } else {
                    btvo h = this.f.h();
                    if (!aujbVar.e(h)) {
                        ((ckco) this.a.a.a(ckht.e)).a(i);
                        return auhh.SUPPRESSED;
                    }
                    auug d = this.c.d(auuh.c(str, i));
                    ddos l = aujbVar.l(h);
                    if (l != null && (d == null || z)) {
                        if (this.b.a(l)) {
                            ((ckco) this.a.a.a(ckht.t)).a(i);
                            return auhh.SUPPRESSED;
                        } else if (akqiVar != null && this.b.b(l, akqiVar)) {
                            ((ckco) this.a.a.a(ckht.u)).a(i);
                            return auhh.SUPPRESSED;
                        }
                    }
                    dcen N = dcep.N();
                    for (auuh auuhVar : this.c.f()) {
                        N.b(Integer.valueOf(auuhVar.b()));
                    }
                    if (!dcnm.o(this.d.a.h(Integer.valueOf(aujbVar.a)), N.f()).isEmpty()) {
                        ((ckco) this.a.a.a(ckht.y)).a(i);
                        return auhh.SUPPRESSED;
                    } else if (!this.e.s(aujbVar.a)) {
                        ((ckco) this.a.a.a(ckht.D)).a(i);
                        return auhh.SUPPRESSED_FOR_OPTOUT;
                    } else {
                        if (btlu.i(this.g.j()) == btlt.INCOGNITO) {
                            final ausy ausyVar = this.j;
                            final int i2 = aujbVar.a;
                            if (!((Boolean) ausyVar.i(new dbty(i2) { // from class: auss
                                private final int a;

                                {
                                    this.a = i2;
                                }

                                @Override // defpackage.dbty
                                public final Object a() {
                                    return Boolean.valueOf(autf.a.contains(Integer.valueOf(this.a)));
                                }
                            }, new dbty(ausyVar, i2) { // from class: aust
                                private final ausy a;
                                private final int b;

                                {
                                    this.a = ausyVar;
                                    this.b = i2;
                                }

                                @Override // defpackage.dbty
                                public final Object a() {
                                    ausy ausyVar2 = this.a;
                                    return Boolean.valueOf(((Boolean) autu.b(ausyVar2.a.a, this.b).h(autm.a).c(false)).booleanValue());
                                }
                            }, Integer.valueOf(i2), ckhu.d, "isEnabledForIncognito")).booleanValue()) {
                                return auhh.SUPPRESSED_FOR_INCOGNITO;
                            }
                        }
                        if (this.i.e() || !this.j.b(aujbVar.a)) {
                            if (aujbVar.m(h)) {
                                ((ckco) this.a.a.a(ckht.v)).a(i);
                                return auhh.SUPPRESSED_FOR_COUNTERFACTUAL;
                            }
                            return auhh.SHOWN;
                        }
                        ((ckco) this.a.a.a(ckht.w)).a(i);
                        return auhh.SUPPRESSED;
                    }
                }
            }
            ((ckco) this.a.a.a(ckht.d)).a(i);
            return auhh.SUPPRESSED;
        } else {
            ((ckco) this.a.a.a(ckht.c)).a(i);
            return auhh.SUPPRESSED;
        }
    }
}
