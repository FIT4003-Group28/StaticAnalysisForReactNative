package defpackage;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: adca  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adca {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ CountDownLatch b;

    public /* synthetic */ adca(Bundle bundle, CountDownLatch countDownLatch) {
        this.a = bundle;
        this.b = countDownLatch;
    }

    public final void a(String str) {
        Bundle bundle = this.a;
        CountDownLatch countDownLatch = this.b;
        int i = adcc.b;
        bundle.putString("mdx_cast_log_crash_id", str);
        countDownLatch.countDown();
    }
}
