package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;
/* compiled from: PG */
/* renamed from: cnzy  reason: default package */
/* loaded from: classes5.dex */
public class cnzy {
    public final coai e;
    boolean f = false;
    public final DroidGuardResultsRequest d = new DroidGuardResultsRequest();

    public cnzy() {
        coak coakVar;
        int i = 0;
        if (dxyx.b()) {
            String[] split = dxyx.a.a().b().split(",");
            int length = split.length;
            while (true) {
                if (i >= length) {
                    coakVar = coak.COARSE;
                    break;
                } else if ("tachyon_registration".equals(split[i])) {
                    coakVar = coak.FINE;
                    break;
                } else {
                    i++;
                }
            }
            this.e = new coal(coakVar);
            return;
        }
        this.e = new coae();
    }

    private final synchronized void a(cnzr cnzrVar) {
        if (this.f) {
            cnzrVar.a();
            return;
        }
        this.f = true;
        try {
            c(cnzrVar);
        } catch (Exception unused) {
        }
    }

    protected void c(cnzr cnzrVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(cnzr cnzrVar) {
        if (!dxyu.a.a().a()) {
            a(cnzrVar);
            return;
        }
        synchronized (this) {
            if (this.f) {
                cnzrVar.a();
                return;
            }
            this.f = true;
            try {
                c(cnzrVar);
            } catch (Exception unused) {
            }
        }
    }
}
