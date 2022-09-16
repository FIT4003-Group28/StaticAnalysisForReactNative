package defpackage;

import android.content.Intent;
import j$.util.function.Supplier;
/* compiled from: PG */
/* renamed from: agar  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agar implements Supplier {
    public final /* synthetic */ Intent a;
    private final /* synthetic */ int b;

    public /* synthetic */ agar(Intent intent, int i) {
        this.b = i;
        this.a = intent;
    }

    @Override // j$.util.function.Supplier
    /* renamed from: get */
    public final Object mo515get() {
        if (this.b == 0) {
            return uir.a(amuk.r(this.a));
        }
        return uir.a(amuk.r(this.a));
    }
}
