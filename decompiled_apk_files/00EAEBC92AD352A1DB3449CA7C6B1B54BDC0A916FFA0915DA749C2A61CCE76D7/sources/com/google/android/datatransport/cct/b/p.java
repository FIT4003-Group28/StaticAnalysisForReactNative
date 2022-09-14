package com.google.android.datatransport.cct.b;

import android.util.SparseArray;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class p extends Enum<p> {

    /* renamed from: b  reason: collision with root package name */
    public static final p f6666b = new p("DEFAULT", 0, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final p f6667c = new p("UNMETERED_ONLY", 1, 1);

    /* renamed from: d  reason: collision with root package name */
    public static final p f6668d = new p("UNMETERED_OR_DAILY", 2, 2);

    /* renamed from: e  reason: collision with root package name */
    public static final p f6669e = new p("FAST_IF_RADIO_AWAKE", 3, 3);

    /* renamed from: f  reason: collision with root package name */
    public static final p f6670f = new p("NEVER", 4, 4);

    /* renamed from: g  reason: collision with root package name */
    public static final p f6671g = new p("UNRECOGNIZED", 5, -1);

    /* renamed from: h  reason: collision with root package name */
    private static final SparseArray<p> f6672h;

    static {
        p[] pVarArr = {f6666b, f6667c, f6668d, f6669e, f6670f, f6671g};
        f6672h = new SparseArray<>();
        f6672h.put(0, f6666b);
        f6672h.put(1, f6667c);
        f6672h.put(2, f6668d);
        f6672h.put(3, f6669e);
        f6672h.put(4, f6670f);
        f6672h.put(-1, f6671g);
    }

    private p(String str, int i, int i2) {
    }
}
