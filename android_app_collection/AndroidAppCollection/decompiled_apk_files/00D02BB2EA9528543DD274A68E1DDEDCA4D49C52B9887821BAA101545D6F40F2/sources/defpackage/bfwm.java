package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfwm  reason: default package */
/* loaded from: classes3.dex */
public class bfwm implements bfwj {
    public final btvo a;
    private final dxio<aesb> b;
    private final dxio<bbut> c;
    private final Resources d;
    private final cztz e;
    @dzsi
    private bwrs<ilo> f;

    public bfwm(Application application, btvo btvoVar, cztz cztzVar, dxio<bbut> dxioVar, dxio<aesb> dxioVar2) {
        this.d = application.getResources();
        this.b = dxioVar2;
        this.c = dxioVar;
        this.a = btvoVar;
        this.e = cztzVar;
    }

    @Override // defpackage.jbf
    public cqtd d() {
        return cqrt.g(2131231769, ibm.x());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return Boolean.TRUE;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        bwrs<ilo> bwrsVar = this.f;
        if (bwrsVar == null) {
            return cqkl.a;
        }
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        dbsk.s(iloVar);
        if (iloVar.j()) {
            cztq a = cztt.a(this.e);
            a.c = this.d.getString(R.string.OFFLINE_TOAST_TEXT_OFFLINE_PHOTO_UPLOAD_ERROR);
            a.c();
            return cqkl.a;
        }
        this.b.a().D(iloVar, 6, null);
        bbuz m = bbve.m();
        m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
        m.e(dwyd.PLACE_PAGE);
        ((bbsu) m).b = iloVar;
        this.c.a().j(m.a());
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        return cjtd.a(dtxy.iW);
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        return "";
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.d.getText(R.string.UPLOAD_PHOTO_MULTIPLE);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.f = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.f = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return (Boolean) dbsg.j((ilo) bwrs.b(this.f)).h(new dbrn(this) { // from class: bfwl
            private final bfwm a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Boolean.valueOf(((ilo) obj).aX(this.a.a.getEnableFeatureParameters()));
            }
        }).c(false);
    }
}
