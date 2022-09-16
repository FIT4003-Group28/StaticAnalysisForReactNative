package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bcnr  reason: default package */
/* loaded from: classes3.dex */
public final class bcnr implements ckqf {
    @dzsi
    ckcq a = null;
    final /* synthetic */ bcnv b;

    public bcnr(bcnv bcnvVar) {
        this.b = bcnvVar;
    }

    @Override // defpackage.ckqf
    public final void a(ckqg ckqgVar) {
        cqkp i = cqkx.i(ckqgVar);
        if (!(i instanceof bcnv)) {
            return;
        }
        this.a = ((ckcr) ((bcnv) i).d.a(ckdz.R)).a();
    }

    @Override // defpackage.ckqf
    public final void b(ckqg ckqgVar) {
    }

    @Override // defpackage.ckqf
    public final void c(ckqg ckqgVar) {
        cqkp i = cqkx.i(ckqgVar);
        if (!(i instanceof bcnv)) {
            return;
        }
        bcnv bcnvVar = (bcnv) i;
        bcle bcleVar = bcnvVar.e;
        if (bcleVar != null) {
            bclf.c(((bclf) bcleVar).c);
        }
        dwfl dwflVar = bcnvVar.k;
        if (bcnvVar.f == null || dwflVar == null) {
            return;
        }
        int i2 = dwflVar.a;
        if ((i2 & 1) == 0 || (i2 & 2) == 0) {
            return;
        }
        cjqp g = bcnvVar.g.g();
        cjta b = cjtd.b();
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        b.d = dtxy.cP;
        g.d(b.a());
    }

    @Override // defpackage.ckqf
    public final void d(ckqg ckqgVar) {
        cqkp i = cqkx.i(ckqgVar);
        if (!(i instanceof bcnv)) {
            return;
        }
        bcnv bcnvVar = (bcnv) i;
        ckcq ckcqVar = this.a;
        if (ckcqVar != null) {
            ckcqVar.b();
            this.a = null;
        }
        this.b.i.w(cwsv.a("PhotoGalleryThumbnailLoadedEvent"));
        dwfl dwflVar = bcnvVar.k;
        cjqq cjqqVar = bcnvVar.g;
        if (cjqqVar != null && dwflVar != null) {
            int i2 = dwflVar.a;
            if ((i2 & 1) != 0 && (i2 & 2) != 0) {
                cjqp g = cjqqVar.g();
                cjta b = cjtd.b();
                b.b = dwflVar.b;
                b.g(dwflVar.c);
                b.d = dtxy.cQ;
                g.d(b.a());
            }
        }
        int i3 = bcnvVar.l;
        StringBuilder sb = new StringBuilder(32);
        sb.append("photoGalleryThumbnail");
        sb.append(i3);
        ckqgVar.setTag(R.id.photo_gallery_photo_tag, sb.toString());
    }
}
