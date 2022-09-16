package defpackage;

import android.app.Activity;
import android.text.Html;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgyj  reason: default package */
/* loaded from: classes4.dex */
public class cgyj extends cgxq {
    public cgyj(Activity activity, buke bukeVar, cgen cgenVar, cgum cgumVar, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar) {
        super(activity, bukeVar, cgenVar, cgskVar, bwrsVar, list, dwqlVar, chakVar, cgumVar);
    }

    private final String g() {
        dofb dofbVar;
        dwqf dwqfVar = this.i.a().c;
        if (dwqfVar == null) {
            dwqfVar = dwqf.g;
        }
        doqw doqwVar = dwqfVar.b;
        if (doqwVar == null) {
            doqwVar = doqw.c;
        }
        if (doqwVar.a == 11) {
            dofbVar = (dofb) doqwVar.b;
        } else {
            dofbVar = dofb.b;
        }
        return dofbVar.a;
    }

    @Override // defpackage.chal, defpackage.cgwg
    public boolean G() {
        akqq aj;
        ilo c = this.k.c();
        return (c == null || (aj = c.aj()) == null || g().isEmpty() || (aj.b == dcyn.a && aj.a == dcyn.a)) ? false : true;
    }

    @Override // defpackage.cgvn
    public CharSequence a() {
        return Html.fromHtml(String.format(this.b.getString(R.string.VERIFY_STREET_NUMBER_QUESTION), Html.escapeHtml(g())));
    }

    @Override // defpackage.cgvn
    public CharSequence b() {
        return "";
    }

    @Override // defpackage.cgvn
    @dzsi
    public cqtd c() {
        return cqrt.f(2131231715);
    }

    @Override // defpackage.cgvn
    public cqkl d() {
        return cqkl.a;
    }

    @Override // defpackage.cgvn
    public CharSequence f() {
        return this.b.getString(R.string.STREET_NUMBER_TITLE);
    }
}
