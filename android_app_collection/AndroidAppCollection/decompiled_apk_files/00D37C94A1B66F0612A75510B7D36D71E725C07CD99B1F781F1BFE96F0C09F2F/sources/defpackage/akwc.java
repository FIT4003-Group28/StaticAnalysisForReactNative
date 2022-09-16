package defpackage;

import android.os.Build;
import android.os.Debug;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: akwc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akwc implements Runnable {
    public final /* synthetic */ akwe a;
    private final /* synthetic */ int b;

    public /* synthetic */ akwc(akwe akweVar) {
        this.a = akweVar;
    }

    public /* synthetic */ akwc(akwe akweVar, int i) {
        this.b = i;
        this.a = akweVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        boolean z = true;
        if (this.b != 0) {
            akwe akweVar = this.a;
            long g = akweVar.h.d.g();
            akvy akvyVar = (akvy) akweVar.g.get();
            boolean z2 = akvyVar.a;
            long j = g - akvyVar.b;
            long j2 = akweVar.a;
            boolean z3 = false;
            if (j > j2) {
                if (Debug.isDebuggerConnected()) {
                    akweVar.d.a();
                } else {
                    Thread thread = akweVar.e.getLooper().getThread();
                    akvu akvuVar = akweVar.d;
                    if (akvuVar.b == null) {
                        aopa createBuilder = aphf.a.createBuilder();
                        long c = akvuVar.a.d.c();
                        createBuilder.copyOnWrite();
                        aphf aphfVar = (aphf) createBuilder.instance;
                        aphfVar.b |= 8;
                        aphfVar.f = c - j;
                        int i = Build.VERSION.SDK_INT;
                        createBuilder.copyOnWrite();
                        aphf aphfVar2 = (aphf) createBuilder.instance;
                        aphfVar2.b |= 64;
                        aphfVar2.i = i;
                        int a = zfm.a(akvuVar.a.b);
                        createBuilder.copyOnWrite();
                        aphf aphfVar3 = (aphf) createBuilder.instance;
                        aphfVar3.b |= 128;
                        aphfVar3.j = a;
                        String c2 = akvu.c(thread);
                        createBuilder.copyOnWrite();
                        aphf aphfVar4 = (aphf) createBuilder.instance;
                        c2.getClass();
                        aphfVar4.b |= 4;
                        aphfVar4.e = c2;
                        akvuVar.b = createBuilder;
                        z3 = true;
                    }
                    aopa aopaVar = akvuVar.b;
                    long min = Math.min(j, 2147483647L);
                    aopaVar.copyOnWrite();
                    aphf aphfVar5 = (aphf) aopaVar.instance;
                    aphf aphfVar6 = aphf.a;
                    aphfVar5.b |= 2;
                    aphfVar5.d = (int) min;
                    if (z2) {
                        int i2 = akvp.a;
                        long min2 = Math.min(j, 2147483647L);
                        aopaVar.copyOnWrite();
                        aphf aphfVar7 = (aphf) aopaVar.instance;
                        aphfVar7.b |= 16;
                        aphfVar7.g = (int) min2;
                    }
                    if (z3) {
                        akweVar.h.g.a(ywr.a, 1);
                    }
                    akvu akvuVar2 = akweVar.d;
                    aopa aopaVar2 = akvuVar2.b;
                    if (aopaVar2 != null) {
                        String.valueOf(String.valueOf(aopaVar2.mo39build())).length();
                        int i3 = akvp.a;
                        akpq.i(akvuVar2.a, (aphf) akvuVar2.b.mo39build());
                    } else {
                        int i4 = akvp.a;
                    }
                    j2 = akweVar.c;
                }
            } else {
                akvu akvuVar3 = akweVar.d;
                if (akvuVar3.b != null) {
                    akvuVar3.a();
                    akweVar.h.g.a(ywr.a, 0);
                }
                j2 = (akweVar.a - j) + 50;
            }
            akweVar.i.schedule(new akwc(akweVar, 1), j2, TimeUnit.MILLISECONDS);
            return;
        }
        akwe akweVar2 = this.a;
        long g2 = akweVar2.h.d.g();
        AtomicReference atomicReference = akweVar2.g;
        akwd akwdVar = (akwd) akweVar2.f.get();
        if (akwdVar != null && (bool = akwdVar.a) != null) {
            z = bool.booleanValue();
        }
        atomicReference.set(new akvy(g2, z));
        akweVar2.e.postDelayed(new akwc(akweVar2), akweVar2.b);
    }
}
