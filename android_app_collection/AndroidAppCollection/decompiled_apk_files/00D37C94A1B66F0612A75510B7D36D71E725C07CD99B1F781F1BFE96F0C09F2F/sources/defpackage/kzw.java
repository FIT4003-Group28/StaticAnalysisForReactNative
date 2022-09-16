package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kzw  reason: default package */
/* loaded from: classes3.dex */
public final class kzw extends ajsl implements laq {
    private final LayoutInflater a;
    private final ajmy b;
    private final ajrp c;
    private final ViewGroup d;
    private final akem e;
    private boolean f;
    private kzv g;
    private kzv h;

    public kzw(Context context, ajmy ajmyVar, aafo aafoVar, akem akemVar) {
        this.a = LayoutInflater.from(context);
        this.b = ajmyVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setClickable(true);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.c = new ajrp(aafoVar, frameLayout);
        this.e = akemVar;
    }

    private final kzv m() {
        if (this.f) {
            if (this.g == null) {
                this.g = new kzv(this.a.inflate(R.layout.watch_card_hero_one_vs_one_event, this.d, false));
            }
            if (this.e.d()) {
                akem akemVar = this.e;
                ImageView imageView = this.g.i;
                akemVar.c(imageView, akemVar.a(imageView, null));
            } else {
                zav.d(this.g.i, zag.e(this.d.getContext(), 0));
            }
            return this.g;
        }
        if (this.h == null) {
            this.h = new kzv(this.a.inflate(R.layout.watch_card_hero_one_vs_one_event_no_thumbnail, this.d, false));
        }
        return this.h;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        auyx auyxVar = (auyx) obj;
        boolean z = true;
        if (1 != (auyxVar.b & 1)) {
            z = false;
        }
        this.f = z;
        kzv m = m();
        this.d.removeAllViews();
        this.d.addView(m.a);
        ajrp ajrpVar = this.c;
        acti actiVar = ajrsVar.a;
        if ((auyxVar.b & 2) != 0) {
            apzgVar = auyxVar.d;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        if (this.f) {
            ajmy ajmyVar = this.b;
            ImageView imageView = m.i;
            avhn avhnVar = auyxVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            TextView textView = m.h;
            if ((auyxVar.b & 8) != 0) {
                aragVar = auyxVar.f;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            Spanned b = ajgl.b(aragVar);
            if ((auyxVar.b & 8) != 0) {
                aragVar2 = auyxVar.f;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            hqs.p(textView, b, ajgl.i(aragVar2), auyxVar.g, null);
        }
        auyy auyyVar = auyxVar.e;
        if (auyyVar == null) {
            auyyVar = auyy.h();
        }
        pns.k(this, auyyVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auyx) obj).h.I();
    }

    @Override // defpackage.laq
    public final TextView f() {
        return m().g;
    }

    @Override // defpackage.laq
    public final TextView g() {
        return m().d;
    }

    @Override // defpackage.laq
    public final TextView h() {
        return m().e;
    }

    @Override // defpackage.laq
    public final TextView i() {
        return m().f;
    }

    @Override // defpackage.laq
    public final TextView j() {
        return m().b;
    }

    @Override // defpackage.laq
    public final TextView k() {
        return m().c;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.c();
    }
}
