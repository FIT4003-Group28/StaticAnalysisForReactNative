package defpackage;

import java.io.InputStream;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxc  reason: default package */
/* loaded from: classes2.dex */
public final class bxc implements Callable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ String b;

    public bxc(InputStream inputStream, String str) {
        this.a = inputStream;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return bxe.c(this.a, this.b);
    }
}
