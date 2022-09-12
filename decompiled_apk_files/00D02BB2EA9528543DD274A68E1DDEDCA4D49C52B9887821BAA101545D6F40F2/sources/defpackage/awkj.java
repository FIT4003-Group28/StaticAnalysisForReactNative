package defpackage;

import android.app.Application;
import android.app.job.JobScheduler;
/* compiled from: PG */
/* renamed from: awkj  reason: default package */
/* loaded from: classes3.dex */
public final class awkj {
    @dzsi
    public final JobScheduler a;

    public awkj(Application application) {
        this.a = (JobScheduler) application.getSystemService("jobscheduler");
    }
}
