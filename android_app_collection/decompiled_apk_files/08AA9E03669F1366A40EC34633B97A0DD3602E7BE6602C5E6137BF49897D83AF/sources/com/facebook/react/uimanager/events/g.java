package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;
/* compiled from: TouchEventCoalescingKeyHelper.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f3894a = new SparseIntArray();

    public void a(long j) {
        this.f3894a.put((int) j, 0);
    }

    public void b(long j) {
        int i = (int) j;
        int i2 = this.f3894a.get(i, -1);
        if (i2 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.f3894a.put(i, i2 + 1);
    }

    public short c(long j) {
        int i = this.f3894a.get((int) j, -1);
        if (i == -1) {
            throw new RuntimeException("Tried to get non-existent cookie");
        }
        return (short) (i & 65535);
    }

    public void d(long j) {
        this.f3894a.delete((int) j);
    }

    public boolean e(long j) {
        return this.f3894a.get((int) j, -1) != -1;
    }
}
