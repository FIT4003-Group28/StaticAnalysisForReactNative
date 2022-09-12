package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ate  reason: default package */
/* loaded from: classes2.dex */
class ate extends ati implements arx, asc {
    private static final ArrayList<IntentFilter> r;
    private static final ArrayList<IntentFilter> s;
    protected final Object a;
    protected final Object b;
    protected final Object c;
    protected final Object d;
    protected int m;
    protected boolean n;
    protected boolean o;
    protected final ArrayList<atc> p;
    protected final ArrayList<atd> q;
    private final ath t;
    private asb u;
    private arz v;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList<IntentFilter> arrayList = new ArrayList<>();
        r = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
        s = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public ate(Context context, ath athVar) {
        super(context);
        this.p = new ArrayList<>();
        this.q = new ArrayList<>();
        this.t = athVar;
        Object systemService = context.getSystemService("media_router");
        this.a = systemService;
        this.b = z();
        this.c = new asd(this);
        this.d = ((MediaRouter) systemService).createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        D();
    }

    protected static final atd C(Object obj) {
        Object tag = ((MediaRouter.RouteInfo) obj).getTag();
        if (tag instanceof atd) {
            return (atd) tag;
        }
        return null;
    }

    private final void D() {
        y();
        MediaRouter mediaRouter = (MediaRouter) this.a;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList<Object> arrayList = new ArrayList(routeCount);
        boolean z = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        for (Object obj : arrayList) {
            z |= E(obj);
        }
        if (z) {
            r();
        }
    }

