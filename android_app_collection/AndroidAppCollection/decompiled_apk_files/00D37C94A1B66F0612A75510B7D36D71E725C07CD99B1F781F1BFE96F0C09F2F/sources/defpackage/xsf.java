package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xsf  reason: default package */
/* loaded from: classes4.dex */
public final class xsf implements View.OnLayoutChangeListener, ajru {
    private final xxj a;
    private final ajmy b;
    private final DisplayMetrics c;
    private final View d;
    private final FixedAspectRatioRelativeLayout e;
    private final ImageView f;
    private final boolean g;
    private final ImageView h;
    private apkt i;
    private boolean j;

    public xsf(Context context, ajmy ajmyVar, afts aftsVar, aacz aaczVar, Executor executor) {
        ajmyVar.getClass();
        this.b = ajmyVar;
        this.c = context.getResources().getDisplayMetrics();
        View inflate = View.inflate(context, R.layout.backstage_image, null);
        this.d = inflate;
        this.e = (FixedAspectRatioRelativeLayout) inflate.findViewById(R.id.image_layout);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.image_view);
        this.f = imageView;
        this.h = (ImageView) inflate.findViewById(R.id.backstage_image_badge);
        boolean d = d(aaczVar);
        this.g = d;
        if (d) {
            this.a = new xxj(ajmyVar, aftsVar, imageView, executor);
        } else {
            this.a = null;
        }
    }

    public static boolean d(aacz aaczVar) {
        apyy b = aaczVar.b();
        if (b != null) {
            atfw atfwVar = b.k;
            if (atfwVar == null) {
                atfwVar = atfw.a;
            }
            if ((atfwVar.c & 1048576) == 0) {
                return true;
            }
            atfw atfwVar2 = b.k;
            if (atfwVar2 == null) {
                atfwVar2 = atfw.a;
            }
            apeu apeuVar = atfwVar2.A;
            if (apeuVar == null) {
                apeuVar = apeu.a;
            }
            return apeuVar.b;
        }
        return true;
    }

    private final void e() {
        if (this.i == null || this.f.getWidth() == 0) {
            return;
        }
        xxj xxjVar = this.a;
        avhn avhnVar = this.i.b;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        boolean z = this.j;
        int width = xxjVar.c.getWidth();
        if (width != 0 && avhnVar != null) {
            xxjVar.f = z;
            Uri s = akel.s(avhnVar, width);
            if (xxjVar.c.getWidth() == 0 || s == null || s.toString().isEmpty()) {
                xxjVar.c.setImageDrawable(null);
                xxjVar.e = null;
            } else if (!s.equals(xxjVar.e)) {
                xxjVar.a.m(s, new xxi(xxjVar.c, xxjVar.b, xxjVar.d, xxjVar.f));
                xxjVar.e = s;
            }
        }
        this.f.removeOnLayoutChangeListener(this);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        int i;
        apkt apktVar = (apkt) obj;
        avhn avhnVar = apktVar.b;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        if (!akel.A(avhnVar)) {
            return;
        }
        this.j = false;
        if (ajrsVar.j("postsV2FullThumbnailStyle", false)) {
            this.j = true;
        }
        ajrsVar.a.u(new acte(apktVar.c), null);
        this.i = apktVar;
        this.h.setVisibility(8);
        if (this.j) {
            this.h.setVisibility(0);
        }
        avhn avhnVar2 = apktVar.b;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        avhm u = akel.u(avhnVar2);
        int i2 = u.d;
        if (i2 <= 0 || (i = u.e) <= 0) {
            FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout = this.e;
            fixedAspectRatioRelativeLayout.a = 1.0f;
            fixedAspectRatioRelativeLayout.b(Integer.MAX_VALUE);
            this.e.a(Integer.MAX_VALUE);
            if (this.g) {
                this.a.a();
                return;
            } else {
                this.b.e(this.f);
                return;
            }
        }
        FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout2 = this.e;
        fixedAspectRatioRelativeLayout2.a = i2 / i;
        fixedAspectRatioRelativeLayout2.b(zew.i(this.c, i2));
        this.e.a(zew.i(this.c, u.e));
        if (this.g) {
            this.f.addOnLayoutChangeListener(this);
            e();
            return;
        }
        ajmy ajmyVar = this.b;
        ImageView imageView = this.f;
        avhn avhnVar3 = apktVar.b;
        if (avhnVar3 == null) {
            avhnVar3 = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar3);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        e();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        if (this.g) {
            this.a.a();
            this.f.removeOnLayoutChangeListener(this);
        } else {
            this.b.e(this.f);
        }
        this.i = null;
    }
}
