package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: biku  reason: default package */
/* loaded from: classes3.dex */
public class biku implements jbf, bega {
    public final btvo a;
    private final dxio<aesb> b;
    private final dxio<bbut> c;
    private final Resources d;
    private final bfwa e;
    private final cztz f;
    @dzsi
    private bwrs<ilo> g;

    public biku(Application application, btvo btvoVar, bfwa bfwaVar, cztz cztzVar, dxio<bbut> dxioVar, dxio<aesb> dxioVar2) {
        this.d = application.getResources();
        this.b = dxioVar2;
        this.c = dxioVar;
        this.a = btvoVar;
        this.e = bfwaVar;
        this.f = cztzVar;
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
        bwrs<ilo> bwrsVar = this.g;
        if (bwrsVar == null) {
            return cqkl.a;
        }
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        dbsk.s(iloVar);
        if (iloVar.j()) {
            cztq a = cztt.a(this.f);
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
        return cjtd.a(dtxy.he);
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
        this.g = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.g = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        int bl = this.a.getUgcParameters().bl();
        if (bl == 0) {
            throw null;
        }
        if (bl != 3 && !this.e.a()) {
            return (Boolean) dbsg.j((ilo) bwrs.b(this.g)).h(new dbrn(this) { // from class: bikt
                private final biku a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return Boolean.valueOf(((ilo) obj).aX(this.a.a.getEnableFeatureParameters()));
                }
            }).c(false);
        }
        return false;
    }
}
