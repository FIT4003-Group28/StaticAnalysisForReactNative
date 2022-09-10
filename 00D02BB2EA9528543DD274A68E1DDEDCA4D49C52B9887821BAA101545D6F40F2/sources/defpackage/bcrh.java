package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bcrh  reason: default package */
/* loaded from: classes3.dex */
public final class bcrh implements bcrs {
    private final bbvn a;
    private final bwqv b;
    private final ff c;
    private final btvo d;
    private final dxio<afha> e;
    @dzsi
    private final ilo f;

    public bcrh(gga ggaVar, bwqv bwqvVar, dxio<afha> dxioVar, bbvn bbvnVar, btvo btvoVar, @dzsi ilo iloVar) {
        this.c = ggaVar;
        this.b = bwqvVar;
        this.e = dxioVar;
        this.a = bbvnVar;
        this.d = btvoVar;
        this.f = iloVar;
    }

    @Override // defpackage.bcrs
    public final void a(dwfl dwflVar) {
        ilo iloVar = this.f;
        if (iloVar == null && (dwflVar.a & ImageMetadata.LENS_APERTURE) != 0) {
            ily ilyVar = new ily();
            dpsn dpsnVar = dwflVar.t;
            if (dpsnVar == null) {
                dpsnVar = dpsn.d;
            }
            ilyVar.j(akqi.j(dpsnVar));
            iloVar = ilyVar.d();
        }
        bdjk.bn(this.c, dwflVar, iloVar, this.b, this.d, this.e, this.a);
    }
}
