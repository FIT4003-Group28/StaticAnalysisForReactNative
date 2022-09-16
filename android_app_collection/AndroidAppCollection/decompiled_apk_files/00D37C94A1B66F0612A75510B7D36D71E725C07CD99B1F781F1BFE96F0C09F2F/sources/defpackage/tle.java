package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: tle  reason: default package */
/* loaded from: classes4.dex */
public final class tle {
    private static final AtomicInteger a = new AtomicInteger();
    private static final long b;
    private static final angh c;

    static {
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        b = currentTimeMillis;
        SystemClock.elapsedRealtime();
        aopa createBuilder = angh.a.createBuilder();
        createBuilder.copyOnWrite();
        angh anghVar = (angh) createBuilder.instance;
        anghVar.b |= 2;
        anghVar.d = 0;
        createBuilder.copyOnWrite();
        angh anghVar2 = (angh) createBuilder.instance;
        anghVar2.b |= 4;
        anghVar2.e = 0;
        createBuilder.copyOnWrite();
        angh anghVar3 = (angh) createBuilder.instance;
        anghVar3.b |= 1;
        anghVar3.c = currentTimeMillis;
        c = (angh) createBuilder.mo39build();
    }

    public static angg a() {
        aopa createBuilder = angg.a.createBuilder();
        int andIncrement = a.getAndIncrement();
        createBuilder.copyOnWrite();
        angg anggVar = (angg) createBuilder.instance;
        anggVar.b |= 2;
        anggVar.d = andIncrement;
        angh anghVar = c;
        createBuilder.copyOnWrite();
        angg anggVar2 = (angg) createBuilder.instance;
        anghVar.getClass();
        anggVar2.c = anghVar;
        anggVar2.b |= 1;
        return (angg) createBuilder.mo39build();
    }
}
