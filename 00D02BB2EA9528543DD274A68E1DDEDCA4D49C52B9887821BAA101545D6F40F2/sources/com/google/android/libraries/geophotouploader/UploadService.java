package com.google.android.libraries.geophotouploader;

import android.app.Service;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.IBinder;
import com.google.android.apps.maps.R;
import java.io.File;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UploadService extends Service {
    public crul a;
    public crug b;
    public crvv c;
    public crvt d;
    crxu e;
    crxv f;
    public crwb g;
    public crwl h;
    public cruw i;
    public cruh j;
    SharedPreferences l;
    public crvc m;
    duiw n;
    private final Object o = new Object();
    public boolean k = false;
    private final IBinder p = new crur(this);

    public final void a() {
        this.j.a(this, getResources().getString(R.string.STARTING_UPLOAD_TITLE));
    }

    public final void b() {
        int i;
        synchronized (crul.a) {
            synchronized (crug.a) {
                if (this.a.i() <= 0) {
                    crug crugVar = this.b;
                    synchronized (crug.a) {
                        i = crugVar.d;
                    }
                    if (i <= 0) {
                        cruh cruhVar = this.j;
                        if (cruhVar != null) {
                            cruhVar.c(this);
                        }
                        new crup(this).execute(new Void[0]);
                    }
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.p;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.d = new crvt(getApplicationContext());
        this.e = new crxu(getApplicationContext());
        this.m = new crvc(getApplicationContext(), new crvd());
        this.a = new crul(this, this.d, new crum(this), this.m, Executors.newSingleThreadExecutor(), this.e);
        this.b = new crug(new crun(this), Executors.newSingleThreadExecutor());
        this.f = new crxv(getApplicationContext());
        this.i = new cruw(bdn.g(this));
        this.l = getSharedPreferences("geo.uploader.shared_preference_file_key", 0);
        new crxq(getApplicationContext());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        crwo a;
        try {
            crwb crwbVar = (crwb) dsqw.cq(crwb.y, (byte[]) dbsk.s(intent.getByteArrayExtra("geo.uploader.gpu_config_key")));
            crwd crwdVar = crwbVar.g;
            if (crwdVar == null) {
                crwdVar = crwd.f;
            }
            if (crwdVar.e) {
                dsqp dsqpVar = (dsqp) crwbVar.cu(5);
                dsqpVar.bC(crwbVar);
                crwa crwaVar = (crwa) dsqpVar;
                boolean z = this.l.getBoolean("geo.uploader.shared_preference_wifi_only_key", crwbVar.e);
                if (crwaVar.c) {
                    crwaVar.bF();
                    crwaVar.c = false;
                }
                crwb crwbVar2 = (crwb) crwaVar.b;
                crwbVar2.a |= 8;
                crwbVar2.e = z;
                crwbVar = crwaVar.bK();
            }
            if (!crwbVar.equals(this.g)) {
                this.g = crwbVar;
                Context applicationContext = getApplicationContext();
                this.d.d = crwbVar;
                if (this.h == null) {
                    this.h = new crwl(crwm.a(applicationContext, crwbVar));
                }
                cruh cruhVar = this.j;
                if (cruhVar == null) {
                    this.j = new cruh(getApplicationContext(), crwbVar, this.a.i, this.i);
                } else {
                    cruhVar.d = crwbVar;
                }
                synchronized (this.o) {
                    crul crulVar = this.a;
                    crulVar.d = crwbVar;
                    crulVar.h = this.j;
                    crulVar.g = this.h;
                    this.b.c = crwbVar;
                    crvv crvvVar = this.c;
                    if (crvvVar == null) {
                        this.c = new crvv(crwbVar, this.d, new dasv());
                    } else {
                        crvvVar.b = crwbVar;
                    }
                    this.a.e = this.c;
                    if (this.n == null) {
                        this.n = duiw.a(new duic(60000, 60000)).a();
                    }
                    this.a.k = this.n;
                }
            }
            if (!"geo.uploader.request_timeout_action".equals(intent.getAction()) || crwbVar.u) {
                int c = (int) this.h.c();
                if ((crwbVar.a & 8192) != 0 && c == 0) {
                    File dir = this.f.b.getDir("gpu_tmp", 0);
                    if (dir != null) {
                        File[] listFiles = dir.listFiles();
                        if (listFiles != null) {
                            for (File file : listFiles) {
                                file.delete();
                            }
                        }
                        dir.delete();
                    }
                    c = 0;
                }
                if (intent.getBooleanExtra("geo.uploader.reschedule_requests_key", false) && c > 0 && !this.k) {
                    a();
                    this.a.e();
                }
                if (!crwbVar.p || !intent.getBooleanExtra("geo.uploader.schedule_periodic_service_key", false)) {
                    return 3;
                }
                this.i.a(crwbVar);
                return 3;
            }
            String string = intent.getExtras().getString("geo.uploader.request_id_key");
            dbsk.s(string);
            if (this.a.f(string)) {
                return 2;
            }
            crwl crwlVar = this.h;
            synchronized (crwl.a) {
                SQLiteDatabase f = crwlVar.f();
                if (f != null) {
                    crwo a2 = crwlVar.a(string);
                    if (a2 != null && crwv.b.contains(a2.C())) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("upload_status", (Integer) 5);
                        contentValues.put("failure_reason", (Integer) 15);
                        int update = f.update("upload_tasks", contentValues, "gpu_media_id = ?", new String[]{string});
                        if (update > 0 && (a = this.h.a(string)) != null) {
                            crvs b = this.d.b(a.P(), dtbh.NEW_UPLOAD);
                            b.k(dgpm.REQUEST_EXPIRED);
                            b.j();
                            crua O = a.O();
                            Intent intent2 = new Intent("geo.uploader.upload_progress_broadcast_action");
                            intent2.putExtra("geo.uploader.upload_state_key", O.bS());
                            int i3 = O.e;
                            crtx crtxVar = crtx.UNKNOWN;
                            double d = O.h;
                            apt.a(this).d(intent2);
                        }
                    }
                }
            }
            return 2;
        } catch (dsrm e) {
            throw new RuntimeException("Error in parsing GpuConfig proto.", e);
        }
    }
}
