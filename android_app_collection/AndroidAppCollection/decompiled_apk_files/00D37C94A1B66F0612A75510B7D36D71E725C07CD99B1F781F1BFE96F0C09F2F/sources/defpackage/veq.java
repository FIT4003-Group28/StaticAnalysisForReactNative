package defpackage;

import android.os.Looper;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: veq  reason: default package */
/* loaded from: classes4.dex */
public final class veq implements vek {
    private static final amzy a = amzy.l("com/google/android/libraries/processinit/finalizer/UncaughtExceptionHandlerProcessInitializer");
    private final azqb b;
    private final snc c;

    public veq(azqb azqbVar, snc sncVar) {
        this.b = azqbVar;
        this.c = sncVar;
    }

    @Override // defpackage.vek
    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: vep
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                veq.this.b(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    public final /* synthetic */ void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        long d = this.c.d();
        try {
            ArrayList<Throwable> arrayList = new ArrayList();
            ((amzw) ((amzw) ((amzw) a.f()).h(th)).i("com/google/android/libraries/processinit/finalizer/UncaughtExceptionHandlerProcessInitializer", "lambda$init$0", '5', "UncaughtExceptionHandlerProcessInitializer.java")).q("Encountered uncaught exception.");
            if (thread == Looper.getMainLooper().getThread()) {
                Set<veo> set = (Set) this.b.get();
                ArrayList arrayList2 = new ArrayList(set.size());
                for (veo veoVar : set) {
                    arrayList2.add(veoVar.a());
                }
                amzt listIterator = anlz.i(arrayList2).listIterator();
                while (listIterator.hasNext()) {
                    try {
                        anlz.d((ankt) listIterator.next(), 4000 - (this.c.d() - d), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException e) {
                        arrayList.add(e);
                    } catch (Throwable th2) {
                        arrayList.add(th2);
                    }
                }
            }
            for (Throwable th3 : arrayList) {
                th3.printStackTrace();
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
