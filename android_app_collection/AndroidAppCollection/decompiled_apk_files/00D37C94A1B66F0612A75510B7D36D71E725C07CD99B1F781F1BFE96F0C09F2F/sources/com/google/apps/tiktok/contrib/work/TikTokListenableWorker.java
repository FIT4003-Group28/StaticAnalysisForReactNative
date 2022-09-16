package com.google.apps.tiktok.contrib.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TikTokListenableWorker extends ListenableWorker {
    private final amly f;
    private final amfw g;
    private final WorkerParameters h;

    public TikTokListenableWorker(Context context, amly amlyVar, amfw amfwVar, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = amfwVar;
        this.f = amlyVar;
        this.h = workerParameters;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [amln, amlv] */
    @Override // androidx.work.ListenableWorker
    public final ankt b() {
        WorkerParameters workerParameters = this.h;
        afy afyVar = new afy(workerParameters.c.size());
        for (String str : workerParameters.c) {
            if (str.startsWith("TikTokWorker#")) {
                afyVar.add(str);
            }
        }
        int i = afyVar.b;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        aqxo.A(z, "Worker has %s tags instead of exactly one.", i);
        String str2 = (String) afyVar.iterator().next();
        if (!amna.o()) {
            ?? c = this.f.c(String.valueOf(str2).concat(" startWork()"));
            try {
                ankt a = this.g.a();
                amna.i(c);
                return a;
            } catch (Throwable th) {
                try {
                    amna.i(c);
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        amlp l = amna.l(String.valueOf(str2).concat(" startWork()"));
        try {
            ankt a2 = this.g.a();
            l.a(a2);
            l.close();
            return a2;
        } catch (Throwable th2) {
            try {
                l.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }
}
