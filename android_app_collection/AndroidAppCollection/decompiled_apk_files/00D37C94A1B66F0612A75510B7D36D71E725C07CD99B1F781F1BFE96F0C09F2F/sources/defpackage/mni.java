package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mni  reason: default package */
/* loaded from: classes3.dex */
public final class mni implements View.OnClickListener, ajru {
    final View a;
    final ImageView b;
    private final Context c;
    private final ajmy d;
    private final aafo e;
    private final acti f;
    private augd g;

    public mni(Context context, ajmy ajmyVar, aafo aafoVar, acth acthVar) {
        this.c = context;
        this.d = ajmyVar;
        this.e = aafoVar;
        this.f = acthVar.oi();
        View inflate = LayoutInflater.from(context).inflate(R.layout.poster, (ViewGroup) null);
        this.a = inflate;
        inflate.setLayoutParams(new FrameLayout.LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.poster_art_width_default), -2));
        inflate.setOnClickListener(this);
        this.b = (ImageView) inflate.findViewById(R.id.poster_image);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        augd augdVar = (augd) obj;
        this.g = augdVar;
        this.f.u(new acte(augdVar.f), null);
        ajmy ajmyVar = this.d;
        ImageView imageView = this.b;
        avhn avhnVar = augdVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        ImageView imageView2 = this.b;
        avhn avhnVar2 = augdVar.c;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        imageView2.setContentDescription(hve.k(avhnVar2));
        Resources resources = this.c.getResources();
        int i = -1;
        if ((augdVar.b & 4) != 0) {
            auge augeVar = augdVar.e;
            if (augeVar == null) {
                augeVar = auge.a;
            }
            int cd = awwc.cd(augeVar.b);
            if (cd == 0) {
                cd = 1;
            }
            int i2 = cd - 1;
            if (i2 == 0) {
                i = resources.getDimensionPixelSize(R.dimen.poster_art_width_default);
            } else if (i2 == 1) {
                i = resources.getDimensionPixelSize(R.dimen.poster_art_width_large);
            }
        } else {
            i = resources.getDimensionPixelSize(R.dimen.poster_art_width_default);
        }
        if (i > 0) {
            this.a.getLayoutParams().width = i;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        augd augdVar = this.g;
        if (augdVar == null) {
            return;
        }
        if ((augdVar.b & 32) != 0) {
            this.f.H(3, new acte(augdVar.f.I()), null);
        }
        augd augdVar2 = this.g;
        if ((augdVar2.b & 2) == 0) {
            return;
        }
        aafo aafoVar = this.e;
        apzg apzgVar = augdVar2.d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, null);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.g = null;
    }
}
