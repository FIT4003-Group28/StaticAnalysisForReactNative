package defpackage;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: agha  reason: default package */
/* loaded from: classes.dex */
public final class agha implements yjo {
    private final agyf a;
    private final /* synthetic */ int b;

    public agha(agyf agyfVar) {
        this.a = agyfVar;
    }

    public agha(agyf agyfVar, int i) {
        this.b = i;
        this.a = agyfVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        int i = this.b;
        if (i == 0) {
            CountDownLatch countDownLatch = this.a.a.j;
            if (countDownLatch == null) {
                countDownLatch = agzh.a;
            }
            try {
                countDownLatch.await();
                return 0;
            } catch (InterruptedException unused) {
                return 1;
            }
        } else if (i == 1) {
            this.a.f(bundle.getString("intentAction"), bundle);
            return 0;
        } else {
            this.a.f(bundle.getString("intentAction"), bundle);
            return 0;
        }
    }
}
