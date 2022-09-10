package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfmm  reason: default package */
/* loaded from: classes3.dex */
public class bfmm implements ihz {
    private final dzsj<brba> a;
    private final dcdc<String> b;
    private final String c = "";
    private final String d;
    private cjtd e;

    public bfmm(Resources resources, dzsj<brba> dzsjVar, bwrs<ilo> bwrsVar, dcdc<String> dcdcVar, String str) {
        this.e = cjtd.b;
        this.a = dzsjVar;
        this.b = dcdcVar;
        this.d = resources.getString(R.string.GENERIC_SEE_ALL);
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar != null) {
            cjta c = cjtd.c(iloVar.bZ());
            c.d = dtxl.ae;
            this.e = c.a();
        }
    }

    @Override // defpackage.ihz
    public String b() {
        return this.d;
    }

    @Override // defpackage.ihz
    public cjtd c() {
        return this.e;
    }

    @Override // defpackage.ihz
    public Boolean d() {
        return ihy.a();
    }

    @Override // defpackage.ihz
    public cqtc e() {
        return cquz.a;
    }

    @Override // defpackage.ihz
    public cqkl f(cjqm cjqmVar) {
        String str = this.c;
        dcdc<String> dcdcVar = this.b;
        bray d = braz.d();
        d.b(cjqmVar);
        d.c(true);
        this.a.a().t(str, dcdcVar, d.a());
        return cqkl.a;
    }
}
