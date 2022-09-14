package com.idehub.GoogleAnalyticsBridge;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import java.util.HashMap;
/* compiled from: GoogleAnalyticsBridgeNative.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f4937a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4938b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, Tracker> f4939c = new HashMap<>();

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f4937a == null) {
                f4937a = new a(context);
            }
            aVar = f4937a;
        }
        return aVar;
    }

    public a(Context context) {
        this.f4938b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Tracker a(String str) {
        if (!this.f4939c.containsKey(str)) {
            GoogleAnalytics googleAnalytics = GoogleAnalytics.getInstance(this.f4938b);
            googleAnalytics.setLocalDispatchPeriod(20);
            Tracker newTracker = googleAnalytics.newTracker(str);
            newTracker.enableExceptionReporting(false);
            this.f4939c.put(str, newTracker);
        }
        return this.f4939c.get(str);
    }

    public void a(String str, boolean z) {
        a(str).enableExceptionReporting(z);
    }

    public void a(String str, String str2) {
        Tracker a2 = a(str);
        if (a2 != null) {
            a2.setScreenName(str2);
            a2.send(new HitBuilders.ScreenViewBuilder().build());
        }
    }

    public void a(String str, String str2, String str3, String str4, Number number) {
        Tracker a2 = a(str);
        if (a2 != null) {
            HitBuilders.EventBuilder action = new HitBuilders.EventBuilder().setCategory(str2).setAction(str3);
            if (str4 != null && number != null) {
                action.setLabel(str4);
                action.setValue(number.longValue());
            }
            a2.send(action.build());
        }
    }

    public void a(String str, int i, String str2) {
        Tracker a2 = a(str);
        if (a2 != null) {
            a2.set("&cd" + i, str2);
        }
    }
}
