package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ajyq  reason: default package */
/* loaded from: classes.dex */
public class ajyq extends ajxl implements ajwc, ajzt, ajzu, ajwq, ajxy, ynl {
    private boolean a;
    private String b;
    public final akab f;
    public final akab g;

    public ajyq(aari aariVar, ajyi ajyiVar, yni yniVar, yzj yzjVar, acti actiVar, akam akamVar) {
        this(aariVar, ajyiVar, yniVar, yzjVar, actiVar, akamVar, new ajsm());
    }

    @Override // defpackage.ajxl
    public final void H(ampt amptVar) {
        super.H(amptVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L(akad akadVar) {
        this.f.b(akadVar);
    }

    public final void M(ajym ajymVar) {
        super.G(ajymVar.a());
    }

    public final void N(aawi aawiVar) {
        super.G(aawiVar.b());
    }

    @Override // defpackage.ajzu
    public final void O(Object obj, Object obj2) {
        I(obj, obj2);
    }

    public void i(aakq aakqVar) {
        lB();
        aslo asloVar = aakqVar.a.d;
        if (asloVar == null) {
            asloVar = aslo.a;
        }
        this.a = false;
        if (asloVar != null) {
            int i = asloVar.b;
            if ((i & 1) != 0) {
                p(asloVar);
            } else if ((i & 2) == 0) {
                aoqu a = aakr.a(asloVar);
                if (a != null) {
                    if (a instanceof aqtb) {
                        akab akabVar = this.g;
                        aslo asloVar2 = aakqVar.a.d;
                        if (asloVar2 == null) {
                            asloVar2 = aslo.a;
                        }
                        D(akabVar.a(amuk.r(asloVar2)));
                    } else {
                        B(a);
                    }
                    this.a = true;
                }
            } else {
                aslp aslpVar = asloVar.d;
                if (aslpVar == null) {
                    aslpVar = aslp.a;
                }
                aslr aslrVar = aslpVar.d;
                if (aslrVar == null) {
                    aslrVar = aslr.a;
                }
                if ((aslrVar.b & 1) != 0) {
                    aslp aslpVar2 = asloVar.d;
                    if (aslpVar2 == null) {
                        aslpVar2 = aslp.a;
                    }
                    B(aslpVar2);
                    this.a = true;
                }
            }
        }
        nm(aakqVar);
        this.b = aakqVar.a.h;
    }

    @Override // defpackage.ajxl, defpackage.ynl
    public Class[] ky(Class cls, Object obj, int i) {
        if (cls == ajyq.class) {
            if (i == -1) {
                return new Class[]{aabk.class, aabm.class, aawi.class, ajym.class};
            }
            if (i == 0) {
                nn((aabk) obj);
                return null;
            } else if (i == 1) {
                no((aabm) obj);
                return null;
            } else if (i == 2) {
                N((aawi) obj);
                return null;
            } else if (i == 3) {
                M((ajym) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return aolu.r(this, obj, i);
    }

    @Override // defpackage.ajwq
    public final /* synthetic */ void li(aumx aumxVar, zdt zdtVar, ajxo ajxoVar, apzg apzgVar) {
        throw null;
    }

    @Override // defpackage.ajxy
    public String lv() {
        return this.b;
    }

    @Override // defpackage.ajwc
    public void lw(Object obj, int i) {
        if (this.a) {
            C(obj, i + 1);
        } else {
            C(obj, i);
        }
    }

    @Override // defpackage.ajwq
    public void lx(aumx aumxVar, apzg apzgVar) {
        lB();
        lr(ajna.g(aumxVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    /* renamed from: ly */
    public void lz(aakq aakqVar, ajfy ajfyVar) {
        super.lz(aakqVar, ajfyVar);
        if (aakqVar == null) {
            return;
        }
        if (ajfyVar == ajfy.RELOAD) {
            i(aakqVar);
        } else {
            nm(aakqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void nm(aakq aakqVar) {
        if (aakqVar == null) {
            return;
        }
        ls(aakqVar.a());
        D(this.f.a(aakqVar.a.e));
    }

    public void nn(aabk aabkVar) {
        super.G(aabkVar.b());
    }

    public void no(aabm aabmVar) {
        if (aabmVar.c() != null) {
            super.H(aabmVar.c());
        } else {
            super.G(aabmVar.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ Object np(auna aunaVar) {
        if (aunaVar == null || !aunaVar.qn(aslq.b)) {
            return null;
        }
        return new aakq((aslq) aunaVar.qm(aslq.b));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(aslo asloVar) {
        asln aslnVar = asloVar.c;
        if (aslnVar == null) {
            aslnVar = asln.a;
        }
        arag aragVar = aslnVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        if (!TextUtils.isEmpty(ajgl.b(aragVar))) {
            asln aslnVar2 = asloVar.c;
            if (aslnVar2 == null) {
                aslnVar2 = asln.a;
            }
            B(aslnVar2);
            this.a = true;
        } else if ((asloVar.b & 64) == 0) {
        } else {
            aqtb aqtbVar = asloVar.i;
            if (aqtbVar == null) {
                aqtbVar = aqtb.a;
            }
            B(aqtbVar);
        }
    }

    @Override // defpackage.ajxl, defpackage.ajxh, defpackage.ajzh
    public akam pn() {
        return new ajyp(super.pn(), this.a, this.b);
    }

    @Override // defpackage.ajwc
    public final void z(Object obj) {
        B(obj);
    }

    public ajyq(aari aariVar, ajyi ajyiVar, yni yniVar, yzj yzjVar, acti actiVar, akam akamVar, ajsm ajsmVar) {
        this(aariVar, ajyiVar, yniVar, yzjVar, actiVar, akamVar, ajsmVar, amon.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajyq(aari aariVar, ajyi ajyiVar, yni yniVar, yzj yzjVar, acti actiVar, akam akamVar, ajsm ajsmVar, ampq ampqVar) {
        super(aariVar, yniVar, yzjVar, actiVar, akam.a(akamVar), ajsmVar);
        ajyiVar.get();
        ajyiVar.a(aakq.class);
        yniVar.getClass();
        if (akamVar instanceof ajyp) {
            ajyp ajypVar = (ajyp) akamVar;
            this.a = ajypVar.a;
            this.b = ajypVar.b;
        }
        yniVar.g(this);
        ajsmVar.mG(new ajyl(this));
        ajsmVar.mG(new akal(this));
        this.f = new akab();
        this.g = new akab();
        L(new ajyo(ampqVar));
    }
}
