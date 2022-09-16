package com.baidu.vi;

import android.net.NetworkInfo;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public String f2161a;

    /* renamed from: b  reason: collision with root package name */
    public int f2162b;

    /* renamed from: c  reason: collision with root package name */
    public int f2163c;

    /* renamed from: com.baidu.vi.c$1  reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2164a = new int[NetworkInfo.State.values().length];

        static {
            try {
                f2164a[NetworkInfo.State.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2164a[NetworkInfo.State.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2164a[NetworkInfo.State.DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2164a[NetworkInfo.State.DISCONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2164a[NetworkInfo.State.SUSPENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public c(NetworkInfo networkInfo) {
        int i;
        this.f2161a = networkInfo.getTypeName();
        this.f2162b = networkInfo.getType();
        switch (AnonymousClass1.f2164a[networkInfo.getState().ordinal()]) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 1;
                break;
            default:
                i = 0;
                break;
        }
        this.f2163c = i;
    }
}
