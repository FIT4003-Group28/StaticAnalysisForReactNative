package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgwm  reason: default package */
/* loaded from: classes4.dex */
public class cgwm extends cgww {
    public cgwm(Activity activity, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, btvo btvoVar, ges gesVar, cgum cgumVar) {
        super(activity, cgskVar, bwrsVar, list, dwqlVar, chakVar, btvoVar, gesVar, cgumVar);
    }

    @Override // defpackage.cgww
    public final void ac(ilo iloVar) {
        String cl = iloVar.cl();
        if (cl.isEmpty()) {
            return;
        }
        this.g = new cgwu(this.a, ai(), cl, true, this);
    }

    @Override // defpackage.cgww
    @dzsi
    public dnfe ad() {
        return aj();
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
            return this.a.getString(R.string.FACTUAL_MODERATION_ADDRESS_QUESTION_MULTIPLE_OPTIONS);
        }
        return this.a.getString(R.string.FACTUAL_MODERATION_ADDRESS_QUESTION);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence e() {
        return this.a.getString(R.string.FACTUAL_MODERATION_ADDRESS_TITLE);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public cqtd g() {
        return cqrt.f(2131231715);
    }
}
