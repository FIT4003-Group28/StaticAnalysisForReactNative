package defpackage;

import java.io.InputStream;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: biy  reason: default package */
/* loaded from: classes3.dex */
public final class biy implements Callable<bjw<bis>> {
    final /* synthetic */ InputStream a;
    final /* synthetic */ String b;

    public biy(InputStream inputStream, String str) {
        this.a = inputStream;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ bjw<bis> call() {
        return bja.g(this.a, this.b);
    }
}
