package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: mqb  reason: default package */
/* loaded from: classes3.dex */
public final class mqb {
    private final ViewGroup b;
    private final azqb c;
    private final airr d;
    private final mqa e;
    private final mqa f;
    private final mqa g;
    private final mqa h;
    private final mqa i;
    private final mqa j;
    private final mqa k;
    private final mqa l;
    private final agrf n;
    private final List a = new ArrayList();
    private boolean m = true;

    public mqb(ViewGroup viewGroup, azqb azqbVar, airr airrVar, agrf agrfVar, mpw mpwVar, mqk mqkVar, mqg mqgVar, mqr mqrVar, mpu mpuVar, mpr mprVar, mqr mqrVar2, byte[] bArr) {
        this.b = viewGroup;
        this.c = azqbVar;
        this.d = airrVar;
        this.n = agrfVar;
        this.e = new mqa(viewGroup, mpwVar);
        this.f = new mqa(viewGroup, mqkVar);
        this.g = new mqa(viewGroup, mqgVar);
        this.h = new mqa(viewGroup, mqgVar);
        this.i = new mqa(viewGroup, mqrVar);
        this.j = new mqa(viewGroup, mpuVar);
        this.k = new mqa(viewGroup, mprVar);
        this.l = new mqa(viewGroup, mqrVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [mqf, mpy, mqq] */
    /* JADX WARN: Type inference failed for: r1v12, types: [mqf, mpy, mqq] */
    /* JADX WARN: Type inference failed for: r1v18, types: [mpv, mpy, mff] */
    /* JADX WARN: Type inference failed for: r1v4, types: [mpy, mpq] */
    /* JADX WARN: Type inference failed for: r1v6, types: [mpt, mpy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [mpy, mqq] */
    /* JADX WARN: Type inference failed for: r9v27, types: [mqj, mpy] */
    private final void h(Object obj, String str, ajrs ajrsVar) {
        avgj avgjVar;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        apoj apojVar;
        mqd mqdVar = null;
        mqdVar = null;
        boolean z = false;
        if (obj instanceof auwy) {
            auwy auwyVar = (auwy) obj;
            if (!auwyVar.c) {
                ?? r1 = (mpv) this.e.a();
                r1.c(auwyVar, (acti) this.c.get(), ajrsVar);
                this.a.add(new mpz(1, r1, this.e));
                mqdVar = r1;
            } else {
                agqv d = d(str);
                airr airrVar = this.d;
                if ((d != null && !d.s() && !d.x()) || fcw.b(airrVar) != null || mqj.d(airrVar) != null) {
                    ?? r9 = (mqj) this.f.a();
                    acti actiVar = (acti) this.c.get();
                    r9.q = str;
                    auwyVar.getClass();
                    r9.p = auwyVar;
                    actiVar.getClass();
                    r9.o = actiVar;
                    apok apokVar = auwyVar.f;
                    if (apokVar == null) {
                        apokVar = apok.a;
                    }
                    aqxo.y(1 == (apokVar.b & 1));
                    apok apokVar2 = auwyVar.f;
                    if (apokVar2 == null) {
                        apokVar2 = apok.a;
                    }
                    apoj apojVar2 = apokVar2.c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                    r9.r = apojVar2;
                    r9.a.h = str;
                    apok apokVar3 = auwyVar.f;
                    if (apokVar3 == null) {
                        apokVar3 = apok.a;
                    }
                    apoj apojVar3 = apokVar3.c;
                    if (apojVar3 == null) {
                        apojVar3 = apoj.a;
                    }
                    boolean z2 = apojVar3.h;
                    boolean z3 = !z2;
                    r9.e.setAlpha(true != z2 ? 1.0f : 0.5f);
                    r9.e.setOnClickListener(z3 ? r9.l : null);
                    r9.e.setClickable(z3);
                    r9.g.setClickable(z3);
                    r9.g.setImportantForAccessibility(2);
                    r9.c.g(r9.a);
                    apoj d2 = mqj.d(r9.i);
                    if (d2 == null || d2.c != 20) {
                        apoj apojVar4 = r9.r;
                        avgjVar = apojVar4.c == 20 ? (avgj) apojVar4.d : null;
                    } else {
                        avgjVar = (avgj) d2.d;
                    }
                    if (avgjVar == null || (avgjVar.b & 1) == 0) {
                        colorStateList = r9.m;
                    } else {
                        Context context = r9.b;
                        avgg b = avgg.b(avgjVar.c);
                        if (b == null) {
                            b = avgg.THEME_ATTRIBUTE_UNKNOWN;
                        }
                        colorStateList = ColorStateList.valueOf(akeq.a(context, b, 0));
                    }
                    r9.f.setTextColor(colorStateList);
                    if (avgjVar == null || (avgjVar.b & 2) == 0) {
                        colorStateList2 = r9.n;
                    } else {
                        Context context2 = r9.b;
                        avgg b2 = avgg.b(avgjVar.d);
                        if (b2 == null) {
                            b2 = avgg.THEME_ATTRIBUTE_UNKNOWN;
                        }
                        colorStateList2 = ColorStateList.valueOf(akeq.a(context2, b2, 0));
                    }
                    r9.g.a(colorStateList2);
                    apoj d3 = mqj.d(r9.i);
                    if (d3 != null) {
                        jed jedVar = r9.a;
                        jedVar.g = d3;
                        jedVar.f = null;
                    } else {
                        jed jedVar2 = r9.a;
                        jedVar2.f = fcw.b(r9.i);
                        jedVar2.g = null;
                    }
                    if (mqj.d(r9.i) != null) {
                        r9.oO(r9.c());
                    } else {
                        agqv c = r9.c();
                        r9.a(c, fcw.b(r9.i));
                        r9.e(c);
                    }
                    r9.e.setId(R.id.offline_button);
                    if (r9.e.getVisibility() == 0 && (apojVar = r9.r) != null) {
                        r9.k.a(apojVar, r9.e);
                    }
                    this.a.add(new mpz(2, r9, this.f));
                    mqdVar = r9;
                }
            }
        } else if (obj instanceof auxb) {
            auxb auxbVar = (auxb) obj;
            if (auxbVar.c) {
                ?? r12 = (mqf) this.g.a();
                r12.k(auxbVar);
                this.a.add(new mpz(3, r12, this.g));
                mqdVar = r12;
            } else if (auxbVar.d) {
                ?? r13 = (mqf) this.h.a();
                r13.k(auxbVar);
                this.a.add(new mpz(4, r13, this.h));
                mqdVar = r13;
            } else {
                ?? r14 = (mqq) this.i.a();
                r14.k(auxbVar);
                this.a.add(new mpz(5, r14, this.i));
                mqdVar = r14;
            }
        } else if (obj instanceof auwx) {
            ?? r15 = (mpt) this.j.a();
            r15.n((auwx) obj);
            this.a.add(new mpz(6, r15, this.j));
            mqdVar = r15;
        } else if (obj instanceof aowb) {
            final aowb aowbVar = (aowb) obj;
            final ?? r16 = (mpq) this.k.a();
            acti actiVar2 = (acti) this.c.get();
            aowbVar.getClass();
            actiVar2.getClass();
            r16.f = actiVar2;
            ajrsVar.getClass();
            r16.g = ajrsVar;
            if ((aowbVar.b & 8) != 0) {
                aopa createBuilder = auwy.a.createBuilder();
                apok apokVar4 = aowbVar.d;
                if (apokVar4 == null) {
                    apokVar4 = apok.a;
                }
                createBuilder.copyOnWrite();
                auwy auwyVar2 = (auwy) createBuilder.instance;
                apokVar4.getClass();
                auwyVar2.f = apokVar4;
                auwyVar2.b |= 8;
                r16.c = (auwy) createBuilder.mo39build();
            }
            if ((aowbVar.b & 16) != 0) {
                aopa createBuilder2 = auwy.a.createBuilder();
                apok apokVar5 = aowbVar.e;
                if (apokVar5 == null) {
                    apokVar5 = apok.a;
                }
                createBuilder2.copyOnWrite();
                auwy auwyVar3 = (auwy) createBuilder2.instance;
                apokVar5.getClass();
                auwyVar3.f = apokVar5;
                auwyVar3.b |= 8;
                r16.d = (auwy) createBuilder2.mo39build();
            }
            String str2 = aowbVar.f;
            aagh c2 = r16.b.c();
            if (r16.e == null) {
                r16.e = c2.h(str2, false).X(aypa.a()).at(new mpp(r16), kjt.q);
            }
            c2.f(str2).y(aypa.a()).o(new mpp(r16, 1)).l(new aypv() { // from class: mpo
                @Override // defpackage.aypv
                public final void a() {
                    mpq.this.d(aowbVar.c);
                }
            }).S();
            this.a.add(new mpz(7, r16, this.k));
            mqdVar = r16;
        } else if (obj instanceof aqtb) {
            mqd mqdVar2 = (mqd) this.l.a();
            ajin ajinVar = (ajin) mqdVar2.b.get();
            ajhh a = ajhh.a((aqtb) obj);
            ajrsVar.a((acti) this.c.get());
            mqdVar2.a.addView(mqdVar2.c.a(), 0);
            mqdVar2.c.oK(ajrsVar, a);
            this.a.add(new mpz(8, mqdVar2, this.l));
            mqdVar = mqdVar2;
        }
        boolean z4 = this.m;
        if (mqdVar != null) {
            z = true;
        }
        this.m = z4 | z;
    }

    public final View a() {
        mpt c = c();
        if (c != null) {
            return c.c;
        }
        return null;
    }

    public final View b() {
        for (mpz mpzVar : this.a) {
            if (mpzVar.a == 2) {
                return mpzVar.b.oN();
            }
        }
        return null;
    }

    public final mpt c() {
        for (mpz mpzVar : this.a) {
            if (mpzVar.a == 6) {
                mpy mpyVar = mpzVar.b;
                if (mpyVar instanceof mpt) {
                    return (mpt) mpyVar;
                }
            }
        }
        return null;
    }

    public final agqv d(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return (agqv) ((ampq) this.n.a().m().h(str).get(4L, TimeUnit.SECONDS)).f();
            }
            return null;
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(str);
            zep.d(valueOf.length() != 0 ? "Get video snapshot was interrupted for video id ".concat(valueOf) : new String("Get video snapshot was interrupted for video id "), e);
            return null;
        } catch (ExecutionException e2) {
            String valueOf2 = String.valueOf(str);
            zep.d(valueOf2.length() != 0 ? "Failed to get video snapshot for video id ".concat(valueOf2) : new String("Failed to get video snapshot for video id "), e2);
            return null;
        } catch (TimeoutException e3) {
            String valueOf3 = String.valueOf(str);
            zep.d(valueOf3.length() != 0 ? "Get video snapshot timed out for video id ".concat(valueOf3) : new String("Get video snapshot timed out for video id "), e3);
            return null;
        }
    }

