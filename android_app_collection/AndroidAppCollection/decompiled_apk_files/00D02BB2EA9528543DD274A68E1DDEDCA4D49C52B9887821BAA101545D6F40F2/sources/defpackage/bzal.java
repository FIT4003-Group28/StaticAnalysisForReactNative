package defpackage;

import android.app.Service;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzal  reason: default package */
/* loaded from: classes4.dex */
public class bzal extends byzq {
    public final vtn a;
    @dzsi
    private String e;
    private int f;

    public bzal(vyl vylVar, Service service, vtn vtnVar, btvo btvoVar) {
        super(vylVar, service, btvoVar);
        this.a = vtnVar;
        this.f = -1;
        this.e = null;
    }

    public static int m(bzdg bzdgVar) {
        int i = bzdgVar.d().h;
        if (bzlx.a(2, i)) {
            return 2131232611;
        }
        if (bzlx.a(273, i)) {
            return 2131232619;
        }
        if (bzlx.a(274, i) || bzlx.a(4, i)) {
            return 2131232956;
        }
        if (bzlx.a(1, i)) {
            return 2131232616;
        }
        return bzlx.a(3, i) ? 2131232608 : 2131232624;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    @Override // defpackage.byzz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.byzy a(defpackage.bzdk r14, defpackage.byzg r15) {
        /*
            r13 = this;
            bzdh r0 = r14.g()
            bzcz r0 = (defpackage.bzcz) r0
            java.lang.String r1 = r0.d()
            int r2 = r0.f()
            java.lang.String r3 = r13.e
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L1b
            r13.e = r1
            r13.f = r2
            goto L21
        L1b:
            int r1 = r13.f
            if (r2 == r1) goto L26
            r13.f = r2
        L21:
            com.google.android.apps.gmm.transit.go.events.TransitGuidanceRemainingStopsEvent r1 = new com.google.android.apps.gmm.transit.go.events.TransitGuidanceRemainingStopsEvent
            r1.<init>(r2)
        L26:
            bzdg r1 = r0.b()
            java.lang.String r1 = r1.f()
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L38
            java.lang.String r1 = r0.d()
            goto L49
        L38:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = r0.d()
            r5[r4] = r6
            r5[r3] = r1
            r1 = 2131958119(0x7f131967, float:1.9552841E38)
            java.lang.String r1 = r13.f(r1, r5)
        L49:
            vyl r5 = r13.b
            java.lang.String r1 = r13.b(r1)
            vyk r9 = r5.a(r1)
            int r1 = r0.f()
            eaow r5 = r0.e()
            long r5 = r5.g()
            int r6 = (int) r5
            int r5 = java.lang.Math.max(r4, r6)
            byzg r6 = defpackage.byzg.GET_OFF
            r6.equals(r15)
            java.lang.String r1 = r13.n(r1, r5, r3)
            boolean r5 = r14.p()
            if (r5 != 0) goto La5
            android.text.style.CharacterStyle[] r5 = new android.text.style.CharacterStyle[r2]
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            android.content.res.Resources r7 = r13.e()
            r8 = 2131101746(0x7f060832, float:1.781591E38)
            int r7 = defpackage.ka.b(r7, r8)
            r6.<init>(r7)
            r5[r4] = r6
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r3)
            r5[r3] = r6
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r1)
            r6 = 0
        L94:
            if (r6 >= r2) goto La4
            r7 = r5[r6]
            int r8 = r1.length()
            r10 = 33
            r3.setSpan(r7, r4, r8, r10)
            int r6 = r6 + 1
            goto L94
        La4:
            r1 = r3
        La5:
            vyl r2 = r13.b
            vyk r10 = r2.a(r1)
            float r2 = r0.l()
            bzdg r1 = r0.b()
            int r3 = r1.m()
            bzap r11 = new bzap
            bzdg r1 = r0.b()
            java.lang.String r4 = r1.A()
            r5 = 1
            vtn r6 = r13.a
            android.content.res.Resources r7 = r13.e()
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            bzdg r0 = r0.b()
            int r12 = m(r0)
            r6 = r13
            r7 = r14
            r8 = r15
            byzy r14 = r6.i(r7, r8, r9, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzal.a(bzdk, byzg):byzy");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b(String str) {
        return f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_RIDE, str);
    }

    public final String n(int i, int i2, boolean z) {
        String obj;
        if (bvtb.a(i2) > 0 || !z) {
            obj = bvtb.e(e(), i2, bvsz.ABBREVIATED).toString();
        } else {
            obj = f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_NOW, new Object[0]);
        }
        if (i > 1 || !z) {
            return f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_RIDE_DESCRIPTION, alcg.b(e(), i), obj);
        }
        return f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_NEXT_STOP_DESCRIPTION, obj);
    }
}
