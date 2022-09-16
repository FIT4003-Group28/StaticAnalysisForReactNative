package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pbf  reason: default package */
/* loaded from: classes7.dex */
public final class pbf implements pai {
    private final cvkt a;
    private final cqat b;

    public pbf(cvkt cvktVar, cqat cqatVar) {
        this.a = cvktVar;
        this.b = cqatVar;
    }

    @Override // defpackage.pai
    public final boolean a(Bundle bundle) {
        cvix d;
        Intent intent = new Intent("com.google.android.c2dm.intent.RECEIVE");
        if (ako.a()) {
            d = cvix.c(9000L);
        } else {
            d = cvix.d();
        }
        intent.putExtras(bundle);
        if (this.a.a(intent)) {
            this.a.b(intent, d, TimeUnit.MILLISECONDS.toMicros(this.b.b()));
            return true;
        }
        return false;
    }
}
