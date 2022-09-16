package defpackage;

import com.google.geo.imagery.viewer.api.SchedulingService;
import com.google.geo.imagery.viewer.api.SchedulingServiceSwigJNI;
import com.google.geo.imagery.viewer.api.Task;
import com.google.geo.imagery.viewer.api.TaskContainer;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfuc  reason: default package */
/* loaded from: classes6.dex */
public final class dfuc extends SchedulingService {
    public final dfuh b;
    private final Executor c;

    public dfuc(dfuh dfuhVar, Executor executor) {
        this.c = executor;
        this.b = dfuhVar;
    }

    @Override // com.google.geo.imagery.viewer.api.SchedulingService
    public final void scheduleTask(Task task) {
        final TaskContainer taskContainer = new TaskContainer(SchedulingServiceSwigJNI.new_TaskContainer(Task.a(task), task));
        this.c.execute(new Runnable(this, taskContainer) { // from class: dfub
            private final dfuc a;
            private final TaskContainer b;

            {
                this.a = this;
                this.b = taskContainer;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfuc dfucVar = this.a;
                TaskContainer taskContainer2 = this.b;
                SchedulingServiceSwigJNI.TaskContainer_run(taskContainer2.a, taskContainer2);
                dfucVar.b.a();
            }
        });
    }
}
