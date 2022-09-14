package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atmm  reason: default package */
/* loaded from: classes2.dex */
public final class atmm implements Callable<Boolean> {
    final /* synthetic */ atmr a;

    public atmm(atmr atmrVar) {
        this.a = atmrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.a.d.v() == null ? false : this.a.d.v().A().booleanValue());
    }
}
