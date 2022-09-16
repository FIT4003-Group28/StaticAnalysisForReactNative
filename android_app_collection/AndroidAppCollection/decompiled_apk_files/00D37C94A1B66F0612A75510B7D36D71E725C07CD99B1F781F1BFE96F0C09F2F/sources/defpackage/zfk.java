package defpackage;

import android.content.ComponentName;
import android.content.Context;
/* compiled from: PG */
/* renamed from: zfk  reason: default package */
/* loaded from: classes4.dex */
public final class zfk implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ Class b;
    final /* synthetic */ int c;

    public zfk(Context context, Class cls, int i) {
        this.a = context;
        this.b = cls;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.a, this.b), this.c, 1);
    }
}
