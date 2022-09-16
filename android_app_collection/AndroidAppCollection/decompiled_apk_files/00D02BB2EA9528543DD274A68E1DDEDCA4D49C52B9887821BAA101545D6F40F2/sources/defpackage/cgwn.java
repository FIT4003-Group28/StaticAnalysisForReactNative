package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgwn  reason: default package */
/* loaded from: classes4.dex */
public class cgwn extends cgww {
    @dzsi
    private String s;

    public cgwn(Activity activity, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, btvo btvoVar, ges gesVar, cgum cgumVar) {
        super(activity, cgskVar, bwrsVar, list, dwqlVar, chakVar, btvoVar, gesVar, cgumVar);
        this.s = null;
    }

    @Override // defpackage.chal, defpackage.cgwg
    public boolean G() {
        ilo c = this.k.c();
        if ((this.c.a & 2) == 0 || c == null || !c.f) {
            return true;
        }
        return c.ar().trim().equals(this.c.f.trim());
    }

    @Override // defpackage.cgww
    public final void ac(ilo iloVar) {
        String ar = iloVar.ar();
        if (ar.isEmpty() || iloVar.h() == null || iloVar.h().B.size() == 0) {
            return;
        }
        this.g = new cgwu(this.a, ai(), ar, true, this);
        this.s = iloVar.h().B.get(0).b;
    }

    @Override // defpackage.cgww
    @dzsi
    public dnfe ad() {
        String str = this.s;
        if (str == null) {
            return null;
        }
        dneu bZ = dnfe.p.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfe dnfeVar = (dnfe) bZ.b;
        str.getClass();
        dnfeVar.a |= 2;
        dnfeVar.c = str;
        return bZ.bK();
    }

    @Override // defpackage.cgww
    public final void ae() {
        this.f = new cgwu(this.a, ah(), this.c.g, false, this);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence b() {
        if (ag()) {
            return this.a.getString(R.string.FACTUAL_MODERATION_CATEGORY_QUESTION_MULTIPLE_OPTIONS);
        }
        return this.a.getString(R.string.FACTUAL_MODERATION_CATEGORY_QUESTION);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence e() {
        return this.a.getString(R.string.FACTUAL_MODERATION_CATEGORY_TITLE);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public cqtd g() {
        return cqrt.f(2131231599);
    }
}
