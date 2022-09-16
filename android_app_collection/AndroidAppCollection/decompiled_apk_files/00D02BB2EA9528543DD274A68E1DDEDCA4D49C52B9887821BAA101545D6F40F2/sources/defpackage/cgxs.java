package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgxs  reason: default package */
/* loaded from: classes4.dex */
public class cgxs extends cgww {
    public cgxs(Activity activity, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, btvo btvoVar, ges gesVar, cgum cgumVar) {
        super(activity, cgskVar, bwrsVar, list, dwqlVar, chakVar, btvoVar, gesVar, cgumVar);
    }

    private static final String am(String str) {
        String[] split = str.split("-");
        return split.length > 0 ? split[0].toLowerCase() : "";
    }

    @Override // defpackage.chal, defpackage.cgwg
    public boolean G() {
        ilo c = this.k.c();
        dnvr dnvrVar = this.c;
        if ((dnvrVar.a & 2) == 0 || c == null || !c.f) {
            return true;
        }
        dnfe dnfeVar = dnvrVar.c;
        if (dnfeVar == null) {
            dnfeVar = dnfe.p;
        }
        return dnfeVar.c.trim().equals(c.n().trim());
    }

    @Override // defpackage.cgww
    public final void ac(ilo iloVar) {
        String ck = iloVar.ck();
        if (ck.isEmpty()) {
            return;
        }
        String am = am(iloVar.r());
        dnfe dnfeVar = this.c.d;
        if (dnfeVar == null) {
            dnfeVar = dnfe.p;
        }
        if (!am.equals(am(dnfeVar.n))) {
            return;
        }
        this.g = new cgwu(this.a, ai(), ck, true, this);
    }

    @Override // defpackage.cgww
    @dzsi
    public dnfe ad() {
        dnfe aj = aj();
        ilo c = this.k.c();
        if (c != null) {
            String r = c.r();
            if (aj == null || dbsj.d(r)) {
                return aj;
            }
            dsqp dsqpVar = (dsqp) aj.cu(5);
            dsqpVar.bC(aj);
            dneu dneuVar = (dneu) dsqpVar;
            if (dneuVar.c) {
                dneuVar.bF();
                dneuVar.c = false;
            }
            dnfe dnfeVar = (dnfe) dneuVar.b;
            r.getClass();
            dnfeVar.a |= 16384;
            dnfeVar.n = r;
            return dneuVar.bK();
        }
        return aj;
    }

    @Override // defpackage.cgww
    public final void ae() {
        Activity activity = this.a;
        String ah = ah();
        dnfe dnfeVar = this.c.d;
        if (dnfeVar == null) {
            dnfeVar = dnfe.p;
        }
        this.f = new cgwu(activity, ah, dnfeVar.c, false, this);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence b() {
        if (ag()) {
            return this.a.getString(R.string.FACTUAL_MODERATION_NAME_QUESTION_MULTIPLE_OPTIONS);
        }
        return this.a.getString(R.string.FACTUAL_MODERATION_NAME_QUESTION);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence e() {
        return this.a.getString(R.string.FACTUAL_MODERATION_NAME_TITLE);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public cqtd g() {
        return cqrt.f(2131231753);
    }
}
