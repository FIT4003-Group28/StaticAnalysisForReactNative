package defpackage;

import android.os.Handler;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qzb  reason: default package */
/* loaded from: classes4.dex */
public final class qzb {
    public final qyt a;
    public final Handler b;
    public final Map c;
    public final DroidGuardResultsRequest d;
    public final qzm e;
    public final qzi f;
    public final qyu g;
    private boolean h = false;

    public qzb(qyt qytVar, Handler handler, Map map, DroidGuardResultsRequest droidGuardResultsRequest, qzm qzmVar, qzi qziVar, qyu qyuVar) {
        this.a = qytVar;
        this.b = handler;
        this.c = map;
        this.d = droidGuardResultsRequest;
        this.e = qzmVar;
        this.f = qziVar;
        this.g = qyuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        synchronized (this) {
            if (this.h) {
                return;
            }
            this.h = true;
            try {
                this.b.post(new qza(this, str));
            } catch (Exception unused) {
            }
        }
    }
}
