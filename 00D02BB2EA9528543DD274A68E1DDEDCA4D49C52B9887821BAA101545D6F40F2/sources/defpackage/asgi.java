package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: asgi  reason: default package */
/* loaded from: classes2.dex */
final class asgi implements cqjb<jba, Boolean> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Boolean a(jba jbaVar, Context context) {
        jba jbaVar2 = jbaVar;
        boolean z = true;
        if (!jbaVar2.J().booleanValue() && jbaVar2.Y().booleanValue() && jbaVar2.P().booleanValue() && jbaVar2.Z().booleanValue() && jbaVar2.aa().booleanValue() && cqjv.v(jbaVar2.i()).booleanValue() && !jbaVar2.v().booleanValue() && !jbaVar2.W().booleanValue() && cqjv.v(jbaVar2.Q()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
