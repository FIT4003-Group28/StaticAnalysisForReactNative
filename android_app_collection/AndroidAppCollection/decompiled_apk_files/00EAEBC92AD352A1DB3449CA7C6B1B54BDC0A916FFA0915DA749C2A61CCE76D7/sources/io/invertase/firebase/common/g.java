package io.invertase.firebase.common;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class g {

    /* renamed from: g  reason: collision with root package name */
    private static g f10329g = new g();

    /* renamed from: d  reason: collision with root package name */
    private ReactContext f10333d;

    /* renamed from: f  reason: collision with root package name */
    private int f10335f;

    /* renamed from: a  reason: collision with root package name */
    private final List<e.a.a.a.b> f10330a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f10331b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, Integer> f10332c = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private Boolean f10334e = false;

    public static g b() {
        return f10329g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f10332c) {
            Iterator it = new ArrayList(this.f10330a).iterator();
            while (it.hasNext()) {
                e.a.a.a.b bVar = (e.a.a.a.b) it.next();
                if (this.f10332c.containsKey(bVar.a())) {
                    this.f10330a.remove(bVar);
                    b(bVar);
                }
            }
        }
    }

    private boolean c(e.a.a.a.b bVar) {
        ReactContext reactContext;
        if (this.f10334e.booleanValue() && (reactContext = this.f10333d) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f10333d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + bVar.a(), bVar.b());
                return true;
            } catch (Exception e2) {
                Log.wtf("RNFB_EMITTER", "Error sending Event " + bVar.a(), e2);
            }
        }
        return false;
    }

    public WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putInt("listeners", this.f10335f);
        createMap.putInt("queued", this.f10330a.size());
        synchronized (this.f10332c) {
            for (Map.Entry<String, Integer> entry : this.f10332c.entrySet()) {
                createMap2.putInt(entry.getKey(), entry.getValue().intValue());
            }
        }
        createMap.putMap("events", createMap2);
        return createMap;
    }

    public void a(final ReactContext reactContext) {
        this.f10331b.post(new Runnable() { // from class: io.invertase.firebase.common.d
            @Override // java.lang.Runnable
            public final void run() {
                g.this.b(reactContext);
            }
        });
    }

    public /* synthetic */ void a(e.a.a.a.b bVar) {
        synchronized (this.f10332c) {
            if (!this.f10332c.containsKey(bVar.a()) || !c(bVar)) {
                this.f10330a.add(bVar);
            }
        }
    }

    public /* synthetic */ void a(Boolean bool) {
        this.f10334e = bool;
        c();
    }

    public void a(String str) {
        synchronized (this.f10332c) {
            this.f10335f++;
            if (!this.f10332c.containsKey(str)) {
                this.f10332c.put(str, 1);
            } else {
                this.f10332c.put(str, Integer.valueOf(this.f10332c.get(str).intValue() + 1));
            }
        }
        this.f10331b.post(new Runnable() { // from class: io.invertase.firebase.common.c
            @Override // java.lang.Runnable
            public final void run() {
                g.this.c();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r6, java.lang.Boolean r7) {
        /*
            r5 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r5.f10332c
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.f10332c     // Catch: java.lang.Throwable -> L41
            boolean r1 = r1.containsKey(r6)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L3f
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.f10332c     // Catch: java.lang.Throwable -> L41
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L41
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L41
            r2 = 1
            if (r1 <= r2) goto L2d
            boolean r3 = r7.booleanValue()     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L21
            goto L2d
        L21:
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r5.f10332c     // Catch: java.lang.Throwable -> L41
            int r4 = r1 + (-1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L41
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L41
            goto L32
        L2d:
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r5.f10332c     // Catch: java.lang.Throwable -> L41
            r3.remove(r6)     // Catch: java.lang.Throwable -> L41
        L32:
            int r6 = r5.f10335f     // Catch: java.lang.Throwable -> L41
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L41
            if (r7 == 0) goto L3b
            goto L3c
        L3b:
            r1 = 1
        L3c:
            int r6 = r6 - r1
            r5.f10335f = r6     // Catch: java.lang.Throwable -> L41
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return
        L41:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.invertase.firebase.common.g.a(java.lang.String, java.lang.Boolean):void");
    }

    public /* synthetic */ void b(ReactContext reactContext) {
        this.f10333d = reactContext;
        c();
    }

    public void b(final e.a.a.a.b bVar) {
        this.f10331b.post(new Runnable() { // from class: io.invertase.firebase.common.b
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a(bVar);
            }
        });
    }

    public void b(final Boolean bool) {
        this.f10331b.post(new Runnable() { // from class: io.invertase.firebase.common.a
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a(bool);
            }
        });
    }
}
