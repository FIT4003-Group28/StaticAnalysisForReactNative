package com.google.android.apps.gmm.ugc.phototaken;

import android.content.Intent;
import android.net.Uri;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PhotoTakenBackfillService extends akh {
    private static final dcqe m = dcqe.c("com.google.android.apps.gmm.ugc.phototaken.PhotoTakenBackfillService");
    public dxio<bztp> g;
    public dxio<cdgj> h;
    public dxio<bzsi> i;
    public dxio<ckcw> j;
    public bvrv k;
    public gdo l;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.akh
    public final void a(Intent intent) {
        String stringExtra = intent.getStringExtra("backfill_type");
        if (((stringExtra.hashCode() == -1722875525 && stringExtra.equals("DATABASE")) ? (char) 0 : (char) 65535) == 0) {
            long[] longArrayExtra = intent.getLongArrayExtra("intervals");
            HashSet c = dcnm.c();
            if ((longArrayExtra.length & 1) != 0) {
                bvoo.h("Backfill interval has an uneven number of timestamps", new Object[0]);
            }
            for (int i = 0; i < longArrayExtra.length; i += 2) {
                long j = longArrayExtra[i];
                long j2 = longArrayExtra[i + 1];
                if (j2 < j) {
                    bvoo.h("Backfill interval has an end earlier than start", new Object[0]);
                } else {
                    c.add(new eape(j, j2));
                }
            }
            try {
                HashSet<Uri> e = dcnm.e(this.g.a().f(c).get());
                cdgj a = this.h.a();
                dcdc z = dcbg.b(dcdc.f(this.i.a())).o(cdgh.a).z();
                if (!a.e(z) || z.isEmpty()) {
                    return;
                }
                deia a2 = deia.a(2.0d);
                for (Uri uri : e) {
                    if (a2.c()) {
                        e.size();
                    }
                    cdhe f = a.f(uri);
                    int size = z.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        z.get(i2).b(f);
                    }
                }
                return;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            } catch (ExecutionException unused2) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.akh, android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.l.b();
        this.j.a().f(ckhc.PHOTO_TAKEN_BACKFILL_SERVICE);
    }

    @Override // defpackage.akh, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.l.e();
        this.j.a().g(ckhc.PHOTO_TAKEN_BACKFILL_SERVICE);
        this.k.a();
    }
}