    public final void e(Iterable iterable, String str, ajrs ajrsVar) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            auwz auwzVar = (auwz) it.next();
            int i = auwzVar.b;
            if (i == 124608017) {
                h((auwy) auwzVar.c, str, ajrsVar);
            } else if (i == 124608045) {
                h((auxb) auwzVar.c, str, ajrsVar);
            } else if (i == 186676672) {
                h((auwx) auwzVar.c, str, ajrsVar);
            } else if (i == 265166751) {
                h((aowb) auwzVar.c, str, ajrsVar);
            } else if (i == 153515154) {
                h((aqtb) auwzVar.c, str, ajrsVar);
            }
        }
    }

    public final void f() {
        for (mpz mpzVar : amxp.t(this.a)) {
            mqa mqaVar = mpzVar.c;
            mpy mpyVar = mpzVar.b;
            mpyVar.b();
            mqaVar.a.removeView(mpyVar.oN());
            mqaVar.b.offerLast(mpyVar);
        }
        this.a.clear();
    }

    public final void g() {
        boolean z = false;
        if (this.m) {
            this.b.removeAllViews();
            this.m = true;
            for (mpz mpzVar : this.a) {
                this.b.addView(mpzVar.b.oN());
            }
            this.m = false;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup.getChildCount() > 0) {
            z = true;
        }
        zag.o(viewGroup, z);
    }
}
