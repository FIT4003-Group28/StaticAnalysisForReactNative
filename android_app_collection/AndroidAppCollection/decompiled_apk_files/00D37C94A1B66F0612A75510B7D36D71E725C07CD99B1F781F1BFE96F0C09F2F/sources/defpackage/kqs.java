package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: kqs  reason: default package */
/* loaded from: classes3.dex */
public abstract class kqs implements ajru {
    static final arhr a = arhr.UNKNOWN;
    public final Context b;
    public final jkv c;
    public final View d;
    public final TextView e;
    protected final TextView f;
    protected final TextView g;
    public final PlaylistThumbnailView h;
    public final ImageView i;
    public final ViewStub j;
    public final ftb k;
    public final ViewStub l;
    public fta m;
    public jku n;
    private final ajmy o;
    private final ajyc p;
    private final TextView q;
    private final ajxz r;
    private final ImageView s;

    public kqs(Context context, ajmy ajmyVar, ajyc ajycVar, int i, ajxz ajxzVar) {
        this(context, ajmyVar, ajycVar, i, ajxzVar, null, null, null);
    }

    public static final boolean m(List list) {
        return list != null && !list.isEmpty();
    }

    public final void d(CharSequence charSequence) {
        zag.m(this.f, charSequence);
    }

    public final void e(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f.setSingleLine(false);
            this.f.setMaxLines(2);
            zag.m(this.f, charSequence);
        } else if (!TextUtils.isEmpty(charSequence2)) {
            this.f.setSingleLine(true);
            zag.m(this.f, charSequence2);
        } else {
            this.f.setVisibility(8);
        }
    }

    public final void f(View view, ates atesVar, Object obj, acti actiVar) {
        atep atepVar;
        ajyc ajycVar = this.p;
        ImageView imageView = this.i;
        if (atesVar == null || (atesVar.b & 1) == 0) {
            atepVar = null;
        } else {
            atep atepVar2 = atesVar.c;
            if (atepVar2 == null) {
                atepVar2 = atep.a;
            }
            atepVar = atepVar2;
        }
        ajycVar.e(view, imageView, atepVar, obj, actiVar);
    }

    public final void g(avhn avhnVar) {
        this.h.d(akel.B(avhnVar));
        this.o.h(this.h.b, avhnVar);
    }

    public final void i(List list) {
        arhr arhrVar;
        int i;
        arhr arhrVar2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            avhc avhcVar = (avhc) it.next();
            int i2 = avhcVar.b;
            if ((i2 & 256) != 0) {
                avhb avhbVar = avhcVar.g;
                if (avhbVar == null) {
                    avhbVar = avhb.a;
                }
                YouTubeTextView youTubeTextView = this.h.c;
                arag aragVar = avhbVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                Spanned b = ajgl.b(aragVar);
                zag.m(youTubeTextView, b);
                int b2 = (avhbVar.b & 1) != 0 ? zgh.b(b.toString(), 0) : 0;
                youTubeTextView.setContentDescription(this.b.getResources().getQuantityString(R.plurals.video_count, b2, Integer.valueOf(b2)));
                if ((avhbVar.b & 2) != 0) {
                    arhs arhsVar = avhbVar.d;
                    if (arhsVar == null) {
                        arhsVar = arhs.a;
                    }
                    arhrVar = arhr.b(arhsVar.c);
                    if (arhrVar == null) {
                        arhrVar = arhr.UNKNOWN;
                    }
                } else {
                    arhrVar = a;
                }
                this.h.b(this.r.a(arhrVar));
                this.h.e(true);
                TextView textView = this.q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if ((i2 & 2) != 0) {
                avgs avgsVar = avhcVar.d;
                if (avgsVar == null) {
                    avgsVar = avgs.a;
                }
                this.h.e(false);
                arag aragVar2 = avgsVar.c;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                Spanned b3 = ajgl.b(aragVar2);
                if (this.q != null && !TextUtils.isEmpty(b3)) {
                    this.q.setVisibility(0);
                    this.q.setText(b3);
                    this.q.setContentDescription(b3);
                }
                int i3 = avgsVar.b;
                if ((i3 & 1) != 0 && (i = i3 & 2) != 0) {
                    if (i != 0) {
                        arhs arhsVar2 = avgsVar.d;
                        if (arhsVar2 == null) {
                            arhsVar2 = arhs.a;
                        }
                        arhrVar2 = arhr.b(arhsVar2.c);
                        if (arhrVar2 == null) {
                            arhrVar2 = arhr.UNKNOWN;
                        }
                    } else {
                        arhrVar2 = a;
                    }
                    int a2 = this.r.a(arhrVar2);
                    if (a2 != 0) {
                        this.s.setImageDrawable(this.b.getResources().getDrawable(a2));
                    }
                }
            }
        }
    }

    public final void j(CharSequence charSequence, CharSequence charSequence2) {
        YouTubeTextView youTubeTextView = this.h.c;
        zag.m(youTubeTextView, charSequence);
        youTubeTextView.setContentDescription(charSequence2);
    }

    public final void k(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public final void l(CharSequence charSequence) {
        this.g.setText(charSequence);
    }

    @Override // defpackage.ajru
    public void qZ(ajsa ajsaVar) {
        jku jkuVar = this.n;
        if (jkuVar != null) {
            jkuVar.a();
        }
    }

    public kqs(Context context, ajmy ajmyVar, ajyc ajycVar, int i, ajxz ajxzVar, ViewGroup viewGroup, jkv jkvVar, ftb ftbVar) {
        this.b = context;
        ajmyVar.getClass();
        this.o = ajmyVar;
        this.p = ajycVar;
        this.r = ajxzVar;
        this.c = jkvVar;
        this.k = ftbVar;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.d = inflate;
        this.e = (TextView) inflate.findViewById(R.id.title);
        this.f = (TextView) inflate.findViewById(R.id.owner);
        this.g = (TextView) inflate.findViewById(R.id.video_count);
        this.q = (TextView) inflate.findViewById(R.id.bottom_panel_overlay_text);
        this.h = (PlaylistThumbnailView) inflate.findViewById(R.id.playlist_thumbnail);
        this.i = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.j = (ViewStub) inflate.findViewById(R.id.offline_badge);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.metadata_badge);
        this.l = viewStub;
        this.s = (ImageView) inflate.findViewById(R.id.bottom_panel_overlay_icon);
        if (viewStub == null || ftbVar == null) {
            return;
        }
        this.m = ftbVar.b(context, viewStub);
    }

    public final void h(aueo aueoVar, avhn avhnVar) {
        avhn avhnVar2;
        if (aueoVar == null) {
            this.h.d(false);
            this.o.h(this.h.b, avhnVar);
        } else if ((aueoVar.b & 2) == 0) {
            this.h.d(false);
            ajmy ajmyVar = this.o;
            ImageView imageView = this.h.b;
            if ((1 & aueoVar.b) != 0) {
                auep auepVar = aueoVar.c;
                if (auepVar == null) {
                    auepVar = auep.a;
                }
                avhnVar2 = auepVar.c;
                if (avhnVar2 == null) {
                    avhnVar2 = avhn.a;
                }
            } else {
                avhnVar2 = null;
            }
            ajmyVar.h(imageView, avhnVar2);
        } else {
            this.h.d(true);
            ajmy ajmyVar2 = this.o;
            ImageView imageView2 = this.h.b;
            auen auenVar = aueoVar.d;
            if (auenVar == null) {
                auenVar = auen.a;
            }
            avhn avhnVar3 = auenVar.b;
            if (avhnVar3 == null) {
                avhnVar3 = avhn.a;
            }
            ajmyVar2.h(imageView2, avhnVar3);
        }
    }
}
