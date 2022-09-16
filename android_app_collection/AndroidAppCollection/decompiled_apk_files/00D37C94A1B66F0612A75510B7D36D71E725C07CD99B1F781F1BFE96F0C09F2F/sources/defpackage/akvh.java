package defpackage;

import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import j$.util.function.BiPredicate;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: akvh  reason: default package */
/* loaded from: classes.dex */
public final class akvh implements Callable {
    private final int a;
    private final BiPredicate b;
    private final akvi c;

    public akvh(int i, akvi akviVar, BiPredicate biPredicate) {
        this.c = akviVar;
        this.b = biPredicate;
        this.a = i;
    }

    private static final aopa b(Thread thread, StackTraceElement[] stackTraceElementArr) {
        aopa createBuilder = aqet.a.createBuilder();
        String name = thread.getName();
        createBuilder.copyOnWrite();
        aqet aqetVar = (aqet) createBuilder.instance;
        name.getClass();
        aqetVar.b |= 2;
        aqetVar.d = name;
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String stackTraceElement2 = stackTraceElement.toString();
            if (sb.length() + stackTraceElement2.length() > 2000) {
                break;
            }
            sb.append(stackTraceElement2);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        createBuilder.copyOnWrite();
        aqet aqetVar2 = (aqet) createBuilder.instance;
        sb2.getClass();
        aqetVar2.b |= 1;
        aqetVar2.c = sb2;
        return createBuilder;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public final aqes call() {
        Map k;
        long uptimeMillis = SystemClock.uptimeMillis();
        aopa createBuilder = aqer.a.createBuilder();
        createBuilder.copyOnWrite();
        aqer aqerVar = (aqer) createBuilder.instance;
        aqerVar.b |= 1;
        aqerVar.c = uptimeMillis;
        long uptimeMillis2 = Build.VERSION.SDK_INT >= 24 ? SystemClock.uptimeMillis() - Process.getStartUptimeMillis() : 0L;
        createBuilder.copyOnWrite();
        aqer aqerVar2 = (aqer) createBuilder.instance;
        aqerVar2.b |= 32;
        aqerVar2.h = uptimeMillis2;
        int rotation = this.c.a.getDefaultDisplay().getRotation();
        int i = 3;
        if (rotation == 0) {
            i = 2;
        } else if (rotation == 1) {
            i = 4;
        } else if (rotation != 2) {
            i = rotation == 3 ? 5 : 1;
        }
        createBuilder.copyOnWrite();
        aqer aqerVar3 = (aqer) createBuilder.instance;
        aqerVar3.g = i - 1;
        aqerVar3.b |= 16;
        long pss = Debug.getPss();
        createBuilder.copyOnWrite();
        aqer aqerVar4 = (aqer) createBuilder.instance;
        aqerVar4.b |= 64;
        aqerVar4.i = pss / 1024;
        aopa createBuilder2 = aqes.a.createBuilder();
        akvi akviVar = this.c;
        if (this.a != 0) {
            k = Thread.getAllStackTraces();
        } else {
            Thread thread = akviVar.b;
            k = amup.k(thread, thread.getStackTrace());
        }
        for (Map.Entry entry : k.entrySet()) {
            Thread thread2 = (Thread) entry.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            if (this.c.b.equals(thread2)) {
                aopa b = b(thread2, stackTraceElementArr);
                createBuilder2.copyOnWrite();
                aqes aqesVar = (aqes) createBuilder2.instance;
                aqet aqetVar = (aqet) b.mo39build();
                aqetVar.getClass();
                aqesVar.c = aqetVar;
                aqesVar.b |= 1;
            } else if (!this.b.test(thread2, stackTraceElementArr)) {
                aopa b2 = b(thread2, stackTraceElementArr);
                createBuilder2.copyOnWrite();
                aqes aqesVar2 = (aqes) createBuilder2.instance;
                aqet aqetVar2 = (aqet) b2.mo39build();
                aqetVar2.getClass();
                aopu aopuVar = aqesVar2.d;
                if (!aopuVar.c()) {
                    aqesVar2.d = aopi.mutableCopy(aopuVar);
                }
                aqesVar2.d.add(aqetVar2);
            }
        }
        long uptimeMillis3 = SystemClock.uptimeMillis();
        createBuilder.copyOnWrite();
        aqer aqerVar5 = (aqer) createBuilder.instance;
        aqerVar5.b = 2 | aqerVar5.b;
        aqerVar5.d = (float) (uptimeMillis3 - uptimeMillis);
        createBuilder2.copyOnWrite();
        aqes aqesVar3 = (aqes) createBuilder2.instance;
        aqer aqerVar6 = (aqer) createBuilder.mo39build();
        aqerVar6.getClass();
        aqesVar3.a();
        aqesVar3.e.add(aqerVar6);
        return (aqes) createBuilder2.mo39build();
    }
}
