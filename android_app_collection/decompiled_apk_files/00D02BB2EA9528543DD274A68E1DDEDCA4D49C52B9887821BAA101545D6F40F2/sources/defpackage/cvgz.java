package defpackage;

import android.content.Context;
import android.os.BatteryManager;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: cvgz  reason: default package */
/* loaded from: classes.dex */
public final class cvgz extends cvgx<cvha> {
    private final cvgy b;

    public cvgz(@dzsi ThreadFactory threadFactory, Context context) {
        super(threadFactory, 200);
        this.b = new cvgy(context);
    }

    @Override // defpackage.cvgx
    /* renamed from: d */
    public final synchronized cvha c() {
        BatteryManager batteryManager = this.b.a;
        long longProperty = batteryManager != null ? batteryManager.getLongProperty(2) : Long.MIN_VALUE;
        BatteryManager batteryManager2 = this.b.a;
        long longProperty2 = batteryManager2 != null ? batteryManager2.getLongProperty(3) : Long.MIN_VALUE;
        BatteryManager batteryManager3 = this.b.a;
        long longProperty3 = batteryManager3 != null ? batteryManager3.getLongProperty(4) : Long.MIN_VALUE;
        if (longProperty == Long.MIN_VALUE || longProperty2 == Long.MIN_VALUE || longProperty3 == Long.MIN_VALUE) {
            return null;
        }
        return new cvha();
    }
}
