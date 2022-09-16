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
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aql  reason: default package */
/* loaded from: classes2.dex */
public final class aql extends aqy {
    final MediaRouter2 a;
    final aqd b;
    final Map<MediaRouter2.RoutingController, aqh> c;
    public List<MediaRoute2Info> d;
    private final MediaRouter2.RouteCallback m;
    private final MediaRouter2.TransferCallback n;
    private final MediaRouter2.ControllerCallback o;
    private final Handler p;
    private final Executor q;
    private final Map<String, String> r;

    public aql(Context context, aqd aqdVar) {
        super(context, null);
        this.c = new ArrayMap();
        this.m = new aqj(this);
        this.n = new aqk(this);
        this.o = new aqe(this);
        this.d = new ArrayList();
        this.r = new ArrayMap();
        this.a = MediaRouter2.getInstance(context);
        this.b = aqdVar;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.p = handler;
        this.q = new Executor(handler) { // from class: apz
            private final Handler a;

            {
                this.a = handler;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        };
    }

    @Override // defpackage.aqy
    public final aqx Ne(String str, String str2) {
        String str3 = this.r.get(str);
        for (aqh aqhVar : this.c.values()) {
            if (TextUtils.equals(str2, aqhVar.b.getId())) {
                return new aqi(str3, aqhVar);
            }
        }
        String str4 = "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2;
        return new aqi(str3, null);
    }

    @Override // defpackage.aqy
    public final aqu Nf(String str) {
        for (Map.Entry<MediaRouter2.RoutingController, aqh> entry : this.c.entrySet()) {
            aqh value = entry.getValue();
            if (TextUtils.equals(str, value.a)) {
                return value;
            }
        }
        return null;
    }

    @Override // defpackage.aqy
    public final aqx b(String str) {
        return new aqi(this.r.get(str), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        List<MediaRoute2Info> list = (List) this.a.getRoutes().stream().distinct().filter(aqa.a).collect(Collectors.toList());
        if (list.equals(this.d)) {
            return;
        }
        this.d = list;
        this.r.clear();
        for (MediaRoute2Info mediaRoute2Info : this.d) {
            Bundle extras = mediaRoute2Info.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                String str = "Cannot find the original route Id. route=" + mediaRoute2Info;
            } else {
                this.r.put(mediaRoute2Info.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        List<aqn> list2 = (List) this.d.stream().map(aqb.a).filter(aqc.a).collect(Collectors.toList());
        aqz aqzVar = new aqz();
        aqzVar.a = true;
        if (list2 == null) {
            throw new IllegalArgumentException("routes must not be null");
        }
        if (!list2.isEmpty()) {
            for (aqn aqnVar : list2) {
                aqzVar.b(aqnVar);
            }
        }
        Nd(aqzVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(MediaRouter2.RoutingController routingController) {
        aqh aqhVar = this.c.get(routingController);
        if (aqhVar == null) {
            String str = "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController;
            return;
        }
        List<String> b = aru.b(routingController.getSelectedRoutes());
        aqn a = aru.a(routingController.getSelectedRoutes().get(0));
        Bundle controlHints = routingController.getControlHints();
        String string = this.e.getString(R.string.mr_dialog_default_group_name);
        aqn aqnVar = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (true != TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    aqnVar = aqn.u(bundle);
                }
            } catch (Exception unused) {
            }
        }
        if (aqnVar == null) {
            aqm aqmVar = new aqm(routingController.getId(), string);
            aqmVar.c(2);
            aqmVar.h(1);
            aqmVar.j(routingController.getVolume());
            aqmVar.l(routingController.getVolumeMax());
            aqmVar.k(routingController.getVolumeHandling());
            aqmVar.b(a.j());
            if (b == null) {
                throw new IllegalArgumentException("groupMemberIds must not be null");
            }
            if (!b.isEmpty()) {
                for (String str2 : b) {
                    if (!TextUtils.isEmpty(str2)) {
                        if (aqmVar.b == null) {
                            aqmVar.b = new ArrayList<>();
                        }
                        if (!aqmVar.b.contains(str2)) {
                            aqmVar.b.add(str2);
                        }
                    } else {
                        throw new IllegalArgumentException("groupMemberId must not be empty");
                    }
                }
            }
            aqnVar = aqmVar.a();
        }
        List<String> b2 = aru.b(routingController.getSelectableRoutes());
        List<String> b3 = aru.b(routingController.getDeselectableRoutes());
        ara araVar = this.k;
        if (araVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<aqn> list = araVar.a;
        if (!list.isEmpty()) {
            for (aqn aqnVar2 : list) {
                String a2 = aqnVar2.a();
                aqs aqsVar = new aqs(aqnVar2);
                aqsVar.b = true != b.contains(a2) ? 1 : 3;
                b2.contains(a2);
                b3.contains(a2);
                arrayList.add(new aqt(aqsVar.a, aqsVar.b));
            }
        }
        aqhVar.k(aqnVar, arrayList);
    }

    @Override // defpackage.aqy
    public final void a(aqo aqoVar) {
        RouteDiscoveryPreference build;
        if (arv.a == null || arv.a.q <= 0) {
            this.a.unregisterRouteCallback(this.m);
            this.a.unregisterTransferCallback(this.n);
            this.a.unregisterControllerCallback(this.o);
            return;
        }
        if (aqoVar == null) {
            aqoVar = new aqo(arc.c, false);
        }
        List<String> a = aqoVar.a().a();
        a.remove("android.media.intent.category.LIVE_AUDIO");
        arb arbVar = new arb();
        arbVar.b(a);
        aqo aqoVar2 = new aqo(arbVar.a(), aqoVar.b());
        MediaRouter2 mediaRouter2 = this.a;
        Executor executor = this.q;
        MediaRouter2.RouteCallback routeCallback = this.m;
        if (!aqoVar2.c()) {
            build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        } else {
            build = new RouteDiscoveryPreference.Builder((List) aqoVar2.a().a().stream().map(art.a).collect(Collectors.toList()), aqoVar2.b()).build();
        }
        mediaRouter2.registerRouteCallback(executor, routeCallback, build);
        this.a.registerTransferCallback(this.q, this.n);
        this.a.registerControllerCallback(this.q, this.o);
    }
}
