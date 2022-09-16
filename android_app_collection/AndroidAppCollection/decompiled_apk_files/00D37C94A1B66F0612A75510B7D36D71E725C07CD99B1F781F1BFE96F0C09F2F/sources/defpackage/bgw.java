package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.VolumeProvider;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import com.google.common.util.concurrent.SettableFuture;
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
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: bgw  reason: default package */
/* loaded from: classes2.dex */
public final class bgw implements bii, bhy {
    bha A;
    public bgv B;
    public iz C;
    private bgb E;
    final Context a;
    boolean b;
    bij c;
    bhz d;
    boolean e;
    bfy f;
    public final boolean n;
    public bhe o;
    public bhm p;
    bhc q;
    public bhc r;
    public bhc s;
    public bgj t;
    bhc u;
    bgj v;
    public bgb x;
    public int y;
    public bgx z;
    final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final Map i = new HashMap();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    final bia l = new bia();
    private final bgc F = new bgc(this);
    final bgs m = new bgs(this);
    final Map w = new HashMap();
    final bgr D = new bgr(this);

    public bgw(Context context) {
        this.a = context;
        this.n = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    private final int p(String str) {
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            if (((bhc) this.h.get(i)).c.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private final boolean q(bhc bhcVar) {
        return bhcVar.c() == this.c && bhcVar.o("android.media.intent.category.LIVE_AUDIO") && !bhcVar.o("android.media.intent.category.LIVE_VIDEO");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(bhc bhcVar, bga bgaVar) {
        int b = bhcVar.b(bgaVar);
        if (b != 0) {
            if ((b & 1) != 0) {
                this.m.a(259, bhcVar);
            }
            if ((b & 2) != 0) {
                this.m.a(260, bhcVar);
            }
            if ((b & 4) != 0) {
                this.m.a(261, bhcVar);
            }
        }
        return b;
    }

    public final bhb b(bgk bgkVar) {
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (((bhb) this.j.get(i)).a == bgkVar) {
                return (bhb) this.j.get(i);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bhc c() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bhc bhcVar = (bhc) arrayList.get(i);
            if (bhcVar != this.q && q(bhcVar) && bhcVar.l()) {
                return bhcVar;
            }
        }
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bhc d() {
        bhc bhcVar = this.q;
        if (bhcVar != null) {
            return bhcVar;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bhc e() {
        bhc bhcVar = this.s;
        if (bhcVar != null) {
            return bhcVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String f(bhb bhbVar, String str) {
        String flattenToShortString = bhbVar.a().flattenToShortString();
        String str2 = flattenToShortString + ":" + str;
        if (p(str2) < 0) {
            this.i.put(new jj(flattenToShortString, str), str2);
            return str2;
        }
        Log.w("MediaRouter", "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
        int i = 2;
        while (true) {
            String format = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i));
            if (p(format) < 0) {
                this.i.put(new jj(flattenToShortString, str), format);
                return format;
            }
            i++;
        }
    }

    @Override // defpackage.bhy
    public final void g(bgk bgkVar) {
        if (b(bgkVar) == null) {
            bhb bhbVar = new bhb(bgkVar);
            this.j.add(bhbVar);
            this.m.a(513, bhbVar);
            n(bhbVar, bgkVar.k);
            bgkVar.jK(this.F);
            bgkVar.jM(this.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        if (!this.s.k()) {
            return;
        }
        List<bhc> d = this.s.d();
        HashSet hashSet = new HashSet();
        for (bhc bhcVar : d) {
            hashSet.add(bhcVar.c);
        }
        Iterator it = this.w.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashSet.contains(entry.getKey())) {
                bgj bgjVar = (bgj) entry.getValue();
                bgjVar.i(0);
                bgjVar.a();
                it.remove();
            }
        }
        for (bhc bhcVar2 : d) {
            if (!this.w.containsKey(bhcVar2.c)) {
                bgj jJ = bhcVar2.c().jJ(bhcVar2.b, this.s.b);
                jJ.g();
                this.w.put(bhcVar2.c, jJ);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(bgw bgwVar, bhc bhcVar, bgj bgjVar, int i, bhc bhcVar2, Collection collection) {
        bgx bgxVar;
        bha bhaVar = this.A;
        if (bhaVar != null) {
            bhaVar.a();
            this.A = null;
        }
        bha bhaVar2 = new bha(bgwVar, bhcVar, bgjVar, i, bhcVar2, collection);
        this.A = bhaVar2;
        if (bhaVar2.b != 3 || (bgxVar = this.z) == null) {
            bhaVar2.b();
            return;
        }
        final bhc bhcVar3 = this.s;
        final bhc bhcVar4 = bhaVar2.c;
        final SettableFuture f = SettableFuture.f();
        final qmm qmmVar = (qmm) bgxVar;
        qmmVar.b.post(new Runnable() { // from class: qml
            @Override // java.lang.Runnable
            public final void run() {
                qku a;
                rve rveVar;
                qmm qmmVar2 = qmm.this;
                bhc bhcVar5 = bhcVar3;
                bhc bhcVar6 = bhcVar4;
                SettableFuture settableFuture = f;
                final qmu qmuVar = qmmVar2.a;
                SessionState sessionState = null;
                if (new HashSet(qmuVar.b).isEmpty()) {
                    settableFuture.o(null);
                } else if (bhcVar5.k != 1 || bhcVar6.k != 0) {
                    settableFuture.o(null);
                } else {
                    qls qlsVar = qmuVar.d;
                    if (qlsVar == null) {
                        a = null;
                    } else {
                        a = qlsVar.a();
                        if (a != null) {
                            a.e = qmuVar;
                        }
                    }
                    if (a == null) {
                        settableFuture.o(null);
                        return;
                    }
                    qoh c = a.c();
                    if (c == null || !c.m()) {
                        qmuVar.a();
                        settableFuture.o(null);
                        return;
                    }
                    qmuVar.f = null;
                    qmuVar.c = 1;
                    qmuVar.e = settableFuture;
                    qnm.g("Must be called from the main thread.");
                    if (c.l()) {
                        MediaStatus e = c.e();
                        qnm.b(e);
                        if ((e.h & 262144) == 0) {
                            rvh rvhVar = new rvh();
                            MediaInfo d = c.d();
                            MediaStatus e2 = c.e();
                            if (d != null && e2 != null) {
                                qkb qkbVar = new qkb();
                                qkbVar.a = d;
                                qkbVar.d = c.c();
                                qkbVar.b = e2.v;
                                qkbVar.b(e2.d);
                                qkbVar.e = e2.k;
                                qkbVar.f = e2.o;
                                MediaLoadRequestData a2 = qkbVar.a();
                                qkg qkgVar = new qkg();
                                qkgVar.a = a2;
                                sessionState = new SessionState(qkgVar.a, null);
                            }
                            rvhVar.b(sessionState);
                            rveVar = rvhVar.a;
                        } else {
                            qpy qpyVar = c.b;
                            JSONObject jSONObject = new JSONObject();
                            long a3 = qpyVar.a();
                            try {
                                jSONObject.put("requestId", a3);
                                jSONObject.put("type", "STORE_SESSION");
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("assistant_supported", true);
                                jSONObject2.put("display_supported", true);
                                jSONObject2.put("is_group", false);
                                jSONObject.put("targetDeviceCapabilities", jSONObject2);
                            } catch (JSONException e3) {
                                qpyVar.a.e(e3, "store session failed to create JSON message", new Object[0]);
                            }
                            try {
                                qpyVar.c(jSONObject.toString(), a3);
                                qpyVar.C.a(a3, new qpv(qpyVar));
                                qpyVar.D = new rvh();
                                rveVar = qpyVar.D.a;
                            } catch (IllegalStateException e4) {
                                rveVar = rwd.b(e4);
                            }
                        }
                    } else {
                        rveVar = rwd.b(new qpx());
                    }
                    rveVar.r(new ruz() { // from class: qmt
                        @Override // defpackage.ruz
                        public final void d(Object obj) {
                            qmu qmuVar2 = qmu.this;
                            SessionState sessionState2 = (SessionState) obj;
                            if (sessionState2 == null) {
                                return;
                            }
                            qmuVar2.f = sessionState2;
                            SettableFuture settableFuture2 = qmuVar2.e;
                            if (settableFuture2 == null) {
                                return;
                            }
                            settableFuture2.o(null);
                        }
                    });
                    rveVar.n(new ruw() { // from class: qms
                        @Override // defpackage.ruw
                        public final void c(Exception exc) {
                            qmu qmuVar2 = qmu.this;
                            qmu.a.e(exc, "Error storing session", new Object[0]);
                            SettableFuture settableFuture2 = qmuVar2.e;
                            if (settableFuture2 != null) {
                                settableFuture2.cancel(false);
                            }
                        }
                    });
                    qmc.d(anfx.CAST_TRANSFER_TO_LOCAL_USED);
                }
            }
        });
        bha bhaVar3 = this.A;
        bgw bgwVar2 = (bgw) bhaVar3.e.get();
        if (bgwVar2 == null || bgwVar2.A != bhaVar3) {
            Log.w("MediaRouter", "Router is released. Cancel transfer");
            bhaVar3.a();
        } else if (bhaVar3.f == null) {
            bhaVar3.f = f;
            bgy bgyVar = new bgy(bhaVar3);
            final bgs bgsVar = bgwVar2.m;
            bgsVar.getClass();
            f.qY(bgyVar, new Executor() { // from class: bgz
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    bgs.this.post(runnable);
                }
            });
        } else {
            throw new IllegalStateException("future is already set");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(bhc bhcVar, int i) {
        if (!this.h.contains(bhcVar)) {
            Log.w("MediaRouter", "Ignoring attempt to select removed route: " + bhcVar);
        } else if (!bhcVar.g) {
            Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + bhcVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                bgk c = bhcVar.c();
                bfy bfyVar = this.f;
                if (c == bfyVar && this.s != bhcVar) {
                    String str = bhcVar.b;
                    MediaRoute2Info mediaRoute2Info = null;
                    if (str != null) {
                        Iterator it = bfyVar.d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MediaRoute2Info mediaRoute2Info2 = (MediaRoute2Info) it.next();
                            if (TextUtils.equals(mediaRoute2Info2.getId(), str)) {
                                mediaRoute2Info = mediaRoute2Info2;
                                break;
                            }
                        }
                    }
                    if (mediaRoute2Info == null) {
                        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
                        return;
                    }
                    bfyVar.a.transferTo(mediaRoute2Info);
                    return;
                }
            }
            k(bhcVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(bhc bhcVar, int i) {
        bgm bgmVar;
        if (bhd.a == null || (this.r != null && bhcVar.i())) {
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
            if (bhd.a == null) {
                Log.w("MediaRouter", "setSelectedRouteInternal is called while sGlobal is null: pkgName=" + this.a.getPackageName() + ", callers=" + sb.toString());
            } else {
                Log.w("MediaRouter", "Default route is selected while a BT route is available: pkgName=" + this.a.getPackageName() + ", callers=" + sb.toString());
            }
        }
        if (this.s == bhcVar) {
            return;
        }
        if (this.u != null) {
            this.u = null;
            bgj bgjVar = this.v;
            if (bgjVar != null) {
                bgjVar.i(3);
                this.v.a();
                this.v = null;
            }
        }
        if (this.e && (bgmVar = bhcVar.a.c) != null && bgmVar.b) {
            bgg jI = bhcVar.c().jI(bhcVar.b);
            if (jI != null) {
                Executor h = ake.h(this.a);
                bgr bgrVar = this.D;
                synchronized (jI.j) {
                    if (h == null) {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                    if (bgrVar != null) {
                        jI.k = h;
                        jI.n = bgrVar;
                        Collection collection = jI.m;
                        if (collection != null && !collection.isEmpty()) {
                            bga bgaVar = jI.l;
                            Collection collection2 = jI.m;
                            jI.l = null;
                            jI.m = null;
                            jI.k.execute(new bgd(jI, bgrVar, bgaVar, collection2, 1));
                        }
                    } else {
                        throw new NullPointerException("Listener shouldn't be null");
                    }
                }
                this.u = bhcVar;
                this.v = jI;
                jI.g();
                return;
            }
            Log.w("MediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + bhcVar);
        }
        bgj b = bhcVar.c().b(bhcVar.b);
        if (b != null) {
            b.g();
        }
        if (this.s == null) {
            this.s = bhcVar;
            this.t = b;
            this.m.b(262, new jj(null, bhcVar), i);
            return;
        }
        i(this, bhcVar, b, i, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgw.l():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        MediaRouter2.RoutingController routingController;
        bhc bhcVar = this.s;
        if (bhcVar != null) {
            bia biaVar = this.l;
            biaVar.a = bhcVar.n;
            biaVar.b = bhcVar.o;
            biaVar.c = bhcVar.a();
            bia biaVar2 = this.l;
            bhc bhcVar2 = this.s;
            biaVar2.d = bhcVar2.l;
            int i = bhcVar2.k;
            if (this.e && bhcVar2.c() == this.f) {
                bia biaVar3 = this.l;
                bgj bgjVar = this.t;
                biaVar3.e = ((bgjVar instanceof bfu) && (routingController = ((bfu) bgjVar).b) != null) ? routingController.getId() : null;
            } else {
                this.l.e = null;
            }
            if (this.k.size() > 0) {
                ku kuVar = (ku) this.k.get(0);
                throw null;
            } else if (this.B == null) {
                return;
            } else {
                if (this.s == d() || this.s == this.r) {
                    this.B.a();
                    return;
                }
                bia biaVar4 = this.l;
                int i2 = biaVar4.c == 1 ? 2 : 0;
                bgv bgvVar = this.B;
                int i3 = biaVar4.b;
                int i4 = biaVar4.a;
                String str = biaVar4.e;
                asd asdVar = bgvVar.b;
                if (asdVar == null || i2 != 0 || i3 != 0) {
                    bgvVar.b = new bgu(bgvVar, i2, i3, i4, str);
                    iz izVar = bgvVar.a;
                    asd asdVar2 = bgvVar.b;
                    if (asdVar2 == null) {
                        throw new IllegalArgumentException("volumeProvider may not be null!");
                    }
                    izVar.b.n(asdVar2);
                    return;
                }
                asdVar.a = i4;
                asc.a((VolumeProvider) asdVar.a(), i4);
                return;
            }
        }
        bgv bgvVar2 = this.B;
        if (bgvVar2 == null) {
            return;
        }
        bgvVar2.a();
    }

    public final void n(bhb bhbVar, bgm bgmVar) {
        int i;
        boolean z;
        if (bhbVar.c != bgmVar) {
            bhbVar.c = bgmVar;
            if (bgmVar == null || (!bgmVar.b() && bgmVar != this.c.k)) {
                Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + bgmVar);
                i = 0;
                z = false;
            } else {
                List<bga> list = bgmVar.a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                z = false;
                int i2 = 0;
                for (bga bgaVar : list) {
                    if (bgaVar == null || !bgaVar.u()) {
                        Log.w("MediaRouter", "Ignoring invalid system route descriptor: " + bgaVar);
                    } else {
                        String n = bgaVar.n();
                        int size = bhbVar.b.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                i3 = -1;
                                break;
                            } else if (((bhc) bhbVar.b.get(i3)).b.equals(n)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 < 0) {
                            bhc bhcVar = new bhc(bhbVar, n, f(bhbVar, n));
                            int i4 = i2 + 1;
                            bhbVar.b.add(i2, bhcVar);
                            this.h.add(bhcVar);
                            if (bgaVar.q().size() > 0) {
                                arrayList.add(new jj(bhcVar, bgaVar));
                            } else {
                                bhcVar.b(bgaVar);
                                this.m.a(257, bhcVar);
                            }
                            i2 = i4;
                        } else if (i3 < i2) {
                            Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + bgaVar);
                        } else {
                            bhc bhcVar2 = (bhc) bhbVar.b.get(i3);
                            int i5 = i2 + 1;
                            Collections.swap(bhbVar.b, i3, i2);
                            if (bgaVar.q().size() > 0) {
                                arrayList2.add(new jj(bhcVar2, bgaVar));
                            } else if (a(bhcVar2, bgaVar) != 0 && bhcVar2 == this.s) {
                                i2 = i5;
                                z = true;
                            }
                            i2 = i5;
                        }
                    }
                }
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    jj jjVar = (jj) arrayList.get(i6);
                    bhc bhcVar3 = (bhc) jjVar.a;
                    bhcVar3.b((bga) jjVar.b);
                    this.m.a(257, bhcVar3);
                }
                int size3 = arrayList2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    jj jjVar2 = (jj) arrayList2.get(i7);
                    bhc bhcVar4 = (bhc) jjVar2.a;
                    if (a(bhcVar4, (bga) jjVar2.b) != 0 && bhcVar4 == this.s) {
                        z = true;
                    }
                }
                i = i2;
            }
            for (int size4 = bhbVar.b.size() - 1; size4 >= i; size4--) {
                bhc bhcVar5 = (bhc) bhbVar.b.get(size4);
                bhcVar5.b(null);
                this.h.remove(bhcVar5);
            }
            o(z);
            for (int size5 = bhbVar.b.size() - 1; size5 >= i; size5--) {
                this.m.a(258, (bhc) bhbVar.b.remove(size5));
            }
            this.m.a(515, bhbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(boolean z) {
        bhc bhcVar = this.q;
        if (bhcVar != null && !bhcVar.l()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing the default route because it is no longer selectable: ");
            sb.append(this.q);
            this.q = null;
        }
        if (this.q == null && !this.h.isEmpty()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                bhc bhcVar2 = (bhc) arrayList.get(i);
                if (bhcVar2.c() == this.c && bhcVar2.b.equals("DEFAULT_ROUTE") && bhcVar2.l()) {
                    this.q = bhcVar2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Found default route: ");
                    sb2.append(this.q);
                    break;
                }
                i++;
            }
        }
        bhc bhcVar3 = this.r;
        if (bhcVar3 != null && !bhcVar3.l()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Clearing the bluetooth route because it is no longer selectable: ");
            sb3.append(this.r);
            this.r = null;
        }
        if (this.r == null && !this.h.isEmpty()) {
            ArrayList arrayList2 = this.h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                bhc bhcVar4 = (bhc) arrayList2.get(i2);
                if (q(bhcVar4) && bhcVar4.l()) {
                    this.r = bhcVar4;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Found bluetooth route: ");
                    sb4.append(this.r);
                    break;
                }
                i2++;
            }
        }
        bhc bhcVar5 = this.s;
        if (bhcVar5 == null || !bhcVar5.g) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Unselecting the current route because it is no longer selectable: ");
            sb5.append(this.s);
            k(c(), 0);
        } else if (!z) {
        } else {
            h();
            m();
        }
    }
}
