package defpackage;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import java.util.List;
/* compiled from: PG */
/* renamed from: umh  reason: default package */
/* loaded from: classes7.dex */
public class umh implements uma, uip {
    private final dxio<? extends uio> a;
    private final doxp b;
    private final Activity c;
    private final amub d;
    private final List<umc> e;
    private final vmv f;
    private final zfr g;
    private final qbv h;
    private final zfl i;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0152, code lost:
        if ((r4 == null ? defpackage.dgas.e : r4).b <= 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016a, code lost:
        if (((r4 == null ? defpackage.dgas.e : r4).a & 1) != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016c, code lost:
        r4 = r24.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016e, code lost:
        if (r19 == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0174, code lost:
        if (r28.i() <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
        r6 = defpackage.amvj.a(r24.d, r28.h(r28.i() - 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0189, code lost:
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018e, code lost:
        r6 = r29.d.a.e.get(0).c.get(r9 + 1).e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a9, code lost:
        if (r6 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ab, code lost:
        r6 = defpackage.dphe.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ad, code lost:
        r6 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01af, code lost:
        if (r6 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b1, code lost:
        r6 = defpackage.dpgw.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b3, code lost:
        r6 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b5, code lost:
        r12 = (android.app.Activity) ((defpackage.dxjd) r4.a).a;
        defpackage.umm.a(r12, 1);
        r15 = r4.b.a();
        defpackage.umm.a(r15, 2);
        r11 = ((defpackage.dxjh) r4.c).a();
        defpackage.umm.a(r11, 3);
        r14 = r4.d.a();
        defpackage.umm.a(r14, 4);
        r4 = r4.e.a();
        defpackage.umm.a(r4, 5);
        defpackage.umm.a(r10, 6);
        defpackage.umm.a(r6, 9);
        r5.g(new defpackage.uml(r12, r15, r11, r14, r4, r10, r18, r19, r6));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public umh(android.app.Activity r23, defpackage.umk r24, defpackage.uir r25, defpackage.vtn r26, defpackage.qbv r27, defpackage.amsy r28, defpackage.amub r29, defpackage.vmv r30, defpackage.dxio<? extends defpackage.uio> r31, defpackage.zfl r32) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umh.<init>(android.app.Activity, umk, uir, vtn, qbv, amsy, amub, vmv, dxio, zfl):void");
    }

    @Override // defpackage.uip
    public void a(List<dwfl> list, dcdc<Integer> dcdcVar) {
        if (this.e.size() >= dcdcVar.size()) {
            for (int i = 0; i < dcdcVar.size(); i++) {
                this.e.get(dcdcVar.get(i).intValue()).c(list.get(i));
            }
            return;
        }
        this.e.size();
        dcdcVar.size();
    }

    @Override // defpackage.uma
    public CharSequence b() {
        String str;
        dgas x;
        dgas dgasVar = this.d.d.w().b;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        String str2 = dgasVar.c;
        if (str2.isEmpty() && (x = vyb.x(this.d.d)) != null) {
            if ((x.a & 1) != 0) {
                str2 = bvtb.e(this.c.getResources(), x.b, bvsz.ABBREVIATED).toString();
            } else {
                str2 = x.c;
            }
        }
        doxp doxpVar = this.b;
        if (doxpVar != null) {
            dquj dqujVar = doxpVar.d;
            if (dqujVar == null) {
                dqujVar = dquj.f;
            }
            if (!dqujVar.d.isEmpty()) {
                dquj dqujVar2 = this.b.d;
                if (dqujVar2 == null) {
                    dqujVar2 = dquj.f;
                }
                str = dqujVar2.d;
            } else {
                dquh dquhVar = this.b.b;
                if (dquhVar == null) {
                    dquhVar = dquh.c;
                }
                str = dquhVar.b;
            }
            if (str.isEmpty()) {
                return new SpannableStringBuilder(str2);
            }
            if (str2.isEmpty()) {
                return new SpannableStringBuilder(str);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str2);
            spannableStringBuilder.append((CharSequence) ", ");
            spannableStringBuilder.append((CharSequence) str);
            return spannableStringBuilder;
        }
        return new SpannableStringBuilder(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018a A[RETURN] */
    @Override // defpackage.uma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence c() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umh.c():java.lang.CharSequence");
    }

    @Override // defpackage.uma
    public zfr d() {
        return this.g;
    }

    @Override // defpackage.uma
    public cqkl e() {
        this.f.s();
        return cqkl.a;
    }

    @Override // defpackage.uma
    public List<umc> f() {
        return this.e;
    }

    @Override // defpackage.uma
    public Boolean g() {
        return Boolean.valueOf(this.h.b());
    }

    @Override // defpackage.uma
    public Boolean h() {
        if (!this.h.d()) {
            return false;
        }
        return Boolean.valueOf(pyy.e(this.d.d));
    }

    @Override // defpackage.uma
    public Boolean i() {
        return Boolean.valueOf(this.h.d());
    }

    @Override // defpackage.uma
    public cqkl j() {
        this.i.r();
        return cqkl.a;
    }
}
