package com.facebook.react.bridge.queue;
/* compiled from: MessageQueueThreadSpec.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final b f3268a = new b(a.MAIN_UI, "main_ui");

    /* renamed from: b  reason: collision with root package name */
    private final a f3269b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3270c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3271d;

    /* compiled from: MessageQueueThreadSpec.java */
    /* loaded from: classes.dex */
    protected enum a {
        MAIN_UI,
        NEW_BACKGROUND
    }

    public static b a(String str) {
        return new b(a.NEW_BACKGROUND, str);
    }

    public static b a(String str, long j) {
        return new b(a.NEW_BACKGROUND, str, j);
    }

    public static b a() {
        return f3268a;
    }

    private b(a aVar, String str) {
        this(aVar, str, 0L);
    }

    private b(a aVar, String str, long j) {
        this.f3269b = aVar;
        this.f3270c = str;
        this.f3271d = j;
    }

    public a b() {
        return this.f3269b;
    }

    public String c() {
        return this.f3270c;
    }

    public long d() {
        return this.f3271d;
    }
}
