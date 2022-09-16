package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfy  reason: default package */
/* loaded from: classes2.dex */
public final class bfy extends bgk {
    final MediaRouter2 a;
    final bfq b;
    final Map c;
    public List d;
    private final MediaRouter2.RouteCallback m;
    private final MediaRouter2.TransferCallback n;
    private final MediaRouter2.ControllerCallback o;
    private final Handler p;
    private final Executor q;
    private final Map r;

    public bfy(Context context, bfq bfqVar) {
        super(context);
        this.c = new ArrayMap();
        this.m = new bfw(this);
        this.n = new bfx(this);
        this.o = new bfr(this);
        this.d = new ArrayList();
        this.r = new ArrayMap();
        this.a = MediaRouter2.getInstance(context);
        this.b = bfqVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.p = handler;
        this.q = new pmc(handler, 1);
    }

    @Override // defpackage.bgk
    public final bgj b(String str) {
        return new bfv((String) this.r.get(str), null);
    }

    @Override // defpackage.bgk
    public final void d(bgb bgbVar) {
        RouteDiscoveryPreference build;
        char c;
        if (bhd.a == null || bhd.a().y <= 0) {
            this.a.unregisterRouteCallback(this.m);
            this.a.unregisterTransferCallback(this.n);
            this.a.unregisterControllerCallback(this.o);
            return;
        }
        boolean f = bhd.f();
        if (bgbVar == null) {
            bgbVar = new bgb(bgo.a, false);
        }
        List b = bgbVar.a().b();
        if (f) {
            if (!b.contains("android.media.intent.category.LIVE_AUDIO")) {
                b.add("android.media.intent.category.LIVE_AUDIO");
            }
        } else {
            b.remove("android.media.intent.category.LIVE_AUDIO");
        }
        bgn bgnVar = new bgn();
        bgnVar.b(b);
        bgb bgbVar2 = new bgb(bgnVar.a(), bgbVar.b());
        MediaRouter2 mediaRouter2 = this.a;
        Executor executor = this.q;
        MediaRouter2.RouteCallback routeCallback = this.m;
        if (!bgbVar2.c()) {
            build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        } else {
            boolean b2 = bgbVar2.b();
            ArrayList arrayList = new ArrayList();
            for (String str : bgbVar2.a().b()) {
                int hashCode = str.hashCode();
                if (hashCode == -2065577523) {
                    if (str.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                        c = 2;
                    }
                    c = 65535;
                } else if (hashCode != 956939050) {
                    if (hashCode == 975975375 && str.equals("android.media.intent.category.LIVE_VIDEO")) {
                        c = 1;
                    }
                    c = 65535;
                } else {
                    if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                        c = 0;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    str = "android.media.route.feature.LIVE_AUDIO";
                } else if (c == 1) {
                    str = "android.media.route.feature.LIVE_VIDEO";
                } else if (c == 2) {
                    str = "android.media.route.feature.REMOTE_PLAYBACK";
                }
                arrayList.add(str);
            }
            build = new RouteDiscoveryPreference.Builder(arrayList, b2).build();
        }
        mediaRouter2.registerRouteCallback(executor, routeCallback, build);
        this.a.registerTransferCallback(this.q, this.n);
        this.a.registerControllerCallback(this.q, this.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (MediaRoute2Info mediaRoute2Info : this.a.getRoutes()) {
            if (mediaRoute2Info != null && !arraySet.contains(mediaRoute2Info) && !mediaRoute2Info.isSystemRoute()) {
                arraySet.add(mediaRoute2Info);
                arrayList.add(mediaRoute2Info);
            }
        }
        if (arrayList.equals(this.d)) {
            return;
        }
        this.d = arrayList;
        this.r.clear();
        for (MediaRoute2Info mediaRoute2Info2 : this.d) {
            Bundle extras = mediaRoute2Info2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2Info2);
            } else {
                this.r.put(mediaRoute2Info2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList<bga> arrayList2 = new ArrayList();
        for (MediaRoute2Info mediaRoute2Info3 : this.d) {
            bga g = kv.g(mediaRoute2Info3);
            if (mediaRoute2Info3 != null) {
                arrayList2.add(g);
            }
        }
        bgl bglVar = new bgl();
        bglVar.a = true;
        if (!arrayList2.isEmpty()) {
            for (bga bgaVar : arrayList2) {
                bglVar.b(bgaVar);
            }
        }
        jL(bglVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(MediaRouter2.RoutingController routingController) {
        bfu bfuVar = (bfu) this.c.get(routingController);
        if (bfuVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        List<String> h = kv.h(selectedRoutes);
        bga g = kv.g(selectedRoutes.get(0));
        Bundle controlHints = routingController.getControlHints();
        String string = this.e.getString(R.string.mr_dialog_default_group_name);
        bga bgaVar = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (true != TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    bgaVar = bga.l(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (bgaVar == null) {
            bfz bfzVar = new bfz(routingController.getId(), string);
            bfzVar.d(2);
            bfzVar.i(1);
            bfzVar.k(routingController.getVolume());
            bfzVar.m(routingController.getVolumeMax());
            bfzVar.l(routingController.getVolumeHandling());
            bfzVar.c(g.p());
            if (!h.isEmpty()) {
                for (String str : h) {
                    if (!TextUtils.isEmpty(str)) {
                        if (bfzVar.b == null) {
                            bfzVar.b = new ArrayList();
                        }
                        if (!bfzVar.b.contains(str)) {
                            bfzVar.b.add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("groupMemberId must not be empty");
                    }
                }
            }
            bgaVar = bfzVar.a();
        }
        List h2 = kv.h(routingController.getSelectableRoutes());
        List h3 = kv.h(routingController.getDeselectableRoutes());
        bgm bgmVar = this.k;
        if (bgmVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<bga> list = bgmVar.a;
        if (!list.isEmpty()) {
            for (bga bgaVar2 : list) {
                String n = bgaVar2.n();
                bge bgeVar = new bge(bgaVar2);
                bgeVar.b = true != h.contains(n) ? 1 : 3;
                h2.contains(n);
                h3.contains(n);
                arrayList.add(new bgf(bgeVar.a, bgeVar.b));
            }
        }
        bfuVar.i = bgaVar;
        bfuVar.k(bgaVar, arrayList);
    }

    @Override // defpackage.bgk
    public final bgg jI(String str) {
        for (Map.Entry entry : this.c.entrySet()) {
            bfu bfuVar = (bfu) entry.getValue();
            if (TextUtils.equals(str, bfuVar.a)) {
                return bfuVar;
            }
        }
        return null;
    }

    @Override // defpackage.bgk
    public final bgj jJ(String str, String str2) {
        String id;
        String str3 = (String) this.r.get(str);
        for (bfu bfuVar : this.c.values()) {
            bga bgaVar = bfuVar.i;
            if (bgaVar != null) {
                id = bgaVar.n();
            } else {
                id = bfuVar.b.getId();
            }
            if (TextUtils.equals(str2, id)) {
                return new bfv(str3, bfuVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new bfv(str3, null);
    }
}
