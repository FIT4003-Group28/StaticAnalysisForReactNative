package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mmr  reason: default package */
/* loaded from: classes3.dex */
public final class mmr implements ajru {
    public final aafo a;
    public itu b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final PlaylistThumbnailView g;
    private final View h;
    private final View i;
    private final ImageView j;
    private final TextView k;
    private final ajmy l;
    private final ajyc m;
    private final ajrp n;

    public mmr(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar) {
        ajmyVar.getClass();
        this.l = ajmyVar;
        this.m = ajycVar;
        aafoVar.getClass();
        this.a = aafoVar;
        View inflate = View.inflate(context, R.layout.playlist_feed_entry, null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.author);
        this.f = (TextView) inflate.findViewById(R.id.video_count);
        this.g = (PlaylistThumbnailView) inflate.findViewById(R.id.playlist_thumbnail);
        this.h = inflate.findViewById(R.id.contextual_menu_anchor);
        View findViewById = inflate.findViewById(R.id.feed_entry);
        this.i = findViewById;
        this.j = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.k = (TextView) inflate.findViewById(R.id.feed_text);
        this.n = new ajrp(aafoVar, inflate);
        findViewById.setOnClickListener(new mmq(this));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        avhn avhnVar;
        arag aragVar;
        aueo aueoVar;
        avhn avhnVar2;
        arag aragVar2;
        apzg apzgVar;
        itu ituVar = (itu) obj;
        ajrp ajrpVar = this.n;
        acti actiVar = ajrsVar.a;
        itv a = ituVar.a();
        atep atepVar = null;
        if (a.b == null) {
            audn audnVar = a.a;
            if ((audnVar.b & 32) != 0) {
                apzgVar = audnVar.j;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else {
                apzgVar = null;
            }
            a.b = apzgVar;
        }
        ajrpVar.a(actiVar, a.b, ajrsVar.e());
        if (ituVar.b() != null) {
            ajrsVar.a.u(new acte(ituVar.b()), null);
        }
        aafx.c(this.a, ituVar.a.i, ituVar);
        this.b = ituVar;
        ajmy ajmyVar = this.l;
        ImageView imageView = this.j;
        aqya aqyaVar = ituVar.a;
        if (aqyaVar.c == 1) {
            avhnVar = (avhn) aqyaVar.d;
        } else {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.k;
        if (textView != null) {
            aqya aqyaVar2 = ituVar.a;
            if ((aqyaVar2.b & 8) != 0) {
                aragVar2 = aqyaVar2.f;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView.setText(ajgl.b(aragVar2));
        }
        itv a2 = ituVar.a();
        TextView textView2 = this.d;
        arag aragVar3 = a2.a.d;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar3));
        TextView textView3 = this.e;
        audn audnVar2 = a2.a;
        if ((audnVar2.b & 128) != 0) {
            aragVar = audnVar2.k;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView3.setText(ajgl.b(aragVar));
        TextView textView4 = this.f;
        arag aragVar4 = a2.a.i;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        textView4.setText(ajgl.b(aragVar4));
        this.g.c.setText(String.valueOf(a2.a.h));
        audn audnVar3 = a2.a;
        if ((audnVar3.b & 4) != 0) {
            aueoVar = audnVar3.e;
            if (aueoVar == null) {
                aueoVar = aueo.a;
            }
        } else {
            aueoVar = null;
        }
        if (aueoVar == null) {
            this.g.d(false);
            this.l.h(this.g.b, a2.a.f.size() > 0 ? (avhn) a2.a.f.get(0) : null);
        } else if ((aueoVar.b & 2) == 0) {
            this.g.d(false);
            ajmy ajmyVar2 = this.l;
            ImageView imageView2 = this.g.b;
            if ((aueoVar.b & 1) != 0) {
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
            ajmyVar2.h(imageView2, avhnVar2);
        } else {
            this.g.d(true);
            ajmy ajmyVar3 = this.l;
            ImageView imageView3 = this.g.b;
            auen auenVar = aueoVar.d;
            if (auenVar == null) {
                auenVar = auen.a;
            }
            avhn avhnVar3 = auenVar.b;
            if (avhnVar3 == null) {
                avhnVar3 = avhn.a;
            }
            ajmyVar3.h(imageView3, avhnVar3);
        }
        this.h.setVisibility(0);
        ajyc ajycVar = this.m;
        View view = this.h;
        if (ituVar.a() != null) {
            itv a3 = ituVar.a();
            ates atesVar = a3.a.l;
            if (atesVar == null) {
                atesVar = ates.a;
            }
            if ((atesVar.b & 1) != 0) {
                ates atesVar2 = a3.a.l;
                if (atesVar2 == null) {
                    atesVar2 = ates.a;
                }
                atepVar = atesVar2.c;
                if (atepVar == null) {
                    atepVar = atep.a;
                }
            }
        }
        ajycVar.d(view, atepVar, ituVar, ajrsVar.a);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.n.c();
    }
}
