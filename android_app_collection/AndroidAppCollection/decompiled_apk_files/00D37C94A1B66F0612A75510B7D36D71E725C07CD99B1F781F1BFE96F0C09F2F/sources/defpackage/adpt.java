package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.youtube.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adpt  reason: default package */
/* loaded from: classes.dex */
public final class adpt implements adnq {
    public static final String a = zep.a("MDX.remote");
    public final azqb c;
    public final afxe d;
    public boolean f;
    private final azqb j;
    private final adbe m;
    private final yni o;
    private final azqb p;
    private adpq r;
    private final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final yiw i = new adpr(this);
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    private final Set n = new HashSet();
    private final Object q = new Object();
    private final Handler l = new adps(this);
    private final Set k = Collections.newSetFromMap(new ConcurrentHashMap());

    public adpt(Executor executor, final adas adasVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, adbe adbeVar, yni yniVar) {
        this.p = azqbVar;
        this.j = azqbVar2;
        this.c = azqbVar3;
        this.m = adbeVar;
        this.o = yniVar;
        this.d = afxe.b(executor, new afyf() { // from class: adpn
            @Override // defpackage.afyf
            public final void a(Object obj, yiw yiwVar) {
                adas adasVar2 = adas.this;
                Uri uri = (Uri) obj;
                String str = adpt.a;
                yiwVar.b(uri, adasVar2.a(uri));
            }
        });
    }

    private final void v() {
        this.o.d(adnp.a);
        for (final adeu adeuVar : this.k) {
            final bgm e = adeuVar.a.e();
            adeuVar.a.o.execute(new Runnable() { // from class: adet
                @Override // java.lang.Runnable
                public final void run() {
                    adeu adeuVar2 = adeu.this;
                    bgm bgmVar = e;
                    int i = adew.q;
                    String.format(Locale.US, "Publishing entire routes on screen changed: %s", adeuVar2.a.k);
                    adeuVar2.a.jL(bgmVar);
                }
            });
        }
    }

    @Override // defpackage.adnq
    public final adig a(ScreenId screenId) {
        ScreenId screenId2;
        adig adigVar;
        Iterator it = this.g.iterator();
        do {
            screenId2 = null;
            if (!it.hasNext()) {
                return null;
            }
            adigVar = (adig) it.next();
            if (adigVar instanceof adif) {
                screenId2 = ((adif) adigVar).e();
            } else if (adigVar instanceof adid) {
                screenId2 = ((adid) adigVar).a.e();
            }
        } while (!screenId.equals(screenId2));
        return adigVar;
    }

    @Override // defpackage.adnq
    public final adig b(String str) {
        if (str == null) {
            return null;
        }
        for (adig adigVar : this.g) {
            if (str.equals(adigVar.g())) {
                return adigVar;
            }
        }
        return null;
    }

    @Override // defpackage.adnq
    public final adig c(Bundle bundle) {
        return b(bundle == null ? null : bundle.getString("screen"));
    }

    @Override // defpackage.adnq
    public final List d() {
        return this.g;
    }

    @Override // defpackage.adnq
    public final List e() {
        return this.b;
    }

