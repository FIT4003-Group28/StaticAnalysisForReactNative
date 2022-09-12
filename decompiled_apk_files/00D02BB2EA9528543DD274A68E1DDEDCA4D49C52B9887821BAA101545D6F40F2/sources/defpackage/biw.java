package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: biw  reason: default package */
/* loaded from: classes3.dex */
public final class biw implements Callable<bjw<bis>> {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    public biw(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ bjw<bis> call() {
        return bja.c(this.a, this.b);
    }
}
