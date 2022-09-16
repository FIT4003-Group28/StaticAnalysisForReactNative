package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: kjg  reason: default package */
/* loaded from: classes3.dex */
public final class kjg extends ahyf implements fgd, aibj {
    public Bitmap a;
    private final fer b;
    private final ajmy c;
    private final ajmu d;
    private kjf e;

    public kjg(Context context, ajmy ajmyVar, fer ferVar, aadd aaddVar) {
        super(context);
        this.b = ferVar;
        this.c = ajmyVar;
        ajmt b = ajmu.b.b();
        b.c(false);
        asxp asxpVar = aaddVar.a().e;
        if ((asxpVar == null ? asxp.a : asxpVar).aC) {
            b.e = 2;
        } else {
            asxp asxpVar2 = aaddVar.a().e;
            if ((asxpVar2 == null ? asxp.a : asxpVar2).aD) {
                b.e = 3;
            }
        }
        this.d = b.a();
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundColor(-16777216);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    @Override // defpackage.aibj
    public final void b(Bitmap bitmap) {
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new aizh(-1, -1, false);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        ImageView imageView = (ImageView) view;
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.isRecycled()) {
            ajmy ajmyVar = this.c;
            fer ferVar = this.b;
            ImageView imageView2 = (ImageView) kZ();
            kjf kjfVar = this.e;
            etk.h(ajmyVar, ferVar, imageView2, kjfVar != null ? kjfVar.a : null, kjfVar != null ? kjfVar.b : null, this.d);
            return;
        }
        ((ImageView) kZ()).setImageBitmap(this.a);
    }

    public final void g(kjf kjfVar) {
        Bitmap bitmap = this.a;
        if ((bitmap == null || bitmap.isRecycled()) && !akzj.f(this.e, kjfVar)) {
            this.e = kjfVar;
            X();
        }
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public final ahyk kS(Context context) {
        ahyk kS = super.kS(context);
        kS.a = 0;
        kS.b = 0;
        kS.f = true;
        kS.g = true;
        kS.b();
        kS.a();
        kS.e = false;
        return kS;
    }

    @Override // defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        return !ezxVar.g();
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.e != null;
    }

    @Override // defpackage.aibj
    public final void nC() {
        this.a = null;
        g(null);
    }
}
