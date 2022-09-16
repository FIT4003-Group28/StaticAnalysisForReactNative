package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mja  reason: default package */
/* loaded from: classes3.dex */
public final class mja extends ajsl implements lss, lsx {
    public final aafo a;
    public aupu b;
    private final ViewGroup c;
    private final ImageView d;
    private final View e;
    private final GradientDrawable f;
    private final Context g;
    private final ajmy h;
    private final ajxz i;
    private final YouTubeTextView j;
    private final YouTubeTextView k;
    private final YouTubeTextView l;
    private final ajmu m;
    private final ImageView n;
    private final akfb o;
    private lsy p;
    private boolean q;
    private ColorDrawable r;
    private Drawable s;

    public mja(Context context, ViewGroup viewGroup, ajmy ajmyVar, ajxz ajxzVar, aafo aafoVar, akfb akfbVar, akem akemVar) {
        this.g = context;
        this.h = ajmyVar;
        this.i = ajxzVar;
        this.a = aafoVar;
        this.o = akfbVar;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.drawer_avatar, viewGroup, false);
        this.c = viewGroup2;
        this.d = (ImageView) viewGroup2.findViewById(R.id.channel_avatar);
        this.l = (YouTubeTextView) viewGroup2.findViewById(R.id.channel_avatar_text);
        View findViewById = viewGroup2.findViewById(R.id.channel_status);
        this.e = findViewById;
        this.f = (GradientDrawable) findViewById.getBackground();
        this.j = (YouTubeTextView) viewGroup2.findViewById(R.id.channel_title);
        this.k = (YouTubeTextView) viewGroup2.findViewById(R.id.channel_count);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.selected_avatar_shim);
        this.n = imageView;
        if (this.s == null) {
            Resources resources = context.getResources();
            ColorDrawable colorDrawable = new ColorDrawable(zhn.j(context, R.attr.ytStaticBlue).orElse(0));
            this.s = colorDrawable;
            colorDrawable.setAlpha(resources.getInteger(R.integer.section_list_drawer_selected_avatar_color_alpha));
        }
        imageView.setBackground(this.s);
        ajmt b = ajmyVar.c().b();
        b.b(2131232143);
        this.m = b.a();
        akemVar.b(viewGroup2, akemVar.a(viewGroup2, null));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.lss
    public final void c(aupu aupuVar, boolean z) {
        if (aupuVar == null || !aupuVar.equals(this.b)) {
            return;
        }
        if (!this.q || !z) {
            this.c.setSelected(z);
        }
        g(z);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        avhn avhnVar;
        String str;
        arag aragVar;
        argj argjVar;
        avhn avhnVar2;
        aupu aupuVar = (aupu) obj;
        this.q = ajrsVar.j("SECTION_LIST_DRAWER_COMPACT_MODE", false);
        aupuVar.getClass();
        this.b = aupuVar;
        lst lstVar = (lst) ajrsVar.c("avatar_selection_controller");
        if (lstVar != null) {
            lstVar.a.put(aupuVar, this);
        }
        ajmy ajmyVar = this.h;
        ImageView imageView = this.d;
        if (aupuVar.c == 1) {
            avhnVar = (avhn) aupuVar.d;
        } else {
            avhnVar = avhn.a;
        }
        ajmyVar.k(imageView, avhnVar, this.m);
        this.l.setVisibility(8);
        String str2 = "";
        if (!(aupuVar.c == 2 ? (String) aupuVar.d : str2).isEmpty()) {
            if (aupuVar.c == 1) {
                avhnVar2 = (avhn) aupuVar.d;
            } else {
                avhnVar2 = avhn.a;
            }
            if (!akel.A(avhnVar2)) {
                this.h.e(this.d);
                this.l.setVisibility(0);
                YouTubeTextView youTubeTextView = this.l;
                if (aupuVar.c == 2) {
                    str2 = (String) aupuVar.d;
                }
                youTubeTextView.setText(str2);
                ImageView imageView2 = this.d;
                Context context = this.g;
                if (this.r == null) {
                    this.r = new ColorDrawable(zhn.j(context, R.attr.ytGeneralBackgroundC).orElse(0));
                }
                imageView2.setImageDrawable(this.r);
            }
        }
        g(aupuVar.l);
        ViewGroup viewGroup = this.c;
        aovs aovsVar = aupuVar.k;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        arag aragVar2 = null;
        if ((aovsVar.b & 1) != 0) {
            aovs aovsVar2 = aupuVar.k;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar = aovsVar2.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            str = aovrVar.c;
        } else {
            str = null;
        }
        viewGroup.setContentDescription(str);
        View view = this.e;
        GradientDrawable gradientDrawable = this.f;
        apsx b = apsx.b(aupuVar.g);
        if (b == null) {
            b = apsx.CHANNEL_STATUS_UNKNOWN;
        }
        elk.a(view, gradientDrawable, b, this.g.getResources());
        if (this.q) {
            this.j.setVisibility(8);
            this.k.setVisibility(8);
        } else {
            YouTubeTextView youTubeTextView2 = this.j;
            if ((aupuVar.b & 8) != 0) {
                aragVar = aupuVar.h;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            zag.m(youTubeTextView2, ajgl.b(aragVar));
            YouTubeTextView youTubeTextView3 = this.k;
            if ((aupuVar.b & 16) != 0 && (aragVar2 = aupuVar.i) == null) {
                aragVar2 = arag.a;
            }
            zag.m(youTubeTextView3, ajgl.b(aragVar2));
        }
        this.c.setOnClickListener(new miy(this, ajrsVar, aupuVar));
        lsy lsyVar = (lsy) ajrsVar.c("drawer_expansion_state_controller");
        this.p = lsyVar;
        if (lsyVar != null) {
            lsyVar.b(this);
            f(this.p.a());
        }
        if (!this.q) {
            this.c.setSelected(aupuVar.l);
        }
        aupt auptVar = aupuVar.n;
        if (auptVar == null) {
            auptVar = aupt.a;
        }
        if (auptVar.b == 102716411) {
            akfb akfbVar = this.o;
            aupt auptVar2 = aupuVar.n;
            if (auptVar2 == null) {
                auptVar2 = aupt.a;
            }
            if (auptVar2.b == 102716411) {
                argjVar = (argj) auptVar2.c;
            } else {
                argjVar = argj.a;
            }
            akfbVar.b(argjVar, this.d, aupuVar, ajrsVar.a);
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aupu) obj).j.I();
    }

    @Override // defpackage.lsx
    public final void f(float f) {
        this.j.setAlpha(f);
        this.k.setAlpha(f);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.setOnClickListener(null);
        this.b = null;
        lsy lsyVar = this.p;
        if (lsyVar != null) {
            lsyVar.d(this);
            this.p = null;
        }
    }

    private final void g(boolean z) {
        if (z) {
            aupu aupuVar = this.b;
            if ((aupuVar.b & 2048) != 0) {
                ImageView imageView = this.n;
                ajxz ajxzVar = this.i;
                arhs arhsVar = aupuVar.m;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                imageView.setImageResource(ajxzVar.a(b));
                this.n.setVisibility(0);
                return;
            }
        }
        this.n.setVisibility(8);
    }
}
