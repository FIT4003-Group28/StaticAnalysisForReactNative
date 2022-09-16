package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fjs  reason: default package */
/* loaded from: classes3.dex */
public final class fjs extends fjq {
    public fjp d;
    private final ImageView e;

    public fjs(View view, ajmy ajmyVar, fjp fjpVar) {
        super(view, ajmyVar, fjpVar);
        view.setVisibility(8);
        this.e = (ImageView) view.findViewById(R.id.image);
        view.setOnClickListener(new View.OnClickListener() { // from class: fjr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fjp fjpVar2;
                fjs fjsVar = fjs.this;
                Object obj = fjsVar.c;
                if (obj != null) {
                    apau apauVar = (apau) obj;
                    if ((apauVar.b & 4) == 0 || (fjpVar2 = fjsVar.d) == null) {
                        return;
                    }
                    apzg apzgVar = apauVar.e;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    fjpVar2.a(obj, amuk.r(apzgVar));
                }
            }
        });
        h();
    }

    private final void h() {
        Object obj = this.c;
        boolean z = false;
        if (obj != null && (((apau) obj).b & 4) != 0 && this.d != null) {
            z = true;
        }
        e(z);
    }

    public final void a(apau apauVar, acti actiVar) {
        if (actiVar != null) {
            actiVar.u(new acte(apauVar.g), null);
        }
        this.c = apauVar;
        this.a.setVisibility(0);
        if ((apauVar.b & 2) == 0) {
            this.a.setVisibility(8);
            return;
        }
        ajmy ajmyVar = this.b;
        ImageView imageView = this.e;
        avhn avhnVar = apauVar.d;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.k(imageView, avhnVar, f(2131232485));
        if (this.e.getBackground() != null && (this.e.getBackground().getCurrent() instanceof GradientDrawable)) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.e.getBackground().getCurrent().mutate();
            gradientDrawable.setColor(apauVar.c);
            this.e.setBackground(gradientDrawable);
        }
        h();
    }

    @Override // defpackage.fjq
    public final void b(fjp fjpVar) {
        this.d = fjpVar;
        h();
    }

    @Override // defpackage.fjq
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    @Override // defpackage.fjq
    public final void d() {
        super.d();
        this.e.setImageDrawable(null);
    }

    public final void g(apau apauVar, acti actiVar, aafo aafoVar) {
        if ((apauVar.b & 8) != 0) {
            apzg apzgVar = apauVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
        a(apauVar, actiVar);
    }
}
