package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Swipe {
    public long a;

    public Swipe(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        if (this.a != 0) {
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
