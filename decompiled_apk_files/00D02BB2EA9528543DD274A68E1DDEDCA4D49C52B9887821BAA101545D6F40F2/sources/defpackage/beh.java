package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
/* compiled from: PG */
/* renamed from: beh  reason: default package */
/* loaded from: classes3.dex */
final class beh {
    public final ComponentName a;

    static {
        bbz.f("SystemJobInfoConverter");
    }

    public beh(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
