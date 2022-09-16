package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmzc  reason: default package */
/* loaded from: classes3.dex */
public class bmzc {
    public final cjqy a;
    public final aesb b;
    public final bbut c;
    private final btvo d;
    private final ff e;

    public bmzc(btvo btvoVar, ff ffVar, cjqy cjqyVar, aesb aesbVar, bbut bbutVar) {
        this.d = btvoVar;
        this.e = ffVar;
        this.a = cjqyVar;
        this.b = aesbVar;
        this.c = bbutVar;
    }

    @dzsi
    public final jho a(@dzsi bwrs<ilo> bwrsVar) {
        final ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null || !iloVar.aX(this.d.getEnableFeatureParameters()) || iloVar.j()) {
            return null;
        }
        jhm jhmVar = new jhm();
        jhmVar.a = this.e.getString(R.string.UPLOAD_PHOTO_MULTIPLE);
        jhmVar.d(new View.OnClickListener(this, iloVar) { // from class: bmzb
            private final bmzc a;
            private final ilo b;

            {
                this.a = this;
                this.b = iloVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bmzc bmzcVar = this.a;
                ilo iloVar2 = this.b;
                ddji bZ = ddjj.c.bZ();
                String bK = iloVar2.bK();
                if (bK != null) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddjj ddjjVar = (ddjj) bZ.b;
                    bK.getClass();
                    ddjjVar.a |= 1;
                    ddjjVar.b = bK;
                }
                cjqy cjqyVar = bmzcVar.a;
                cjta c = cjtd.c(iloVar2.a());
                c.d = dtxy.jQ;
                c.k(bZ.bK());
                cjqyVar.i(c.a());
                bmzcVar.b.D(iloVar2, 6, null);
                bbut bbutVar = bmzcVar.c;
                bbuz m = bbve.m();
                m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
                m.e(dwyd.PLACE_PAGE);
                ((bbsu) m).b = iloVar2;
                bbutVar.j(m.a());
            }
        });
        return jhmVar.c();
    }
}
