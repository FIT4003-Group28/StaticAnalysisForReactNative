package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayff  reason: default package */
/* loaded from: classes2.dex */
final class ayff extends ayfb {
    final /* synthetic */ ayfq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayff(ayfr ayfrVar, ayfq ayfqVar) {
        super(ayfrVar.a);
        this.a = ayfqVar;
    }

    @Override // defpackage.ayfb
    public final void a() {
        List<Runnable> list;
        ayfq ayfqVar = this.a;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (ayfqVar) {
                if (ayfqVar.b.isEmpty()) {
                    ayfqVar.b = null;
                    ayfqVar.a = true;
                    return;
                }
                list = ayfqVar.b;
                ayfqVar.b = arrayList;
            }
            for (Runnable runnable : list) {
                runnable.run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
