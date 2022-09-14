package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dymj  reason: default package */
/* loaded from: classes6.dex */
public final class dymj extends dymf {
    final /* synthetic */ dymu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dymj(dymv dymvVar, dymu dymuVar) {
        super(dymvVar.a);
        this.a = dymuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dymf
    public final void a() {
        List<Runnable> list;
        dymu dymuVar = this.a;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (dymuVar) {
                if (dymuVar.c.isEmpty()) {
                    dymuVar.c = null;
                    dymuVar.b = true;
                    return;
                }
                list = dymuVar.c;
                dymuVar.c = arrayList;
            }
            for (Runnable runnable : list) {
                runnable.run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
