package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.List;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class ReactMarker {

    /* renamed from: a  reason: collision with root package name */
    private static final List<a> f3213a = new ArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void a(ak akVar, String str, int i);
    }

    @com.facebook.k.a.a
    public static void addListener(a aVar) {
        synchronized (f3213a) {
            if (!f3213a.contains(aVar)) {
                f3213a.add(aVar);
            }
        }
    }

    @com.facebook.k.a.a
    public static void removeListener(a aVar) {
        synchronized (f3213a) {
            f3213a.remove(aVar);
        }
    }

    @com.facebook.k.a.a
    public static void clearMarkerListeners() {
        synchronized (f3213a) {
            f3213a.clear();
        }
    }

    @com.facebook.k.a.a
    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    @com.facebook.k.a.a
    public static void logMarker(String str, int i) {
        logMarker(str, (String) null, i);
    }

    @com.facebook.k.a.a
    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    @com.facebook.k.a.a
    public static void logMarker(String str, String str2, int i) {
        logMarker(ak.valueOf(str), str2, i);
    }

    @com.facebook.k.a.a
    public static void logMarker(ak akVar) {
        logMarker(akVar, (String) null, 0);
    }

    @com.facebook.k.a.a
    public static void logMarker(ak akVar, int i) {
        logMarker(akVar, (String) null, i);
    }

    @com.facebook.k.a.a
    public static void logMarker(ak akVar, String str) {
        logMarker(akVar, str, 0);
    }

    @com.facebook.k.a.a
    public static void logMarker(ak akVar, String str, int i) {
        synchronized (f3213a) {
            for (a aVar : f3213a) {
                aVar.a(akVar, str, i);
            }
        }
    }
}
