package defpackage;

import android.app.Application;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcbj  reason: default package */
/* loaded from: classes3.dex */
public class bcbj implements bcbf {
    public final bcba a;
    public SpannableStringBuilder b;
    private final jib c;
    private final jic d;
    private final jic e;
    private final String f;
    private final Application g;
    private final dwfl h;
    private final TextWatcher i;

    public bcbj(bcba bcbaVar, bbtw bbtwVar, dwfl dwflVar, @dzsi String str, String str2, Application application) {
        this.g = application;
        this.a = bcbaVar;
        this.h = dwflVar;
        this.f = str2;
        this.d = new jic(dwflVar.h, ckqc.FULLY_QUALIFIED, irg.b(), 250, WebImageView.b, new ckql());
        dwfh dwfhVar = dwflVar.k;
        dnpq dnpqVar = (dwfhVar == null ? dwfh.d : dwfhVar).c;
        this.e = new jic((dnpqVar == null ? dnpq.g : dnpqVar).e, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998, 0);
        jhz jhzVar = new jhz();
        jhzVar.a = application.getString(R.string.EDIT_PHOTO_CAPTION_TITLE);
        jhzVar.u = ibl.b();
        jhzVar.o = cjtd.a(dtxo.v);
        jhzVar.x = false;
        jhzVar.r = 0;
        jhzVar.f(new bcbg(bcbaVar));
        jhm a = jhm.a();
        a.h = 2;
        a.f = cjtd.a(dtxo.x);
        a.d(new bcbi(this));
        int ordinal = bbtwVar.ordinal();
        if (ordinal == 0) {
            a.a = application.getString(R.string.PUBLISH_BUTTON);
            a.b = application.getString(R.string.PUBLISH_BUTTON);
            a.c = iut.a(cqrt.f(2131231742));
        } else if (ordinal == 1) {
            a.a = application.getString(R.string.DONE);
            a.b = application.getString(R.string.DONE);
            a.c = cqrt.f(2131231589);
        }
        jhzVar.c(a.c());
        jhzVar.g = ibl.b();
        this.c = jhzVar.b();
        this.b = new SpannableStringBuilder(str == null ? dwflVar.g : str);
        this.i = new bcbh(this);
    }

    @Override // defpackage.bcbf, defpackage.jbk
    public jib NC() {
        return this.c;
    }

    @Override // defpackage.bcbf
    public jic b() {
        return this.d;
    }

    @Override // defpackage.bcbf
    public CharSequence c() {
        return this.b;
    }

    @Override // defpackage.bcbf
    public String d() {
        return this.f;
    }

    @Override // defpackage.bcbf
    public TextWatcher e() {
        return this.i;
    }

    @Override // defpackage.bcbf
    public Boolean f() {
        dwfh dwfhVar = this.h.k;
        if (dwfhVar == null) {
            dwfhVar = dwfh.d;
        }
        dnpq dnpqVar = dwfhVar.c;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return Boolean.valueOf((dnpqVar.a & 16) != 0);
    }

    @Override // defpackage.bcbf
    public jic g() {
        return this.e;
    }

    @Override // defpackage.bcbf
    public Integer h() {
        return Integer.valueOf(this.b.length());
    }
}
