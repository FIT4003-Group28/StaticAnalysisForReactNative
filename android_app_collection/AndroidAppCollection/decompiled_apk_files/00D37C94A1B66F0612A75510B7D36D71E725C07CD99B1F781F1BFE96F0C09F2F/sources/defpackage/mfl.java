package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: mfl  reason: default package */
/* loaded from: classes3.dex */
public final class mfl implements ajru, fzq, ynl {
    ggz a;
    private final Context b;
    private final amqo c;
    private final ajmy d;
    private final eze e;
    private final aafo f;
    private final fer g;
    private final fyx h;
    private final ivt i;
    private final FrameLayout j;
    private mfk k;
    private mfk l;
    private mfk m;

    public mfl(Context context, amqo amqoVar, yni yniVar, ajmy ajmyVar, eze ezeVar, aafo aafoVar, fer ferVar, fyx fyxVar, ivt ivtVar) {
        this.b = context;
        this.c = amqoVar;
        yniVar.getClass();
        ajmyVar.getClass();
        this.d = ajmyVar;
        ezeVar.getClass();
        this.e = ezeVar;
        aafoVar.getClass();
        this.f = aafoVar;
        ferVar.getClass();
        this.g = ferVar;
        fyxVar.getClass();
        this.h = fyxVar;
        ivtVar.getClass();
        this.i = ivtVar;
        this.j = new FrameLayout(context);
        yniVar.g(this);
        this.a = ggz.a;
    }

