package com.google.android.apps.gmm.ugc.phototaken;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.apps.gmm.ugc.phototaken.PhotoTakenObserverService;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PhotoTakenObserverService extends JobService {
    public cdgj a;
    public bvrb b;
    public cqat c;
    public ckcw d;
    public bvrv e;
    public gdo f;
    public dxio<apni> g;
    private final cdgi h = new cdgg();

    public static void b(Context context, boolean z, dxio<apni> dxioVar) {
        ComponentName componentName = new ComponentName(context, PhotoTakenObserverService.class);
        try {
            if (!context.getPackageManager().getServiceInfo(componentName, 0).isEnabled()) {
                return;
            }
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (z) {
                JobInfo.Builder addTriggerContentUri = new JobInfo.Builder(137361750, componentName).addTriggerContentUri(new JobInfo.TriggerContentUri(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, 1));
                if (dxioVar.a().b()) {
                    addTriggerContentUri.addTriggerContentUri(new JobInfo.TriggerContentUri(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, 1));
                }
                jobScheduler.schedule(addTriggerContentUri.build());
                return;
            }
            jobScheduler.cancel(137361750);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final synchronized void a(Uri[] uriArr) {
        final long b = this.c.b();
        ((ckco) this.d.a(ckdz.s)).a(uriArr.length);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Uri uri : uriArr) {
            boolean b2 = cdgj.b(uri);
            boolean c = cdgj.c(uri);
            if (b2 || c) {
                try {
                    try {
                        btou btouVar = new btou(this, uri, "_data", "datetaken");
                        try {
                            int i = btouVar.i();
                            if (i == 0) {
                                c(3);
                            } else if (i != 1) {
                                c(4);
                            } else {
                                btos b3 = btouVar.h().b();
                                dbsg a = b3.a(btouVar.a("_data"));
                                dbsg a2 = b3.a(btouVar.c("datetaken"));
                                if (!((Boolean) a.h(cdge.a).c(false)).booleanValue()) {
                                    c(5);
                                } else {
                                    boolean booleanValue = ((Boolean) a2.h(new dbrn(this, b) { // from class: cdgf
                                        private final PhotoTakenObserverService a;
                                        private final long b;

                                        {
                                            this.a = this;
                                            this.b = b;
                                        }

                                        @Override // defpackage.dbrn
                                        public final Object a(Object obj) {
                                            PhotoTakenObserverService photoTakenObserverService = this.a;
                                            ((ckcp) photoTakenObserverService.d.a(ckdz.n)).a(TimeUnit.MILLISECONDS.toMinutes(this.b - ((Long) obj).longValue()));
                                            photoTakenObserverService.c(1);
                                            return true;
                                        }
                                    }).c(false)).booleanValue();
                                    btouVar.close();
                                    if (booleanValue) {
                                        if (b2) {
                                            arrayList.add(uri);
                                        } else {
                                            arrayList2.add(uri);
                                        }
                                    }
                                }
                            }
                            btouVar.close();
                        } catch (Throwable th) {
                            try {
                                btouVar.close();
                            } catch (Throwable th2) {
                                deki.a(th, th2);
                            }
                            throw th;
                            break;
                        }
                    } catch (btnx | IllegalArgumentException unused) {
                        c(8);
                    }
                } catch (btnv unused2) {
                    c(7);
                }
            } else {
                c(2);
            }
        }
        ((ckco) this.d.a(ckdz.t)).a(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.a.d(this.h, (Uri) arrayList.get(i2));
        }
        ((ckco) this.d.a(ckdz.u)).a(arrayList2.size());
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            this.a.d(this.h, (Uri) arrayList2.get(i3));
        }
    }

    public final void c(int i) {
        ((ckco) this.d.a(ckdz.q)).a(i - 1);
    }

    public final void d(int i) {
        ((ckco) this.d.a(ckdz.r)).a(i - 1);
    }

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.f.b();
        this.d.f(ckhc.PHOTO_TAKEN_OBSERVER_SERVICE);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f.e();
        this.d.g(ckhc.PHOTO_TAKEN_OBSERVER_SERVICE);
        this.e.a();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        d(1);
        b(this, true, this.g);
        if (jobParameters == null) {
            d(2);
            return false;
        } else if (jobParameters.getTriggeredContentAuthorities() != null) {
            this.b.b(new Runnable(this, jobParameters) { // from class: cdgd
                private final PhotoTakenObserverService a;
                private final JobParameters b;

                {
                    this.a = this;
                    this.b = jobParameters;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PhotoTakenObserverService photoTakenObserverService = this.a;
                    JobParameters jobParameters2 = this.b;
                    photoTakenObserverService.a(jobParameters2.getTriggeredContentUris());
                    photoTakenObserverService.d(4);
                    photoTakenObserverService.jobFinished(jobParameters2, false);
                }
            }, bvrj.BACKGROUND_THREADPOOL);
            return true;
        } else {
            d(3);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        d(5);
        return false;
    }
}
