package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.libraries.youtube.innertube.model.ads.InstreamAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wkh  reason: default package */
/* loaded from: classes4.dex */
public final class wkh implements airt, wlt, ynl {
    public final List a;
    public wke b;
    public InstreamAd c;
    public boolean d;
    public boolean e;
    public final Set f = new HashSet();
    public final Map g = new HashMap();
    public final xiw h;
    public final Activity i;
    public final ajmy j;
    public final wxc k;
    public View l;
    public ajrs m;
    private final List n;

    public wkh(Activity activity, ajmy ajmyVar, xiw xiwVar, wxc wxcVar, List list, List list2) {
        this.i = activity;
        this.j = ajmyVar;
        this.h = xiwVar;
        this.k = wxcVar;
        this.n = list;
        this.a = list2;
    }

    public final wkd a(PlayerResponseModel playerResponseModel, String str, asit asitVar) {
        for (wkd wkdVar : this.n) {
            if (wkdVar.g(str, playerResponseModel, asitVar)) {
                return wkdVar;
            }
        }
        return null;
    }

    public final void b(wkd wkdVar) {
        this.n.add(wkdVar);
    }

    public final void c() {
        for (wke wkeVar : this.n) {
            wkeVar.e(this.l);
        }
        for (wke wkeVar2 : this.a) {
            wkeVar2.e(this.l);
        }
        d(null);
        this.g.clear();
        this.l = null;
        this.c = null;
        this.d = false;
        this.e = false;
    }

    public final void d(wke wkeVar) {
        View view;
        ajrs ajrsVar;
        this.b = wkeVar;
        if (wkeVar == null || (view = this.l) == null || (ajrsVar = this.m) == null) {
            return;
        }
        wkeVar.d(view, ajrsVar);
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.G(aypa.a()).Z(new ayqb() { // from class: wkc
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                wkh wkhVar = wkh.this;
                ylr.c();
                aika aikaVar = aika.NEW;
                int ordinal = ((ahhw) obj).c().ordinal();
                if (ordinal == 0) {
                    wkhVar.c();
                } else if (ordinal != 8) {
                } else {
                    wkhVar.d = true;
                }
            }
        })};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    wxo wxoVar = (wxo) obj;
                    wke wkeVar = this.b;
                    if (wkeVar == null) {
                        return null;
                    }
                    wkeVar.h(wxoVar);
                    return null;
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            wki wkiVar = (wki) obj;
            wke wkeVar2 = this.b;
            if (wkeVar2 == null || this.l == null || !(wkeVar2 instanceof wkf)) {
                return null;
            }
            wkf wkfVar = (wkf) wkeVar2;
            MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer = (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer) this.g.get(wkiVar.a);
            if (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer == null) {
                return null;
            }
            if (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.e) {
                this.b.e(this.l);
                return null;
            } else if ((multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.b & 2) == 0) {
                return null;
            } else {
                aunb aunbVar = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.d;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                this.b.e(this.l);
                if (!wkfVar.k(aunbVar, this.e)) {
                    String valueOf = String.valueOf(aunbVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 44);
                    sb2.append("Unable to load companion card with renderer ");
                    sb2.append(valueOf);
                    afus.b(2, 1, sb2.toString());
                }
                this.b.d(this.l, this.m);
                return null;
            }
        }
        return new Class[]{wki.class, wxo.class};
    }
}
