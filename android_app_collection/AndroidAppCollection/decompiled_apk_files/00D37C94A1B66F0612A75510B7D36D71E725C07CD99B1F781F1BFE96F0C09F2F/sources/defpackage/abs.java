package defpackage;

import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import java.util.ArrayDeque;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: abs  reason: default package */
/* loaded from: classes.dex */
public final class abs {
    final ArrayDeque a;
    private final Runnable b;

    public abs() {
        this(null);
    }

    public final abi a(abq abqVar) {
        this.a.add(abqVar);
        abr abrVar = new abr(this, abqVar);
        abqVar.b(abrVar);
        return abrVar;
    }

    public final void b(apy apyVar, abq abqVar) {
        apu lifecycle = apyVar.getLifecycle();
        if (lifecycle.a() == apt.DESTROYED) {
            return;
        }
        abqVar.b(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, abqVar));
    }

    public final void c() {
        Iterator descendingIterator = this.a.descendingIterator();
        while (descendingIterator.hasNext()) {
            abq abqVar = (abq) descendingIterator.next();
            if (abqVar.b) {
                abqVar.a();
                return;
            }
        }
        this.b.run();
    }

    public abs(Runnable runnable) {
        this.a = new ArrayDeque();
        this.b = runnable;
    }
}
