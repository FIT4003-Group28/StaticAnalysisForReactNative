package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: ckvw  reason: default package */
/* loaded from: classes4.dex */
public final class ckvw extends afhx {
    public static final dbsl<afga> b;
    public final gga a;
    private final afhb c;
    private final btvo d;
    private final dxio<ckcw> e;

    static {
        dcep.E("https://maps.app.goo.gl/1BSsU", "https://maps.app.goo.gl/uGxwU", "https://maps.app.goo.gl/XWPTr", "https://maps.app.goo.gl/CXJZy");
        b = ckvv.a;
    }

    public ckvw(Intent intent, @dzsi String str, afhb afhbVar, gga ggaVar, btvo btvoVar, dxio<ckcw> dxioVar) {
        super(intent, str, afid.ZERO_RATING_ACTIVATION);
        this.c = afhbVar;
        this.a = ggaVar;
        this.d = btvoVar;
        this.e = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        ((ckcn) this.e.a().a(ckkw.a)).a();
        dkyz zeroRatingParameters = this.d.getZeroRatingParameters();
        if (zeroRatingParameters.h.length() <= 0 || zeroRatingParameters.g.length() <= 0 || zeroRatingParameters.k.length() <= 0 || zeroRatingParameters.l.length() <= 0 || zeroRatingParameters.j.length() <= 0 || zeroRatingParameters.i.length() <= 0 || zeroRatingParameters.f.length() <= 0) {
            ((ckcn) this.e.a().a(ckkw.b)).a();
            return;
        }
        Uri data = this.f.getData();
        if (data != null && data.toString().equals("https://maps.app.goo.gl/xuJBc")) {
            ((ckcn) this.e.a().a(ckkw.c)).a();
        }
        this.c.a(this.f).s(new cpcl(this) { // from class: ckvu
            private final ckvw a;

            {
                this.a = this;
            }

            @Override // defpackage.cpcl
            public final void c(Object obj) {
                Uri a;
                ckvw ckvwVar = this.a;
                dept deptVar = (dept) obj;
                if (deptVar == null || (a = deptVar.a()) == null || !a.getBooleanQueryParameter("zra", false)) {
                    return;
                }
                ckvwVar.a.D(new ckvr());
            }
        });
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_ZERO_RATING_ACTIVATION;
    }
}
