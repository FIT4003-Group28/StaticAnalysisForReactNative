package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ccdo  reason: default package */
/* loaded from: classes4.dex */
public class ccdo implements ccdn {
    private static final dcdn<drmu, ImageView.ScaleType> a = dcdn.n(drmu.UNKNOWN_IMAGE_HORIZONTAL_ALIGNMENT, ImageView.ScaleType.FIT_START, drmu.START, ImageView.ScaleType.FIT_START, drmu.CENTER, ImageView.ScaleType.FIT_CENTER, drmu.END, ImageView.ScaleType.FIT_END);
    private final dxio<gce> b;
    private final String c;
    private final String d;
    private final jic e;
    private final jic f;
    private final ImageView.ScaleType g;

    public ccdo(dxio<gce> dxioVar, drmv drmvVar) {
        this.b = dxioVar;
        this.c = drmvVar.b;
        this.d = drmvVar.e;
        drnn drnnVar = drmvVar.c;
        drnnVar = drnnVar == null ? drnn.d : drnnVar;
        jic jicVar = new jic(drnnVar.b, ckqc.FULLY_QUALIFIED, 0, 0);
        this.e = jicVar;
        this.f = (drnnVar.a & 2) != 0 ? new jic(drnnVar.c, ckqc.FULLY_QUALIFIED, 0, 0) : jicVar;
        if ((drmvVar.a & 16) == 0) {
            this.g = ImageView.ScaleType.FIT_START;
            return;
        }
        dcdn<drmu, ImageView.ScaleType> dcdnVar = a;
        drmu b = drmu.b(drmvVar.d);
        ImageView.ScaleType scaleType = dcdnVar.get(b == null ? drmu.UNKNOWN_IMAGE_HORIZONTAL_ALIGNMENT : b);
        this.g = scaleType == null ? ImageView.ScaleType.FIT_START : scaleType;
    }

    @Override // defpackage.ccdn
    public String a() {
        return this.c;
    }

    @Override // defpackage.ccdn
    public jic b() {
        return this.b.a().h() ? this.f : this.e;
    }

    @Override // defpackage.ccdn
    public ImageView.ScaleType c() {
        return this.g;
    }

    @Override // defpackage.ccdn
    public String d() {
        return this.d;
    }
}
