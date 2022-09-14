package defpackage;

import android.content.Intent;
import android.os.Debug;
import java.io.File;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwxe  reason: default package */
/* loaded from: classes5.dex */
public final class cwxe implements Runnable {
    final /* synthetic */ cwxf a;
    private final long b;

    public cwxe(cwxf cwxfVar, long j) {
        this.a = cwxfVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cwwz a = this.a.d.a();
        long d = this.b + a.d();
        long b = this.a.f.b();
        if (d <= b) {
            this.a.a(false);
            return;
        }
        cwxf cwxfVar = this.a;
        Intent registerReceiver = cwxfVar.b.registerReceiver(null, cwxfVar.e);
        cwxf cwxfVar2 = this.a;
        dzyx bZ = dzyy.e.bZ();
        dzza c = cwxfVar2.c(registerReceiver);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzyy dzyyVar = (dzyy) bZ.b;
        c.getClass();
        dzyyVar.b = c;
        dzyyVar.a |= 1;
        dzyy bK = bZ.bK();
        dbsg<File> a2 = this.a.i.a();
        if (!a2.a()) {
            return;
        }
        File b2 = a2.b();
        cwxf.d(b2);
        Debug.startMethodTracingSampling(b2.getAbsolutePath(), a.c(), a.f());
        cwxf cwxfVar3 = this.a;
        cwxfVar3.h = cwxfVar3.c.d(new cwxd(cwxfVar3, b2, bK, Float.valueOf(cwxf.f(registerReceiver)), d, b), d - b, TimeUnit.MILLISECONDS);
    }
}
