package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TaskContainer {
    public long a;
    protected boolean b = true;

    public TaskContainer(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                SchedulingServiceSwigJNI.delete_TaskContainer(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
