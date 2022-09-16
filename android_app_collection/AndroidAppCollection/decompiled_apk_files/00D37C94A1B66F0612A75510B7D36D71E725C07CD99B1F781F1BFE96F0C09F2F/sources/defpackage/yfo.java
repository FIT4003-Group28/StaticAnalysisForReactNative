package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: yfo  reason: default package */
/* loaded from: classes4.dex */
public final class yfo extends ajsl implements View.OnClickListener {
    private final View a;
    private final aafo b;
    private final ajmy c;
    private final aagi d;
    private avwi e;
    private aypg f;

    public yfo(aafo aafoVar, ajmy ajmyVar, aagi aagiVar, ViewStub viewStub) {
        this.b = aafoVar;
        this.c = ajmyVar;
        this.d = aagiVar;
        viewStub.setLayoutResource(R.layout.vc_balance_widget);
        View inflate = viewStub.inflate();
        this.a = inflate;
        inflate.setVisibility(8);
        inflate.setOnClickListener(this);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        avwi avwiVar = (avwi) obj;
        avwiVar.getClass();
        this.e = avwiVar;
        aunb aunbVar = avwiVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apqc apqcVar = (apqc) aunbVar.qm(apqd.a);
        if (apqcVar == null) {
            return;
        }
        ImageView imageView = (ImageView) this.a.findViewById(R.id.image);
        float f = this.a.getContext().getResources().getDisplayMetrics().density;
        zgd.t(imageView, zgd.s((int) (apqcVar.g * f), (int) (apqcVar.f * f)), ViewGroup.LayoutParams.class);
        if (apqcVar.c == 1) {
            this.c.k(imageView, (avhn) apqcVar.d, ajmu.b);
        } else if ((apqcVar.b & 4) == 0) {
            return;
        } else {
            ajmy ajmyVar = this.c;
            avhn avhnVar = apqcVar.e;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.k(imageView, avhnVar, ajmu.b);
        }
        this.a.setVisibility(0);
        TextView textView = (TextView) this.a.findViewById(R.id.amount);
        aypg aypgVar = this.f;
        if (aypgVar != null && !aypgVar.e()) {
            ayqi.c((AtomicReference) this.f);
        }
        this.f = null;
        this.f = this.d.c().h(this.e.c, true).I(noc.t).V(yps.b).k(avwg.class).X(aypa.a()).as(new zwd(textView, 1));
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avwi) obj).f.I();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        avwi avwiVar = this.e;
        if (avwiVar == null || (avwiVar.b & 4) == 0) {
            return;
        }
        aafo aafoVar = this.b;
        apzg apzgVar = avwiVar.e;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, actk.f(this.e));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e = null;
        this.a.setVisibility(8);
    }
}
