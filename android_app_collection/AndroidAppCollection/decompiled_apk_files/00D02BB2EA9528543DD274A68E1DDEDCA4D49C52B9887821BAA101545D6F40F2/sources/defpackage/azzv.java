package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: azzv  reason: default package */
/* loaded from: classes3.dex */
public final class azzv extends azzn<azxg> {
    private azxg e;
    private long f;
    private long g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private azzv(defpackage.azxg r8) {
        /*
            r7 = this;
            dolm r0 = r8.g()
            dppl r0 = r0.b
            if (r0 != 0) goto La
            dppl r0 = defpackage.dppl.m
        La:
            java.lang.String r0 = r0.f
            dolm r1 = r8.g()
            dppl r1 = r1.b
            if (r1 != 0) goto L16
            dppl r1 = defpackage.dppl.m
        L16:
            dpox r1 = r1.h
            if (r1 != 0) goto L1c
            dpox r1 = defpackage.dpox.d
        L1c:
            int r2 = r1.a
            r2 = r2 & 1
            r3 = 0
            if (r2 == 0) goto L92
            dwfl r2 = defpackage.dwfl.w
            dsqp r2 = r2.bZ()
            dwfi r2 = (defpackage.dwfi) r2
            java.lang.String r4 = r1.b
            boolean r5 = r2.c
            if (r5 == 0) goto L36
            r2.bF()
            r2.c = r3
        L36:
            MessageType extends dsqw<MessageType, BuilderType> r5 = r2.b
            dwfl r5 = (defpackage.dwfl) r5
            r4.getClass()
            int r6 = r5.a
            r6 = r6 | 128(0x80, float:1.794E-43)
            r5.a = r6
            r5.h = r4
            dizh r4 = defpackage.dizh.j
            dsqp r4 = r4.bZ()
            dizg r4 = (defpackage.dizg) r4
            dggg r1 = r1.c
            if (r1 != 0) goto L53
            dggg r1 = defpackage.dggg.d
        L53:
            boolean r5 = r4.c
            if (r5 == 0) goto L5c
            r4.bF()
            r4.c = r3
        L5c:
            MessageType extends dsqw<MessageType, BuilderType> r5 = r4.b
            dizh r5 = (defpackage.dizh) r5
            r1.getClass()
            r5.b = r1
            int r1 = r5.a
            r1 = r1 | 1
            r5.a = r1
            boolean r1 = r2.c
            if (r1 == 0) goto L74
            r2.bF()
            r2.c = r3
        L74:
            MessageType extends dsqw<MessageType, BuilderType> r1 = r2.b
            dwfl r1 = (defpackage.dwfl) r1
            dsqw r4 = r4.bK()
            dizh r4 = (defpackage.dizh) r4
            r4.getClass()
            r1.p = r4
            int r4 = r1.a
            r5 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 | r5
            r1.a = r4
            dsqw r1 = r2.bK()
            dwfl r1 = (defpackage.dwfl) r1
            goto L93
        L92:
            r1 = 0
        L93:
            dolm r2 = r8.g()
            dppl r2 = r2.b
            if (r2 != 0) goto L9d
            dppl r2 = defpackage.dppl.m
        L9d:
            int r2 = r2.i
            r7.<init>(r0, r1, r3, r2)
            r7.e = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azzv.<init>(azxg):void");
    }

    public static azzv u(azxg azxgVar) {
        return new azzv(azxgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    @Override // defpackage.baal
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.baai A() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azzv.A():baai");
    }

    @Override // defpackage.baal
    public final void B(dpop dpopVar) {
        this.f = dpopVar.b;
        this.g = dpopVar.c;
    }

    @Override // defpackage.baal
    @dzsi
    public final baag C() {
        dppl dpplVar = this.e.g().b;
        if (dpplVar == null) {
            dpplVar = dppl.m;
        }
        if (dpplVar.b == 17) {
            dppe dppeVar = (dppe) dpplVar.c;
            String str = dppeVar.c;
            azzw azzwVar = new azzw();
            if (str != null) {
                azzwVar.a = str;
                String str2 = "";
                azzwVar.a(str2);
                azzwVar.c = str2;
                if ((dppeVar.a & 4) != 0) {
                    azzwVar.a(dppeVar.d);
                }
                int i = dppeVar.a;
                if ((i & 8) != 0) {
                    azzwVar.c = dppeVar.e;
                }
                if ((i & 16) != 0) {
                    dpoo bZ = dpop.d.bZ();
                    dppd dppdVar = dppeVar.f;
                    if (dppdVar == null) {
                        dppdVar = dppd.d;
                    }
                    dqjt dqjtVar = dppdVar.b;
                    if (dqjtVar == null) {
                        dqjtVar = dqjt.d;
                    }
                    long j = dqjtVar.b;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dpop dpopVar = (dpop) bZ.b;
                    dpopVar.a |= 1;
                    dpopVar.b = j;
                    dppd dppdVar2 = dppeVar.f;
                    if (dppdVar2 == null) {
                        dppdVar2 = dppd.d;
                    }
                    dqjt dqjtVar2 = dppdVar2.c;
                    if (dqjtVar2 == null) {
                        dqjtVar2 = dqjt.d;
                    }
                    long j2 = dqjtVar2.b;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dpop dpopVar2 = (dpop) bZ.b;
                    dpopVar2.a |= 2;
                    dpopVar2.c = j2;
                    azzwVar.d = bZ.bK();
                }
                if (azzwVar.a == null) {
                    str2 = " dealId";
                }
                if (azzwVar.b == null) {
                    str2 = str2.concat(" businessName");
                }
                if (str2.isEmpty()) {
                    return new azzx(azzwVar.a, azzwVar.b, azzwVar.c, azzwVar.d);
                }
                String valueOf = String.valueOf(str2);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            throw new NullPointerException("Null dealId");
        }
        return null;
    }

    @Override // defpackage.baal
    public final boolean D() {
        return false;
    }

    @Override // defpackage.baal
    @dzsi
    public final docg E() {
        return null;
    }

    @Override // defpackage.baal
    public final long F() {
        dojz dojzVar = this.e.g().e;
        if (dojzVar == null) {
            dojzVar = dojz.c;
        }
        return dojzVar.b;
    }

    @Override // defpackage.azzp
    public final /* bridge */ /* synthetic */ azwm ao() {
        return this.e;
    }

    @Override // defpackage.azzp
    public final void ap(azzo<azxg> azzoVar) {
        dppl dpplVar = this.e.g().b;
        if (dpplVar == null) {
            dpplVar = dppl.m;
        }
        dsqp dsqpVar = (dsqp) dpplVar.cu(5);
        dsqpVar.bC(dpplVar);
        dpoy dpoyVar = (dpoy) dsqpVar;
        if (this.d) {
            String str = this.a;
            if (dpoyVar.c) {
                dpoyVar.bF();
                dpoyVar.c = false;
            }
            dppl dpplVar2 = (dppl) dpoyVar.b;
            str.getClass();
            int i = dpplVar2.a | 32;
            dpplVar2.a = i;
            dpplVar2.f = str;
            int i2 = this.b;
            if (i2 != -1) {
                dpplVar2.a = i | 256;
                dpplVar2.i = i2;
            }
            dwfl j = j();
            dpox dpoxVar = null;
            if (j != null && (j.a & 128) != 0) {
                dpow bZ = dpox.d.bZ();
                String str2 = j.h;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpox dpoxVar2 = (dpox) bZ.b;
                str2.getClass();
                dpoxVar2.a |= 1;
                dpoxVar2.b = str2;
                dizh dizhVar = j.p;
                if (dizhVar == null) {
                    dizhVar = dizh.j;
                }
                dggg dgggVar = dizhVar.b;
                if (dgggVar == null) {
                    dgggVar = dggg.d;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpox dpoxVar3 = (dpox) bZ.b;
                dgggVar.getClass();
                dpoxVar3.c = dgggVar;
                dpoxVar3.a |= 4;
                dpoxVar = bZ.bK();
            }
            if (dpoxVar != null) {
                if (dpoyVar.c) {
                    dpoyVar.bF();
                    dpoyVar.c = false;
                }
                dppl dpplVar3 = (dppl) dpoyVar.b;
                dpoxVar.getClass();
                dpplVar3.h = dpoxVar;
                dpplVar3.a |= 128;
            } else {
                dpox dpoxVar4 = dpox.d;
                if (dpoyVar.c) {
                    dpoyVar.bF();
                    dpoyVar.c = false;
                }
                dppl dpplVar4 = (dppl) dpoyVar.b;
                dpoxVar4.getClass();
                dpplVar4.h = dpoxVar4;
                dpplVar4.a |= 128;
            }
        }
        azxf i3 = this.e.i();
        dppl bK = dpoyVar.bK();
        dolm dolmVar = i3.a;
        dsqp dsqpVar2 = (dsqp) dolmVar.cu(5);
        dsqpVar2.bC(dolmVar);
        doll dollVar = (doll) dsqpVar2;
        if (dollVar.c) {
            dollVar.bF();
            dollVar.c = false;
        }
        dolm dolmVar2 = (dolm) dollVar.b;
        bK.getClass();
        dolmVar2.b = bK;
        dolmVar2.a |= 1;
        i3.a = dollVar.bK();
        this.e = azzoVar.a(i3.b(), this.d);
        this.d = false;
    }

    @Override // defpackage.baal
    public final dppl v() {
        dppl dpplVar = this.e.g().b;
        return dpplVar == null ? dppl.m : dpplVar;
    }

    @Override // defpackage.baal
    @dzsi
    public final String w() {
        baad baadVar = this.c;
        if (baadVar != null) {
            dppt dpptVar = v().d;
            if (dpptVar == null) {
                dpptVar = dppt.e;
            }
            return azxg.l(dpptVar, baadVar.l());
        }
        return null;
    }

    @Override // defpackage.baal
    public final baaj x() {
        dppl dpplVar = this.e.g().b;
        if (dpplVar == null) {
            dpplVar = dppl.m;
        }
        dppt dpptVar = dpplVar.d;
        if (dpptVar == null) {
            dpptVar = dppt.e;
        }
        dppz dppzVar = dpptVar.d;
        if (dppzVar == null) {
            dppzVar = dppz.c;
        }
        dppy b = dppy.b(dppzVar.b);
        if (b == null) {
            b = dppy.UNKNOWN_ITEM_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return baaj.EXPERIENCE;
            }
            if (ordinal == 3) {
                return baaj.DEAL;
            }
            return baaj.UNKNOWN;
        }
        return baaj.PLACE;
    }

    @Override // defpackage.baal
    public final String y(Context context) {
        return this.e.e(context);
    }

    @Override // defpackage.baal
    @dzsi
    public final baak z() {
        dppi dppiVar;
        dppe dppeVar;
        dppl dpplVar = this.e.g().b;
        if (dpplVar == null) {
            dpplVar = dppl.m;
        }
        if (dpplVar.b != 2) {
            dppl dpplVar2 = this.e.g().b;
            if (dpplVar2 == null) {
                dpplVar2 = dppl.m;
            }
            if (dpplVar2.b == 12) {
                dppiVar = (dppi) dpplVar2.c;
            } else {
                dppiVar = dppi.h;
            }
            if ((dppiVar.a & 4) == 0) {
                dppl dpplVar3 = this.e.g().b;
                if (dpplVar3 == null) {
                    dpplVar3 = dppl.m;
                }
                if (dpplVar3.b == 17) {
                    dppeVar = (dppe) dpplVar3.c;
                } else {
                    dppeVar = dppe.g;
                }
                if ((dppeVar.a & 1) == 0) {
                    return null;
                }
            }
        }
        return new baaa(this.e.b(), this.e.d(), this.e.u(), this.e.c());
    }
}
