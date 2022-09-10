package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: vra  reason: default package */
/* loaded from: classes7.dex */
public abstract class vra implements vqw {
    private static final dcqe c = dcqe.c("vra");
    public final dxio<bsvm> a;
    protected final gga b;
    private final cklf d;
    private final vpd e;
    private final btrm f;
    private final vqy g;
    private final vpc h;
    @dzsi
    private final Runnable i;

    public vra(cklf cklfVar, vpd vpdVar, btrm btrmVar, vqy vqyVar, gga ggaVar, dxio<bsvm> dxioVar, @dzsi Runnable runnable, vpc vpcVar) {
        this.d = cklfVar;
        this.i = runnable;
        this.e = vpdVar;
        this.f = btrmVar;
        this.g = vqyVar;
        this.b = ggaVar;
        this.a = dxioVar;
        this.h = vpcVar;
    }

    @Override // defpackage.vqw
    public cqkl a() {
        this.d.a("license_plate_android");
        return cqkl.a;
    }

    @Override // defpackage.vqw
    public cqkl b() {
        vux vuxVar;
        dowl e = this.g.e();
        this.e.g(this.h, e);
        EnumMap k = dcjz.k(vux.class);
        vpc vpcVar = vpc.JAKARTA;
        int ordinal = this.h.ordinal();
        if (ordinal == 1) {
            vuxVar = vux.AVOID_RODIZIO_AREAS;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                bvoo.h("Santiago license plate restrictions are not enabled in config settings.", new Object[0]);
                return cqkl.a;
            }
            bvoo.h("Scheme is not rotation-based for a rotation license promo.", new Object[0]);
            return cqkl.a;
        } else {
            vuxVar = vux.AVOID_MANILA_NUMBER_CODING_ROADS;
        }
        k.put((EnumMap) vuxVar, (vux) Integer.valueOf(e.t));
        this.f.b(sri.a(k));
        Runnable runnable = this.i;
        if (runnable != null) {
            runnable.run();
        }
        String i = i(e);
        if (i != null) {
            dafk a = ckos.a(this.b.findViewById(16908290), i, 0);
            a.t(R.string.SETTINGS, new View.OnClickListener(this) { // from class: vqz
                private final vra a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.a.a().l();
                }
            });
            a.c();
        }
        return cqkl.a;
    }

    @Override // defpackage.vqw
    public vqy c() {
        return this.g;
    }

    @Override // defpackage.vqw
    public cjtd f() {
        return cjtd.a(dtxx.c);
    }

    @Override // defpackage.vqw
    public cjtd g() {
        return cjtd.a(dtxx.d);
    }

    @Override // defpackage.vqw
    public cjtd h() {
        return cjtd.a(dtxx.b);
    }

    @dzsi
    protected abstract String i(dowl dowlVar);
}
