package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: dbbi  reason: default package */
/* loaded from: classes5.dex */
public final class dbbi implements Runnable {
    final /* synthetic */ Activity a;
    final /* synthetic */ dbbk b;
    final /* synthetic */ dbay c;

    public dbbi(dbbk dbbkVar, Activity activity, dbay dbayVar) {
        this.b = dbbkVar;
        this.a = activity;
        this.c = dbayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.b.e.e(this.a.getApplicationInfo().packageName, Collections.singletonList(dbbk.h()), new Bundle(), new dbbg(this, atomicBoolean));
            new Handler().postDelayed(new dbbh(this, atomicBoolean), 3000L);
        } catch (RemoteException unused) {
            dbbk.g(this.a, this.c);
        }
    }
}