    private final View d(int i) {
        View inflate = View.inflate(this.b, i, null);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.inline_metadata_stub);
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.inline_metadata_full);
            viewStub.inflate();
        }
        return inflate;
    }

    private final mfk e(ajrx ajrxVar, View view, aafo aafoVar) {
        return new mfk(this.b, this.d, this.e, ajrxVar, view, aafoVar, this.g);
    }

    private final void h(mfk mfkVar, ggz ggzVar) {
        if (l(mfkVar)) {
            mfkVar.e(ggzVar.b);
        }
    }

    private final void k(mfk mfkVar, boolean z) {
        if (l(mfkVar)) {
            mfkVar.g(z);
        }
    }

    private final boolean l(mfk mfkVar) {
        return mfkVar != null && zag.t(this.j, mfkVar.a());
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.j;
    }

    @Override // defpackage.fzq
    public final View g() {
        mfk mfkVar = this.m;
        if (mfkVar == null) {
            return null;
        }
        return mfkVar.a;
    }

    @Override // defpackage.fzq
    public final void i(boolean z) {
    }

    @Override // defpackage.fzq
    public final /* synthetic */ mct j() {
        return null;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        aunb aunbVar;
        boolean z = false;
        if (i != -1) {
            if (i == 0) {
                feq feqVar = (feq) obj;
                if (this.a == ggz.a || !TextUtils.equals(this.a.f(), feqVar.a())) {
                    return null;
                }
                h(this.k, this.a);
                h(this.l, this.a);
                return null;
            } else if (i == 1) {
                boolean z2 = !((fyw) obj).a();
                k(this.k, z2);
                k(this.l, z2);
                return null;
            } else if (i != 2) {
                if (i == 3) {
                    if (((adob) obj).a() != null) {
                        z = true;
                    }
                    mfk mfkVar = this.k;
                    if (!l(mfkVar)) {
                        return null;
                    }
                    mfkVar.f(z, this.i);
                    return null;
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            } else {
                gaf gafVar = (gaf) obj;
                if (this.a == ggz.a) {
                    return null;
                }
                String f = this.a.f();
                aopa mo52toBuilder = eog.bn(this.a.b).mo52toBuilder();
                if (TextUtils.equals(f, gafVar.b()) && mo52toBuilder != null) {
                    arjt arjtVar = (arjt) mo52toBuilder.instance;
                    if ((arjtVar.b & 64) != 0) {
                        asow asowVar = arjtVar.h;
                        if (asowVar == null) {
                            asowVar = asow.a;
                        }
                        aopa mo52toBuilder2 = asowVar.mo52toBuilder();
                        asov asovVar = ((asow) mo52toBuilder2.instance).c;
                        if (asovVar == null) {
                            asovVar = asov.a;
                        }
                        aopc aopcVar = (aopc) asovVar.mo52toBuilder();
                        aspb a = gafVar.a();
                        aopcVar.copyOnWrite();
                        asov asovVar2 = (asov) aopcVar.instance;
                        asovVar2.d = a.e;
                        asovVar2.b |= 2;
                        mo52toBuilder2.copyOnWrite();
                        asow asowVar2 = (asow) mo52toBuilder2.instance;
                        asov asovVar3 = (asov) aopcVar.mo39build();
                        asovVar3.getClass();
                        asowVar2.c = asovVar3;
                        asowVar2.b |= 1;
                        mo52toBuilder.copyOnWrite();
                        arjt arjtVar2 = (arjt) mo52toBuilder.instance;
                        asow asowVar3 = (asow) mo52toBuilder2.mo39build();
                        asowVar3.getClass();
                        arjtVar2.h = asowVar3;
                        arjtVar2.b |= 64;
                    }
                }
                aopa mo52toBuilder3 = this.a.b.mo52toBuilder();
                arju arjuVar = this.a.b.g;
                if (arjuVar == null) {
                    arjuVar = arju.a;
                }
                aopa mo52toBuilder4 = arjuVar.mo52toBuilder();
                mo52toBuilder4.copyOnWrite();
                arju arjuVar2 = (arju) mo52toBuilder4.instance;
                arjt arjtVar3 = (arjt) mo52toBuilder.mo39build();
                arjtVar3.getClass();
                arjuVar2.c = arjtVar3;
                arjuVar2.b |= 1;
                mo52toBuilder3.copyOnWrite();
                arjw arjwVar = (arjw) mo52toBuilder3.instance;
                arju arjuVar3 = (arju) mo52toBuilder4.mo39build();
                arjuVar3.getClass();
                arjwVar.g = arjuVar3;
                arjwVar.b = 32 | arjwVar.b;
                ggz ggzVar = this.a;
                ggzVar.b = (arjw) mo52toBuilder3.mo39build();
                Object obj2 = ggzVar.c;
                if (obj2 instanceof aqlb) {
                    aopc aopcVar2 = (aopc) ((aqlb) obj2).mo52toBuilder();
                    aqlb aqlbVar = (aqlb) ggzVar.c;
                    if (aqlbVar.c == 22) {
                        aunbVar = (aunb) aqlbVar.d;
                    } else {
                        aunbVar = aunb.a;
                    }
                    aopc aopcVar3 = (aopc) aunbVar.mo52toBuilder();
                    aopcVar3.e(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer, ggzVar.b);
                    aopcVar2.copyOnWrite();
                    aqlb aqlbVar2 = (aqlb) aopcVar2.instance;
                    aunb aunbVar2 = (aunb) aopcVar3.mo39build();
                    aunbVar2.getClass();
                    aqlbVar2.d = aunbVar2;
                    aqlbVar2.c = 22;
                    ggzVar.c = aopcVar2.mo39build();
                    return null;
                } else if (obj2 instanceof mbf) {
                    aopa mo52toBuilder5 = ((mbf) obj2).a().mo52toBuilder();
                    aunb aunbVar3 = ((mbf) ggzVar.c).a().c;
                    if (aunbVar3 == null) {
                        aunbVar3 = aunb.a;
                    }
                    aopc aopcVar4 = (aopc) aunbVar3.mo52toBuilder();
                    aopcVar4.e(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer, ggzVar.b);
                    mo52toBuilder5.copyOnWrite();
                    auhp auhpVar = (auhp) mo52toBuilder5.instance;
                    aunb aunbVar4 = (aunb) aopcVar4.mo39build();
                    aunbVar4.getClass();
                    auhpVar.c = aunbVar4;
                    auhpVar.b |= 1;
                    ((mbf) ggzVar.c).d = (auhp) mo52toBuilder5.mo39build();
                    return null;
                } else if (!(obj2 instanceof mbg)) {
                    return null;
                } else {
                    aopa mo52toBuilder6 = ((mbg) obj2).a().mo52toBuilder();
                    aunb aunbVar5 = ((mbg) ggzVar.c).a().c;
                    if (aunbVar5 == null) {
                        aunbVar5 = aunb.a;
                    }
                    aopc aopcVar5 = (aopc) aunbVar5.mo52toBuilder();
                    aopcVar5.e(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer, ggzVar.b);
                    mo52toBuilder6.copyOnWrite();
                    auht auhtVar = (auht) mo52toBuilder6.instance;
                    aunb aunbVar6 = (aunb) aopcVar5.mo39build();
                    aunbVar6.getClass();
                    auhtVar.c = aunbVar6;
                    auhtVar.b |= 1;
                    ((mbg) ggzVar.c).d = (auht) mo52toBuilder6.mo39build();
                    return null;
                }
            }
        }
        return new Class[]{feq.class, fyw.class, gaf.class, adob.class};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9, types: [ajrx, java.lang.Object] */
    @Override // defpackage.ajru
    public final void oK(ajrs ajrsVar, Object obj) {
        ggz bm = eog.bm(obj);
        if (bm == null) {
            bm = ggz.a;
        }
        this.a = bm;
        this.j.removeAllViews();
        boolean z = false;
        if (ajrsVar.j("inlineFullscreen", false)) {
            if (this.l == null) {
                this.l = e(new ajsn(), d(R.layout.inline_video_fullscreen), this.f);
            }
            this.m = this.l;
        } else {
            if (this.k == null) {
                ?? r8 = this.c.get();
                View d = d(R.layout.inline_video);
                aafo aafoVar = this.f;
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.apps.youtube.app.endpoint.flags", 8);
                this.k = e(r8, d, new gnr(aafoVar, hashMap));
                Resources resources = this.b.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.inline_controls_bottom_bar_height);
                this.k.a.addOnLayoutChangeListener(new mdi(new Rect(0, 0, 0, (resources.getDimensionPixelSize(R.dimen.inline_time_bar_size) - dimensionPixelSize) / 2)));
            }
            this.m = this.k;
        }
        this.j.addView(this.m.a());
        this.m.oK(ajrsVar, this.a.b);
        this.m.g(!this.h.f());
        mfk mfkVar = this.m;
        if (this.i.a.e() != null) {
            z = true;
        }
        mfkVar.f(z, this.i);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mfk mfkVar = this.k;
        if (mfkVar != null) {
            mfkVar.qZ(ajsaVar);
        }
        mfk mfkVar2 = this.l;
        if (mfkVar2 != null) {
            mfkVar2.qZ(ajsaVar);
        }
    }
}
