package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LifeboatReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!intent.hasExtra("MetricSnapshot") || !intent.hasExtra("Transmitters")) {
            return;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("MetricSnapshot");
        byteArrayExtra.getClass();
        try {
            vao vaoVar = (vao) aopi.parseFrom(vao.a, byteArrayExtra, aoos.b());
            BroadcastReceiver.PendingResult goAsync = goAsync();
            String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
            stringArrayExtra.getClass();
            String[] strArr = stringArrayExtra;
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                try {
                    Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    arrayList.add(((vaq) declaredConstructor.newInstance(new Object[0])).a());
                } catch (Throwable th) {
                    Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", str), th);
                }
            }
            ankt w = anlz.w(arrayList);
            goAsync.getClass();
            w.qY(new amhy(goAsync, 1), anjk.a);
        } catch (aopx e) {
            Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
        }
    }
}
