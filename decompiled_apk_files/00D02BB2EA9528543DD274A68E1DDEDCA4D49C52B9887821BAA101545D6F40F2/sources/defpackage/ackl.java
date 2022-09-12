package defpackage;

import android.content.res.Resources;
import android.view.View;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ackl  reason: default package */
/* loaded from: classes2.dex */
public class ackl extends actu implements bega {
    public final dxio<bbut> a;
    public bwrs<ilo> b;
    private final btvo c;
    private Boolean e;

    public ackl(Resources resources, cjqy cjqyVar, btvo btvoVar, dxio<bbut> dxioVar) {
        super(resources, btvoVar, cjqyVar);
        this.b = bwrs.a(null);
        this.c = btvoVar;
        this.a = dxioVar;
        this.e = false;
    }

    @dzsi
    private final View.OnClickListener c(@dzsi dwfl dwflVar) {
        return new ackk(this, dwflVar);
    }

    @Override // defpackage.acts, defpackage.actl
    public Boolean a() {
        ilo c = this.b.c();
        boolean z = false;
        if (c != null && c.aX(this.c.getEnableFeatureParameters())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.acts, defpackage.actl
    public Boolean b() {
        return this.e;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        dcdc r;
        this.b = bwrsVar;
        ilo c = bwrsVar.c();
        if (c == null) {
            r = dcdc.e();
        } else {
            r = dcdc.r(c.aF(dweb.IN_STORE));
        }
        int size = r.size();
        r.size();
        dcdc z = dcbg.b(r).x(8).z();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (int i = 0; i < z.size(); i++) {
            dwfl dwflVar = (dwfl) z.get(i);
            arrayList.add(new actt(dwflVar.h, c(dwflVar), dwflVar, i));
        }
        View.OnClickListener onClickListener = null;
        View.OnClickListener c2 = c(null);
        if (a().booleanValue()) {
            onClickListener = new View.OnClickListener(this) { // from class: ackj
                private final ackl a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dwyd dwydVar;
                    ackl acklVar = this.a;
                    ilo c3 = acklVar.b.c();
                    if (c3 != null) {
                        bbut a = acklVar.a.a();
                        bbuz m = bbve.m();
                        m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
                        if (!acklVar.z().booleanValue() || acklVar.j().size() >= 3) {
                            dwydVar = dwyd.PLACE_PAGE;
                        } else {
                            dwydVar = dwyd.PLACE_PAGE_CAROUSEL_ADD_PHOTOS_PROMINENT;
                        }
                        m.e(dwydVar);
                        ((bbsu) m).b = c3;
                        a.j(m.a());
                    }
                }
            };
        }
        super.y(arrayList, c2, onClickListener);
        if (size > arrayList.size()) {
            z2 = true;
        }
        this.e = Boolean.valueOf(z2);
    }

    @Override // defpackage.bega
    public void u() {
        t(bwrs.a(null));
    }

    @Override // defpackage.bega
    public Boolean w() {
        return z();
    }
}
