package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: daa  reason: default package */
/* loaded from: classes3.dex */
public final class daa extends ddc implements dcm {
    private final AtomicInteger c;
    private final int d;

    public daa(int i) {
        super(i);
        this.c = new AtomicInteger(0);
        this.d = i;
    }

    @Override // defpackage.dcm
    public final Object a(Context context, czb czbVar) {
        Object d = super.d();
        if (d != null) {
            return d;
        }
        this.c.incrementAndGet();
        return czbVar.J(context);
    }

    @Override // defpackage.dcm
    public final void b(Context context, czb czbVar) {
        if (this.b < this.a && this.c.getAndIncrement() < this.d) {
            c(czbVar.J(context));
        }
    }
}
