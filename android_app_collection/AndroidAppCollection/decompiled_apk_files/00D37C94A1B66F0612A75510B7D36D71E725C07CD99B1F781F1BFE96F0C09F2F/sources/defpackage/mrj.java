package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mrj  reason: default package */
/* loaded from: classes3.dex */
public final class mrj implements ajru {
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
    private final gdq q = new gdq() { // from class: mrg
        @Override // defpackage.gdq
        public final void a() {
            mrj mrjVar = mrj.this;
            boolean z = mrjVar.b;
            boolean e = mrjVar.e();
            mrjVar.b = e;
            if (z != e) {
                mrjVar.d();
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
    private Drawable y;
    private Drawable z;

    public mrj(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, jkv jkvVar, akem akemVar, ViewGroup viewGroup) {
        this.c = context;
        this.e = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.playlist_panel_video_item, viewGroup, false);
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
        this.r = akemVar;
        ajmt b = ajmyVar.c().b();
        b.c = new mrh(this);
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

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    public final boolean e() {
        gdr gdrVar = this.v;
        return (gdrVar == null || gdrVar.b() == null || this.w == null) ? this.x : akzj.f(this.v.b(), this.w);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        apmk apmkVar;
        arag aragVar4;
        audk audkVar = ((mri) obj).a;
        acti actiVar = ajrsVar.a;
        aafo aafoVar = (aafo) ajrsVar.c("commandRouter");
        if (aafoVar != null) {
            this.m.a = aafoVar;
        }
        ajrp ajrpVar = this.m;
        atep atepVar = null;
        if ((audkVar.b & 256) != 0) {
            apzgVar = audkVar.m;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, null);
        actiVar.u(new acte(audkVar.r), null);
        TextView textView = this.f;
        if ((audkVar.b & 1) != 0) {
            aragVar = audkVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.h;
        if ((audkVar.b & 16) != 0) {
            aragVar2 = audkVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView2.setText(ajgl.b(aragVar2));
        TextView textView3 = this.h;
        if ((audkVar.b & 16) != 0) {
            aragVar3 = audkVar.g;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        textView3.setContentDescription(ajgl.i(aragVar3));
        this.g.setVisibility(4);
        if ((audkVar.b & 2048) != 0) {
            this.f.setMaxLines(1);
            this.h.setVisibility(8);
            this.p.a(null);
            avhn avhnVar = audkVar.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            if (akel.A(avhnVar)) {
                f();
            } else {
                if (this.t == null) {
                    this.t = (ImageView) ((ViewStub) this.d.findViewById(R.id.unplayable_overlay_stub)).inflate();
                }
                this.t.setVisibility(0);
            }
            if ((audkVar.b & 2048) != 0) {
                aragVar4 = audkVar.n;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
            } else {
                aragVar4 = null;
            }
            Spanned b = ajgl.b(aragVar4);
            if (this.s == null) {
                this.s = (TextView) ((ViewStub) this.d.findViewById(R.id.unplayable_reason_stub)).inflate();
            }
            this.s.setText(b);
            this.s.setVisibility(0);
        } else {
            this.f.setMaxLines(2);
            this.h.setVisibility(0);
            ftc ftcVar = this.p;
            apmg apmgVar = audkVar.p;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            if ((apmgVar.b & 1) != 0) {
                apmg apmgVar2 = audkVar.p;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                apmkVar = apmgVar2.c;
                if (apmkVar == null) {
                    apmkVar = apmk.a;
                }
            } else {
                apmkVar = null;
            }
            ftcVar.a(apmkVar);
            f();
            TextView textView4 = this.s;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        }
        this.v = (gdr) ajrsVar.c("PLAYLIST_CURRENT_VIDEO_MONITOR");
        this.w = audkVar.o;
        this.x = audkVar.k;
        this.b = e();
        d();
        gdr gdrVar = this.v;
        if (gdrVar != null) {
            gdrVar.c(this.q);
        }
        this.a.setBackgroundResource(R.drawable.bg_video_thumb);
        ajmy ajmyVar = this.e;
        ImageView imageView = this.i;
        avhn avhnVar2 = audkVar.f;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        ajmyVar.k(imageView, avhnVar2, this.n);
        this.k.setVisibility(0);
        ajyc ajycVar = this.l;
        ImageView imageView2 = this.k;
        ates atesVar = audkVar.q;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = audkVar.q;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atepVar = atesVar2.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
        }
        ajycVar.d(imageView2, atepVar, audkVar, actiVar);
        avxe avxeVar = audkVar.u;
        if (avxeVar == null) {
            avxeVar = avxe.a;
        }
        if ((avxeVar.b & 1) != 0) {
            avxe avxeVar2 = audkVar.u;
            if (avxeVar2 == null) {
                avxeVar2 = avxe.a;
            }
            ajrsVar.f("VideoPresenterConstants.VIDEO_ID", avxeVar2.c);
            jku jkuVar = this.u;
            if (jkuVar == null) {
                return;
            }
            jkuVar.b(ajrsVar);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        gdr gdrVar = this.v;
        if (gdrVar != null) {
            gdrVar.pe(this.q);
        }
    }

    public final void d() {
        if (!this.b) {
            if (this.r.d()) {
                if (this.z == null) {
                    akej a = akej.a(this.c);
                    a.a = zhn.d(this.c, R.attr.ytTouchResponse);
                    this.z = a.b();
                }
                this.d.setBackground(this.z);
            } else {
                this.d.setBackground(null);
            }
            this.f.setTextColor(zhn.d(this.c, R.attr.ytTextSecondary));
            this.g.setVisibility(4);
            zdk.c(this.i, (int) (this.c.getResources().getFraction(R.fraction.playlist_panel_video_item_thumb_alpha, 1, 1) * 255.0f));
            this.h.setTextColor(zhn.j(this.c, R.attr.ytOverlayTextSecondary).orElse(0));
            zag.o(this.j, false);
            return;
        }
        this.d.setBackgroundColor(zhn.d(this.c, R.attr.ytBadgeChipBackground));
        if (this.r.d()) {
            if (this.y == null) {
                akej a2 = akej.a(this.c);
                a2.a = zhn.d(this.c, R.attr.ytTouchResponse);
                a2.b = this.d.getBackground();
                this.y = a2.b();
            }
            this.d.setBackground(this.y);
        }
        this.f.setTextColor(zhn.d(this.c, R.attr.ytTextPrimary));
        this.g.setVisibility(0);
        zdk.c(this.i, (int) (this.c.getResources().getFraction(R.fraction.playlist_panel_video_item_thumb_selected_alpha, 1, 1) * 255.0f));
        this.h.setTextColor(zhn.j(this.c, R.attr.ytOverlayTextPrimary).orElse(0));
        zag.o(this.j, true);
    }
}
