package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: arm  reason: default package */
/* loaded from: classes2.dex */
public final class arm implements ath, asy {
    public final Context a;
    final boolean b;
    public final aql c;
    public final ati i;
    public asz j;
    public arq k;
    arq l;
    aqx m;
    arq n;
    aqx o;
    public int q;
    arq r;
    private final boolean v;
    private arq x;
    private aqo y;
    private aqo z;
    public final ArrayList<WeakReference<arv>> d = new ArrayList<>();
    public final ArrayList<arq> e = new ArrayList<>();
    public final Map<mx<String, String>, String> f = new HashMap();
    public final ArrayList<arp> g = new ArrayList<>();
    private final ArrayList<arl> t = new ArrayList<>();
    private final ark u = new ark(this);
    final ari h = new ari(this);
    private arw w = new arw(new arg(this));
    final Map<String, aqx> p = new HashMap();
    arh s = new arh(this);

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public arm(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.t = r0
            ark r0 = new ark
            r0.<init>(r3)
            r3.u = r0
            ari r0 = new ari
            r0.<init>(r3)
            r3.h = r0
            arw r0 = new arw
            arg r1 = new arg
            r1.<init>(r3)
            r0.<init>(r1)
            r3.w = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.p = r0
            arh r0 = new arh
            r0.<init>(r3)
            r3.s = r0
            r3.a = r4
            java.util.WeakHashMap<android.content.Context, kx> r0 = defpackage.kx.a
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, kx> r1 = defpackage.kx.a     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> Lc4
            kx r1 = (defpackage.kx) r1     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto L67
            kx r1 = new kx     // Catch: java.lang.Throwable -> Lc4
            r1.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.util.WeakHashMap<android.content.Context, kx> r2 = defpackage.kx.a     // Catch: java.lang.Throwable -> Lc4
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> Lc4
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            boolean r0 = r0.isLowRamDevice()
            r3.v = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto Lab
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<asj> r1 = defpackage.asj.class
            r0.<init>(r4, r1)
            java.lang.String r1 = r4.getPackageName()
            r0.setPackage(r1)
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r2)
            int r0 = r0.size()
            if (r0 <= 0) goto L9a
            r2 = 1
        L9a:
            r3.b = r2
            if (r2 == 0) goto Lad
            aql r0 = new aql
            arj r1 = new arj
            r1.<init>(r3)
            r0.<init>(r4, r1)
            r3.c = r0
            goto Lb0
        Lab:
            r3.b = r2
        Lad:
            r0 = 0
            r3.c = r0
        Lb0:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lbc
            ata r0 = new ata
            r0.<init>(r4, r3)
            goto Lc1
        Lbc:
            atg r0 = new atg
            r0.<init>(r4, r3)
        Lc1:
            r3.i = r0
            return
        Lc4:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc4
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arm.<init>(android.content.Context):void");
    }

    private final int p(String str) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            if (this.e.get(i).c.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private final boolean q(arq arqVar) {
        return arqVar.h() == this.i && arqVar.b("android.media.intent.category.LIVE_AUDIO") && !arqVar.b("android.media.intent.category.LIVE_VIDEO");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final arq a() {
        arq arqVar = this.k;
        if (arqVar != null) {
            return arqVar;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final arq b() {
        arq arqVar = this.l;
        if (arqVar != null) {
            return arqVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(arq arqVar, int i) {
        if (!this.e.contains(arqVar)) {
            String str = "Ignoring attempt to select removed route: " + arqVar;
        } else if (!arqVar.f) {
            String str2 = "Ignoring attempt to select disabled route: " + arqVar;
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                aqy h = arqVar.h();
                aql aqlVar = this.c;
                if (h == aqlVar && this.l != arqVar) {
                    String str3 = arqVar.b;
                    MediaRoute2Info mediaRoute2Info = null;
                    if (str3 != null) {
                        Iterator<MediaRoute2Info> it = aqlVar.d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MediaRoute2Info next = it.next();
                            if (TextUtils.equals(next.getId(), str3)) {
                                mediaRoute2Info = next;
                                break;
                            }
                        }
                    }
                    if (mediaRoute2Info == null) {
                        String str4 = "transferTo: Specified route not found. routeId=" + str3;
                        return;
                    }
                    aqlVar.a.transferTo(mediaRoute2Info);
                    return;
                }
            }
            l(arqVar, i);
        }
    }

    public final void d() {
        aqo aqoVar;
        arv arvVar;
        int i;
        arb arbVar = new arb();
        arw arwVar = this.w;
        arwVar.c = 0L;
        arwVar.e = false;
        arwVar.d = SystemClock.elapsedRealtime();
        arwVar.a.removeCallbacks(arwVar.b);
        int size = this.d.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            arv arvVar2 = this.d.get(size).get();
            if (arvVar2 == null) {
                this.d.remove(size);
            } else {
                int size2 = arvVar2.c.size();
                i2 += size2;
                int i4 = 0;
                while (i4 < size2) {
                    are areVar = arvVar2.c.get(i4);
                    arbVar.d(areVar.c);
                    int i5 = areVar.d & 1;
                    arw arwVar2 = this.w;
                    int i6 = i2;
                    long j = areVar.e;
                    if (i5 != 0) {
                        long j2 = arwVar2.d;
                        if (j2 - j < 30000) {
                            arvVar = arvVar2;
                            i = size2;
                            arwVar2.c = Math.max(arwVar2.c, (j + 30000) - j2);
                            arwVar2.e = true;
                            i3 = ((areVar.d & 4) != 0 || this.v) ? i5 | i3 : 1;
                            i4++;
                            i2 = i6;
                            arvVar2 = arvVar;
                            size2 = i;
                        }
                    }
                    arvVar = arvVar2;
                    i = size2;
                    if ((areVar.d & 4) != 0) {
                    }
                    i4++;
                    i2 = i6;
                    arvVar2 = arvVar;
                    size2 = i;
                }
            }
        }
        arw arwVar3 = this.w;
        if (arwVar3.e) {
            long j3 = arwVar3.c;
            if (j3 > 0) {
                arwVar3.a.postDelayed(arwVar3.b, j3);
            }
        }
        boolean z = arwVar3.e;
        this.q = i2;
        arc a = i3 != 0 ? arbVar.a() : arc.c;
        arc a2 = arbVar.a();
        if (this.b && ((aqoVar = this.z) == null || !aqoVar.a().equals(a2) || this.z.b() != z)) {
            if (!a2.c() || z) {
                this.z = new aqo(a2, z);
            } else if (this.z != null) {
                this.z = null;
            }
            this.c.Nc(this.z);
        }
        aqo aqoVar2 = this.y;
        if (aqoVar2 == null || !aqoVar2.a().equals(a) || this.y.b() != z) {
            if (!a.c() || z) {
                this.y = new aqo(a, z);
            } else if (this.y == null) {
                return;
            } else {
                this.y = null;
            }
            int size3 = this.g.size();
            for (int i7 = 0; i7 < size3; i7++) {
                aqy aqyVar = this.g.get(i7).a;
                if (aqyVar != this.c) {
                    aqyVar.Nc(this.y);
                }
            }
        }
    }

    @Override // defpackage.asy
    public final void e(aqy aqyVar) {
        if (f(aqyVar) == null) {
            arp arpVar = new arp(aqyVar);
            this.g.add(arpVar);
            this.h.a(513, arpVar);
            g(arpVar, aqyVar.k);
            aqyVar.Nb(this.u);
            aqyVar.Nc(this.y);
        }
    }

    public final arp f(aqy aqyVar) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            if (this.g.get(i).a == aqyVar) {
                return this.g.get(i);
            }
        }
        return null;
    }

    public final void g(arp arpVar, ara araVar) {
        boolean z;
        if (arpVar.c != araVar) {
            arpVar.c = araVar;
            int i = 0;
            if (araVar == null || (!araVar.a() && araVar != this.i.k)) {
                String str = "Ignoring invalid provider descriptor: " + araVar;
                z = false;
            } else {
                List<aqn> list = araVar.a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                z = false;
                int i2 = 0;
                for (aqn aqnVar : list) {
                    if (aqnVar == null || !aqnVar.t()) {
                        String str2 = "Ignoring invalid system route descriptor: " + aqnVar;
                    } else {
                        String a = aqnVar.a();
                        int size = arpVar.b.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                i3 = -1;
                                break;
                            } else if (arpVar.b.get(i3).b.equals(a)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 < 0) {
                            arq arqVar = new arq(arpVar, a, i(arpVar, a));
                            int i4 = i2 + 1;
                            arpVar.b.add(i2, arqVar);
                            this.e.add(arqVar);
                            if (aqnVar.b().size() > 0) {
                                arrayList.add(new mx(arqVar, aqnVar));
                            } else {
                                arqVar.g(aqnVar);
                                this.h.a(257, arqVar);
                            }
                            i2 = i4;
                        } else if (i3 < i2) {
                            String str3 = "Ignoring route descriptor with duplicate id: " + aqnVar;
                        } else {
                            arq arqVar2 = arpVar.b.get(i3);
                            int i5 = i2 + 1;
                            Collections.swap(arpVar.b, i3, i2);
                            if (aqnVar.b().size() > 0) {
                                arrayList2.add(new mx(arqVar2, aqnVar));
                            } else if (h(arqVar2, aqnVar) != 0 && arqVar2 == this.l) {
                                i2 = i5;
                                z = true;
                            }
                            i2 = i5;
                        }
                    }
                }
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    mx mxVar = (mx) arrayList.get(i6);
                    arq arqVar3 = (arq) mxVar.a;
                    arqVar3.g((aqn) mxVar.b);
                    this.h.a(257, arqVar3);
                }
                int size3 = arrayList2.size();
                while (i < size3) {
                    mx mxVar2 = (mx) arrayList2.get(i);
                    arq arqVar4 = (arq) mxVar2.a;
                    if (h(arqVar4, (aqn) mxVar2.b) != 0 && arqVar4 == this.l) {
                        z = true;
                    }
                    i++;
                }
                i = i2;
            }
            for (int size4 = arpVar.b.size() - 1; size4 >= i; size4--) {
                arq arqVar5 = arpVar.b.get(size4);
                arqVar5.g(null);
                this.e.remove(arqVar5);
            }
            j(z);
            for (int size5 = arpVar.b.size() - 1; size5 >= i; size5--) {
                this.h.a(258, arpVar.b.remove(size5));
            }
            this.h.a(515, arpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int h(arq arqVar, aqn aqnVar) {
        int g = arqVar.g(aqnVar);
        if (g != 0) {
            if ((g & 1) != 0) {
                this.h.a(259, arqVar);
            }
            if ((g & 2) != 0) {
                this.h.a(260, arqVar);
            }
            if ((g & 4) != 0) {
                this.h.a(261, arqVar);
            }
        }
        return g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String i(arp arpVar, String str) {
        String flattenToShortString = arpVar.b().flattenToShortString();
        String str2 = flattenToShortString + ":" + str;
        if (p(str2) < 0) {
            this.f.put(new mx<>(flattenToShortString, str), str2);
            return str2;
        }
        String str3 = "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route";
        int i = 2;
        while (true) {
            String format = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i));
            if (p(format) < 0) {
                this.f.put(new mx<>(flattenToShortString, str), format);
                return format;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z) {
        arq arqVar = this.k;
        if (arqVar != null && !arqVar.c()) {
            String str = "Clearing the default route because it is no longer selectable: " + this.k;
            this.k = null;
        }
        if (this.k == null && !this.e.isEmpty()) {
            ArrayList<arq> arrayList = this.e;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                arq arqVar2 = arrayList.get(i);
                if (arqVar2.h() == this.i && arqVar2.b.equals("DEFAULT_ROUTE") && arqVar2.c()) {
                    this.k = arqVar2;
                    String str2 = "Found default route: " + this.k;
                    break;
                }
                i++;
            }
        }
        arq arqVar3 = this.x;
        if (arqVar3 != null && !arqVar3.c()) {
            String str3 = "Clearing the bluetooth route because it is no longer selectable: " + this.x;
            this.x = null;
        }
        if (this.x == null && !this.e.isEmpty()) {
            ArrayList<arq> arrayList2 = this.e;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                arq arqVar4 = arrayList2.get(i2);
                if (q(arqVar4) && arqVar4.c()) {
                    this.x = arqVar4;
                    String str4 = "Found bluetooth route: " + this.x;
                    break;
                }
                i2++;
            }
        }
        arq arqVar5 = this.l;
        if (arqVar5 != null && arqVar5.f) {
            if (!z) {
                return;
            }
            m();
            n();
            return;
        }
        String str5 = "Unselecting the current route because it is no longer selectable: " + this.l;
        l(k(), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final arq k() {
        ArrayList<arq> arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arq arqVar = arrayList.get(i);
            if (arqVar != this.k && q(arqVar) && arqVar.c()) {
                return arqVar;
            }
        }
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(arq arqVar, int i) {
        ara araVar;
        Executor aklVar;
        if (arv.a == null || (this.x != null && arqVar.a())) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 3; i2 < stackTrace.length; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                sb.append(stackTraceElement.getClassName());
                sb.append(".");
                sb.append(stackTraceElement.getMethodName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                sb.append("  ");
            }
            if (arv.a == null) {
                String str = "setSelectedRouteInternal is called while sGlobal is null: pkgName=" + this.a.getPackageName() + ", callers=" + sb.toString();
            } else {
                String str2 = "Default route is selected while a BT route is available: pkgName=" + this.a.getPackageName() + ", callers=" + sb.toString();
            }
        }
        if (this.l == arqVar) {
            return;
        }
        if (this.n != null) {
            this.n = null;
            aqx aqxVar = this.o;
            if (aqxVar != null) {
                aqxVar.i(3);
                this.o.c();
                this.o = null;
            }
        }
        if (this.b && (araVar = arqVar.a.c) != null && araVar.b) {
            aqu Nf = arqVar.h().Nf(arqVar.b);
            if (Nf != null) {
                Context context = this.a;
                if (Build.VERSION.SDK_INT >= 28) {
                    aklVar = context.getMainExecutor();
                } else {
                    aklVar = new akl(new Handler(context.getMainLooper()));
                }
                arh arhVar = this.s;
                synchronized (Nf.i) {
                    if (aklVar == null) {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                    if (arhVar != null) {
                        Nf.j = aklVar;
                        Nf.m = arhVar;
                        Collection<aqt> collection = Nf.l;
                        if (collection != null && !collection.isEmpty()) {
                            aqn aqnVar = Nf.k;
                            Collection<aqt> collection2 = Nf.l;
                            Nf.k = null;
                            Nf.l = null;
                            Nf.j.execute(new aqq(Nf, arhVar, aqnVar, collection2));
                        }
                    } else {
                        throw new NullPointerException("Listener shouldn't be null");
                    }
                }
                this.n = arqVar;
                this.o = Nf;
                Nf.g();
                return;
            }
            String str3 = "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + arqVar;
        }
        arq arqVar2 = this.l;
        o(i);
        aqx b = arqVar.h().b(arqVar.b);
        this.m = b;
        this.l = arqVar;
        if (b != null) {
            b.g();
        }
        this.h.b(262, new mx(arqVar2, this.l), i);
        this.p.clear();
        m();
        n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        if (!this.l.e()) {
            return;
        }
        List<arq> f = this.l.f();
        HashSet hashSet = new HashSet();
        for (arq arqVar : f) {
            hashSet.add(arqVar.c);
        }
        Iterator<Map.Entry<String, aqx>> it = this.p.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, aqx> next = it.next();
            if (!hashSet.contains(next.getKey())) {
                aqx value = next.getValue();
                value.i(0);
                value.c();
                it.remove();
            }
        }
        for (arq arqVar2 : f) {
            if (!this.p.containsKey(arqVar2.c)) {
                aqx Ne = arqVar2.h().Ne(arqVar2.b, this.l.b);
                Ne.g();
                this.p.put(arqVar2.c, Ne);
            }
        }
    }

    public final void n() {
        MediaRouter2.RoutingController routingController;
        arq arqVar = this.l;
        if (arqVar != null) {
            if (this.b && arqVar.h() == this.c) {
                aqx aqxVar = this.m;
                if ((aqxVar instanceof aqh) && (routingController = ((aqh) aqxVar).b) != null) {
                    routingController.getId();
                }
            }
            if (this.t.size() <= 0) {
                return;
            }
            this.t.get(0);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(int i) {
        if (this.l == null) {
            return;
        }
        aro aroVar = new aro(this, i);
        this.r = this.l;
        aroVar.a();
        this.h.b(263, this.l, i);
        this.m = null;
        this.p.clear();
        this.l = null;
    }
}
