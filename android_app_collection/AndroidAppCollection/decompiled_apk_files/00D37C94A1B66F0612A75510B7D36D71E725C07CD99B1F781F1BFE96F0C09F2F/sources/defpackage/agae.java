package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: agae  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agae implements ampg {
    public final /* synthetic */ aoqu a;
    private final /* synthetic */ int b;

    public /* synthetic */ agae(aoqu aoquVar, int i) {
        this.b = i;
        this.a = aoquVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            aoqu aoquVar = this.a;
            Bundle bundle = new Bundle();
            bundle.putString("renderer_class_name", aoquVar.getClass().getName());
            bundle.putString("unique_payload_id", (String) obj);
            return bundle;
        }
        aoqu aoquVar2 = (aoqu) obj;
        return this.a;
    }
}
