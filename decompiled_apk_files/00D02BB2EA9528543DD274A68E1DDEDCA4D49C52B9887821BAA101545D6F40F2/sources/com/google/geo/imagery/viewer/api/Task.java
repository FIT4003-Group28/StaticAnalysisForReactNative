package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Task {
    private long a;

    /* JADX INFO: Access modifiers changed from: protected */
    public Task(long j) {
        this.a = j;
    }

    public static long a(Task task) {
        if (task == null) {
            return 0L;
        }
        return task.a;
    }

    public final synchronized void b() {
        if (this.a != 0) {
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}
