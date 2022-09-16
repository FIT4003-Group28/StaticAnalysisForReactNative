package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f837a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<b> f838b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    private class LifecycleOnBackPressedCancellable implements g, androidx.activity.a {

        /* renamed from: a  reason: collision with root package name */
        private final f f839a;

        /* renamed from: b  reason: collision with root package name */
        private final b f840b;

        /* renamed from: c  reason: collision with root package name */
        private androidx.activity.a f841c;

        LifecycleOnBackPressedCancellable(f fVar, b bVar) {
            this.f839a = fVar;
            this.f840b = bVar;
            fVar.a(this);
        }

        @Override // androidx.lifecycle.g
        public void a(i iVar, f.a aVar) {
            if (aVar == f.a.ON_START) {
                this.f841c = OnBackPressedDispatcher.this.a(this.f840b);
            } else if (aVar != f.a.ON_STOP) {
                if (aVar != f.a.ON_DESTROY) {
                    return;
                }
                cancel();
            } else {
                androidx.activity.a aVar2 = this.f841c;
                if (aVar2 == null) {
                    return;
                }
                aVar2.cancel();
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f839a.b(this);
            this.f840b.b(this);
            androidx.activity.a aVar = this.f841c;
            if (aVar != null) {
                aVar.cancel();
                this.f841c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {

        /* renamed from: a  reason: collision with root package name */
        private final b f843a;

        a(b bVar) {
            this.f843a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f838b.remove(this.f843a);
            this.f843a.b(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f837a = runnable;
    }

    androidx.activity.a a(b bVar) {
        this.f838b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void a() {
        Iterator<b> descendingIterator = this.f838b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.b()) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f837a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @SuppressLint({"LambdaLast"})
    public void a(i iVar, b bVar) {
        f a2 = iVar.a();
        if (a2.a() == f.b.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(a2, bVar));
    }
}
