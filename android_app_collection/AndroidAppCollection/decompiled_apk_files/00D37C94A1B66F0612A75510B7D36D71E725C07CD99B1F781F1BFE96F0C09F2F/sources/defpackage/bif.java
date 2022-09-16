package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bif  reason: default package */
/* loaded from: classes2.dex */
class bif extends bij implements bhf, bhh {
    private static final ArrayList r;
    private static final ArrayList s;
    protected final Object a;
    protected final Object b;
    protected final Object c;
    protected final Object d;
    protected int m;
    protected boolean n;
    protected boolean o;
    protected final ArrayList p;
    protected final ArrayList q;
    private final bii t;
    private kx u;
    private kw v;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        r = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        s = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public bif(Context context, bii biiVar) {
        super(context);
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.t = biiVar;
        Object systemService = context.getSystemService("media_router");
        this.a = systemService;
        this.b = q();
        this.c = new bhi(this);
        this.d = ((MediaRouter) systemService).createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        D();
    }

    protected static final bie C(Object obj) {
        Object tag = ((MediaRouter.RouteInfo) obj).getTag();
        if (tag instanceof bie) {
            return (bie) tag;
        }
        return null;
    }

    private final void D() {
        z();
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
            x();
        }
    }

    private final boolean E(Object obj) {
        String format;
        if (C(obj) != null || n(obj) >= 0) {
            return false;
        }
        String format2 = r() == obj ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(s(obj).hashCode()));
        if (o(format2) >= 0) {
            int i = 2;
            while (true) {
                format = String.format(Locale.US, "%s_%d", format2, Integer.valueOf(i));
                if (o(format) < 0) {
                    break;
                }
                i++;
            }
            format2 = format;
        }
        bid bidVar = new bid(obj, format2);
        A(bidVar);
        this.p.add(bidVar);
        return true;
    }

    protected final void A(bid bidVar) {
        bfz bfzVar = new bfz(bidVar.b, s(bidVar.a));
        m(bidVar, bfzVar);
        bidVar.c = bfzVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B(bie bieVar) {
        ((MediaRouter.UserRouteInfo) bieVar.b).setName(bieVar.a.d);
        ((MediaRouter.UserRouteInfo) bieVar.b).setPlaybackType(bieVar.a.k);
        ((MediaRouter.UserRouteInfo) bieVar.b).setPlaybackStream(bieVar.a.l);
        ((MediaRouter.UserRouteInfo) bieVar.b).setVolume(bieVar.a.n);
        ((MediaRouter.UserRouteInfo) bieVar.b).setVolumeMax(bieVar.a.o);
        ((MediaRouter.UserRouteInfo) bieVar.b).setVolumeHandling(bieVar.a.a());
    }

    @Override // defpackage.bhf
    public final void a(Object obj) {
        if (E(obj)) {
            x();
        }
    }

    @Override // defpackage.bgk
    public final bgj b(String str) {
        int o = o(str);
        if (o >= 0) {
            return new bic(((bid) this.p.get(o)).a);
        }
        return null;
    }

    @Override // defpackage.bhf
    public final void c(Object obj) {
        int n;
        if (C(obj) != null || (n = n(obj)) < 0) {
            return;
        }
        A((bid) this.p.get(n));
        x();
    }

    @Override // defpackage.bgk
    public final void d(bgb bgbVar) {
        boolean z;
        int i = 0;
        if (bgbVar != null) {
            List b = bgbVar.a().b();
            int size = b.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) b.get(i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else {
                    i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                }
                i++;
            }
            z = bgbVar.b();
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

    @Override // defpackage.bhf
    public final void e(Object obj) {
        int n;
        if (C(obj) != null || (n = n(obj)) < 0) {
            return;
        }
        this.p.remove(n);
        x();
    }

    @Override // defpackage.bhf
    public final void f(Object obj) {
        int n;
        if (C(obj) != null || (n = n(obj)) < 0) {
            return;
        }
        bid bidVar = (bid) this.p.get(n);
        int i = kw.i(obj);
        if (i == bidVar.c.f()) {
            return;
        }
        bfz bfzVar = new bfz(bidVar.c);
        bfzVar.k(i);
        bidVar.c = bfzVar.a();
        x();
    }

    @Override // defpackage.bhf
    public final void g() {
    }

    @Override // defpackage.bhf
    public final void h(Object obj) {
        bhc b;
        if (obj != kx.g(this.a)) {
            return;
        }
        bie C = C(obj);
        if (C != null) {
            C.a.g();
            return;
        }
        int n = n(obj);
        if (n < 0) {
            return;
        }
        bii biiVar = this.t;
        String str = ((bid) this.p.get(n)).b;
        bgw bgwVar = (bgw) biiVar;
        bgwVar.m.removeMessages(262);
        bhb b2 = bgwVar.b(bgwVar.c);
        if (b2 == null || (b = b2.b(str)) == null) {
            return;
        }
        b.g();
    }

    @Override // defpackage.bhf
    public final void i() {
    }

    @Override // defpackage.bhf
    public final void j() {
    }

    @Override // defpackage.bhh
    public final void k(Object obj, int i) {
        bie C = C(obj);
        if (C != null) {
            C.a.e(i);
        }
    }

    @Override // defpackage.bhh
    public final void l(Object obj, int i) {
        bie C = C(obj);
        if (C != null) {
            C.a.f(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(bid bidVar, bfz bfzVar) {
        int supportedTypes = ((MediaRouter.RouteInfo) bidVar.a).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            bfzVar.c(r);
        }
        if ((supportedTypes & 2) != 0) {
            bfzVar.c(s);
        }
        bfzVar.i(((MediaRouter.RouteInfo) bidVar.a).getPlaybackType());
        bfzVar.a.putInt("playbackStream", ((MediaRouter.RouteInfo) bidVar.a).getPlaybackStream());
        bfzVar.k(kw.i(bidVar.a));
        bfzVar.m(((MediaRouter.RouteInfo) bidVar.a).getVolumeMax());
        bfzVar.l(((MediaRouter.RouteInfo) bidVar.a).getVolumeHandling());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int n(Object obj) {
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            if (((bid) this.p.get(i)).a == obj) {
                return i;
            }
        }
        return -1;
    }

    protected final int o(String str) {
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            if (((bid) this.p.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    protected final int p(bhc bhcVar) {
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            if (((bie) this.q.get(i)).a == bhcVar) {
                return i;
            }
        }
        return -1;
    }

    protected Object q() {
        return new bhg(this);
    }

    protected final String s(Object obj) {
        CharSequence name = ((MediaRouter.RouteInfo) obj).getName(this.e);
        return name != null ? name.toString() : "";
    }

    @Override // defpackage.bij
    public final void t(bhc bhcVar) {
        if (bhcVar.c() != this) {
            MediaRouter.UserRouteInfo createUserRoute = ((MediaRouter) this.a).createUserRoute((MediaRouter.RouteCategory) this.d);
            bie bieVar = new bie(bhcVar, createUserRoute);
            createUserRoute.setTag(bieVar);
            createUserRoute.setVolumeCallback((MediaRouter.VolumeCallback) this.c);
            B(bieVar);
            this.q.add(bieVar);
            ((MediaRouter) this.a).addUserRoute(createUserRoute);
            return;
        }
        int n = n(kx.g(this.a));
        if (n < 0 || !((bid) this.p.get(n)).b.equals(bhcVar.b)) {
            return;
        }
        bhcVar.g();
    }

    @Override // defpackage.bij
    public final void u(bhc bhcVar) {
        int p;
        if (bhcVar.c() == this || (p = p(bhcVar)) < 0) {
            return;
        }
        B((bie) this.q.get(p));
    }

    @Override // defpackage.bij
    public final void v(bhc bhcVar) {
        int p;
        if (bhcVar.c() == this || (p = p(bhcVar)) < 0) {
            return;
        }
        bie bieVar = (bie) this.q.remove(p);
        ((MediaRouter.RouteInfo) bieVar.b).setTag(null);
        ((MediaRouter.UserRouteInfo) bieVar.b).setVolumeCallback(null);
        ((MediaRouter) this.a).removeUserRoute((MediaRouter.UserRouteInfo) bieVar.b);
    }

    @Override // defpackage.bij
    public final void w(bhc bhcVar) {
        if (!bhcVar.m()) {
            return;
        }
        if (bhcVar.c() == this) {
            int o = o(bhcVar.b);
            if (o < 0) {
                return;
            }
            y(((bid) this.p.get(o)).a);
            return;
        }
        int p = p(bhcVar);
        if (p < 0) {
            return;
        }
        y(((bie) this.q.get(p)).b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        bgl bglVar = new bgl();
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            bglVar.b(((bid) this.p.get(i)).c);
        }
        jL(bglVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z() {
        if (this.o) {
            this.o = false;
            kx.f(this.a, this.b);
        }
        int i = this.m;
        if (i != 0) {
            this.o = true;
            ((MediaRouter) this.a).addCallback(i, (MediaRouter.Callback) this.b);
        }
    }

    protected Object r() {
        if (this.v == null) {
            this.v = new kw();
        }
        throw null;
    }

    protected void y(Object obj) {
        if (this.u == null) {
            this.u = new kx();
        }
        throw null;
    }
}
