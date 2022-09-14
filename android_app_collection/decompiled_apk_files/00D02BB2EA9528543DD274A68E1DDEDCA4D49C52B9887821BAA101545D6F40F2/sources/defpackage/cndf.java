package defpackage;

import android.content.Context;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: cndf  reason: default package */
/* loaded from: classes5.dex */
public final class cndf extends cndc {
    private final Context h;
    private final ddid i;

    public cndf(Context context, cmze cmzeVar, cmzh cmzhVar, cnac cnacVar, Looper looper, int i, int i2, ddid ddidVar) {
        super(context, cmzeVar, cmzhVar, cnacVar, looper, i, i2);
        this.h = context;
        this.i = ddidVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cndc
    public final ddid f() {
        return this.i;
    }

    @Override // defpackage.cndc
    protected final cnce h() {
        return new cnde(this.h);
    }
}
