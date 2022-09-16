package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jky  reason: default package */
/* loaded from: classes3.dex */
public final class jky implements ajru, ynl {
    public final PlaylistThumbnailView a;
    public agqf b;
    private final Context c;
    private final yni d;
    private final ajrx e;
    private final ajmy f;
    private final azqb g;
    private final yrj h;
    private final agvq i;
    private final ajyc j;
    private final jml k;
    private final View.OnClickListener l;
    private final View m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final OfflineArrowView q;
    private final jkx r;
    private final View s;

    public jky(Context context, yni yniVar, gem gemVar, ajmy ajmyVar, azqb azqbVar, yrj yrjVar, agvq agvqVar, final aafo aafoVar, ajyc ajycVar, jml jmlVar, ViewGroup viewGroup) {
        this.c = context;
        this.d = yniVar;
        this.e = gemVar;
        this.f = ajmyVar;
        this.g = azqbVar;
        this.h = yrjVar;
        this.i = agvqVar;
        this.j = ajycVar;
        this.k = jmlVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.offline_playlist_item, viewGroup, false);
        this.m = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        textView.getClass();
        this.n = textView;
        textView.setMaxLines(2);
        TextView textView2 = (TextView) inflate.findViewById(R.id.owner);
        textView2.getClass();
        this.o = textView2;
        TextView textView3 = (TextView) inflate.findViewById(R.id.details);
        textView3.getClass();
        this.p = textView3;
        PlaylistThumbnailView playlistThumbnailView = (PlaylistThumbnailView) inflate.findViewById(R.id.playlist_thumbnail);
        playlistThumbnailView.getClass();
        this.a = playlistThumbnailView;
        this.r = new jkx(this);
        this.q = (OfflineArrowView) inflate.findViewById(R.id.offline_arrow);
        this.s = inflate.findViewById(R.id.contextual_menu_anchor);
        gemVar.c(inflate);
        this.l = new View.OnClickListener() { // from class: jkw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jky jkyVar = jky.this;
                aafo aafoVar2 = aafoVar;
                agqf agqfVar = jkyVar.b;
                if (agqfVar != null) {
                    aafoVar2.c(far.a(agqfVar.a), null);
                }
            }
        };
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.e).b;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (!this.b.a.equals(((agnm) obj).a)) {
                    return null;
                }
                d(null);
                return null;
            } else if (i == 1) {
                agqg agqgVar = ((agnp) obj).a;
                if (!this.b.a.equals(agqgVar.a.a)) {
                    return null;
                }
                d(agqgVar);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{agnm.class, agnp.class};
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        agqh e;
        ater aterVar;
        agqf agqfVar = (agqf) obj;
        this.d.g(this);
        this.b = agqfVar;
        agqa agqaVar = agqfVar.c;
        this.n.setText(agqfVar.b);
        zag.m(this.o, agqaVar == null ? null : agqaVar.b);
        this.a.c.setText(Integer.toString(agqfVar.f));
        Uri a = agqfVar.a();
        if (a != null) {
            yyt.b(this.f.b(), a, this.a.b, this.r);
        } else {
            this.a.b.setImageDrawable(null);
        }
        agvv i = ((agrf) this.g.get()).a().i();
        String str = agqfVar.a;
        aopa createBuilder = atep.a.createBuilder();
        if (!amps.e(str) && (e = i.e(str)) != null && (aterVar = (ater) this.k.g(agqh.class, ater.class, e, null)) != null) {
            aopa createBuilder2 = aten.a.createBuilder();
            createBuilder2.copyOnWrite();
            aten atenVar = (aten) createBuilder2.instance;
            atenVar.d = aterVar;
            atenVar.b |= 2;
            createBuilder.aC(createBuilder2);
        }
        this.j.e(this.m, this.s, (atep) createBuilder.mo39build(), agqfVar, ajrsVar.a);
        agqg d = i.d(str);
        if (d != null) {
            d(d);
        }
        this.e.e(ajrsVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.m(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.agqg r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jky.d(agqg):void");
    }
}
