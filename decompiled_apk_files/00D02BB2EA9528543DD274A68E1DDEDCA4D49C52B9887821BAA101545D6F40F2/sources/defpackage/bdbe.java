package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bdbe  reason: default package */
/* loaded from: classes3.dex */
public abstract class bdbe implements bdav {
    static final View.OnAttachStateChangeListener a = new bdbc();
    public final dwfl b;
    public final iys c = new iys();
    public final Toast d;
    public final ckcw e;
    public final cjqq f;
    public final ckmm g;
    public jic h;
    @dzsi
    public ImageView i;
    private final cjtd j;

    public bdbe(dwfl dwflVar, ckqd ckqdVar, int i, Toast toast, @dzsi cqtd cqtdVar, ckcw ckcwVar, cjqq cjqqVar, ckmm ckmmVar) {
        this.b = dwflVar;
        this.d = toast;
        this.e = ckcwVar;
        this.f = cjqqVar;
        this.g = ckmmVar;
        this.h = new jic(dwflVar.h, ckqdVar, cqtdVar, 0, new bdbd(this), null);
        cjta b = cjtd.b();
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        b.i(i);
        b.d = dtxy.fq;
        if ((dwflVar.a & ImageMetadata.LENS_APERTURE) != 0) {
            dpsn dpsnVar = dwflVar.t;
            b.g = decs.a((dpsnVar == null ? dpsn.d : dpsnVar).c);
        }
        this.j = b.a();
    }

    @Override // defpackage.bdav
    public jic b() {
        return this.h;
    }

    @Override // defpackage.bdav
    public jbu c() {
        return this.c;
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return this.j;
    }

    @Override // defpackage.bdar
    public void l() {
    }

    @Override // defpackage.bdar
    public void m() {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }
}
