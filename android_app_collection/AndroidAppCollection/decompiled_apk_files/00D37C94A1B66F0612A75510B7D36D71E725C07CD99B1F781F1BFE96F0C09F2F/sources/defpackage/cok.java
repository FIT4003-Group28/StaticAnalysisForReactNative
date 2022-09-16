package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cok  reason: default package */
/* loaded from: classes2.dex */
public final class cok implements cnr {
    private final Context a;
    private final /* synthetic */ int b;

    public cok(Context context) {
        this.a = context;
    }

    public cok(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.cnr
    public final void d() {
    }

    @Override // defpackage.cnr
    public final cnq c(cny cnyVar) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return new col(this.a, 1);
            }
            return new col(this.a, 2, null);
        }
        return new col(this.a);
    }
}
