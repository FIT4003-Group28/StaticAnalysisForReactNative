package defpackage;

import android.os.Build;
import android.os.Debug;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akvw  reason: default package */
/* loaded from: classes.dex */
public final class akvw extends Thread {
    public volatile boolean a;
    final /* synthetic */ akvx b;
    private final Runnable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akvw(akvx akvxVar) {
        super("ANRGuard-Thread");
        this.b = akvxVar;
        this.c = new Runnable() { // from class: akvv
            @Override // java.lang.Runnable
            public final void run() {
                akvw.this.a = false;
            }
        };
        this.a = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        aopa mo52toBuilder;
        int i = akvp.a;
        Thread thread = this.b.c.getLooper().getThread();
        akvs akvsVar = this.b.b;
        if (akvsVar.c.a.exists()) {
            try {
                aphf aphfVar = (aphf) ((aopa) aphf.a.createBuilder().mo38mergeFrom(anhe.h(akvsVar.c.a), aoos.b())).mo39build();
                String.valueOf(String.valueOf(aphfVar)).length();
                arrf a = arrh.a();
                a.copyOnWrite();
                ((arrh) a.instance).bX(aphfVar);
                akvsVar.d.c((arrh) a.mo39build());
                akvsVar.a();
            } catch (IOException e) {
                afus.c(2, 27, "Unable to flush ANR", e);
            }
        }
        this.b.d.a();
        while (!interrupted()) {
            this.a = true;
            this.b.c.post(this.c);
            try {
                TimeUnit.MILLISECONDS.sleep(this.b.a);
                this.b.d.a();
                if (Debug.isDebuggerConnected()) {
                    this.b.b.a();
                } else if (!this.a) {
                    akvx akvxVar = this.b;
                    akvs akvsVar2 = akvxVar.b;
                    long j = akvxVar.a;
                    aphf aphfVar2 = akvsVar2.g;
                    if (aphfVar2 != null) {
                        if (akvsVar2.f) {
                            aopa mo52toBuilder2 = aphfVar2.mo52toBuilder();
                            mo52toBuilder2.copyOnWrite();
                            aphf aphfVar3 = (aphf) mo52toBuilder2.instance;
                            aphfVar3.b |= 1;
                            aphfVar3.c = true;
                            akvsVar2.b(mo52toBuilder2, j);
                            int i2 = Build.VERSION.SDK_INT;
                            mo52toBuilder2.copyOnWrite();
                            aphf aphfVar4 = (aphf) mo52toBuilder2.instance;
                            aphfVar4.b |= 64;
                            aphfVar4.i = i2;
                            int a2 = zfm.a(akvsVar2.a);
                            mo52toBuilder2.copyOnWrite();
                            aphf aphfVar5 = (aphf) mo52toBuilder2.instance;
                            aphfVar5.b |= 128;
                            aphfVar5.j = a2;
                            akvsVar2.g = (aphf) mo52toBuilder2.mo39build();
                            String.valueOf(String.valueOf(akvsVar2.g)).length();
                            arrf a3 = arrh.a();
                            aphf aphfVar6 = akvsVar2.g;
                            a3.copyOnWrite();
                            ((arrh) a3.instance).bX(aphfVar6);
                            akvsVar2.d.c((arrh) a3.mo39build());
                        }
                        akvsVar2.a();
                    }
                } else {
                    akvx akvxVar2 = this.b;
                    akvs akvsVar3 = akvxVar2.b;
                    long j2 = akvxVar2.a;
                    aphf aphfVar7 = akvsVar3.g;
                    if (aphfVar7 != null) {
                        mo52toBuilder = aphfVar7.mo52toBuilder();
                    } else {
                        mo52toBuilder = aphf.a.createBuilder();
                        mo52toBuilder.copyOnWrite();
                        aphf aphfVar8 = (aphf) mo52toBuilder.instance;
                        aphfVar8.b |= 8;
                        aphfVar8.f = akvsVar3.b.c() - j2;
                    }
                    akvsVar3.b(mo52toBuilder, j2);
                    int i3 = akvsVar3.e;
                    if (i3 > 0) {
                        StringBuilder sb = new StringBuilder();
                        for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                            sb.append(stackTraceElement);
                            sb.append("\n");
                        }
                        String sb2 = sb.toString();
                        if (sb.length() > i3) {
                            sb2 = sb2.substring(0, i3);
                        }
                        mo52toBuilder.copyOnWrite();
                        aphf aphfVar9 = (aphf) mo52toBuilder.instance;
                        sb2.getClass();
                        aphfVar9.b |= 4;
                        aphfVar9.e = sb2;
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    mo52toBuilder.copyOnWrite();
                    aphf aphfVar10 = (aphf) mo52toBuilder.instance;
                    aphfVar10.b |= 64;
                    aphfVar10.i = i4;
                    int a4 = zfm.a(akvsVar3.a);
                    mo52toBuilder.copyOnWrite();
                    aphf aphfVar11 = (aphf) mo52toBuilder.instance;
                    aphfVar11.b |= 128;
                    aphfVar11.j = a4;
                    akvsVar3.g = (aphf) mo52toBuilder.mo39build();
                    try {
                        String.valueOf(String.valueOf(akvsVar3.g)).length();
                        akvr akvrVar = akvsVar3.c;
                        aphf aphfVar12 = akvsVar3.g;
                        if (!akvrVar.b) {
                            akvrVar.b = true;
                            File parentFile = akvrVar.a.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                        }
                        anhe.g(aphfVar12.toByteArray(), akvrVar.a);
                    } catch (IOException e2) {
                        afus.c(2, 27, "Unable to record ANR", e2);
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
