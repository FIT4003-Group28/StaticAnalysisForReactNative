package com.google.android.libraries.geophotouploader;

import android.content.Context;
import android.content.Intent;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Date;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PeriodicWorker extends Worker {
    Context e;
    crwl f;
    cruh g;

    public PeriodicWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = context;
    }

    @Override // androidx.work.Worker
    public final bbx h() {
        boolean z;
        long j;
        bbp b = b();
        if (b == null) {
            return bbx.c();
        }
        String c = b.c("geo.uploader.gpu_config_key");
        if (!dbsj.d(c)) {
            try {
                crwb crwbVar = (crwb) dsqw.cq(crwb.y, datl.b(c));
                if (!crwbVar.p) {
                    return bbx.c();
                }
                if (this.f == null) {
                    this.f = new crwl(crwm.a(this.e, crwbVar));
                }
                if (!crwbVar.u) {
                    crwl crwlVar = this.f;
                    synchronized (crwl.a) {
                        SQLiteDatabase e = crwlVar.e();
                        j = -1;
                        if (e != null) {
                            try {
                                j = DatabaseUtils.queryNumEntries(e, "upload_tasks", "clear_record_type = ? AND completion_time > 0 AND clear_record_ttl * 1000 + completion_time - ? > 0", new String[]{Integer.toString(1), Long.toString(new Date().getTime())});
                            } catch (Exception e2) {
                                deki.b(e2);
                            }
                        }
                    }
                    z = j > 0;
                    this.f.g();
                } else {
                    z = false;
                }
                dcdc<crwo> b2 = this.f.b();
                if (b2.isEmpty()) {
                    if (!z) {
                        bdn.g(this.e).c("geo.uploader.periodic_check");
                    }
                    return bbx.a();
                }
                if (this.g == null) {
                    Context context = this.e;
                    this.g = new cruh(context, crwbVar, null, new cruw(bdn.g(context)));
                }
                int size = b2.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    String A = b2.get(i2).A();
                    if (A != null && A.startsWith("video/")) {
                        i++;
                    }
                }
                if (!this.g.d(b2.size(), i)) {
                    Intent intent = new Intent(this.e, UploadService.class);
                    intent.putExtra("geo.uploader.gpu_config_key", crwbVar.bS());
                    intent.putExtra("geo.uploader.reschedule_requests_key", true);
                    cruv.b(this.e, intent);
                }
                return bbx.a();
            } catch (dsrm unused) {
                return bbx.c();
            }
        }
        return bbx.c();
    }
}
