package defpackage;

import android.view.View;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bngu  reason: default package */
/* loaded from: classes3.dex */
public class bngu implements bner {
    public final cdjj a;
    public final bwrs<ilo> b;
    public final ddho c;
    private final bnem d;

    public bngu(cdjj cdjjVar, bnfp bnfpVar, bwrs<ilo> bwrsVar, ddho ddhoVar) {
        this.a = cdjjVar;
        this.b = bwrsVar;
        this.d = bnfpVar;
        this.c = ddhoVar;
    }

    @Override // defpackage.bner
    public bnem a() {
        return this.d;
    }

    @Override // defpackage.bner
    public View.OnClickListener b() {
        return new View.OnClickListener(this) { // from class: bngt
            private final bngu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bngu bnguVar = this.a;
                cdjj cdjjVar = bnguVar.a;
                bwrs<ilo> bwrsVar = bnguVar.b;
                cdje e = cdjf.e();
                dnqg bZ = dnqh.p.bZ();
                int b = bnguVar.c.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ.b;
                dnqhVar.a |= 64;
                dnqhVar.g = b;
                dnmu dnmuVar = dnmu.PROPERTY_GMM;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar2 = (dnqh) bZ.b;
                dnqhVar2.l = dnmuVar.ap;
                dnqhVar2.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                e.b(bZ.bK());
                cdjjVar.c(bwrsVar, e.a());
            }
        };
    }

    @Override // defpackage.bner
    public cjtd c() {
        return cjtd.a(this.c);
    }
}
