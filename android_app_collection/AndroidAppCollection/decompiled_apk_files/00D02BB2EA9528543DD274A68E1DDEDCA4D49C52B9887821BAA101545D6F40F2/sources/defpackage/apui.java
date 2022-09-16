package defpackage;

import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: apui  reason: default package */
/* loaded from: classes2.dex */
public final class apui extends bvxb<dbns, dbnu> {
    public final gga a;
    public final bwrs<ilo> b;
    public final btrm c;

    public apui(gga ggaVar, btrm btrmVar, bwrs<ilo> bwrsVar) {
        this.a = ggaVar;
        this.c = btrmVar;
        this.b = bwrsVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rtr.rr";
    }

    @Override // defpackage.bvxb
    protected final /* bridge */ /* synthetic */ dbnu e(dbns dbnsVar) {
        final dbns dbnsVar2 = dbnsVar;
        this.a.runOnUiThread(new Runnable(this, dbnsVar2) { // from class: apug
            private final apui a;
            private final dbns b;

            {
                this.a = this;
                this.b = dbnsVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final apui apuiVar = this.a;
                dbns dbnsVar3 = this.b;
                String str = dbnsVar3.a;
                final String str2 = dbnsVar3.b;
                ilo c = apuiVar.b.c();
                if (c == null || c.bo() == null) {
                    return;
                }
                bwrs<ilo> bwrsVar = apuiVar.b;
                ily g = c.g();
                g.J(str, new dbrn(apuiVar, str2) { // from class: apuh
                    private final apui a;
                    private final String b;

                    {
                        this.a = apuiVar;
                        this.b = str2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        apui apuiVar2 = this.a;
                        String str3 = this.b;
                        docc ca = docg.M.ca((docg) obj);
                        dnth bZ = dnti.k.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dnti dntiVar = (dnti) bZ.b;
                        str3.getClass();
                        dntiVar.a |= 8;
                        dntiVar.e = str3;
                        String string = apuiVar2.a.getString(R.string.TODAY);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dnti dntiVar2 = (dnti) bZ.b;
                        string.getClass();
                        dntiVar2.a |= 1;
                        dntiVar2.b = string;
                        if (ca.c) {
                            ca.bF();
                            ca.c = false;
                        }
                        docg docgVar = (docg) ca.b;
                        dnti bK = bZ.bK();
                        bK.getClass();
                        docgVar.A = bK;
                        docgVar.a |= ImageMetadata.SHADING_MODE;
                        return ca.bK();
                    }
                });
                bwrsVar.d(g.d());
                apuiVar.c.b(new apul(str, str2, apuiVar.a.getString(R.string.TODAY)));
            }
        });
        return dbnu.a;
    }

    @Override // defpackage.bvxb
    protected final /* bridge */ /* synthetic */ dbns j(byte[] bArr) {
        return ((dbnr) dbns.c.bZ().by(bArr)).bK();
    }
}
