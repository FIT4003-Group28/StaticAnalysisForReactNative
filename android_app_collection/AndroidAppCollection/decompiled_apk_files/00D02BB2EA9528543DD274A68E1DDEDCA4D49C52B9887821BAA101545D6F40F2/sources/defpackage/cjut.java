package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cjut  reason: default package */
/* loaded from: classes4.dex */
public final class cjut {
    public final cqat a;
    public final dbsz<cjtp> b;
    public final LinkedHashMap<Integer, Long> c = dcjz.i(128);
    public int d = 1;
    private final dehq e;

    public cjut(dehq dehqVar, cqat cqatVar, dbsz<cjtp> dbszVar) {
        this.e = dehqVar;
        this.a = cqatVar;
        this.b = dbszVar;
        dehqVar.d(new Runnable(this) { // from class: cjus
            private final cjut a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, 5000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        synchronized (this) {
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                this.d = 2;
                if (this.c.isEmpty()) {
                    return;
                }
                int[] iArr = new int[this.c.size()];
                int i2 = 0;
                for (Integer num : this.c.keySet()) {
                    iArr[i2] = num.intValue();
                    i2++;
                }
                Arrays.sort(iArr);
                dbsz<cjtp> dbszVar = this.b;
                cjtp cjtpVar = new cjtp(this.a.e(), dbpy.a);
                cjtpVar.x(iArr);
                dbszVar.NU(cjtpVar);
                return;
            }
            throw null;
        }
    }
}
