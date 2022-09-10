package defpackage;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.libraries.geophotouploader.UploadService;
/* compiled from: PG */
/* renamed from: crtf  reason: default package */
/* loaded from: classes5.dex */
public final class crtf {
    public final Context a;
    public crwb b;
    public final Intent c;
    public final crvt d;
    final crxu e;
    public final crwl f;
    public final cruw g;
    public final crxv h;
    public final AlarmManager i;
    public final SharedPreferences j;
    public final crte k = new crte();

    public crtf(Context context, crwb crwbVar) {
        boolean z = true;
        dbsk.b(1 == (crwbVar.a & 1), "Invalid GpuConfig: api_server must be set");
        dbsk.b((crwbVar.a & 32) != 0, "Invalid GpuConfig: progress_notification is required to be Android O compatible");
        crwd crwdVar = crwbVar.g;
        dbsk.b((crwdVar == null ? crwd.f : crwdVar).b != 0, "Invalid GpuConfig: progress_notification.icon must be set");
        dbsk.b(crwbVar.r > crwbVar.q ? false : z, "Periodic work flex duration must be smaller than interval duration.");
        this.a = context;
        this.b = crwbVar;
        crvt crvtVar = new crvt(context);
        this.d = crvtVar;
        crvtVar.d = crwbVar;
        this.e = new crxu(context);
        this.f = new crwl(crwm.a(context, crwbVar));
        this.g = new cruw(bdn.g(context));
        this.h = new crxv(context);
        this.i = (AlarmManager) context.getSystemService("alarm");
        this.j = context.getSharedPreferences("geo.uploader.shared_preference_file_key", 0);
        Intent intent = new Intent(context, UploadService.class);
        this.c = intent;
        intent.putExtra("geo.uploader.gpu_config_key", crwbVar.bS());
    }

    public static boolean e(@dzsi crti crtiVar) {
        int a;
        if (crtiVar == null || crtiVar.b.isEmpty() || (a = dgps.a(crtiVar.d)) == 0 || a == 1) {
            return false;
        }
        if ((crtiVar.a & 8) != 0) {
            dgpy dgpyVar = crtiVar.e;
            if (dgpyVar == null) {
                dgpyVar = dgpy.c;
            }
            if (dgpyVar.b.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static crva f(int i, cruf crufVar) {
        crux bZ = crva.b.bZ();
        for (int i2 = 0; i2 < i; i2++) {
            cruy bZ2 = cruz.d.bZ();
            String f = crwz.f();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            cruz cruzVar = (cruz) bZ2.b;
            f.getClass();
            int i3 = cruzVar.a | 1;
            cruzVar.a = i3;
            cruzVar.b = f;
            cruzVar.c = crufVar.l;
            cruzVar.a = i3 | 2;
            bZ.a(bZ2);
        }
        return bZ.bK();
    }

    public final void a(cruu cruuVar) {
        cruv.a(this.a, this.c, cruuVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:338:0x07ad, code lost:
        if (r5 != null) goto L355;
     */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dbsi<defpackage.cruf, defpackage.crwz> b(defpackage.crxb r24, defpackage.crwz r25) {
        /*
            Method dump skipped, instructions count: 2049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crtf.b(crxb, crwz):dbsi");
    }

    @dzsi
    public final crua c(String str) {
        crwo a = this.f.a(str);
        if (a == null) {
            return null;
        }
        return a.O();
    }

    public final boolean d() {
        return this.j.getBoolean("geo.uploader.shared_preference_wifi_only_key", this.b.e);
    }
}
