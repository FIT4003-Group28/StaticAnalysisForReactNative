package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdbd  reason: default package */
/* loaded from: classes3.dex */
final class bdbd implements ckqf {
    final /* synthetic */ bdbe a;
    @dzsi
    private ckcq b;

    public bdbd(bdbe bdbeVar) {
        this.a = bdbeVar;
        this.b = ((ckcr) bdbeVar.e.a(ckdz.S)).a();
    }

    @Override // defpackage.ckqf
    public final void a(ckqg ckqgVar) {
        ckcq ckcqVar = this.b;
        if (ckcqVar != null) {
            ckcqVar.a();
        }
    }

    @Override // defpackage.ckqf
    public final void b(ckqg ckqgVar) {
    }

    @Override // defpackage.ckqf
    public final void c(ckqg ckqgVar) {
        if (this.a.d.getView().getWindowVisibility() != 0) {
            this.a.d.show();
        }
        cjqp g = this.a.f.g();
        cjta b = cjtd.b();
        dwfl dwflVar = this.a.b;
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        b.d = dtxy.cP;
        g.d(b.a());
        this.b = null;
    }

    @Override // defpackage.ckqf
    public final void d(ckqg ckqgVar) {
        ckcq ckcqVar = this.b;
        if (ckcqVar != null) {
            ckcqVar.b();
            this.b = null;
        }
        this.a.c.a(true);
        ckqgVar.setTag(R.id.lightbox_photo_tag, this.a.b);
        ckqgVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        bdbe bdbeVar = this.a;
        bdbeVar.i = ckqgVar;
        jic jicVar = bdbeVar.h;
        bdbeVar.h = new jic(jicVar.a, jicVar.b, null, 0, null, null);
        this.a.g.w(cwsv.a("PhotoLightboxLoadedEvent"));
        cjqp g = this.a.f.g();
        cjta b = cjtd.b();
        dwfl dwflVar = this.a.b;
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        b.d = dtxy.cQ;
        g.d(b.a());
    }
}
