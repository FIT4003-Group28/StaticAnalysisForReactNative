package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;
/* compiled from: PG */
/* renamed from: qze  reason: default package */
/* loaded from: classes4.dex */
public class qze {
    final String d;
    public final qzm f;
    boolean g = false;
    public final DroidGuardResultsRequest e = new DroidGuardResultsRequest();

    public qze(String str) {
        qzn qznVar;
        int i = 0;
        this.d = str;
        if (axrg.b()) {
            String[] split = axrg.a.get().a().split(",");
            int length = split.length;
            while (true) {
                if (i >= length) {
                    qznVar = qzn.COARSE;
                    break;
                } else if (str.equals(split[i])) {
                    qznVar = qzn.FINE;
                    break;
                } else {
                    i++;
                }
            }
            this.f = new qzo(qznVar);
            return;
        }
        this.f = new qzj();
    }

    private final synchronized void c(qyt qytVar) {
        if (this.g) {
            qytVar.b();
            return;
        }
        this.g = true;
        try {
            a(qytVar);
        } catch (Exception unused) {
        }
    }

    protected void a(qyt qytVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(qyt qytVar) {
        if (!axrd.b()) {
            c(qytVar);
            return;
        }
        synchronized (this) {
            if (this.g) {
                qytVar.b();
                return;
            }
            this.g = true;
            try {
                a(qytVar);
            } catch (Exception unused) {
            }
        }
    }
}
