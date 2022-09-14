package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SchedulingServiceSwigJNI {
    static {
        swig_module_init();
    }

    public static final native void SchedulingService_director_connect(SchedulingService schedulingService, long j, boolean z, boolean z2);

    public static final native void SchedulingService_scheduleTask(long j, SchedulingService schedulingService, long j2, Task task);

    public static void SwigDirector_SchedulingService_scheduleTask(SchedulingService schedulingService, long j) {
        schedulingService.scheduleTask(j == 0 ? null : new Task(j));
    }

    public static final native void TaskContainer_run(long j, TaskContainer taskContainer);

    public static final native void delete_SchedulingService(long j);

    public static final native void delete_TaskContainer(long j);

    public static final native long new_SchedulingService();

    public static final native long new_TaskContainer(long j, Task task);

    private static final native void swig_module_init();
}
