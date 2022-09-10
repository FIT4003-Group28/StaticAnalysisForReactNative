package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: li  reason: default package */
/* loaded from: classes7.dex */
final class li extends lh {
    public li(Context context, ComponentName componentName, le leVar, Bundle bundle) {
        super(context, componentName, leVar, bundle);
    }

    @Override // defpackage.lg, defpackage.lf
    public final void g(String str, lp lpVar) {
        if (this.f == null || this.e < 2) {
            this.b.subscribe(str, lpVar.a);
        } else {
            super.g(str, lpVar);
        }
    }
}
