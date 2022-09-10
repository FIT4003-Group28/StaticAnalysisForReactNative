package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbik  reason: default package */
/* loaded from: classes3.dex */
public class bbik implements bbhl, bbmb {
    private final gga a;
    private final dcdc<bblz> b;

    public bbik(gga ggaVar, final dxio<bbdv> dxioVar, bbma bbmaVar, final bwrs<ilo> bwrsVar, final bbhm bbhmVar) {
        this.a = ggaVar;
        final bbij bbijVar = new bbij();
        this.b = dcdc.h(bbmaVar.a(ggaVar.getString(R.string.EXEMPLAR_VOTE_NO), e(R.raw.thumbs_down), cjtd.a(dtxo.aX), new Runnable(dxioVar, bwrsVar, bbijVar, bbhmVar) { // from class: bbig
            private final dxio a;
            private final bwrs b;
            private final bbdu c;
            private final bbhm d;

            {
                this.a = dxioVar;
                this.b = bwrsVar;
                this.c = bbijVar;
                this.d = bbhmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dxio dxioVar2 = this.a;
                bwrs bwrsVar2 = this.b;
                bbdu bbduVar = this.c;
                bbhm bbhmVar2 = this.d;
                ilo iloVar = (ilo) bwrsVar2.c();
                dbsk.s(iloVar);
                ((bbdv) dxioVar2.a()).r(iloVar, bbduVar);
                bbhmVar2.c(bbhn.PLACE_DOWN_VOTE, null);
            }
        }), bbmaVar.a(ggaVar.getString(R.string.EXEMPLAR_VOTE_SOMEWHAT), e(R.raw.neutral), cjtd.a(dtxo.aY), new Runnable(dxioVar, bwrsVar, bbijVar, bbhmVar) { // from class: bbih
            private final dxio a;
            private final bwrs b;
            private final bbdu c;
            private final bbhm d;

            {
                this.a = dxioVar;
                this.b = bwrsVar;
                this.c = bbijVar;
                this.d = bbhmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dxio dxioVar2 = this.a;
                bwrs bwrsVar2 = this.b;
                bbdu bbduVar = this.c;
                bbhm bbhmVar2 = this.d;
                ilo iloVar = (ilo) bwrsVar2.c();
                dbsk.s(iloVar);
                ((bbdv) dxioVar2.a()).t(iloVar, bbduVar);
                bbhmVar2.c(bbhn.PLACE_MIDDLE_VOTE, null);
            }
        }), bbmaVar.a(ggaVar.getString(R.string.EXEMPLAR_VOTE_YES), e(R.raw.thumbs_up), cjtd.a(dtxo.aZ), new Runnable(dxioVar, bwrsVar, bbijVar, bbhmVar) { // from class: bbii
            private final dxio a;
            private final bwrs b;
            private final bbdu c;
            private final bbhm d;

            {
                this.a = dxioVar;
                this.b = bwrsVar;
                this.c = bbijVar;
                this.d = bbhmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dxio dxioVar2 = this.a;
                bwrs bwrsVar2 = this.b;
                bbdu bbduVar = this.c;
                bbhm bbhmVar2 = this.d;
                ilo iloVar = (ilo) bwrsVar2.c();
                dbsk.s(iloVar);
                ((bbdv) dxioVar2.a()).s(iloVar, bbduVar);
                bbhmVar2.c(bbhn.PLACE_UP_VOTE, null);
            }
        }));
    }

    private static cqtd e(int i) {
        return cqrt.i(iut.a(iup.e(i)), ibm.x());
    }

    @Override // defpackage.bbmb
    public String a() {
        return this.a.getString(R.string.EXEMPLAR_YOUR_TYPE_OF_PLACE_QUESTION);
    }

    @Override // defpackage.bbmb
    public List<bblz> b() {
        return this.b;
    }

    @Override // defpackage.bbmb
    public cjtd c() {
        return cjtd.a(dtxo.ba);
    }

    @Override // defpackage.bbhl
    public cqix<bbmb> d() {
        return cqgr.fT(new bblq(), this);
    }
}
