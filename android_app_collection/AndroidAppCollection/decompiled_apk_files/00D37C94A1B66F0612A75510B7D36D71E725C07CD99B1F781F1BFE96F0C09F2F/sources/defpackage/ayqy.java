package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ayqy  reason: default package */
/* loaded from: classes2.dex */
public final class ayqy implements Callable, ayqe {
    public final Object a;

    public ayqy(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        return this.a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }
}
