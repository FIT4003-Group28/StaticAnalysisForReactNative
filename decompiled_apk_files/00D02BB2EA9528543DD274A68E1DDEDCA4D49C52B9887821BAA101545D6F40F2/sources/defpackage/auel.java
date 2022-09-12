package defpackage;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: auel  reason: default package */
/* loaded from: classes2.dex */
final class auel implements Runnable {
    final /* synthetic */ aueo a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ auem c;

    public auel(auem auemVar, aueo aueoVar, AtomicReference atomicReference) {
        this.c = auemVar;
        this.a = aueoVar;
        this.b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aueo aueoVar = this.a;
        Uri uri = null;
        Uri bI = aueoVar != null ? aueoVar.bI() : null;
        if (bI == null) {
            akoz akozVar = this.c.b;
            amyn.b.a();
            if (akozVar.a.a().p) {
                alad n = akozVar.a.a().n();
                float f = n.k;
                akqq akqqVar = n.i;
                double d = akqqVar.a;
                double d2 = akqqVar.b;
                uri = Uri.parse("http://maps.google.com/?ll=" + d + "," + d2 + "&z=" + f);
            }
        } else {
            uri = bI;
        }
        if (uri != null) {
            this.b.set(uri);
        }
    }
}
