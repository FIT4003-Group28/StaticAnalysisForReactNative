package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dpq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dpq implements Callable {
    public final /* synthetic */ dpr a;
    private final /* synthetic */ int b;

    public /* synthetic */ dpq(dpr dprVar, int i) {
        this.b = i;
        this.a = dprVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.b == 0) {
            return new dpw(this.a.c);
        }
        return new dqf(this.a.d);
    }
}
