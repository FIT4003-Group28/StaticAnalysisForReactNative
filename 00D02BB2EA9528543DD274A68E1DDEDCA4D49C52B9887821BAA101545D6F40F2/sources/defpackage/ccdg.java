package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ccdg  reason: default package */
/* loaded from: classes4.dex */
public class ccdg implements ccdf {
    private static final dcdn<drmq, ImageView.ScaleType> a = dcdn.n(drmq.UNKNOWN_IMAGE_HORIZONTAL_ALIGNMENT, ImageView.ScaleType.FIT_START, drmq.START, ImageView.ScaleType.FIT_START, drmq.CENTER, ImageView.ScaleType.FIT_CENTER, drmq.END, ImageView.ScaleType.FIT_END);
    private final dxio<gce> b;
    private final String c;
    private final String d;
    private final String e;
    private final jic f;
    private final jic g;
    private final ImageView.ScaleType h;
    private final Boolean i;

    public ccdg(dxio<gce> dxioVar, drmr drmrVar) {
        this.b = dxioVar;
        this.c = drmrVar.b;
        this.d = drmrVar.c;
        this.e = drmrVar.g;
        drnn drnnVar = drmrVar.e;
        boolean z = false;
        jic jicVar = new jic((drnnVar == null ? drnn.d : drnnVar).b, ckqc.FULLY_QUALIFIED, 0, 0);
        this.f = jicVar;
        drnn drnnVar2 = drmrVar.e;
        if (((drnnVar2 == null ? drnn.d : drnnVar2).a & 2) != 0) {
            drnn drnnVar3 = drmrVar.e;
            jicVar = new jic((drnnVar3 == null ? drnn.d : drnnVar3).c, ckqc.FULLY_QUALIFIED, 0, 0);
        }
        this.g = jicVar;
        dcdn<drmq, ImageView.ScaleType> dcdnVar = a;
        drmq b = drmq.b(drmrVar.f);
        ImageView.ScaleType scaleType = dcdnVar.get(b == null ? drmq.UNKNOWN_IMAGE_HORIZONTAL_ALIGNMENT : b);
        this.h = scaleType == null ? ImageView.ScaleType.FIT_START : scaleType;
        int a2 = drmo.a(drmrVar.d);
        this.i = Boolean.valueOf((a2 == 0 || a2 != 3) ? true : z);
    }

    @Override // defpackage.ccdf
    public String a() {
        return this.c;
    }

    @Override // defpackage.ccdf
    public String b() {
        return this.d;
    }

    @Override // defpackage.ccdf
    public jic c() {
        return this.b.a().h() ? this.g : this.f;
    }

    @Override // defpackage.ccdf
    public ImageView.ScaleType d() {
        return this.h;
    }

    @Override // defpackage.ccdf
    public String e() {
        return this.e;
    }

    @Override // defpackage.ccdf
    public Boolean f() {
        return this.i;
    }
}
