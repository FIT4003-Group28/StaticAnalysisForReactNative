package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import com.google.protos.youtube.api.innertube.SharePlaylistEndpointOuterClass$SharePlaylistEndpoint;
/* compiled from: PG */
/* renamed from: lrp  reason: default package */
/* loaded from: classes3.dex */
public final class lrp implements ynl {
    private TextView A;
    private TextView B;
    private boolean C;
    public final Activity a;
    public final String b;
    public final View c;
    public final acti d;
    public SwitchCompat e;
    public TextView f;
    public View g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public gga l;
    public TextView m;
    public gga n;
    public AlertDialog o;
    public boolean p;
    public ajsm q;
    public audx r;
    private final aafo s;
    private final ajsg t;
    private final ggb u;
    private final ajmy v;
    private final float w;
    private RecyclerView x;
    private View y;
    private View z;

    public lrp(Activity activity, aafo aafoVar, ajsg ajsgVar, String str, View view, ggb ggbVar, ajmy ajmyVar, acti actiVar) {
        activity.getClass();
        this.a = activity;
        aafoVar.getClass();
        this.s = aafoVar;
        ajsgVar.getClass();
        this.t = ajsgVar;
        str.getClass();
        this.b = str;
        view.getClass();
        this.c = view;
        ajmyVar.getClass();
        this.v = ajmyVar;
        actiVar.getClass();
        this.d = actiVar;
        ggbVar.getClass();
        this.u = ggbVar;
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(16842803, typedValue, true);
        this.w = typedValue.getFloat();
    }

