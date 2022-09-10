package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgxw  reason: default package */
/* loaded from: classes4.dex */
public class cgxw extends cgww {
    private final afha s;

    public cgxw(Activity activity, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, btvo btvoVar, ges gesVar, cgum cgumVar, afha afhaVar) {
        super(activity, cgskVar, bwrsVar, list, dwqlVar, chakVar, btvoVar, gesVar, cgumVar);
        this.s = afhaVar;
    }

    @Override // defpackage.cgww
    public final void ac(ilo iloVar) {
        String cm = iloVar.cm();
        if (cm.isEmpty()) {
            return;
        }
        this.g = new cgxv(this.a, ai(), cm, true, this, this.s);
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
        this.f = new cgxv(activity, ah, dnfeVar.c, false, this, this.s);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence b() {
        if (ag()) {
            return this.a.getString(R.string.FACTUAL_MODERATION_PHONE_QUESTION_MULTIPLE_OPTIONS);
        }
        return this.a.getString(R.string.FACTUAL_MODERATION_PHONE_QUESTION);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence e() {
        return this.a.getString(R.string.FACTUAL_MODERATION_PHONE_TITLE);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public cqtd g() {
        return cqrt.f(2131231713);
    }
}