    @Override // defpackage.adnq
    public final void f(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "pauseScan: ".concat(valueOf);
        }
        this.n.remove(str);
        if (this.n.isEmpty()) {
            this.f = false;
            this.l.removeMessages(0);
            this.l.removeMessages(1);
        }
    }

    @Override // defpackage.adnq
    public final void g(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "resumeScan: ".concat(valueOf);
        }
        if (this.n.isEmpty()) {
            this.f = true;
            t();
            s();
            this.f = true;
            this.l.sendEmptyMessageDelayed(0, 5000L);
            this.l.sendEmptyMessageDelayed(1, 10000L);
        }
        this.n.add(str);
    }

    @Override // defpackage.adnq
    public final void h(adeu adeuVar) {
        this.k.add(adeuVar);
    }

    @Override // defpackage.adnq
    public final void i(adeu adeuVar) {
        this.k.remove(adeuVar);
    }

    @Override // defpackage.adnq
    public final ankt j(adit aditVar) {
        adif adifVar;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                adifVar = null;
                break;
            }
            adifVar = (adif) it.next();
            if (aditVar.equals(adifVar.h())) {
                break;
            }
        }
        if (adifVar == null) {
            return ankq.a;
        }
        n(adifVar, atcv.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED);
        r(adifVar);
        final ScreenId e = adifVar.e();
        return ((adqq) this.j.get()).e.a.b(new ampg() { // from class: adkf
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                ScreenId screenId = ScreenId.this;
                int i = adkg.b;
                aopa mo52toBuilder = ((aoub) obj).mo52toBuilder();
                int i2 = 0;
                while (true) {
                    if (i2 >= ((aoub) mo52toBuilder.instance).b.size()) {
                        i2 = -1;
                        break;
                    } else if (((aoua) ((aoub) mo52toBuilder.instance).b.get(i2)).c.equals(String.valueOf(screenId))) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    mo52toBuilder.V(i2);
                }
                return (aoub) mo52toBuilder.mo39build();
            }
        }, anjk.a);
    }

    @Override // defpackage.adnq
    public final void k(final adit aditVar, yit yitVar) {
        final adqq adqqVar = (adqq) this.j.get();
        final adpo adpoVar = new adpo(this, yitVar);
        ylx.k(anii.h(adqqVar.e.a(), new ampg() { // from class: adqo
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                adif adifVar;
                String string;
                String str;
                adqq adqqVar2 = adqq.this;
                List list = (List) obj;
                adib b = adqqVar2.f.b(aditVar, 8);
                if (b == null) {
                    return amon.a;
                }
                adia f = b.f();
                ScreenId screenId = b.f;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        adifVar = null;
                        break;
                    }
                    adifVar = (adif) it.next();
                    if (adifVar.e().equals(screenId)) {
                        break;
                    }
                }
                if (adifVar != null) {
                    str = adifVar.f();
                } else if (!TextUtils.isEmpty(b.e)) {
                    String str2 = b.e;
                    String str3 = str2;
                    int i = 2;
                    while (aecq.b(list, str3) != null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                        sb.append(str2);
                        sb.append(" ");
                        sb.append(i);
                        str3 = sb.toString();
                        i++;
                    }
                    str = str3;
                } else {
                    int i2 = 1;
                    while (true) {
                        string = adqqVar2.h.getString(R.string.screen_name, Integer.valueOf(i2));
                        if (aecq.b(list, string) == null) {
                            break;
                        }
                        i2++;
                    }
                    str = string;
                }
                f.e(str);
                return ampq.j(new adif(f.a()));
            }
        }, adqqVar.a), adqqVar.a, adkd.f, new ylw() { // from class: adqn
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                adqq adqqVar2 = adqq.this;
                yiw yiwVar = adpoVar;
                adit aditVar2 = aditVar;
                ampq ampqVar = (ampq) obj;
                if (ampqVar.h()) {
                    yiwVar.b(aditVar2, (adif) ampqVar.c());
                    adkg adkgVar = adqqVar2.e;
                    final adif adifVar = (adif) ampqVar.c();
                    ylx.j(adkgVar.a.b(new ampg() { // from class: adke
                        @Override // defpackage.ampg
                        public final Object apply(Object obj2) {
                            adif adifVar2 = adif.this;
                            int i = adkg.b;
                            aopa mo52toBuilder = ((aoub) obj2).mo52toBuilder();
                            aopa createBuilder = aoua.a.createBuilder();
                            String valueOf = String.valueOf(adifVar2.e());
                            createBuilder.copyOnWrite();
                            aoua aouaVar = (aoua) createBuilder.instance;
                            valueOf.getClass();
                            aouaVar.b |= 1;
                            aouaVar.c = valueOf;
                            String f = adifVar2.f();
                            createBuilder.copyOnWrite();
                            aoua aouaVar2 = (aoua) createBuilder.instance;
                            f.getClass();
                            aouaVar2.b |= 2;
                            aouaVar2.d = f;
                            String valueOf2 = String.valueOf(adifVar2.h());
                            createBuilder.copyOnWrite();
                            aoua aouaVar3 = (aoua) createBuilder.instance;
                            valueOf2.getClass();
                            aouaVar3.b |= 4;
                            aouaVar3.e = valueOf2;
                            aoua aouaVar4 = (aoua) createBuilder.mo39build();
                            mo52toBuilder.copyOnWrite();
                            aoub aoubVar = (aoub) mo52toBuilder.instance;
                            aouaVar4.getClass();
                            aoubVar.a();
                            aoubVar.b.add(0, aouaVar4);
                            if (((aoub) mo52toBuilder.instance).b.size() > 5) {
                                mo52toBuilder.V(((aoub) mo52toBuilder.instance).b.size() - 1);
                            }
                            return (aoub) mo52toBuilder.mo39build();
                        }
                    }, anjk.a), anjk.a, adkd.a);
                    return;
                }
                yiwVar.a(aditVar2, new Exception("Screen is null."));
            }
        });
    }

    public final adpp l(adid adidVar) {
        return new adpp(this, adidVar);
    }

    public final atcv m(adid adidVar) {
        if (!((adwc) this.p.get()).f()) {
            return atcv.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE;
        }
        if (((adwc) this.p.get()).g(3)) {
            if (!TextUtils.equals(adidVar.e, ((adwc) this.p.get()).b())) {
                return atcv.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED;
            }
            return atcv.MDX_SESSION_DISCONNECT_REASON_DIAL_SCREEN_UNAVAILABLE;
        }
        return atcv.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED;
    }

    public final void n(adig adigVar, atcv atcvVar) {
        adnt e = ((adoa) this.c.get()).e();
        if (e == null || !adigVar.equals(e.k())) {
            return;
        }
        e.D(atcvVar);
    }

    public final void o(adid adidVar) {
        adid u = u(adidVar.n);
        if (u != null) {
            q(u);
        }
        this.h.add(adidVar);
        this.g.add(adidVar);
        v();
    }

    public final void p(adif adifVar) {
        if (this.g.contains(adifVar)) {
            return;
        }
        adnt e = ((adoa) this.c.get()).e();
        Iterator it = this.b.iterator();
        boolean z = true;
        while (it.hasNext()) {
            adif adifVar2 = (adif) it.next();
            if (adifVar2.e().equals(adifVar.e())) {
                if (e == null || !e.k().equals(adifVar2)) {
                    String.valueOf(String.valueOf(adifVar2)).length();
                    r(adifVar2);
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            this.b.add(adifVar);
            this.g.add(adifVar);
        }
        v();
    }

    public final void q(adid adidVar) {
        this.h.remove(adidVar);
        this.g.remove(adidVar);
        this.e.remove(adidVar.n);
        v();
    }

    public final void r(adif adifVar) {
        String.valueOf(String.valueOf(adifVar)).length();
        this.b.remove(adifVar);
        this.g.remove(adifVar);
        v();
    }

    public final void s() {
        this.l.removeMessages(2);
        if (!((adwc) this.p.get()).g(3)) {
            if (!this.h.isEmpty()) {
                zep.h(a, "Network conditions unsatisfactory. Removing all DIAL screens.");
            }
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                adid adidVar = (adid) it.next();
                this.g.remove(adidVar);
                n(adidVar, m(adidVar));
            }
            v();
            this.h.clear();
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        newSetFromMap.addAll(this.h);
        Handler handler = this.l;
        handler.sendMessageDelayed(Message.obtain(handler, 2, newSetFromMap), 9500L);
        synchronized (this.q) {
            adpq adpqVar = this.r;
            if (adpqVar != null) {
                this.m.f(adpqVar);
            }
            adpq adpqVar2 = new adpq(this, newSetFromMap);
            this.r = adpqVar2;
            this.m.b(adpqVar2);
        }
    }

    public final void t() {
        if (!((adwc) this.p.get()).f()) {
            if (!this.g.isEmpty()) {
                zep.h(a, "Network conditions unsatisfactory. Removing all manual pairing screens.");
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                adif adifVar = (adif) it.next();
                this.g.remove(adifVar);
                n(adifVar, atcv.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE);
            }
            v();
            this.b.clear();
            return;
        }
        adqq adqqVar = (adqq) this.j.get();
        yiw yiwVar = this.i;
        final adqp adqpVar = new adqp(adqqVar, yiwVar, yiwVar);
        ylx.k(adqqVar.e.a(), adqqVar.a, adkd.g, new ylw() { // from class: adqm
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                int i = adqq.i;
                yiw.this.b(null, (List) obj);
            }
        });
    }

    public final adid u(adit aditVar) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            adid adidVar = (adid) it.next();
            if (adidVar.n.equals(aditVar)) {
                return adidVar;
            }
        }
        return null;
    }
}
