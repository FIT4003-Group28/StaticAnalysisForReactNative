package com.google.android.libraries.geophotouploader;

import android.content.Context;
import android.content.Intent;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class WaitForWifiWorker extends Worker {
    Context e;

    public WaitForWifiWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = context;
    }

    @Override // androidx.work.Worker
    public final bbx h() {
        if (this.e == null) {
            this.e = this.a;
        }
        bbp b = b();
        if (b == null) {
            return bbx.c();
        }
        String c = b.c("geo.uploader.gpu_config_key");
        if (!dbsj.d(c)) {
            try {
                crwb crwbVar = (crwb) dsqw.cq(crwb.y, datl.b(c));
                if (this.b.c.contains("geo.uploader.wait_for_wifi_task")) {
                    if ((crwbVar.a & 32) != 0) {
                        crwd crwdVar = crwbVar.g;
                        if (crwdVar == null) {
                            crwdVar = crwd.f;
                        }
                        if (crwdVar.e) {
                            Intent intent = new Intent(this.e, UploadService.class);
                            intent.putExtra("geo.uploader.gpu_config_key", crwbVar.bS());
                            intent.putExtra("geo.uploader.reschedule_requests_key", true);
                            intent.putExtra("geo.uploader.schedule_periodic_service_key", true);
                            cruv.b(this.e, intent);
                            return bbx.a();
                        }
                    }
                    return bbx.c();
                }
                return bbx.c();
            } catch (dsrm unused) {
                return bbx.c();
            }
        }
        return bbx.c();
    }
}
