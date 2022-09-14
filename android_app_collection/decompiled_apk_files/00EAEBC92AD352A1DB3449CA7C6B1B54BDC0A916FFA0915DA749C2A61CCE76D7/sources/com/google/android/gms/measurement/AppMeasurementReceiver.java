package com.google.android.gms.measurement;

import a.m.a.a;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.w4;
import com.google.android.gms.measurement.internal.z4;
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a implements z4 {

    /* renamed from: c  reason: collision with root package name */
    private w4 f7144c;

    @Override // com.google.android.gms.measurement.internal.z4
    public final void a(Context context, Intent intent) {
        a.b(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f7144c == null) {
            this.f7144c = new w4(this);
        }
        this.f7144c.a(context, intent);
    }
}
