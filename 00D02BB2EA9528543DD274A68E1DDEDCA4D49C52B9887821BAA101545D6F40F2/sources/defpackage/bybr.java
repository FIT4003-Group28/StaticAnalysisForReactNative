package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bybr  reason: default package */
/* loaded from: classes4.dex */
final class bybr implements Runnable {
    final /* synthetic */ bybt a;

    public bybr(bybt bybtVar) {
        this.a = bybtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = bybt.g;
        Iterator<K> it = ((dznt) this.a.a).g().iterator();
        while (it.hasNext()) {
            byax byaxVar = (byax) ((Map.Entry) it.next()).getValue();
            if (byaxVar != null && !byaxVar.equals(this.a.b)) {
                for (byay byayVar : byaxVar.b) {
                    if (byayVar.d != null) {
                        byayVar.a();
                    }
                }
                byaxVar.b = dcdc.e();
                byaxVar.f();
                it.remove();
            }
        }
    }
}
