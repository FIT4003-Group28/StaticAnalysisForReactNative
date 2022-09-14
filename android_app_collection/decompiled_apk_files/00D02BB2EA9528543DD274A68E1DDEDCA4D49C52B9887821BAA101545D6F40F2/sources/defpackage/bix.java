package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bix  reason: default package */
/* loaded from: classes3.dex */
public final class bix implements Callable<bjw<bis>> {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ Context b;
    final /* synthetic */ int c;

    public bix(WeakReference weakReference, Context context, int i) {
        this.a = weakReference;
        this.b = context;
        this.c = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ bjw<bis> call() {
        Context context = (Context) this.a.get();
        if (context == null) {
            context = this.b;
        }
        return bja.e(context, this.c);
    }
}
