package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PlaylistHeaderActionBarView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import j$.util.Collection;
/* compiled from: PG */
/* renamed from: jff  reason: default package */
/* loaded from: classes3.dex */
public final class jff implements ynl {
    private final TextView A;
    private final TextView B;
    private final TextView C;
    private final ImageView D;
    private final LinearLayout E;
    private final PlaylistHeaderActionBarView F;
    private final TextView G;
    private final TextView H;
    private final FrameLayout I;
    public final ksj a;
    public final ahce b;
    public final jlj c;
    public final fcg d;
    public final azqb e;
    public final acti f;
    public final aspb g;
    public final String h;
    public final View i;
    public final ImageView j;
    public final ImageView k;
    public final TextView l;
    public final OfflineArrowView m;
    public jli n;
    public agqf o;
    public Boolean p;
    public boolean q;
    public boolean r;
    final akbm s;
    final TextView t;
    final FrameLayout u;
    private final Activity v;
    private final ajmy w;
    private final aadd x;
    private final ImageView y;
    private final TextView z;

    public jff(Activity activity, ajmy ajmyVar, ksj ksjVar, ahce ahceVar, jlj jljVar, fcg fcgVar, azqb azqbVar, aadd aaddVar, akbn akbnVar, acti actiVar, aspb aspbVar, ViewGroup viewGroup, String str, boolean z) {
        FrameLayout frameLayout;
        this.v = activity;
        this.w = ajmyVar;
        this.a = ksjVar;
        this.b = ahceVar;
        this.c = jljVar;
        this.d = fcgVar;
        this.e = azqbVar;
        this.x = aaddVar;
        this.f = actiVar;
        this.g = aspbVar;
        zgh.m(str);
        this.h = str;
        View findViewById = viewGroup.findViewById(R.id.thumbnail_layout);
        this.i = findViewById;
        this.y = findViewById != null ? (ImageView) findViewById.findViewById(R.id.thumbnail) : null;
        this.z = (TextView) viewGroup.findViewById(R.id.playlist_title);
        this.A = (TextView) viewGroup.findViewById(R.id.playlist_channel);
        TextView textView = (TextView) viewGroup.findViewById(R.id.playlist_description);
        this.B = textView;
        this.C = (TextView) viewGroup.findViewById(R.id.playlist_size);
        this.D = (ImageView) viewGroup.findViewById(R.id.private_playlist_indicator);
        this.j = (ImageView) viewGroup.findViewById(R.id.like_button);
        this.k = (ImageView) viewGroup.findViewById(R.id.share_button);
        this.l = (TextView) viewGroup.findViewById(R.id.offline_sync_button);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.playlist_data);
        this.E = linearLayout;
        PlaylistHeaderActionBarView playlistHeaderActionBarView = (PlaylistHeaderActionBarView) viewGroup.findViewById(R.id.actions_bar);
        this.F = playlistHeaderActionBarView;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.playlist_tvshow_metadata);
        this.G = textView2;
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.action_button);
        this.H = textView3;
        FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.footer);
        this.I = frameLayout2;
        this.m = (OfflineArrowView) viewGroup.findViewById(R.id.offline_button);
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.play_button_label);
        this.t = textView4;
        FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.play_button_container);
        this.u = frameLayout3;
        akbm a = akbnVar.a(textView4);
        this.s = a;
        if (z) {
            frameLayout = frameLayout3;
            linearLayout.setPaddingRelative(activity.getResources().getDimensionPixelSize(R.dimen.start_end_padding), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
            g(playlistHeaderActionBarView, R.dimen.playlist_header_action_bar_start_padding_compact);
            g(textView2, R.dimen.start_end_padding);
            g(textView, R.dimen.start_end_padding);
            g(textView3, R.dimen.start_end_padding);
            g(frameLayout2, R.dimen.start_end_padding);
        } else {
            frameLayout = frameLayout3;
        }
        viewGroup.findViewById(R.id.edit_button).setVisibility(8);
        viewGroup.findViewById(R.id.shuffle_button_container).setVisibility(8);
        viewGroup.findViewById(R.id.shuffle_button_label).setVisibility(8);
        linearLayout.setBackground(null);
        aopc aopcVar = (aopc) apoj.a.createBuilder();
        aopc aopcVar2 = (aopc) arhs.a.createBuilder();
        arhr arhrVar = arhr.PLAY_ARROW;
        aopcVar2.copyOnWrite();
        arhs arhsVar = (arhs) aopcVar2.instance;
        arhsVar.c = arhrVar.pS;
        arhsVar.b |= 1;
        aopcVar.copyOnWrite();
        apoj apojVar = (apoj) aopcVar.instance;
        arhs arhsVar2 = (arhs) aopcVar2.mo39build();
        arhsVar2.getClass();
        apojVar.g = arhsVar2;
        apojVar.b |= 32;
        aopcVar.copyOnWrite();
        apoj apojVar2 = (apoj) aopcVar.instance;
        apojVar2.d = 35;
        apojVar2.c = 1;
        arag g = ajgl.g("PLAY");
        aopcVar.copyOnWrite();
        apoj apojVar3 = (apoj) aopcVar.instance;
        g.getClass();
        apojVar3.i = g;
        apojVar3.b |= 256;
        aopa createBuilder = attf.a.createBuilder();
        createBuilder.copyOnWrite();
        attf attfVar = (attf) createBuilder.instance;
        attfVar.b |= 2;
        attfVar.d = str;
        aopc aopcVar3 = (aopc) apzg.a.createBuilder();
        aopcVar3.e(attg.a, (attf) createBuilder.mo39build());
        apzg apzgVar = (apzg) aopcVar3.mo39build();
        aopcVar.copyOnWrite();
        apoj apojVar4 = (apoj) aopcVar.instance;
        apzgVar.getClass();
        apojVar4.o = apzgVar;
        apojVar4.b |= 16384;
        a.b((apoj) aopcVar.mo39build(), actiVar);
        Drawable background = textView4.getBackground();
        textView4.setBackground(null);
        FrameLayout frameLayout4 = frameLayout;
        frameLayout4.setBackground(background);
        frameLayout4.setOnClickListener(new jfc(this, 3));
    }

    private final void g(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(this.v.getResources().getDimensionPixelSize(i));
        }
    }

    public final void a(Boolean bool) {
        this.p = bool;
        jli jliVar = this.n;
        if (jliVar != null) {
            jliVar.d(bool);
        } else {
            zep.b("downloadButtonController is not properly initiated when sync.");
        }
    }

    public final void b(agqf agqfVar) {
        this.r = true;
        this.o = agqfVar;
        zag.m(this.z, agqfVar.b);
        TextView textView = this.A;
        agqa agqaVar = agqfVar.c;
        zag.m(textView, agqaVar == null ? null : agqaVar.b);
        zag.m(this.B, null);
        d();
        ImageView imageView = this.y;
        if (imageView != null && agqfVar.a() != null) {
            this.w.l(agqfVar.a(), yit.c(this.v, new jfe(this, imageView)));
        }
        this.j.setEnabled(true);
        ImageView imageView2 = this.j;
        agqa agqaVar2 = agqfVar.c;
        boolean z = false;
        if (agqaVar2 != null && !agqaVar2.e && !agqfVar.a.startsWith("BL")) {
            z = true;
        }
        zag.o(imageView2, z);
        zag.o(this.k, true ^ agqfVar.i);
        zag.o(this.D, agqfVar.i);
    }

    public final void c(boolean z) {
        this.q = z;
        this.j.setSelected(z);
    }

    public final void d() {
        if (!eog.M(this.x) || this.o.g == 0) {
            TextView textView = this.C;
            Resources resources = this.v.getResources();
            int i = this.o.f;
            textView.setText(resources.getQuantityString(R.plurals.playlist_size, i, Integer.valueOf(i)));
            return;
        }
        this.C.setText(nni.m(this.v.getResources(), this.o.g, (int) Collection.EL.stream(((agrf) this.e.get()).a().i().l(this.h)).filter(gka.l).count()));
    }

    public final void e() {
        jli jliVar = this.n;
        if (jliVar != null) {
            jliVar.a();
        } else {
            zep.b("downloadButtonController is not properly initiated when update.");
        }
        int a = ((agrf) this.e.get()).a().i().a(this.h);
        if (this.l != null) {
            zag.m(this.l, a > 0 ? this.v.getResources().getQuantityString(R.plurals.download_new_videos_button_text, a, Integer.valueOf(a)) : null);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        boolean z = true;
        switch (i) {
            case -1:
                return new Class[]{gae.class, agnl.class, agnm.class, agnn.class, agnp.class, agnq.class, agnr.class, agnz.class, agoa.class};
            case 0:
                gae gaeVar = (gae) obj;
                agqf agqfVar = this.o;
                if (agqfVar == null || !agqfVar.a.equals(gaeVar.b())) {
                    return null;
                }
                if (gaeVar.a() != aspb.LIKE) {
                    z = false;
                }
                c(z);
                return null;
            case 1:
                if (!((agnl) obj).a.equals(this.h)) {
                    return null;
                }
                e();
                return null;
            case 2:
                if (!((agnm) obj).a.equals(this.h)) {
                    return null;
                }
                e();
                return null;
            case 3:
                if (!((agnn) obj).a.equals(this.h)) {
                    return null;
                }
                e();
                return null;
            case 4:
                if (!((agnp) obj).a.d().equals(this.h)) {
                    return null;
                }
                e();
                return null;
            case 5:
                if (!((agnq) obj).a.equals(this.h)) {
                    return null;
                }
                e();
                return null;
            case 6:
                a(null);
                agqg agqgVar = ((agnr) obj).a;
                if (!agqgVar.d().equals(this.h)) {
                    return null;
                }
                b(agqgVar.a);
                e();
                return null;
            case 7:
                agnz agnzVar = (agnz) obj;
                d();
                return null;
            case 8:
                agoa agoaVar = (agoa) obj;
                d();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
