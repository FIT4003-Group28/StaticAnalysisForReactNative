package defpackage;

import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.libraries.youtube.mdx.mediaroute.MdxMediaRouteButton;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: adft  reason: default package */
/* loaded from: classes.dex */
public final class adft extends Observable implements ynl {
    public static final String a = zep.a("MDX.MediaRouteButtonController");
    public boolean b;
    public aypg c;
    public final Map d;
    private final yni e;
    private final azqb f;
    private final azqb g;
    private final adfs h;
    private final adhf i;
    private final Set j;
    private final adoa k;
    private final azqb l;
    private final acyz m;
    private final aczd n;
    private final boolean o;
    private final acwn p;
    private acth q;
    private List r;
    private boolean s;
    private final adhh t;
    private final mdv u;
    private final adfq v = new adfq(this);

    public adft(yni yniVar, azqb azqbVar, azqb azqbVar2, adhf adhfVar, adhh adhhVar, adoa adoaVar, azqb azqbVar3, acyz acyzVar, aczd aczdVar, acwu acwuVar, acwn acwnVar, mdv mdvVar) {
        yniVar.getClass();
        this.e = yniVar;
        azqbVar.getClass();
        this.g = azqbVar;
        azqbVar2.getClass();
        this.f = azqbVar2;
        this.i = adhfVar;
        this.t = adhhVar;
        this.k = adoaVar;
        this.l = azqbVar3;
        this.h = new adfs(this);
        this.j = Collections.newSetFromMap(new WeakHashMap());
        this.m = acyzVar;
        this.o = acwuVar.q;
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        hashMap.put(acuo.b(11208), false);
        this.n = aczdVar;
        this.p = acwnVar;
        this.u = mdvVar;
        l();
    }

    public static final void k(acti actiVar, acup acupVar) {
        if (acupVar == null) {
            return;
        }
        actiVar.D(new acte(acupVar));
    }

    private final void l() {
        this.p.i().X(aypa.a()).az(new adfr(this));
    }

    private final void m(boolean z) {
        for (MediaRouteButton mediaRouteButton : this.j) {
            mediaRouteButton.c(z);
        }
    }

    private final void n() {
        for (MediaRouteButton mediaRouteButton : this.j) {
            mediaRouteButton.setVisibility(true != this.s ? 8 : 0);
            mediaRouteButton.setEnabled(this.s);
        }
        e(a(), acuo.b(11208));
    }

    public final acti a() {
        acth acthVar = this.q;
        if (acthVar == null || acthVar.oi() == null) {
            return acti.l;
        }
        return this.q.oi();
    }

    public final void b(MediaRouteButton mediaRouteButton) {
        if (!this.b) {
            this.s = false;
            mediaRouteButton.c(false);
        } else if (this.o) {
            mediaRouteButton.c(true);
            this.s = true;
        }
        mediaRouteButton.g((bgo) this.f.get());
        mediaRouteButton.d(this.i);
        this.j.add(mediaRouteButton);
        if (mediaRouteButton instanceof MdxMediaRouteButton) {
            MdxMediaRouteButton mdxMediaRouteButton = (MdxMediaRouteButton) mediaRouteButton;
            adfq adfqVar = this.v;
            adhh adhhVar = this.t;
            adoa adoaVar = this.k;
            azqb azqbVar = this.g;
            azqb azqbVar2 = this.l;
            acyz acyzVar = this.m;
            aczd aczdVar = this.n;
            mdxMediaRouteButton.m = this.u;
            mdxMediaRouteButton.l = adfqVar;
            mdxMediaRouteButton.k = adhhVar;
            mdxMediaRouteButton.f = adoaVar;
            mdxMediaRouteButton.e = azqbVar;
            mdxMediaRouteButton.g = azqbVar2;
            mdxMediaRouteButton.h = acyzVar;
            mdxMediaRouteButton.i = aczdVar;
            mdxMediaRouteButton.j = true;
            mdxMediaRouteButton.d.sm();
        }
        k(a(), acuo.b(11208));
        n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        boolean z = false;
        if (!this.b) {
            m(false);
        } else if (this.o) {
            m(true);
            z = true;
        } else {
            bhd bhdVar = (bhd) this.g.get();
            z = bhd.k((bgo) this.f.get(), 1);
        }
        if (this.s == z) {
            return;
        }
        this.s = z;
        String str = a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Media route button available: ");
        sb.append(z);
        zep.h(str, sb.toString());
        if (this.s) {
            this.e.g(this);
        } else {
            this.e.m(this);
        }
        n();
        setChanged();
        notifyObservers();
    }

    public final void d(acth acthVar, acup... acupVarArr) {
        acthVar.getClass();
        this.q = acthVar;
        aqxo.p(true);
        this.r = Arrays.asList(acupVarArr);
    }

    public final void e(acti actiVar, acup acupVar) {
        List list;
        if (acupVar == null) {
            return;
        }
        acup a2 = (actiVar.c() == null || actiVar.c().f == 0) ? null : acuo.a(actiVar.c().f);
        if (!j() || !this.d.containsKey(acupVar) || ((Boolean) this.d.get(acupVar)).booleanValue() || (list = this.r) == null || !list.contains(a2)) {
            return;
        }
        actiVar.u(new acte(acupVar), null);
        this.d.put(acupVar, true);
    }

    public final void g() {
        ((bhd) this.g.get()).q((bgo) this.f.get(), this.h, 4);
        if (this.c.e()) {
            l();
        }
        c();
    }

    public final void h() {
        this.c.qr();
        ((bhd) this.g.get()).r(this.h);
        this.e.m(this);
    }

    public final void i(MediaRouteButton mediaRouteButton) {
        this.j.remove(mediaRouteButton);
    }

    public final boolean j() {
        return this.s && this.j.size() > 0;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                actv actvVar = (actv) obj;
                for (Map.Entry entry : this.d.entrySet()) {
                    entry.setValue(false);
                    k(actvVar.a(), (acup) entry.getKey());
                    e(actvVar.a(), (acup) entry.getKey());
                }
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{actv.class};
    }
}
