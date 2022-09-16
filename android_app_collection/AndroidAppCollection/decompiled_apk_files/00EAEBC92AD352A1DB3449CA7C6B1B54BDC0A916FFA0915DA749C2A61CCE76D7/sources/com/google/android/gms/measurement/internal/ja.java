package com.google.android.gms.measurement.internal;

import c.e.a.b.d.g.t0;
import c.e.a.b.d.g.v0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class ja {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f7409a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ int[] f7410b = new int[t0.a.values().length];

    static {
        try {
            f7410b[t0.a.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7410b[t0.a.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f7410b[t0.a.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f7410b[t0.a.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f7409a = new int[v0.b.values().length];
        try {
            f7409a[v0.b.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f7409a[v0.b.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f7409a[v0.b.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f7409a[v0.b.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f7409a[v0.b.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f7409a[v0.b.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
