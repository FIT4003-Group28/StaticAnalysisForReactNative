package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxb  reason: default package */
/* loaded from: classes2.dex */
public final class bxb implements Callable {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ Context b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;

    public bxb(WeakReference weakReference, Context context, int i, String str) {
        this.a = weakReference;
        this.b = context;
        this.c = i;
        this.d = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Context context = (Context) this.a.get();
        if (context == null) {
            context = this.b;
        }
        return bxe.f(context, this.c, this.d);
    }
}
