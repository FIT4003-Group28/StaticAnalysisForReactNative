package defpackage;

import android.os.Build;
import android.os.Debug;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akwa  reason: default package */
/* loaded from: classes.dex */
public final class akwa extends Thread {
    public volatile boolean a;
    final /* synthetic */ akwb b;
    private final Runnable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akwa(akwb akwbVar) {
        super("ANRGuard-Thread");
        this.b = akwbVar;
        this.c = new Runnable() { // from class: akvz
            @Override // java.lang.Runnable
            public final void run() {
                akwa.this.a = false;
            }
        };
        this.a = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        aopa mo52toBuilder;
        int i = akvp.a;
        Thread thread = this.b.b.getLooper().getThread();
        while (!interrupted()) {
            this.a = true;
            this.b.b.post(this.c);
            akvq akvqVar = (akvq) this.b.d.get();
            try {
                Thread.sleep(this.b.a);
                if (akvqVar != null) {
                    akvqVar.a();
                }
                if (Debug.isDebuggerConnected()) {
                    this.b.c.a();
                } else {
                    boolean z = false;
                    if (!this.a) {
                        akvt akvtVar = this.b.c;
                        if (akvtVar.b != null) {
                            akvtVar.a();
                            this.b.e.g.a(ywr.a, 0);
                        }
                    } else {
                        akwb akwbVar = this.b;
                        akvt akvtVar2 = akwbVar.c;
                        long j = akwbVar.a;
                        aphf aphfVar = akvtVar2.b;
                        if (aphfVar != null) {
                            mo52toBuilder = aphfVar.mo52toBuilder();
                        } else {
                            mo52toBuilder = aphf.a.createBuilder();
                            mo52toBuilder.copyOnWrite();
                            aphf aphfVar2 = (aphf) mo52toBuilder.instance;
                            aphfVar2.b |= 8;
                            aphfVar2.f = akvtVar2.a.d.c() - j;
                            z = true;
                        }
                        mo52toBuilder.copyOnWrite();
                        aphf aphfVar3 = (aphf) mo52toBuilder.instance;
                        aphfVar3.b |= 2;
                        aphfVar3.d = (int) (((aphf) mo52toBuilder.instance).d + j);
                        if (akvqVar == null || akvqVar.c()) {
                            mo52toBuilder.copyOnWrite();
                            aphf aphfVar4 = (aphf) mo52toBuilder.instance;
                            aphfVar4.b |= 16;
                            aphfVar4.g = (int) (((aphf) mo52toBuilder.instance).g + j);
                        }
                        if (akvqVar == null || akvqVar.b()) {
                            mo52toBuilder.copyOnWrite();
                            aphf aphfVar5 = (aphf) mo52toBuilder.instance;
                            aphfVar5.b |= 32;
                            aphfVar5.h = (int) (((aphf) mo52toBuilder.instance).h + j);
                        }
                        String c = akvu.c(thread);
                        mo52toBuilder.copyOnWrite();
                        aphf aphfVar6 = (aphf) mo52toBuilder.instance;
                        c.getClass();
                        aphfVar6.b |= 4;
                        aphfVar6.e = c;
                        int i2 = Build.VERSION.SDK_INT;
                        mo52toBuilder.copyOnWrite();
                        aphf aphfVar7 = (aphf) mo52toBuilder.instance;
                        aphfVar7.b |= 64;
                        aphfVar7.i = i2;
                        int a = zfm.a(akvtVar2.a.b);
                        mo52toBuilder.copyOnWrite();
                        aphf aphfVar8 = (aphf) mo52toBuilder.instance;
                        aphfVar8.b |= 128;
                        aphfVar8.j = a;
                        akvtVar2.b = (aphf) mo52toBuilder.mo39build();
                        String.valueOf(String.valueOf(akvtVar2.b)).length();
                        akpq.i(akvtVar2.a, akvtVar2.b);
                        if (z) {
                            this.b.e.g.a(ywr.a, 1);
                        }
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
