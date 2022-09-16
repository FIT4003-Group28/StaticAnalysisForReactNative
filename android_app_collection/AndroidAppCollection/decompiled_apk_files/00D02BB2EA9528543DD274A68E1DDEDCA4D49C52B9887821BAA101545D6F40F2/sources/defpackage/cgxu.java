package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: cgxu  reason: default package */
/* loaded from: classes4.dex */
public class cgxu extends cgww {
    private final List<jbf> s;
    private final bydk t;

    public cgxu(Activity activity, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, btvo btvoVar, ges gesVar, cgum cgumVar) {
        super(activity, cgskVar, bwrsVar, list, dwqlVar, chakVar, btvoVar, gesVar, cgumVar);
        bydk bydkVar = new bydk(activity);
        this.t = bydkVar;
        dnfe dnfeVar = this.c.d;
        dgsl dgslVar = (dnfeVar == null ? dnfe.p : dnfeVar).l;
        LinkedHashMap<String, List<String>> c = bydkVar.c(dgslVar == null ? dgsl.b : dgslVar, TimeZone.getTimeZone(cgskVar.c().ad));
        this.s = new ArrayList();
        for (Map.Entry<String, List<String>> entry : c.entrySet()) {
            this.s.add(new cgxt(entry.getKey(), dbrz.e("\n").g(entry.getValue())));
        }
    }

    @Override // defpackage.chal, defpackage.cgwg
    public boolean G() {
        dgsl c;
        ilo c2 = this.k.c();
        if ((this.c.a & 2) == 0 || c2 == null || !c2.f || (c = c2.al().c()) == null) {
            return true;
        }
        List<String> b = this.t.b(c, TimeZone.getTimeZone(c2.aT()));
        bydk bydkVar = this.t;
        dnfe dnfeVar = this.c.c;
        if (dnfeVar == null) {
            dnfeVar = dnfe.p;
        }
        dgsl dgslVar = dnfeVar.l;
        if (dgslVar == null) {
            dgslVar = dgsl.b;
        }
        return b.equals(bydkVar.b(dgslVar, TimeZone.getTimeZone(c2.aT())));
    }

    @Override // defpackage.cgww, defpackage.cgva
    public Boolean a() {
        return Boolean.TRUE;
    }

    @Override // defpackage.cgww
    @dzsi
    public dnfe ad() {
        return null;
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence b() {
        return this.a.getString(R.string.FACTUAL_MODERATION_HOURS_QUESTION);
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence e() {
        return this.a.getString(R.string.FACTUAL_MODERATION_HOURS_TITLE);
    }

    @Override // defpackage.cgww, defpackage.cgva
    @dzsi
    public List<jbf> f() {
        return this.s;
    }

    @Override // defpackage.cgww, defpackage.cgva
    public cqtd g() {
        return cqrt.f(2131231600);
    }
}
