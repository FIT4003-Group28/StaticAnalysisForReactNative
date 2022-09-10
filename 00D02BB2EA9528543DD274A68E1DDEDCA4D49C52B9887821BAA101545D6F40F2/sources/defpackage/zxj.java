package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: zxj  reason: default package */
/* loaded from: classes7.dex */
final class zxj implements Callable<Integer> {
    final /* synthetic */ zxk a;
    final /* synthetic */ zxn b;
    final /* synthetic */ zxl c;

    public zxj(zxl zxlVar, zxk zxkVar, zxn zxnVar) {
        this.c = zxlVar;
        this.a = zxkVar;
        this.b = zxnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Integer call() {
        return Integer.valueOf(this.c.a.b(this.a.m, this.b));
    }
}
