package defpackage;

import android.text.TextUtils;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: kqi  reason: default package */
/* loaded from: classes7.dex */
public final class kqi {
    public final cjqy a;
    public final cjqq b;
    public final ckco c;
    public final ckco d;
    private final ckcw e;
    private final cqat f;
    private final ckco g;
    private final ckco h;
    private final ckco i;

    public kqi(cjqy cjqyVar, ckcw ckcwVar, cjqq cjqqVar, cqat cqatVar) {
        this.a = cjqyVar;
        this.e = ckcwVar;
        this.b = cjqqVar;
        this.f = cqatVar;
        this.g = (ckco) ckcwVar.a(ckee.r);
        this.c = (ckco) ckcwVar.a(ckee.t);
        this.d = (ckco) ckcwVar.a(ckee.s);
        this.h = (ckco) ckcwVar.a(ckee.C);
        this.i = (ckco) ckcwVar.a(ckee.u);
    }

    public final void a(afhu afhuVar, boolean z) {
        ddho ddhoVar;
        dbsg i;
        if (z) {
            ddjr b = afhuVar.b();
            if (b == null) {
                b = ddjr.NONE;
            }
            int ordinal = b.ordinal();
            if (ordinal == 22) {
                ddhoVar = dtxm.aJ;
            } else if (ordinal == 23) {
                ddhoVar = dtxm.aK;
            } else {
                i = dbpy.a;
                bvor.a(i, new mw(this) { // from class: kqh
                    private final kqi a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj) {
                        kqi kqiVar = this.a;
                        cjtd cjtdVar = (cjtd) obj;
                        kqiVar.a.j(kqiVar.b.g().d(cjtdVar), cjtdVar);
                    }
                });
            }
            cjta b2 = cjtd.b();
            b2.d = ddhoVar;
            afhp afhpVar = (afhp) afhuVar;
            String str = afhpVar.a.O;
            if (!TextUtils.isEmpty(str)) {
                b2.g(str);
            }
            String str2 = afhpVar.a.P;
            if (!TextUtils.isEmpty(str2)) {
                b2.b = str2;
            }
            Integer num = afhpVar.a.y;
            if (num != null && num.intValue() >= 0) {
                b2.i(num.intValue());
            }
            i = dbsg.i(b2.a());
            bvor.a(i, new mw(this) { // from class: kqh
                private final kqi a;

                {
                    this.a = this;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    kqi kqiVar = this.a;
                    cjtd cjtdVar = (cjtd) obj;
                    kqiVar.a.j(kqiVar.b.g().d(cjtdVar), cjtdVar);
                }
            });
        }
    }

    public final void b(ddda dddaVar) {
        cjug cjugVar = new cjug();
        cjugVar.a = new cjte(deaf.USER);
        cjugVar.j = this.f;
        cjugVar.g = dddaVar;
        cjugVar.k = this.a.G();
        cjuh a = cjugVar.a();
        dnqg bZ = dnqh.p.bZ();
        int i = dddaVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        a.i(bZ.bK());
        this.a.u(a);
    }

    public final void c(kpt kptVar) {
        this.g.a(kptVar.G);
    }

    public final void d(@dzsi dpjs dpjsVar, boolean z) {
        this.h.a(nma.a(dpjsVar, z) - 1);
    }

    public final void e(afhu afhuVar, boolean z) {
        if (afhuVar.j()) {
            g(afhuVar, z);
        } else {
            f(afhuVar, z);
        }
    }

    public final void f(afhu afhuVar, boolean z) {
        int i = 1;
        dbsk.l(!afhuVar.j());
        dbsk.l(afhuVar.g() >= 0);
        int g = afhuVar.g();
        if (g == 0) {
            i = 3;
        } else if (g != 1) {
            i = true != z ? 2 : 4;
        }
        h(kqk.b(afhuVar)).a(i - 1);
        this.i.a(afhuVar.g());
    }

    public final void g(afhu afhuVar, boolean z) {
        dbsk.l(afhuVar.j());
        dbsk.l(afhuVar.g() >= 0);
        int g = afhuVar.g();
        h(kqk.c(afhuVar)).a((g != 0 ? g != 1 ? true != z ? 102 : 104 : R.styleable.AppCompatTheme_switchStyle : R.styleable.AppCompatTheme_textAppearanceListItem) - 1);
        this.i.a(afhuVar.g());
    }

    public final ckco h(boolean z) {
        ckgz ckgzVar;
        ckcw ckcwVar = this.e;
        if (z) {
            ckgzVar = ckee.v;
        } else {
            ckgzVar = ckee.w;
        }
        return (ckco) ckcwVar.a(ckgzVar);
    }
}
