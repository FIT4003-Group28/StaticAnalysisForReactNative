package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
/* compiled from: PG */
/* renamed from: bsk  reason: default package */
/* loaded from: classes2.dex */
final class bsk {
    public final ComponentName a;

    static {
        bqf.b("SystemJobInfoConverter");
    }

    public bsk(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
