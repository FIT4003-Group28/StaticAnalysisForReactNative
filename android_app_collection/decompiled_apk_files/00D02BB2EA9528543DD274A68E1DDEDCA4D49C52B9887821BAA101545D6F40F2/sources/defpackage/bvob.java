package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: PG */
/* renamed from: bvob  reason: default package */
/* loaded from: classes.dex */
public final class bvob implements cqfk {
    public final ConcurrentLinkedQueue<View.OnAttachStateChangeListener> a;

    public bvob(View.OnAttachStateChangeListener... onAttachStateChangeListenerArr) {
        this.a = new ConcurrentLinkedQueue<>(Arrays.asList(onAttachStateChangeListenerArr));
    }

    @Override // defpackage.cqfk
    public final void a(View view) {
        Iterator<View.OnAttachStateChangeListener> it = this.a.iterator();
        while (it.hasNext()) {
            View.OnAttachStateChangeListener next = it.next();
            if (next instanceof cqfk) {
                ((cqfk) next).a(view);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Iterator<View.OnAttachStateChangeListener> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onViewAttachedToWindow(view);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Iterator<View.OnAttachStateChangeListener> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onViewDetachedFromWindow(view);
        }
    }
}
