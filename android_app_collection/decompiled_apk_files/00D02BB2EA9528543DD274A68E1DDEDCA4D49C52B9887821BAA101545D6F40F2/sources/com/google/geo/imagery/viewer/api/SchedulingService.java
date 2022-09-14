package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SchedulingService {
    protected boolean a;
    private long b;

    public SchedulingService() {
        this(SchedulingServiceSwigJNI.new_SchedulingService(), true);
        SchedulingServiceSwigJNI.SchedulingService_director_connect(this, this.b, this.a, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SchedulingService(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long getCPtr(SchedulingService schedulingService) {
        if (schedulingService == null) {
            return 0L;
        }
        return schedulingService.b;
    }

    public synchronized void delete() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                SchedulingServiceSwigJNI.delete_SchedulingService(j);
            }
            this.b = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public void scheduleTask(Task task) {
        SchedulingServiceSwigJNI.SchedulingService_scheduleTask(this.b, this, Task.a(task), task);
    }

    protected void swigDirectorDisconnect() {
        this.a = false;
        delete();
    }
}
