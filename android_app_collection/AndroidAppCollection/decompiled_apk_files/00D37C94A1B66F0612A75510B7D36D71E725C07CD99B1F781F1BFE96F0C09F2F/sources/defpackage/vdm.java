package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: vdm  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vdm implements anir {
    public final /* synthetic */ vco a;
    private final /* synthetic */ int b;

    public /* synthetic */ vdm(vco vcoVar) {
        this.a = vcoVar;
    }

    public /* synthetic */ vdm(vco vcoVar, int i) {
        this.b = i;
        this.a = vcoVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.b == 0) {
            vco vcoVar = this.a;
            return vdq.e(vcoVar.b, vcoVar.c, vcoVar.d, (vdr) obj, vcoVar.g);
        }
        vco vcoVar2 = this.a;
        vby vbyVar = (vby) obj;
        if (vbyVar.a == 29501) {
            String str = vcoVar2.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68);
            sb.append("Failed to commit due to stale snapshot for ");
            sb.append(str);
            sb.append(", triggering flag update.");
            Log.w("ProtoDataStoreFlagStore", sb.toString(), vbyVar);
            vcoVar2.d();
        }
        return anlz.p(vbyVar);
    }
}
