package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: advu  reason: default package */
/* loaded from: classes2.dex */
public class advu extends adyp {
    private final Activity a;
    private final akzh b;
    private final btlu c;
    private final cchz d;
    private final bqji e;
    private final bbut f;
    private final cjta q;

    public advu(Activity activity, akzh akzhVar, cchz cchzVar, bqji bqjiVar, bbut bbutVar, adyo adyoVar, btlu btluVar, int i, View.OnAttachStateChangeListener onAttachStateChangeListener) {
        super(adyoVar, onAttachStateChangeListener, "", null, btluVar);
        this.a = activity;
        this.b = akzhVar;
        this.c = btluVar;
        this.d = cchzVar;
        this.e = bqjiVar;
        this.f = bbutVar;
        this.q = W(null, i);
    }

    @Override // defpackage.adyp, defpackage.advs
    public cqkl J() {
        this.e.a();
        return cqkl.a;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cqkl K() {
        akqq S = this.b.g().S();
        bbut bbutVar = this.f;
        bbuz m = bbve.m();
        m.e(dwyd.YOUR_EXPLORE_FEED);
        m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
        ((bbsu) m).a = bbvd.f(S);
        bbutVar.j(m.a());
        return cqkl.a;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd N(ddho ddhoVar) {
        return this.q.b(ddhoVar);
    }

    @Override // defpackage.adyp
    protected final jic O() {
        return new jic(this.d.c(this.c), ckqc.FIFE_MERGE, (cqtd) null, 0);
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return cjtd.b;
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence p() {
        return this.a.getString(R.string.YOUR_EXPLORE_ADD_CONTRIBUTION_PROMPT);
    }
}
