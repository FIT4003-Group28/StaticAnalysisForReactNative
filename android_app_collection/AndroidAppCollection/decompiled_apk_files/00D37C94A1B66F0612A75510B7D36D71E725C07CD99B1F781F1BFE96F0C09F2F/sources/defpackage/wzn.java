package defpackage;

import com.google.android.libraries.lidar.VisibilityChangeEventData;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wzn  reason: default package */
/* loaded from: classes4.dex */
public final class wzn extends wzm {
    private final tjv i;
    private final String j;
    private final asaj k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wzn(defpackage.xci r12, defpackage.asaj r13, defpackage.wme r14, defpackage.tjv r15, android.view.View r16) {
        /*
            r11 = this;
            r7 = r11
            r8 = r13
            r9 = r15
            r10 = r16
            asap r0 = r8.g
            if (r0 != 0) goto Lb
            asap r0 = defpackage.asap.a
        Lb:
            long r0 = r0.e
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r4 = 1
            r5 = 0
            r0 = r11
            r1 = r12
            r6 = r14
            r0.<init>(r1, r2, r4, r5, r6)
            r7.k = r8
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r7.j = r0
            r7.i = r9
            wkj r1 = r9.c
            boolean r1 = r1.a()
            if (r1 != 0) goto L30
            return
        L30:
            java.util.Map r1 = r9.b
            java.lang.Object r1 = r1.get(r0)
            tky r1 = (defpackage.tky) r1
            if (r1 == 0) goto L46
            android.view.View r2 = r1.a()
            if (r10 == r2) goto L46
            r1.d(r10)
            r1.h = r7
            return
        L46:
            tky r1 = new tky
            tjw r2 = r9.d
            tjq r2 = new tjq
            r2.<init>()
            r1.<init>(r11, r2)
            tld r2 = r11.a()
            boolean r2 = r2.d
            r1.a = r2
            r1.d(r10)
            r2 = 2
            r1.r = r2
            java.util.Map r2 = r9.b
            r2.put(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzn.<init>(xci, asaj, wme, tjv, android.view.View):void");
    }

    @Override // defpackage.tkz
    public final Set b(tla tlaVar) {
        aoyb aoybVar;
        amuk a;
        for (asac asacVar : this.k.m) {
            if (asacVar.b == 84813246) {
                aoybVar = (aoyb) asacVar.c;
            } else {
                aoybVar = aoyb.a;
            }
            for (aoyc aoycVar : aoybVar.c) {
                if ((aoycVar.b & 64) != 0) {
                    avww avwwVar = aoycVar.g;
                    if (avwwVar == null) {
                        avwwVar = avww.a;
                    }
                    apai apaiVar = avwwVar.c;
                    if (apaiVar == null) {
                        apaiVar = apai.a;
                    }
                    tla tlaVar2 = tla.START;
                    switch (tlaVar.ordinal()) {
                        case 0:
                            a = xeu.a(apaiVar.r);
                            break;
                        case 1:
                            a = xeu.a(apaiVar.s);
                            break;
                        case 2:
                            a = xeu.a(apaiVar.t);
                            break;
                        case 3:
                            a = xeu.a(apaiVar.u);
                            break;
                        case 4:
                            a = xeu.a(apaiVar.v);
                            break;
                        case 5:
                            a = xeu.a(apaiVar.g);
                            break;
                        case 6:
                            a = xeu.a(apaiVar.f);
                            break;
                        case 7:
                            a = amuk.q();
                            break;
                        case 8:
                            a = xeu.a(apaiVar.q);
                            break;
                        case 9:
                            a = xeu.a(apaiVar.h);
                            break;
                        case 10:
                            a = xeu.a(apaiVar.d);
                            break;
                        case 11:
                            a = xeu.a(apaiVar.e);
                            break;
                        case 12:
                            a = xeu.a(apaiVar.m);
                            break;
                        case 13:
                            a = xeu.a(apaiVar.n);
                            break;
                        case 14:
                            a = xeu.a(apaiVar.o);
                            break;
                        case 15:
                            a = xeu.a(apaiVar.l);
                            break;
                        case 16:
                            a = xeu.a(apaiVar.p);
                            break;
                        default:
                            String valueOf = String.valueOf(tlaVar.name());
                            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unrecognized video event: ".concat(valueOf) : new String("Unrecognized video event: "));
                    }
                    return afzo.d(a, a);
                }
            }
        }
        return amyg.a;
    }

    @Override // defpackage.wzm
    public final tjt f(int i) {
        if (i != 1) {
            if (i == 2) {
                return this.i.a(this.j, tla.MIDPOINT);
            }
            if (i == 3) {
                return this.i.a(this.j, tla.THIRD_QUARTILE);
            }
            return null;
        }
        return this.i.a(this.j, tla.FIRST_QUARTILE);
    }

    @Override // defpackage.wzm
    public final void h() {
        this.e = this.i.a(this.j, tla.ABANDON);
    }

    @Override // defpackage.wzm
    public final void i() {
        this.e = this.i.a(this.j, tla.COMPLETE);
    }

    @Override // defpackage.wzm
    public final void j() {
        this.e = this.i.a(this.j, tla.START);
    }

    @Override // defpackage.wzm
    public final void k() {
        this.e = this.i.a(this.j, tla.PAUSE);
    }

    @Override // defpackage.wzm
    public final void l() {
        this.e = this.i.a(this.j, tla.RESUME);
    }

    @Override // defpackage.wzm
    public final void m() {
        this.e = this.i.a(this.j, tla.SKIP);
    }

    @Override // defpackage.wzm
    public final void n() {
        this.e = this.i.a(this.j, tla.ABANDON);
    }

    @Override // defpackage.wzm
    public final void o(VisibilityChangeEventData visibilityChangeEventData) {
    }

    @Override // defpackage.wzm
    public final void p() {
        this.i.a(this.j, tla.SUSPEND);
        this.e = this.i.a(this.j, tla.ABANDON);
    }

    @Override // defpackage.wzm
    public final void q(aijs aijsVar) {
    }

    @Override // defpackage.wzm
    public final void r(int i, int i2, int i3, int i4) {
        tjv tjvVar = this.i;
        String str = this.j;
        tkc tkcVar = (tkc) tjvVar.a.get(str);
        if (tkcVar != null) {
            tkcVar.e(i, i2, i3, i4);
        }
        tky tkyVar = (tky) tjvVar.b.get(str);
        if (tkyVar != null) {
            tkyVar.e(i, i2, i3, i4);
        }
    }
}
