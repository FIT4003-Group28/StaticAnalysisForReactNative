package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mmz  reason: default package */
/* loaded from: classes3.dex */
public final class mmz implements ajru {
    private Drawable A;
    private Drawable B;
    private Drawable C;
    private final aacz D;
    public final View a;
    public boolean b;
    private final Context c;
    private final View d;
    private final ajmy e;
    private final TextView f;
    private final ImageView g;
    private final TextView h;
    private final ImageView i;
    private final View j;
    private final ImageView k;
    private final ajyc l;
    private final ajrp m;
    private final ajmu n;
    private final jkv o;
    private final ftc p;
    private final gdq q = new gdq() { // from class: mmw
        @Override // defpackage.gdq
        public final void a() {
            mmz mmzVar = mmz.this;
            boolean z = mmzVar.b;
            boolean e = mmzVar.e();
            mmzVar.b = e;
            if (z != e) {
                mmzVar.d();
            }
        }
    };
    private final akem r;
    private TextView s;
    private ImageView t;
    private jku u;
    private gdr v;
    private String w;
    private boolean x;
    private boolean y;
    private Drawable z;

    public mmz(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, jkv jkvVar, aacz aaczVar, akem akemVar, ViewGroup viewGroup) {
        this.c = context;
        this.e = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.set_bar_video_item, viewGroup, false);
        this.d = inflate;
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.i = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.j = inflate.findViewById(R.id.thumbnail_border);
        this.g = (ImageView) inflate.findViewById(R.id.selected_position_indicator);
        this.h = (TextView) inflate.findViewById(R.id.duration);
        this.s = (TextView) inflate.findViewById(R.id.unplayable_reason);
        this.t = (ImageView) inflate.findViewById(R.id.unplayable_overlay);
        View findViewById = inflate.findViewById(R.id.thumbnail_layout);
        this.a = findViewById;
        this.k = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.l = ajycVar;
        this.o = jkvVar;
        this.D = aaczVar;
        this.r = akemVar;
        ajmt b = ajmyVar.c().b();
        b.c = new mmy(this);
        b.c(false);
        this.n = b.a();
        this.m = new ajrp(aafoVar, inflate);
        this.p = new ftc((ViewStub) inflate.findViewById(R.id.standalone_ypc_badge), 0);
        if (jkvVar != null) {
            ViewStub viewStub = (ViewStub) findViewById.findViewById(R.id.offline_thumbnail_badge);
            this.u = viewStub != null ? jkvVar.a(viewStub, null) : null;
        }
    }

    private final void f() {
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    private final void g() {
        this.g.setVisibility(0);
        Drawable drawable = this.g.getDrawable();
        drawable.setColorFilter(zhn.d(this.c, R.attr.ytIconActiveOther), PorterDuff.Mode.SRC_ATOP);
        this.g.setImageDrawable(drawable);
        zdk.c(this.i, (int) (this.c.getResources().getFraction(R.dimen.set_bar_video_item_thumb_selected_alpha, 1, 1) * 255.0f));
        this.h.setTextColor(zhn.j(this.c, R.attr.ytOverlayTextPrimary).orElse(0));
        zag.o(this.j, true);
    }

    private final void h() {
        this.g.setVisibility(4);
        zdk.c(this.i, (int) (this.c.getResources().getFraction(R.dimen.set_bar_video_item_thumb_alpha, 1, 1) * 255.0f));
        this.h.setTextColor(zhn.j(this.c, R.attr.ytOverlayTextSecondary).orElse(0));
        zag.o(this.j, false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    public final boolean e() {
        gdr gdrVar = this.v;
        return (gdrVar == null || gdrVar.b() == null || this.w == null) ? this.x : akzj.f(this.v.b(), this.w);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d9  */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mmz.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        gdr gdrVar = this.v;
        if (gdrVar != null) {
            gdrVar.pe(this.q);
        }
    }

    public final void d() {
        if (this.y) {
            if (!this.b) {
                this.d.setBackgroundColor(zhn.d(this.c, R.attr.ytGeneralBackgroundA));
                if (this.r.d()) {
                    if (this.C == null) {
                        akej a = akej.a(this.c);
                        a.b = this.d.getBackground();
                        this.C = a.b();
                    }
                    this.d.setBackground(this.C);
                }
                this.f.setTextColor(zhn.d(this.c, R.attr.ytTextSecondary));
                h();
                return;
            }
            this.d.setBackgroundColor(zhn.d(this.c, R.attr.ytGeneralBackgroundB));
            if (this.r.d()) {
                if (this.B == null) {
                    akej a2 = akej.a(this.c);
                    a2.b = this.d.getBackground();
                    this.B = a2.b();
                }
                this.d.setBackground(this.B);
            }
            this.f.setTextColor(zhn.d(this.c, R.attr.ytTextPrimary));
            g();
        } else if (!this.b) {
            if (this.r.d()) {
                if (this.A == null) {
                    akej a3 = akej.a(this.c);
                    a3.a = -1;
                    this.A = a3.b();
                }
                this.d.setBackground(this.A);
            } else {
                this.d.setBackgroundResource(R.drawable.bg_set_row);
            }
            this.f.setTextColor(ake.d(this.c, R.color.yt_grey2));
            h();
        } else {
            this.d.setBackgroundResource(R.drawable.bg_set_row_selected);
            if (this.r.d()) {
                if (this.z == null) {
                    akej a4 = akej.a(this.c);
                    a4.a = -1;
                    a4.b = this.d.getBackground();
                    this.z = a4.b();
                }
                this.d.setBackground(this.z);
            }
            this.f.setTextColor(ake.d(this.c, R.color.yt_white1));
            g();
        }
    }
}
