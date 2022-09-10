package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aheh  reason: default package */
/* loaded from: classes2.dex */
public class aheh implements agzl {
    public final dxio<afzv> a;
    private final bvjj c;
    private final dcdc<agzk> d;
    @dzsi
    private final btlu e;
    private final ahef f;
    private final agxm g;
    private int h;
    private final jco b = new ahee(this);
    private boolean i = true;

    public aheh(Activity activity, cqhn cqhnVar, agwa agwaVar, bvjj bvjjVar, dxio<afzv> dxioVar, @dzsi btlu btluVar, agxn agxnVar, ahef ahefVar) {
        this.c = bvjjVar;
        this.a = dxioVar;
        this.f = ahefVar;
        this.e = btluVar;
        dsqp dsqpVar = (dsqp) agxnVar.cu(5);
        dsqpVar.bC(agxnVar);
        agxm agxmVar = (agxm) dsqpVar;
        this.g = agxmVar;
        if (agwaVar.f(btluVar) && (agxnVar.a & 1) == 0) {
            int t = bvjjVar.t(bvjk.aJ, btluVar, -1) + 1;
            if (agxmVar.c) {
                agxmVar.bF();
                agxmVar.c = false;
            }
            agxn agxnVar2 = (agxn) agxmVar.b;
            agxnVar2.a |= 1;
            agxnVar2.b = t;
        }
        String string = activity.getString(R.string.LOCALSTREAM_ONE_TAP_ONBOARDING_WELCOME_CARD_HEADER);
        String string2 = activity.getString(R.string.LOCALSTREAM_ONE_TAP_ONBOARDING_WELCOME_CARD_BODY);
        cqtd e = iup.e(R.raw.localstream_one_tap_onboarding_svg);
        cjta b = cjtd.b();
        b.d = dtxu.bS;
        b.i(0);
        aheg ahegVar = new aheg(this, string, string2, "", e, b.a(), false, 8);
        String string3 = activity.getString(R.string.LOCALSTREAM_ONE_TAP_ONBOARDING_INSTRUCTIONAL_CARD_HEADER);
        String string4 = activity.getString(R.string.LOCALSTREAM_ONE_TAP_ONBOARDING_INSTRUCTIONAL_CARD_BODY);
        cqtd e2 = iup.e(R.raw.localstream_one_tap_onboarding_svg2);
        cjta b2 = cjtd.b();
        b2.d = dtxu.bS;
        b2.i(1);
        aheg ahegVar2 = new aheg(this, string3, string4, "", e2, b2.a(), false, 8);
        String string5 = activity.getString(R.string.LOCALSTREAM_EXPLICIT_PREFERENCE_INSTRUCTIONAL_CARD_HEADER);
        String string6 = activity.getString(R.string.LOCALSTREAM_EXPLICIT_PREFERENCE_INSTRUCTIONAL_CARD_BODY);
        String string7 = activity.getString(R.string.LOCALSTREAM_EXPLCIIT_PREFERENCE_INSTRUCTIONAL_CARD_UPDATE_AREAS_BUTTON);
        cqtd e3 = iup.e(R.raw.localstream_one_tap_onboarding_svg3);
        cjta b3 = cjtd.b();
        b3.d = dtxu.bS;
        b3.i(2);
        this.d = dcdc.h(ahegVar, ahegVar2, new aheg(this, string5, string6, string7, e3, b3.a(), true, 0));
        g(((agxn) agxmVar.b).b);
    }

    @Override // defpackage.agzl
    public Boolean a() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.agzl
    public List<agzk> b() {
        return this.d;
    }

    @Override // defpackage.agzl
    public Integer c() {
        return Integer.valueOf(this.h);
    }

    @Override // defpackage.agzl
    public jco d() {
        return this.b;
    }

    public agxn e() {
        return this.g.bK();
    }

    public final void f() {
        this.i = false;
        this.c.X(bvjk.aI, this.e, Integer.MAX_VALUE);
        this.c.Q(bvjk.aJ, this.e);
        ahin ahinVar = ((ahhz) this.f).a;
        agyk agykVar = ahinVar.k;
        boolean booleanValue = a().booleanValue();
        if (agykVar.c) {
            agykVar.bF();
            agykVar.c = false;
        }
        agyp agypVar = (agyp) agykVar.b;
        agyp agypVar2 = agyp.r;
        agypVar.a |= 4096;
        agypVar.o = booleanValue;
        cqkx.p(ahinVar);
    }

    public void g(int i) {
        int max = Math.max(0, i) % this.d.size();
        this.h = max;
        agxm agxmVar = this.g;
        if (agxmVar.c) {
            agxmVar.bF();
            agxmVar.c = false;
        }
        agxn agxnVar = (agxn) agxmVar.b;
        agxn agxnVar2 = agxn.c;
        agxnVar.a |= 1;
        agxnVar.b = max;
        this.c.X(bvjk.aJ, this.e, this.h);
    }
}