    private final boolean E(Object obj) {
        String format;
        if (C(obj) != null || s(obj) >= 0) {
            return false;
        }
        String format2 = B() == obj ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(w(obj).hashCode()));
        if (t(format2) >= 0) {
            int i = 2;
            while (true) {
                format = String.format(Locale.US, "%s_%d", format2, Integer.valueOf(i));
                if (t(format) < 0) {
                    break;
                }
                i++;
            }
            format2 = format;
        }
        atc atcVar = new atc(obj, format2);
        v(atcVar);
        this.p.add(atcVar);
        return true;
    }

    protected void A(Object obj) {
        if (this.u == null) {
            this.u = new asb();
        }
        throw null;
    }

    protected Object B() {
        if (this.v == null) {
            this.v = new arz();
        }
        throw null;
    }

    @Override // defpackage.aqy
    public final void a(aqo aqoVar) {
        boolean z;
        int i = 0;
        if (aqoVar != null) {
            List<String> a = aqoVar.a().a();
            int size = a.size();
            int i2 = 0;
            while (i < size) {
                String str = a.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                i++;
            }
            z = aqoVar.b();
            i = i2;
        } else {
            z = false;
        }
        if (this.m == i && this.n == z) {
            return;
        }
        this.m = i;
        this.n = z;
        D();
    }

    @Override // defpackage.aqy
    public final aqx b(String str) {
        int t = t(str);
        if (t >= 0) {
            return new atb(this.p.get(t).a);
        }
        return null;
    }

    @Override // defpackage.arx
    public final void c(Object obj) {
        if (E(obj)) {
            r();
        }
    }

    @Override // defpackage.arx
    public final void d(Object obj) {
        int s2;
        if (C(obj) != null || (s2 = s(obj)) < 0) {
            return;
        }
        this.p.remove(s2);
        r();
    }

    @Override // defpackage.arx
    public final void e(Object obj) {
        int s2;
        if (C(obj) != null || (s2 = s(obj)) < 0) {
            return;
        }
        v(this.p.get(s2));
        r();
    }

    @Override // defpackage.arx
    public final void f(Object obj) {
        int s2;
        if (C(obj) != null || (s2 = s(obj)) < 0) {
            return;
        }
        atc atcVar = this.p.get(s2);
        int a = asa.a(obj);
        if (a == atcVar.c.o()) {
            return;
        }
        aqm aqmVar = new aqm(atcVar.c);
        aqmVar.j(a);
        atcVar.c = aqmVar.a();
        r();
    }

    @Override // defpackage.arx
    public final void g() {
    }

    @Override // defpackage.arx
    public final void h(Object obj) {
        arq c;
        if (obj != ase.b(this.a)) {
            return;
        }
        atd C = C(obj);
        if (C != null) {
            C.a.d();
            return;
        }
        int s2 = s(obj);
        if (s2 < 0) {
            return;
        }
        ath athVar = this.t;
        String str = this.p.get(s2).b;
        arm armVar = (arm) athVar;
        armVar.h.removeMessages(262);
        arp f = armVar.f(armVar.i);
        if (f == null || (c = f.c(str)) == null) {
            return;
        }
        c.d();
    }

    @Override // defpackage.arx
    public final void i() {
    }

    @Override // defpackage.arx
    public final void j() {
    }

    @Override // defpackage.asc
    public final void k(Object obj, int i) {
        aqx aqxVar;
        aqx aqxVar2;
        atd C = C(obj);
        if (C != null) {
            arq arqVar = C.a;
            arv.a();
            arm armVar = arv.a;
            int min = Math.min(arqVar.m, Math.max(0, i));
            if (arqVar != armVar.l || (aqxVar2 = armVar.m) == null) {
                if (armVar.p.isEmpty() || (aqxVar = armVar.p.get(arqVar.c)) == null) {
                    return;
                }
                aqxVar.a(min);
                return;
            }
            aqxVar2.a(min);
        }
    }

    @Override // defpackage.asc
    public final void l(Object obj, int i) {
        aqx aqxVar;
        aqx aqxVar2;
        atd C = C(obj);
        if (C != null) {
            arq arqVar = C.a;
            arv.a();
            if (i == 0) {
                return;
            }
            arm armVar = arv.a;
            if (arqVar != armVar.l || (aqxVar2 = armVar.m) == null) {
                if (armVar.p.isEmpty() || (aqxVar = armVar.p.get(arqVar.c)) == null) {
                    return;
                }
                aqxVar.b(i);
                return;
            }
            aqxVar2.b(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(atc atcVar, aqm aqmVar) {
        int supportedTypes = ((MediaRouter.RouteInfo) atcVar.a).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            aqmVar.b(r);
        }
        if ((supportedTypes & 2) != 0) {
            aqmVar.b(s);
        }
        aqmVar.h(((MediaRouter.RouteInfo) atcVar.a).getPlaybackType());
        aqmVar.a.putInt("playbackStream", ((MediaRouter.RouteInfo) atcVar.a).getPlaybackStream());
        aqmVar.j(asa.a(atcVar.a));
        aqmVar.l(((MediaRouter.RouteInfo) atcVar.a).getVolumeMax());
        aqmVar.k(((MediaRouter.RouteInfo) atcVar.a).getVolumeHandling());
    }

    @Override // defpackage.ati
    public final void n(arq arqVar) {
        if (arqVar.h() != this) {
            MediaRouter.UserRouteInfo createUserRoute = ((MediaRouter) this.a).createUserRoute((MediaRouter.RouteCategory) this.d);
            atd atdVar = new atd(arqVar, createUserRoute);
            createUserRoute.setTag(atdVar);
            createUserRoute.setVolumeCallback((MediaRouter.VolumeCallback) this.c);
            x(atdVar);
            this.q.add(atdVar);
            ((MediaRouter) this.a).addUserRoute(createUserRoute);
            return;
        }
        int s2 = s(ase.b(this.a));
        if (s2 < 0 || !this.p.get(s2).b.equals(arqVar.b)) {
            return;
        }
        arqVar.d();
    }

    @Override // defpackage.ati
    public final void o(arq arqVar) {
        int u;
        if (arqVar.h() == this || (u = u(arqVar)) < 0) {
            return;
        }
        atd remove = this.q.remove(u);
        ((MediaRouter.RouteInfo) remove.b).setTag(null);
        ((MediaRouter.UserRouteInfo) remove.b).setVolumeCallback(null);
        ((MediaRouter) this.a).removeUserRoute((MediaRouter.UserRouteInfo) remove.b);
    }

    @Override // defpackage.ati
    public final void p(arq arqVar) {
        int u;
        if (arqVar.h() == this || (u = u(arqVar)) < 0) {
            return;
        }
        x(this.q.get(u));
    }

    @Override // defpackage.ati
    public final void q(arq arqVar) {
        arv.a();
        if (arv.a.b() == arqVar) {
            if (arqVar.h() == this) {
                int t = t(arqVar.b);
                if (t < 0) {
                    return;
                }
                A(this.p.get(t).a);
                return;
            }
            int u = u(arqVar);
            if (u < 0) {
                return;
            }
            A(this.q.get(u).b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        aqz aqzVar = new aqz();
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            aqzVar.b(this.p.get(i).c);
        }
        Nd(aqzVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int s(Object obj) {
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            if (this.p.get(i).a == obj) {
                return i;
            }
        }
        return -1;
    }

    protected final int t(String str) {
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            if (this.p.get(i).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    protected final int u(arq arqVar) {
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            if (this.q.get(i).a == arqVar) {
                return i;
            }
        }
        return -1;
    }

    protected final void v(atc atcVar) {
        aqm aqmVar = new aqm(atcVar.b, w(atcVar.a));
        m(atcVar, aqmVar);
        atcVar.c = aqmVar.a();
    }

    protected final String w(Object obj) {
        CharSequence name = ((MediaRouter.RouteInfo) obj).getName(this.e);
        return name != null ? name.toString() : "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x(atd atdVar) {
        ((MediaRouter.UserRouteInfo) atdVar.b).setName(atdVar.a.d);
        ((MediaRouter.UserRouteInfo) atdVar.b).setPlaybackType(atdVar.a.h);
        ((MediaRouter.UserRouteInfo) atdVar.b).setPlaybackStream(atdVar.a.i);
        ((MediaRouter.UserRouteInfo) atdVar.b).setVolume(atdVar.a.l);
        ((MediaRouter.UserRouteInfo) atdVar.b).setVolumeMax(atdVar.a.m);
        ((MediaRouter.UserRouteInfo) atdVar.b).setVolumeHandling(atdVar.a.k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void y() {
        if (this.o) {
            this.o = false;
            ase.a(this.a, this.b);
        }
        int i = this.m;
        if (i != 0) {
            this.o = true;
            ((MediaRouter) this.a).addCallback(i, (MediaRouter.Callback) this.b);
        }
    }

    protected Object z() {
        return new ary(this);
    }
}
