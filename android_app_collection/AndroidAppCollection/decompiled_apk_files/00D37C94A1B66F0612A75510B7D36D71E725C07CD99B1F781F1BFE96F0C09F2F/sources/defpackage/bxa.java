package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxa  reason: default package */
/* loaded from: classes2.dex */
public final class bxa implements Callable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public bxa(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return bxe.b(this.a, this.b, this.c);
    }
}