    public final void a() {
        apzg apzgVar;
        if (this.r == null) {
            return;
        }
        e(3);
        this.j.setText(this.a.getString(R.string.collab_playlist_link_loading));
        aafo aafoVar = this.s;
        audv audvVar = this.r.g;
        if (audvVar == null) {
            audvVar = audv.a;
        }
        apoj apojVar = audvVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 8192) != 0) {
            audv audvVar2 = this.r.g;
            if (audvVar2 == null) {
                audvVar2 = audv.a;
            }
            apoj apojVar2 = audvVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            apzgVar = apojVar2.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        aafoVar.c(apzgVar, null);
    }

    public final void b() {
        if (this.C) {
            return;
        }
        this.e = (SwitchCompat) this.c.findViewById(R.id.collaboration_state_switch);
        this.f = (TextView) this.c.findViewById(R.id.empty_collaborators_text);
        this.g = this.c.findViewById(R.id.collaborators_list);
        this.x = (RecyclerView) this.c.findViewById(R.id.collaborators_avatars);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ab(0);
        this.x.ag(linearLayoutManager);
        ajqw ajqwVar = new ajqw();
        ajqwVar.f(audp.class, new mmo(this.a, this.v, this.s));
        ajsf a = this.t.a(ajqwVar);
        ajsm ajsmVar = new ajsm();
        this.q = ajsmVar;
        a.h(ajsmVar);
        this.x.ad(a);
        this.y = this.c.findViewById(R.id.get_link_section);
        this.h = (TextView) this.c.findViewById(R.id.get_link_description);
        this.i = (TextView) this.c.findViewById(R.id.get_link_button);
        this.z = this.c.findViewById(R.id.link_sharing_section);
        this.j = (TextView) this.c.findViewById(R.id.invite_link);
        this.k = (TextView) this.c.findViewById(R.id.share_link_description);
        TextView textView = (TextView) this.c.findViewById(R.id.share_link_button);
        this.A = textView;
        this.l = this.u.a(textView);
        this.m = (TextView) this.c.findViewById(R.id.revoke_links_description);
        TextView textView2 = (TextView) this.c.findViewById(R.id.revoke_links_button);
        this.B = textView2;
        this.n = this.u.a(textView2);
        this.C = true;
    }

    public final void c(boolean z) {
        audx audxVar = this.r;
        if (audxVar == null) {
            return;
        }
        audr audrVar = audxVar.d;
        if (audrVar == null) {
            audrVar = audr.a;
        }
        apzg apzgVar = audrVar.e;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aopa mo52toBuilder = ((PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apzgVar.qm(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint)).mo52toBuilder();
        int i = 0;
        while (true) {
            if (i >= ((PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) mo52toBuilder.instance).c.size()) {
                break;
            }
            auci auciVar = (auci) ((PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) mo52toBuilder.instance).c.get(i);
            int cf = awwc.cf(auciVar.c);
            if (cf != 0 && cf == 32) {
                aopa mo52toBuilder2 = auciVar.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                auci auciVar2 = (auci) mo52toBuilder2.instance;
                auciVar2.b |= 4194304;
                auciVar2.l = !z;
                auci auciVar3 = (auci) mo52toBuilder2.mo39build();
                mo52toBuilder.copyOnWrite();
                PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) mo52toBuilder.instance;
                auciVar3.getClass();
                aopu aopuVar = playlistEditEndpointOuterClass$PlaylistEditEndpoint.c;
                if (!aopuVar.c()) {
                    playlistEditEndpointOuterClass$PlaylistEditEndpoint.c = aopi.mutableCopy(aopuVar);
                }
                playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.set(i, auciVar3);
            } else {
                i++;
            }
        }
        aopa mo52toBuilder3 = this.r.mo52toBuilder();
        audr audrVar2 = this.r.d;
        if (audrVar2 == null) {
            audrVar2 = audr.a;
        }
        aopa mo52toBuilder4 = audrVar2.mo52toBuilder();
        audr audrVar3 = this.r.d;
        if (audrVar3 == null) {
            audrVar3 = audr.a;
        }
        apzg apzgVar2 = audrVar3.e;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aopc aopcVar = (aopc) apzgVar2.mo52toBuilder();
        aopcVar.e(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint, (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) mo52toBuilder.mo39build());
        mo52toBuilder4.copyOnWrite();
        audr audrVar4 = (audr) mo52toBuilder4.instance;
        apzg apzgVar3 = (apzg) aopcVar.mo39build();
        apzgVar3.getClass();
        audrVar4.e = apzgVar3;
        audrVar4.b |= 8;
        mo52toBuilder3.copyOnWrite();
        audx audxVar2 = (audx) mo52toBuilder3.instance;
        audr audrVar5 = (audr) mo52toBuilder4.mo39build();
        audrVar5.getClass();
        audxVar2.d = audrVar5;
        audxVar2.b |= 2;
        audx audxVar3 = (audx) mo52toBuilder3.mo39build();
        this.r = audxVar3;
        aafo aafoVar = this.s;
        audr audrVar6 = audxVar3.d;
        if (audrVar6 == null) {
            audrVar6 = audr.a;
        }
        apzg apzgVar4 = audrVar6.e;
        if (apzgVar4 == null) {
            apzgVar4 = apzg.a;
        }
        aafoVar.c(apzgVar4, null);
        this.e.setEnabled(false);
    }

    public final void d(boolean z) {
        this.i.setEnabled(z);
        float f = z ? 1.0f : this.w;
        this.y.setAlpha(f);
        this.f.setAlpha(f);
    }

    public final void e(int i) {
        if (i == 1) {
            this.z.setVisibility(8);
            this.y.setVisibility(0);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.q.clear();
            d(false);
        } else if (i != 2) {
            this.y.setVisibility(8);
            this.z.setVisibility(0);
            d(true);
        } else {
            this.z.setVisibility(8);
            this.y.setVisibility(0);
            d(true);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        abbi abbiVar = (abbi) obj;
                        if (!TextUtils.equals(this.b, abbiVar.a)) {
                            return null;
                        }
                        b();
                        if (abbiVar.b) {
                            return null;
                        }
                        e(3);
                        return null;
                    }
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
                abbg abbgVar = (abbg) obj;
                if (!TextUtils.equals(this.b, abbgVar.a)) {
                    return null;
                }
                b();
                if (abbgVar.c) {
                    boolean z = !abbgVar.b;
                    this.p = z;
                    if (z) {
                        a();
                    }
                } else {
                    this.e.setChecked(this.p);
                    d(this.p);
                }
                this.e.setEnabled(true);
                return null;
            }
            abbf abbfVar = (abbf) obj;
            if (!TextUtils.equals(this.b, abbfVar.a)) {
                return null;
            }
            b();
            if (!abbfVar.c || this.r == null) {
                e(2);
                return null;
            }
            this.j.setText(abbfVar.b);
            audv audvVar = this.r.i;
            if (audvVar == null) {
                audvVar = audv.a;
            }
            apoj apojVar = audvVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            apzg apzgVar = apojVar.o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (!apzgVar.qn(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint)) {
                return null;
            }
            aopa mo52toBuilder = ((SharePlaylistEndpointOuterClass$SharePlaylistEndpoint) apzgVar.qm(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint)).mo52toBuilder();
            String str = abbfVar.b;
            mo52toBuilder.copyOnWrite();
            SharePlaylistEndpointOuterClass$SharePlaylistEndpoint sharePlaylistEndpointOuterClass$SharePlaylistEndpoint = (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint) mo52toBuilder.instance;
            str.getClass();
            sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.b = 2 | sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.b;
            sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.c = str;
            SharePlaylistEndpointOuterClass$SharePlaylistEndpoint sharePlaylistEndpointOuterClass$SharePlaylistEndpoint2 = (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint) mo52toBuilder.mo39build();
            audv audvVar2 = this.r.i;
            if (audvVar2 == null) {
                audvVar2 = audv.a;
            }
            apoj apojVar2 = audvVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            aopc aopcVar = (aopc) apojVar2.mo52toBuilder();
            aopc aopcVar2 = (aopc) apzgVar.mo52toBuilder();
            aopcVar2.e(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint, sharePlaylistEndpointOuterClass$SharePlaylistEndpoint2);
            aopcVar.copyOnWrite();
            apoj apojVar3 = (apoj) aopcVar.instance;
            apzg apzgVar2 = (apzg) aopcVar2.mo39build();
            apzgVar2.getClass();
            apojVar3.o = apzgVar2;
            apojVar3.b |= 16384;
            apoj apojVar4 = (apoj) aopcVar.mo39build();
            this.l.b(apojVar4, this.d);
            aopa mo52toBuilder2 = this.r.mo52toBuilder();
            audv audvVar3 = this.r.i;
            if (audvVar3 == null) {
                audvVar3 = audv.a;
            }
            aopa mo52toBuilder3 = audvVar3.mo52toBuilder();
            mo52toBuilder3.copyOnWrite();
            audv audvVar4 = (audv) mo52toBuilder3.instance;
            apojVar4.getClass();
            audvVar4.c = apojVar4;
            audvVar4.b |= 1;
            mo52toBuilder2.copyOnWrite();
            audx audxVar = (audx) mo52toBuilder2.instance;
            audv audvVar5 = (audv) mo52toBuilder3.mo39build();
            audvVar5.getClass();
            audxVar.i = audvVar5;
            audxVar.b |= 1024;
            this.r = (audx) mo52toBuilder2.mo39build();
            return null;
        }
        return new Class[]{abbf.class, abbg.class, abbi.class};
    }
}
