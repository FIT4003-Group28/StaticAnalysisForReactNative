package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cdhd  reason: default package */
/* loaded from: classes4.dex */
public final class cdhd extends cdhf {
    private final Bitmap.Config a;
    private final dvlj b;
    private final bbtk c;
    private final bbtt d;
    private final axru e;
    private final dxio<apni> f;

    public cdhd(Bitmap.Config config, dvlj dvljVar, bbtk bbtkVar, bbtt bbttVar, axru axruVar, dxio<apni> dxioVar) {
        this.a = config;
        this.b = dvljVar;
        this.c = bbtkVar;
        this.d = bbttVar;
        this.e = axruVar;
        this.f = dxioVar;
    }

    @Override // defpackage.cdhf
    public final void b(cdhe cdheVar) {
        if (!this.e.a("android.permission.READ_EXTERNAL_STORAGE")) {
            c(cdheVar);
        } else if (this.c.a(cdheVar.a).b().equals(bbti.VIDEO)) {
            if (this.f.a().b()) {
                c(cdheVar);
                return;
            }
            cdheVar.b(cdhg.LOAD_BITMAP_VIDEO_WHILE_VIDEO_SERVER_FLAG_OFF);
            c(cdheVar);
        } else {
            try {
                cdheVar.b = this.d.c(cdheVar.a, this.a, this.b.b);
                if (cdheVar.b == null) {
                    cdheVar.b(cdhg.LOAD_BITMAP_NULL_BITMAP);
                    c(cdheVar);
                    return;
                }
                c(cdheVar);
            } catch (IOException unused) {
                cdheVar.b(cdhg.LOAD_BITMAP_EXCEPTION_LOADING_IMAGE);
                c(cdheVar);
            }
        }
    }
}
