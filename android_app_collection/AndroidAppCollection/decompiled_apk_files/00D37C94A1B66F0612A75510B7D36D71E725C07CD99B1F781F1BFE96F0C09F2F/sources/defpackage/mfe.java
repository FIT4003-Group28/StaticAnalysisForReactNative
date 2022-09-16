package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: mfe  reason: default package */
/* loaded from: classes3.dex */
public final class mfe implements ajru, fea, ynl {
    public final ImageView a;
    public final ImageView b;
    public mfc c;
    public final aafo d;
    public final airr e;
    public final oei f;
    private final Context g;
    private final yni h;
    private final ajyc i;
    private final PlaybackLoopShuffleMonitor j;
    private final oez k;
    private final fzx l;
    private final lrq m;
    private final fmr n;
    private final View o;
    private final TextView p;
    private final ImageView q;
    private final ImageView r;
    private final ImageView s;
    private acti t;
    private gae u;

    public mfe(Context context, yni yniVar, ajyc ajycVar, fzx fzxVar, airr airrVar, final aire aireVar, PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, oez oezVar, aafo aafoVar, oei oeiVar, fms fmsVar, ViewGroup viewGroup) {
        this.g = context;
        this.h = yniVar;
        this.j = playbackLoopShuffleMonitor;
        this.k = oezVar;
        this.i = ajycVar;
        this.l = fzxVar;
        this.d = aafoVar;
        this.e = airrVar;
        this.f = oeiVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.set_content_header, viewGroup, false);
        this.o = inflate;
        this.p = (TextView) inflate.findViewById(R.id.set_content_title);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.set_repeat);
        this.a = imageView;
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.set_shuffle);
        this.b = imageView2;
        this.q = (ImageView) inflate.findViewById(R.id.like_button);
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.save_button);
        this.s = imageView3;
        ImageView imageView4 = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.r = imageView4;
        imageView4.setClickable(true);
        imageView4.setEnabled(true);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: mfb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aireVar.h(!mfe.this.a.isSelected());
            }
        });
        imageView2.setOnClickListener(new mfd(this));
        fzxVar.b(inflate.findViewById(R.id.like_button));
        this.m = new lrq(context, inflate.findViewById(R.id.set_share), aafoVar);
        playbackLoopShuffleMonitor.g(this);
        fmr a = fmsVar.a(imageView3);
        this.n = a;
        a.b = imageView3;
    }

    public static boolean e(apos aposVar) {
        return (aposVar == null || (aposVar.b & 1024) == 0) ? false : true;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.o;
    }

    public final void d(gae gaeVar) {
        mfc mfcVar = this.c;
        if (mfcVar == null || gaeVar == null || !TextUtils.equals(mfcVar.a.k, gaeVar.b())) {
            this.u = null;
            return;
        }
        this.l.f(gaeVar.a());
        boolean z = gaeVar.a() == aspb.LIKE;
        if (!this.n.e()) {
            fmr fmrVar = this.n;
            if (fmrVar.d.e != z) {
                fmrVar.c();
            }
        }
        this.u = gaeVar;
    }

    @Override // defpackage.fea
    public final void g(int i, boolean z) {
        ImageView imageView = this.a;
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        imageView.setSelected(z2);
        if (!e(this.c.a())) {
            this.b.setSelected(z);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                d((gae) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{gae.class};
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        atep atepVar;
        aopc aopcVar;
        arag aragVar;
        this.h.h(this, mfe.class);
        this.c = (mfc) obj;
        this.t = ajrsVar.a;
        this.o.setVisibility(0);
        mfc mfcVar = this.c;
        boolean z = mfcVar.c || mfcVar.a() != null;
        if (this.c.b || z) {
            this.p.setVisibility(8);
            this.a.setVisibility(true != this.c.b ? 8 : 0);
            this.b.setVisibility(true != z ? 8 : 0);
        } else {
            this.p.setVisibility(0);
            TextView textView = this.p;
            audg audgVar = this.c.a;
            if ((audgVar.c & 128) != 0) {
                aragVar = audgVar.n;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            this.a.setVisibility(8);
            this.b.setVisibility(8);
        }
        PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor = this.j;
        g(playbackLoopShuffleMonitor.a, playbackLoopShuffleMonitor.b);
        audg audgVar2 = this.c.a;
        if (audgVar2.r) {
            this.p.setText(this.g.getResources().getString(R.string.radio_total_videos));
            this.r.setVisibility(8);
        } else {
            ajyc ajycVar = this.i;
            ImageView imageView = this.r;
            ates atesVar = audgVar2.z;
            if (atesVar == null) {
                atesVar = ates.a;
            }
            if ((atesVar.b & 1) != 0) {
                ates atesVar2 = audgVar2.z;
                if (atesVar2 == null) {
                    atesVar2 = ates.a;
                }
                atepVar = atesVar2.c;
                if (atepVar == null) {
                    atepVar = atep.a;
                }
            } else {
                atepVar = null;
            }
            ajycVar.d(imageView, atepVar, audgVar2, this.t);
        }
        if (this.k.a() == null || this.k.a().e()) {
            this.q.setVisibility(8);
            this.s.setVisibility(8);
        } else {
            asow asowVar = this.c.a.u;
            if (asowVar == null) {
                asowVar = asow.a;
            }
            if ((asowVar.b & 1) != 0) {
                asow asowVar2 = this.c.a.u;
                if (asowVar2 == null) {
                    asowVar2 = asow.a;
                }
                asov asovVar = asowVar2.c;
                if (asovVar == null) {
                    asovVar = asov.a;
                }
                aopcVar = (aopc) asovVar.mo52toBuilder();
            } else {
                aopcVar = null;
            }
            if (aopcVar != null) {
                aopc aopcVar2 = (aopc) this.c.a.mo52toBuilder();
                asow asowVar3 = ((audg) aopcVar2.instance).u;
                if (asowVar3 == null) {
                    asowVar3 = asow.a;
                }
                aopa mo52toBuilder = asowVar3.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                asow asowVar4 = (asow) mo52toBuilder.instance;
                asov asovVar2 = (asov) aopcVar.mo39build();
                asovVar2.getClass();
                asowVar4.c = asovVar2;
                asowVar4.b |= 1;
                aopcVar2.copyOnWrite();
                audg audgVar3 = (audg) aopcVar2.instance;
                asow asowVar5 = (asow) mo52toBuilder.mo39build();
                asowVar5.getClass();
                audgVar3.u = asowVar5;
                audgVar3.c |= 524288;
                this.c.a = (audg) aopcVar2.mo39build();
            }
            this.l.i(aopcVar);
            apon aponVar = this.c.a.A;
            if (aponVar == null) {
                aponVar = apon.a;
            }
            if ((aponVar.b & 1) == 0) {
                this.n.b(null);
            } else {
                fmr fmrVar = this.n;
                apon aponVar2 = this.c.a.A;
                if (aponVar2 == null) {
                    aponVar2 = apon.a;
                }
                apos aposVar = aponVar2.c;
                if (aposVar == null) {
                    aposVar = apos.a;
                }
                fmrVar.b(aposVar);
            }
        }
        d(this.u);
        lrq lrqVar = this.m;
        audg audgVar4 = this.c.a;
        if (audgVar4 == null || abgc.a(audgVar4) == null) {
            zag.o(lrqVar.a, false);
            lrqVar.a.setOnClickListener(null);
            return;
        }
        ates atesVar3 = audgVar4.z;
        if (atesVar3 == null) {
            atesVar3 = ates.a;
        }
        atep atepVar2 = atesVar3.c;
        if (atepVar2 == null) {
            atepVar2 = atep.a;
        }
        Iterator it = atepVar2.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aten atenVar = (aten) it.next();
            ateo ateoVar = atenVar.c;
            if (ateoVar == null) {
                ateoVar = ateo.a;
            }
            apzg apzgVar = ateoVar.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar.qn(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint)) {
                ateo ateoVar2 = atenVar.c;
                if (ateoVar2 == null) {
                    ateoVar2 = ateo.a;
                }
                apzg apzgVar2 = ateoVar2.e;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                lrqVar.d = apzgVar2;
            }
        }
        lrqVar.b = zgh.h(audgVar4.g);
        lrqVar.c = abgc.a(audgVar4);
        lrqVar.a.setOnClickListener(lrqVar);
        zag.o(lrqVar.a, !adwa.a(audgVar4.k));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.h.m(this);
    }
}
