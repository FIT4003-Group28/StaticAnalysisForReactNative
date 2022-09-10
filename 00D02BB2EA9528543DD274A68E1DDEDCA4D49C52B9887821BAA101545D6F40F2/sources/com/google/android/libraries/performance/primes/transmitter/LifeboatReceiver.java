package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LifeboatReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!intent.hasExtra("MetricSnapshot") || !intent.hasExtra("Transmitters")) {
            return;
        }
        try {
            cxfl cxflVar = (cxfl) dsqw.cr(cxfl.c, intent.getByteArrayExtra("MetricSnapshot"), dsqa.c());
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
            ArrayList arrayList = new ArrayList(stringArrayExtra.length);
            for (String str : stringArrayExtra) {
                try {
                    Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    arrayList.add(((cxfm) declaredConstructor.newInstance(new Object[0])).a(context, cxflVar));
                } catch (Throwable unused) {
                }
            }
            dehn p = deha.p(arrayList);
            goAsync.getClass();
            p.Pk(new Runnable(goAsync) { // from class: cxfj
                private final BroadcastReceiver.PendingResult a;

                {
                    this.a = goAsync;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.finish();
                }
            }, dege.a);
        } catch (dsrm unused2) {
        }
    }
}
