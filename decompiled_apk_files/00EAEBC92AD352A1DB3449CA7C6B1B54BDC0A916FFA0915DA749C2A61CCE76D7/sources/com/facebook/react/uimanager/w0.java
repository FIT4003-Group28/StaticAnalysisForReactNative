package com.facebook.react.uimanager;

import java.util.Comparator;
/* loaded from: classes.dex */
public class w0 {

    /* renamed from: c  reason: collision with root package name */
    public static Comparator<w0> f6133c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f6134a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6135b;

    /* loaded from: classes.dex */
    static class a implements Comparator<w0> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(w0 w0Var, w0 w0Var2) {
            return w0Var.f6135b - w0Var2.f6135b;
        }
    }

    public w0(int i, int i2) {
        this.f6134a = i;
        this.f6135b = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != w0.class) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f6135b == w0Var.f6135b && this.f6134a == w0Var.f6134a;
    }

    public String toString() {
        return "[" + this.f6134a + ", " + this.f6135b + "]";
    }
}
