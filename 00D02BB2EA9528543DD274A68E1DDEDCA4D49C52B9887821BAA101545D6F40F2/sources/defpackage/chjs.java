package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chjs  reason: default package */
/* loaded from: classes4.dex */
public class chjs extends chjc implements chmf {
    private final jic a;
    private final djdd c;
    private final String d;
    private final String e;

    public chjs(cchz cchzVar, chiu chiuVar, Resources resources, chmu chmuVar) {
        super(chmuVar);
        chhy chhyVar;
        djdd djddVar;
        chik chikVar = ((chle) chmuVar).a;
        if (chikVar.a == 1) {
            chhyVar = (chhy) chikVar.b;
        } else {
            chhyVar = chhy.e;
        }
        djdm djdmVar = chhyVar.b;
        djdmVar = djdmVar == null ? djdm.c : djdmVar;
        if (djdmVar.a == 5) {
            djddVar = (djdd) djdmVar.b;
        } else {
            djddVar = djdd.e;
        }
        this.c = djddVar;
        ccih l = cchzVar.d().l();
        dbsk.s(l);
        this.a = chiuVar.a((djddVar.a & 2) != 0 ? djddVar.c : l.b());
        this.d = dbsj.e(l.a().v());
        String string = resources.getString(R.string.LOCAL_GUIDE_PREFIX);
        int i = djddVar.b;
        String quantityString = resources.getQuantityString(R.plurals.LOCAL_GUIDE_CURRENT_LEVEL, i, Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(quantityString).length());
        sb.append(string);
        sb.append(" · ");
        sb.append(quantityString);
        this.e = sb.toString();
    }

    @Override // defpackage.chmv
    public void RH(cqiv cqivVar) {
        cqivVar.a(new chdc(), this);
    }

    @Override // defpackage.chmf
    public jic c() {
        return this.a;
    }

    @Override // defpackage.chmf
    public String d() {
        return this.d;
    }

    @Override // defpackage.chmf
    public String h() {
        return this.e;
    }

    @Override // defpackage.chmf
    public String i() {
        return this.c.d;
    }

    @Override // defpackage.chmf
    public cjtd j() {
        cjta b = cjtd.b();
        b.g(this.b.d());
        b.d = dtyc.m;
        return b.a();
    }
}
