package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nph  reason: default package */
/* loaded from: classes3.dex */
public final class nph implements nlx {
    public View a;
    public int c;
    public int d;
    public nmn f;
    private final Context g;
    private final ajxz h;
    private final Typeface i;
    private final int j;
    private View k;
    private YouTubeTextView l;
    private YouTubeTextView m;
    private YouTubeTextView n;
    private ImageView o;
    private mnk p;
    private CharSequence q;
    private CharSequence r;
    private CharSequence s;
    private arhs t;
    private apmf u;
    private int v;
    private int w;
    private Typeface z;
    public boolean b = true;
    public int e = R.attr.ytTextAppearanceTitle2;
    private int x = R.attr.ytTextAppearanceTitle2;
    private int y = R.attr.ytTextAppearanceBody1a;

    public nph(Context context, ajxz ajxzVar) {
        this.g = context;
        this.h = ajxzVar;
        this.i = ajgo.YOUTUBE_SANS_BOLD.c(context);
        this.j = zhn.d(context, R.attr.ytTextSecondary);
    }

    private final void s() {
        String str;
        String str2;
        if (!TextUtils.isEmpty(this.q)) {
            String valueOf = String.valueOf(this.q);
            CharSequence charSequence = this.r;
            String str3 = "";
            if (charSequence != null) {
                String valueOf2 = String.valueOf(charSequence);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 2);
                sb.append(". ");
                sb.append(valueOf2);
                str2 = sb.toString();
            } else {
                str2 = str3;
            }
            CharSequence charSequence2 = this.s;
            if (charSequence2 != null) {
                String valueOf3 = String.valueOf(charSequence2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 2);
                sb2.append(". ");
                sb2.append(valueOf3);
                str3 = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb3.append(valueOf);
            sb3.append(str2);
            sb3.append(str3);
            str = sb3.toString();
        } else {
            str = null;
        }
        View view = this.k;
        if (view != null) {
            view.setContentDescription(str);
        }
    }

    private final void t() {
        mnk mnkVar = this.p;
        if (mnkVar == null) {
            return;
        }
        mnkVar.a(TextUtils.isEmpty(this.r) ? null : this.u);
    }

    @Override // defpackage.nlx
    public final View a() {
        return this.a;
    }

    @Override // defpackage.nlx
    public final View b() {
        if (this.k == null) {
            View inflate = LayoutInflater.from(this.g).inflate(R.layout.playlist_engagement_panel_header, (ViewGroup) null);
            this.k = inflate;
            this.l = (YouTubeTextView) inflate.findViewById(R.id.title);
            this.m = (YouTubeTextView) this.k.findViewById(R.id.subtitle);
            this.n = (YouTubeTextView) this.k.findViewById(R.id.position);
            this.o = (ImageView) this.k.findViewById(R.id.icon);
            this.p = new mnk((ImageView) this.k.findViewById(R.id.privacy), this.g);
            j(this.q);
            i(this.r);
            n(this.s);
            m(this.t);
            p(this.u);
            q(this.y, this.v);
            o(this.x, this.w);
        }
        return this.k;
    }

    @Override // defpackage.nlx
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.nlx
    public final void d() {
    }

    @Override // defpackage.nlx
    public final void e(boolean z) {
    }

    @Override // defpackage.nlx
    public final void f(auxr auxrVar) {
    }

    @Override // defpackage.nlx
    public final void g(nma nmaVar) {
    }

    @Override // defpackage.nlx
    public final void h(nly nlyVar) {
    }

    @Override // defpackage.nlx
    public final void i(CharSequence charSequence) {
        this.r = charSequence;
        t();
        YouTubeTextView youTubeTextView = this.m;
        if (youTubeTextView != null) {
            zag.m(youTubeTextView, charSequence);
            s();
        }
        this.z = TextUtils.isEmpty(charSequence) ? null : this.i;
        r();
    }

    @Override // defpackage.nlx
    public final void j(CharSequence charSequence) {
        this.q = charSequence;
        YouTubeTextView youTubeTextView = this.l;
        if (youTubeTextView != null) {
            zag.m(youTubeTextView, charSequence);
            s();
        }
    }

    @Override // defpackage.nlx
    public final boolean k() {
        return this.b;
    }

    @Override // defpackage.nlx
    public final void l(nmn nmnVar) {
        if (this.f == nmnVar) {
            return;
        }
        this.f = nmnVar;
    }

    public final void m(arhs arhsVar) {
        int i;
        this.t = arhsVar;
        if (this.o == null) {
            return;
        }
        boolean z = false;
        if (arhsVar != null) {
            ajxz ajxzVar = this.h;
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            i = ajxzVar.a(b);
        } else {
            i = 0;
        }
        ImageView imageView = this.o;
        if (i != 0) {
            z = true;
        }
        zag.o(imageView, z);
        if (i == 0) {
            return;
        }
        this.o.setImageResource(i);
    }

    public final void n(CharSequence charSequence) {
        this.s = charSequence;
        YouTubeTextView youTubeTextView = this.n;
        if (youTubeTextView != null) {
            zag.m(youTubeTextView, charSequence);
            s();
        }
    }

    public final void o(int i, int i2) {
        this.x = i;
        this.w = i2;
        YouTubeTextView youTubeTextView = this.n;
        if (youTubeTextView != null) {
            Context context = this.g;
            youTubeTextView.setTextAppearance(context, zhn.e(context, i));
            this.n.setTextColor(this.j);
            if (this.w == 0) {
                return;
            }
            kz.r(this.n, this.g.getResources().getDimensionPixelSize(this.w));
        }
    }

    public final void p(apmf apmfVar) {
        this.u = apmfVar;
        t();
    }

    public final void q(int i, int i2) {
        this.y = i;
        this.v = i2;
        YouTubeTextView youTubeTextView = this.m;
        if (youTubeTextView != null) {
            Context context = this.g;
            youTubeTextView.setTextAppearance(context, zhn.e(context, i));
            this.m.setTextColor(this.j);
            if (i2 == 0) {
                return;
            }
            kz.r(this.m, this.g.getResources().getDimensionPixelSize(i2));
        }
    }

    public final void r() {
        YouTubeTextView youTubeTextView = this.l;
        if (youTubeTextView != null) {
            Context context = this.g;
            youTubeTextView.setTextAppearance(context, zhn.e(context, this.e));
            Typeface typeface = this.z;
            if (typeface != null) {
                this.l.setTypeface(typeface);
            }
            if (this.c != 0) {
                this.l.setTextSize(0, this.g.getResources().getDimension(this.c));
            }
            if (this.d == 0) {
                return;
            }
            kz.r(this.l, this.g.getResources().getDimensionPixelSize(this.d));
        }
    }
}
