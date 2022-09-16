package com.dieam.reactnativepushnotification.modules;

import android.os.Bundle;
import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {
    private final String A;
    private final boolean B;
    private final String C;
    private final String D;
    private final double E;
    private final boolean F;
    private final boolean G;
    private final boolean H;
    private final boolean I;

    /* renamed from: a  reason: collision with root package name */
    private final String f5116a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5117b;

    /* renamed from: c  reason: collision with root package name */
    private final double f5118c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5119d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5120e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5121f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5122g;

    /* renamed from: h  reason: collision with root package name */
    private final String f5123h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private final boolean v;
    private final String w;
    private final boolean x;
    private final boolean y;
    private final double z;

    /* renamed from: com.dieam.reactnativepushnotification.modules.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0113a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5124a = new int[ReadableType.values().length];

        static {
            try {
                f5124a[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5124a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5124a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5124a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5124a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5124a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public a(Bundle bundle) {
        this.f5116a = bundle.getString("id");
        this.f5117b = bundle.getString("message");
        this.f5118c = bundle.getDouble("fireDate");
        this.f5119d = bundle.getString("title");
        this.f5120e = bundle.getString("ticker");
        this.f5121f = bundle.getBoolean("showWhen");
        this.f5122g = bundle.getBoolean("autoCancel");
        this.f5123h = bundle.getString("largeIcon");
        this.i = bundle.getString("largeIconUrl");
        this.j = bundle.getString("smallIcon");
        this.k = bundle.getString("bigText");
        this.l = bundle.getString("subText");
        this.m = bundle.getString("bigPictureUrl");
        this.n = bundle.getString("shortcutId");
        this.o = bundle.getString("number");
        this.p = bundle.getString("channelId");
        this.q = bundle.getString("channelName");
        this.r = bundle.getString("channelDescription");
        this.s = bundle.getString("sound");
        this.t = bundle.getString("color");
        this.u = bundle.getString("group");
        this.v = bundle.getBoolean("groupSummary");
        this.w = bundle.getString("messageId");
        this.x = bundle.getBoolean("playSound");
        this.y = bundle.getBoolean("vibrate");
        this.z = bundle.getDouble("vibration");
        this.A = bundle.getString("actions");
        this.B = bundle.getBoolean("invokeApp");
        this.C = bundle.getString("tag");
        this.D = bundle.getString("repeatType");
        this.E = bundle.getDouble("repeatTime");
        this.F = bundle.getBoolean("onlyAlertOnce");
        this.G = bundle.getBoolean("ongoing");
        this.H = bundle.getBoolean("allowWhileIdle");
        this.I = bundle.getBoolean("ignoreInForeground");
    }

    private a(JSONObject jSONObject) {
        try {
            String str = null;
            this.f5116a = jSONObject.has("id") ? jSONObject.getString("id") : null;
            this.f5117b = jSONObject.has("message") ? jSONObject.getString("message") : null;
            double d2 = 0.0d;
            this.f5118c = jSONObject.has("fireDate") ? jSONObject.getDouble("fireDate") : 0.0d;
            this.f5119d = jSONObject.has("title") ? jSONObject.getString("title") : null;
            this.f5120e = jSONObject.has("ticker") ? jSONObject.getString("ticker") : null;
            boolean z = true;
            this.f5121f = jSONObject.has("showWhen") ? jSONObject.getBoolean("showWhen") : true;
            this.f5122g = jSONObject.has("autoCancel") ? jSONObject.getBoolean("autoCancel") : true;
            this.f5123h = jSONObject.has("largeIcon") ? jSONObject.getString("largeIcon") : null;
            this.i = jSONObject.has("largeIconUrl") ? jSONObject.getString("largeIconUrl") : null;
            this.j = jSONObject.has("smallIcon") ? jSONObject.getString("smallIcon") : null;
            this.k = jSONObject.has("bigText") ? jSONObject.getString("bigText") : null;
            this.l = jSONObject.has("subText") ? jSONObject.getString("subText") : null;
            this.m = jSONObject.has("bigPictureUrl") ? jSONObject.getString("bigPictureUrl") : null;
            this.n = jSONObject.has("shortcutId") ? jSONObject.getString("shortcutId") : null;
            this.o = jSONObject.has("number") ? jSONObject.getString("number") : null;
            this.p = jSONObject.has("channelId") ? jSONObject.getString("channelId") : null;
            this.q = jSONObject.has("channelName") ? jSONObject.getString("channelName") : null;
            this.r = jSONObject.has("channelDescription") ? jSONObject.getString("channelDescription") : null;
            this.s = jSONObject.has("sound") ? jSONObject.getString("sound") : null;
            this.t = jSONObject.has("color") ? jSONObject.getString("color") : null;
            this.u = jSONObject.has("group") ? jSONObject.getString("group") : null;
            boolean z2 = false;
            this.v = jSONObject.has("groupSummary") ? jSONObject.getBoolean("groupSummary") : false;
            this.w = jSONObject.has("messageId") ? jSONObject.getString("messageId") : null;
            this.x = jSONObject.has("playSound") ? jSONObject.getBoolean("playSound") : true;
            this.y = jSONObject.has("vibrate") ? jSONObject.getBoolean("vibrate") : true;
            this.z = jSONObject.has("vibration") ? jSONObject.getDouble("vibration") : 1000.0d;
            this.A = jSONObject.has("actions") ? jSONObject.getString("actions") : null;
            this.B = jSONObject.has("invokeApp") ? jSONObject.getBoolean("invokeApp") : z;
            this.C = jSONObject.has("tag") ? jSONObject.getString("tag") : null;
            this.D = jSONObject.has("repeatType") ? jSONObject.getString("repeatType") : str;
            this.E = jSONObject.has("repeatTime") ? jSONObject.getDouble("repeatTime") : d2;
            this.F = jSONObject.has("onlyAlertOnce") ? jSONObject.getBoolean("onlyAlertOnce") : false;
            this.G = jSONObject.has("ongoing") ? jSONObject.getBoolean("ongoing") : false;
            this.H = jSONObject.has("allowWhileIdle") ? jSONObject.getBoolean("allowWhileIdle") : false;
            this.I = jSONObject.has("ignoreInForeground") ? jSONObject.getBoolean("ignoreInForeground") : z2;
        } catch (JSONException e2) {
            throw new IllegalStateException("Exception while initializing RNPushNotificationAttributes from JSON", e2);
        }
    }

    public static a a(String str) {
        return new a(new JSONObject(str));
    }

    public double a() {
        return this.f5118c;
    }

    public boolean a(ReadableMap readableMap) {
        Bundle h2 = h();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (!h2.containsKey(nextKey)) {
                return false;
            }
            switch (C0113a.f5124a[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    if (h2.get(nextKey) == null) {
                        break;
                    } else {
                        return false;
                    }
                case 2:
                    if (readableMap.getBoolean(nextKey) == h2.getBoolean(nextKey)) {
                        break;
                    } else {
                        return false;
                    }
                case 3:
                    if (readableMap.getDouble(nextKey) != h2.getDouble(nextKey) && readableMap.getInt(nextKey) != h2.getInt(nextKey)) {
                        return false;
                    }
                    break;
                case 4:
                    if (readableMap.getString(nextKey).equals(h2.getString(nextKey))) {
                        break;
                    } else {
                        return false;
                    }
                case 5:
                case 6:
                    return false;
            }
        }
        return true;
    }

    public String b() {
        return this.f5116a;
    }

    public String c() {
        return this.f5117b;
    }

    public String d() {
        return this.o;
    }

    public String e() {
        return this.D;
    }

    public String f() {
        return this.s;
    }

    public String g() {
        return this.f5119d;
    }

    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putString("id", this.f5116a);
        bundle.putString("message", this.f5117b);
        bundle.putDouble("fireDate", this.f5118c);
        bundle.putString("title", this.f5119d);
        bundle.putString("ticker", this.f5120e);
        bundle.putBoolean("showWhen", this.f5121f);
        bundle.putBoolean("autoCancel", this.f5122g);
        bundle.putString("largeIcon", this.f5123h);
        bundle.putString("largeIconUrl", this.i);
        bundle.putString("smallIcon", this.j);
        bundle.putString("bigText", this.k);
        bundle.putString("subText", this.l);
        bundle.putString("bigPictureUrl", this.m);
        bundle.putString("shortcutId", this.n);
        bundle.putString("number", this.o);
        bundle.putString("channelId", this.p);
        bundle.putString("channelName", this.q);
        bundle.putString("channelDescription", this.r);
        bundle.putString("sound", this.s);
        bundle.putString("color", this.t);
        bundle.putString("group", this.u);
        bundle.putBoolean("groupSummary", this.v);
        bundle.putString("messageId", this.w);
        bundle.putBoolean("playSound", this.x);
        bundle.putBoolean("vibrate", this.y);
        bundle.putDouble("vibration", this.z);
        bundle.putString("actions", this.A);
        bundle.putBoolean("invokeApp", this.B);
        bundle.putString("tag", this.C);
        bundle.putString("repeatType", this.D);
        bundle.putDouble("repeatTime", this.E);
        bundle.putBoolean("onlyAlertOnce", this.F);
        bundle.putBoolean("ongoing", this.G);
        bundle.putBoolean("allowWhileIdle", this.H);
        bundle.putBoolean("ignoreInForeground", this.I);
        return bundle;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f5116a);
            jSONObject.put("message", this.f5117b);
            jSONObject.put("fireDate", this.f5118c);
            jSONObject.put("title", this.f5119d);
            jSONObject.put("ticker", this.f5120e);
            jSONObject.put("showWhen", this.f5121f);
            jSONObject.put("autoCancel", this.f5122g);
            jSONObject.put("largeIcon", this.f5123h);
            jSONObject.put("largeIconUrl", this.i);
            jSONObject.put("smallIcon", this.j);
            jSONObject.put("bigText", this.k);
            jSONObject.put("bigPictureUrl", this.m);
            jSONObject.put("subText", this.l);
            jSONObject.put("shortcutId", this.n);
            jSONObject.put("number", this.o);
            jSONObject.put("channelId", this.p);
            jSONObject.put("channelName", this.q);
            jSONObject.put("channelDescription", this.r);
            jSONObject.put("sound", this.s);
            jSONObject.put("color", this.t);
            jSONObject.put("group", this.u);
            jSONObject.put("groupSummary", this.v);
            jSONObject.put("messageId", this.w);
            jSONObject.put("playSound", this.x);
            jSONObject.put("vibrate", this.y);
            jSONObject.put("vibration", this.z);
            jSONObject.put("actions", this.A);
            jSONObject.put("invokeApp", this.B);
            jSONObject.put("tag", this.C);
            jSONObject.put("repeatType", this.D);
            jSONObject.put("repeatTime", this.E);
            jSONObject.put("onlyAlertOnce", this.F);
            jSONObject.put("ongoing", this.G);
            jSONObject.put("allowWhileIdle", this.H);
            jSONObject.put("ignoreInForeground", this.I);
            return jSONObject;
        } catch (JSONException e2) {
            Log.e(RNPushNotification.LOG_TAG, "Exception while converting RNPushNotificationAttributes to JSON. Returning an empty object", e2);
            return new JSONObject();
        }
    }

    public String toString() {
        return "RNPushNotificationAttributes{id='" + this.f5116a + "', message='" + this.f5117b + "', fireDate=" + this.f5118c + ", title='" + this.f5119d + "', ticker='" + this.f5120e + "', showWhen=" + this.f5121f + ", autoCancel=" + this.f5122g + ", largeIcon='" + this.f5123h + "', largeIconUrl='" + this.i + "', smallIcon='" + this.j + "', bigText='" + this.k + "', subText='" + this.l + "', bigPictureUrl='" + this.m + "', shortcutId='" + this.n + "', number='" + this.o + "', channelId='" + this.p + "', channelName='" + this.p + "', channelDescription='" + this.r + "', sound='" + this.s + "', color='" + this.t + "', group='" + this.u + "', groupSummary='" + this.v + "', messageId='" + this.w + "', playSound=" + this.x + ", vibrate=" + this.y + ", vibration=" + this.z + ", actions='" + this.A + "', invokeApp=" + this.B + ", tag='" + this.C + "', repeatType='" + this.D + "', repeatTime=" + this.E + ", onlyAlertOnce=" + this.F + ", ongoing=" + this.G + ", allowWhileIdle=" + this.H + ", ignoreInForeground=" + this.I + '}';
    }
}
