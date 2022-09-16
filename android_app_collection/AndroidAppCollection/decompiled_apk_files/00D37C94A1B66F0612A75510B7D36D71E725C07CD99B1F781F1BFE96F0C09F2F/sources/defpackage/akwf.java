package defpackage;

import java.lang.Thread;
/* compiled from: PG */
/* renamed from: akwf  reason: default package */
/* loaded from: classes.dex */
public final class akwf implements Thread.UncaughtExceptionHandler {
    public final akwh a;
    public Thread.UncaughtExceptionHandler b;
    private final azqb c;

    public akwf(akwh akwhVar, azqb azqbVar) {
        this.a = akwhVar;
        this.c = azqbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0208, code lost:
        if ((r0 & 2) != 0) goto L25;
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r14, java.lang.Throwable r15) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwf.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
