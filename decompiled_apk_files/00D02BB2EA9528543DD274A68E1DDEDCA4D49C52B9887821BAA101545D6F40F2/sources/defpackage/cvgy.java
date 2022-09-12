package defpackage;

import android.content.Context;
import android.os.BatteryManager;
/* compiled from: PG */
/* renamed from: cvgy  reason: default package */
/* loaded from: classes5.dex */
final class cvgy {
    public final BatteryManager a;

    public cvgy(Context context) {
        this.a = (BatteryManager) context.getSystemService("batterymanager");
    }
}
