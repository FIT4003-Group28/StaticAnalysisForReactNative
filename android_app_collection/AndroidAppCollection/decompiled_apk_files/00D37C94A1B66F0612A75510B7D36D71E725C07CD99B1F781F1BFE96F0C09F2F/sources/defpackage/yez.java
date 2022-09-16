package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yez  reason: default package */
/* loaded from: classes4.dex */
final class yez {
    final TextView a;
    final ImageView b;
    final ImageView c;
    final TextView d;
    final TextView e;
    final View f;
    final View g;
    final TextView h;
    public final int i;
    public final akbm j;
    public final yzo k;
    public int[] l;
    final /* synthetic */ yfa m;

    public yez(yfa yfaVar, int i) {
        this.m = yfaVar;
        this.i = i;
        if (i != 0) {
            this.g = c(R.layout.unlimited_page_header_v2).findViewById(R.id.unlimited_page_header);
        } else {
            this.g = c(R.layout.unlimited_page_header);
        }
        this.b = (ImageView) this.g.findViewById(R.id.promo_background);
        this.c = (ImageView) this.g.findViewById(R.id.promo_logo);
        this.a = (TextView) this.g.findViewById(R.id.promo_header_description);
        TextView textView = (TextView) this.g.findViewById(R.id.subscription_button);
        this.d = textView;
        this.e = (TextView) this.g.findViewById(R.id.metadata);
        View findViewById = this.g.findViewById(R.id.background_scrim);
        this.f = findViewById;
        this.j = yfaVar.e.a(textView);
        this.k = zdk.d(findViewById);
        this.h = (TextView) this.g.findViewById(R.id.promotion_text);
        textView.addOnLayoutChangeListener(akel.a(textView, yfaVar.d.getResources().getDimensionPixelSize(R.dimen.price_icon_size)));
    }

    public static final avhn b(avhu avhuVar, boolean z) {
        if (avhuVar == null) {
            return null;
        }
        avht avhtVar = avhuVar.c;
        if (avhtVar == null) {
            avhtVar = avht.a;
        }
        if (z) {
            avhn avhnVar = avhtVar.d;
            return avhnVar == null ? avhn.a : avhnVar;
        }
        avhn avhnVar2 = avhtVar.c;
        return avhnVar2 == null ? avhn.a : avhnVar2;
    }

    private final View c(int i) {
        return LayoutInflater.from(this.m.d).inflate(i, (ViewGroup) this.m.c, false);
    }

    public final void a(ImageView imageView, avhn avhnVar) {
        if (avhnVar != null) {
            this.m.a.h(imageView, avhnVar);
        } else {
            this.m.a.e(imageView);
        }
    }
}
