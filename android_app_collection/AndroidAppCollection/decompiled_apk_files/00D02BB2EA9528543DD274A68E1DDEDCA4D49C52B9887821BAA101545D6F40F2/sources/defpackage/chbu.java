package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: chbu  reason: default package */
/* loaded from: classes4.dex */
public class chbu extends cgww {
    private final afha s;

    public chbu(Activity activity, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, btvo btvoVar, ges gesVar, cgum cgumVar, afha afhaVar) {
        super(activity, cgskVar, bwrsVar, list, dwqlVar, chakVar, btvoVar, gesVar, cgumVar);
        this.s = afhaVar;
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
        return dnfeVar.c.trim().equals(c.ag().c.trim());
    }

    @Override // defpackage.cgww
    public final void ac(ilo iloVar) {
        String cn = iloVar.cn();
        if (cn.isEmpty()) {
            return;
        }
        this.g = new chbt(this.a, ai(), cn, true, this, this.s);
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
        this.f = new chbt(activity, ah, dnfeVar.c, false, this, this.s);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence b() {
        if (ag()) {
            return this.a.getString(R.string.FACTUAL_MODERATION_WEBSITE_QUESTION_MULTIPLE_OPTIONS);
        }
        return this.a.getString(R.string.FACTUAL_MODERATION_WEBSITE_QUESTION);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence e() {
        return this.a.getString(R.string.FACTUAL_MODERATION_WEBSITE_TITLE);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public cqtd g() {
        return cqrt.f(2131231775);
    }
}
