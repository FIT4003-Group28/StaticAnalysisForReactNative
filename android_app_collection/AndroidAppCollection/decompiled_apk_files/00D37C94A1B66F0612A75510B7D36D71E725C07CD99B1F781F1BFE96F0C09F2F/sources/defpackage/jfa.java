package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PlaylistHeaderActionBarView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.youtube.R;
import j$.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: jfa  reason: default package */
/* loaded from: classes3.dex */
public final class jfa implements ynl {
    private final TextView A;
    private final ImageView B;
    private final LinearLayout C;
    private final PlaylistHeaderActionBarView D;
    private final TextView E;
    private final TextView F;
    private final FrameLayout G;
    private final FloatingActionButton H;
    private ged I;
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
    private final Activity s;
    private final ajmy t;
    private final gee u;
    private final aadd v;
    private final ImageView w;
    private final TextView x;
    private final TextView y;
    private final TextView z;

    public jfa(Activity activity, ajmy ajmyVar, ksj ksjVar, ahce ahceVar, gee geeVar, jlj jljVar, fcg fcgVar, azqb azqbVar, aadd aaddVar, acti actiVar, aspb aspbVar, ViewGroup viewGroup, String str, boolean z) {
        this.s = activity;
        this.t = ajmyVar;
        this.a = ksjVar;
        this.b = ahceVar;
        this.u = geeVar;
        this.c = jljVar;
        this.d = fcgVar;
        this.e = azqbVar;
        this.v = aaddVar;
        this.f = actiVar;
        this.g = aspbVar;
        zgh.m(str);
        this.h = str;
        View findViewById = viewGroup.findViewById(R.id.thumbnail_layout);
        this.i = findViewById;
        this.w = findViewById != null ? (ImageView) findViewById.findViewById(R.id.thumbnail) : null;
        this.x = (TextView) viewGroup.findViewById(R.id.playlist_title);
        this.y = (TextView) viewGroup.findViewById(R.id.playlist_channel);
        TextView textView = (TextView) viewGroup.findViewById(R.id.playlist_description);
        this.z = textView;
        this.A = (TextView) viewGroup.findViewById(R.id.playlist_size);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.private_playlist_indicator);
        this.B = imageView;
        this.j = (ImageView) viewGroup.findViewById(R.id.like_button);
        this.k = (ImageView) viewGroup.findViewById(R.id.share_button);
        this.l = (TextView) viewGroup.findViewById(R.id.offline_sync_button);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.playlist_data);
        this.C = linearLayout;
        PlaylistHeaderActionBarView playlistHeaderActionBarView = (PlaylistHeaderActionBarView) viewGroup.findViewById(R.id.actions_bar);
        this.D = playlistHeaderActionBarView;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.playlist_tvshow_metadata);
        this.E = textView2;
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.action_button);
        this.F = textView3;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.footer);
        this.G = frameLayout;
        this.m = (OfflineArrowView) viewGroup.findViewById(R.id.offline_button);
        this.H = (FloatingActionButton) viewGroup.findViewById(R.id.playlist_fab);
        if (z) {
            linearLayout.setPaddingRelative(activity.getResources().getDimensionPixelSize(R.dimen.start_end_padding), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
            i(playlistHeaderActionBarView, R.dimen.playlist_header_action_bar_start_padding_compact);
            i(textView2, R.dimen.start_end_padding);
            i(textView, R.dimen.start_end_padding);
            i(textView3, R.dimen.start_end_padding);
            i(frameLayout, R.dimen.start_end_padding);
        }
        viewGroup.findViewById(R.id.edit_button).setVisibility(8);
        viewGroup.findViewById(R.id.shuffle_button).setVisibility(8);
        viewGroup.findViewById(R.id.primary_and_secondary_buttons_container).setVisibility(8);
        linearLayout.setBackground(null);
        imageView.setImageResource(2131232585);
    }

    private final void i(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(this.s.getResources().getDimensionPixelSize(i));
        }
    }

    public final void a() {
        ged gedVar = this.I;
        if (gedVar != null) {
            gedVar.a(null);
        } else {
            zep.b("playlistHeaderFabController is not properly initiated.");
        }
    }

    public final void b(Boolean bool) {
        this.p = bool;
        jli jliVar = this.n;
        if (jliVar != null) {
            jliVar.d(bool);
        } else {
            zep.b("downloadButtonController is not properly initiated when sync.");
        }
    }

    public final void c(agqf agqfVar) {
        this.r = true;
        this.o = agqfVar;
        zag.m(this.x, agqfVar.b);
        TextView textView = this.y;
        agqa agqaVar = agqfVar.c;
        zag.m(textView, agqaVar == null ? null : agqaVar.b);
        zag.m(this.z, null);
        e();
        ImageView imageView = this.w;
        if (imageView != null && agqfVar.a() != null) {
            this.t.l(agqfVar.a(), yit.c(this.s, new jez(this, imageView)));
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
        zag.o(this.B, agqfVar.i);
    }

    public final void d(boolean z) {
        this.q = z;
        this.j.setSelected(z);
    }

    public final void e() {
        if (!eog.M(this.v) || this.o.g == 0) {
            TextView textView = this.A;
            Resources resources = this.s.getResources();
            int i = this.o.f;
            textView.setText(resources.getQuantityString(R.plurals.playlist_size, i, Integer.valueOf(i)));
            return;
        }
        this.A.setText(nni.m(this.s.getResources(), this.o.g, (int) Collection.EL.stream(((agrf) this.e.get()).a().i().l(this.h)).filter(gka.k).count()));
    }

    public final void g() {
        ged a = this.u.a(this.H);
        this.I = a;
        agvv i = ((agrf) this.e.get()).a().i();
        String str = null;
        if (i.l(this.h) != null) {
            Iterator it = i.l(this.h).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                agqv agqvVar = (agqv) it.next();
                if (agqvVar.i() == agqp.PLAYABLE) {
                    str = agqvVar.m();
                    break;
                }
            }
        }
        if (amps.e(str)) {
            a();
            return;
        }
        String str2 = this.h;
        String string = this.s.getString(R.string.accessibility_playlist_play_all);
        str.getClass();
        string.getClass();
        a.a(new fyk(str2, str, string));
    }

    public final void h() {
        jli jliVar = this.n;
        if (jliVar != null) {
            jliVar.a();
        } else {
            zep.b("downloadButtonController is not properly initiated when update.");
        }
        int a = ((agrf) this.e.get()).a().i().a(this.h);
        if (this.l != null) {
            zag.m(this.l, a > 0 ? this.s.getResources().getQuantityString(R.plurals.download_new_videos_button_text, a, Integer.valueOf(a)) : null);
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
                d(z);
                return null;
            case 1:
                if (!((agnl) obj).a.equals(this.h)) {
                    return null;
                }
                h();
                return null;
            case 2:
                if (!((agnm) obj).a.equals(this.h)) {
                    return null;
                }
                h();
                return null;
            case 3:
                if (!((agnn) obj).a.equals(this.h)) {
                    return null;
                }
                h();
                return null;
            case 4:
                if (!((agnp) obj).a.d().equals(this.h)) {
                    return null;
                }
                h();
                return null;
            case 5:
                if (!((agnq) obj).a.equals(this.h)) {
                    return null;
                }
                h();
                return null;
            case 6:
                b(null);
                agqg agqgVar = ((agnr) obj).a;
                if (!agqgVar.d().equals(this.h)) {
                    return null;
                }
                c(agqgVar.a);
                h();
                return null;
            case 7:
                agnz agnzVar = (agnz) obj;
                e();
                g();
                return null;
            case 8:
                agoa agoaVar = (agoa) obj;
                e();
                g();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
