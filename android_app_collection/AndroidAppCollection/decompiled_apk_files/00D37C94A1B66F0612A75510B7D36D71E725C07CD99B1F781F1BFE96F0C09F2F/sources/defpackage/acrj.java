package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acrj  reason: default package */
/* loaded from: classes.dex */
final class acrj implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Thread.UncaughtExceptionHandler a;
    final /* synthetic */ acrk b;

    public acrj(acrk acrkVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = acrkVar;
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        final acrk acrkVar = this.b;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        zep.f(acrk.a, "APP CRASHED!", th);
        long j = ((awtn) ((yve) acrkVar.c.get()).c()).e;
        long c = acrkVar.b.c();
        if (j > c || c - j >= 10000) {
            final Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            if (afux.b(th2)) {
                th2 = afux.a(th2);
            }
            try {
                ((yve) acrkVar.c.get()).b(new ampg() { // from class: acri
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        aoob aoobVar;
                        acrk acrkVar2 = acrk.this;
                        Throwable th3 = th2;
                        awtn awtnVar = (awtn) obj;
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            objectOutputStream.writeObject(th3);
                            objectOutputStream.flush();
                            aoobVar = aoob.x(byteArrayOutputStream.toByteArray());
                        } catch (IOException unused) {
                            zep.f(acrk.a, "Failed to serialize throwable.", th3);
                            aoobVar = null;
                        }
                        if (aoobVar == null) {
                            return awtnVar;
                        }
                        aopa mo52toBuilder = awtnVar.mo52toBuilder();
                        mo52toBuilder.copyOnWrite();
                        awtn awtnVar2 = (awtn) mo52toBuilder.instance;
                        awtnVar2.b |= 2;
                        awtnVar2.d = aoobVar;
                        long c2 = acrkVar2.b.c();
                        mo52toBuilder.copyOnWrite();
                        awtn awtnVar3 = (awtn) mo52toBuilder.instance;
                        awtnVar3.b |= 4;
                        awtnVar3.e = c2;
                        return (awtn) mo52toBuilder.mo39build();
                    }
                }).get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e) {
                afus.c(1, 12, "Failed to save the last crash exception.", e);
            }
        } else {
            try {
                ((yve) acrkVar.c.get()).b(new ampg() { // from class: acrh
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        acrk acrkVar2 = acrk.this;
                        aopa mo52toBuilder = ((awtn) obj).mo52toBuilder();
                        long c2 = acrkVar2.b.c();
                        mo52toBuilder.copyOnWrite();
                        awtn awtnVar = (awtn) mo52toBuilder.instance;
                        awtnVar.b |= 4;
                        awtnVar.e = c2;
                        return (awtn) mo52toBuilder.mo39build();
                    }
                }).get(1L, TimeUnit.SECONDS);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            } catch (Exception unused3) {
                zep.b("Failed to write the last exception time");
            }
            zep.c(acrk.a, "APP CRASHED RECENTLY.  Ignore!!!");
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
