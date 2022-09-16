package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f5917a = new SparseIntArray();

    public void a(long j) {
        this.f5917a.put((int) j, 0);
    }

    public short b(long j) {
        int i = this.f5917a.get((int) j, -1);
        if (i != -1) {
            return (short) (65535 & i);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public boolean c(long j) {
        return this.f5917a.get((int) j, -1) != -1;
    }

    public void d(long j) {
        int i = (int) j;
        int i2 = this.f5917a.get(i, -1);
        if (i2 != -1) {
            this.f5917a.put(i, i2 + 1);
            return;
        }
        throw new RuntimeException("Tried to increment non-existent cookie");
    }

    public void e(long j) {
        this.f5917a.delete((int) j);
    }
}
