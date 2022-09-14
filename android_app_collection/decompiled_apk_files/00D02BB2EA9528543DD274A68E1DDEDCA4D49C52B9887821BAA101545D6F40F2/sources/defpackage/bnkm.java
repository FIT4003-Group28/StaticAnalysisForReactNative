package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bnkm  reason: default package */
/* loaded from: classes3.dex */
public class bnkm implements bnkl {
    private final gga a;
    private final dxio<afha> b;

    public bnkm(gga ggaVar, dxio<afha> dxioVar) {
        dcqe dcqeVar = cjtd.a;
        this.a = ggaVar;
        this.b = dxioVar;
    }

    @Override // defpackage.bnkl
    public CharSequence a() {
        return this.a.getString(R.string.ABOUT_THIS_DATA_LABEL);
    }

    @Override // defpackage.bnkl
    public CharSequence b() {
        return this.a.getString(R.string.ABOUT_THIS_DATA_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.bnkl
    public cqkl c(cjqm cjqmVar) {
        this.b.a().m("https://support.google.com/local-listings?p=how_google_sources", 1);
        return cqkl.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            return;
        }
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.gS;
        c.a();
    }

    @Override // defpackage.bega
    public void u() {
        dcqe dcqeVar = cjtd.a;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return true;
    }
}
