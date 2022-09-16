package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aaop  reason: default package */
/* loaded from: classes.dex */
final class aaop implements Runnable {
    final /* synthetic */ aoqu a;
    final /* synthetic */ aaoq b;

    public aaop(aaoq aaoqVar, aoqu aoquVar) {
        this.b = aaoqVar;
        this.a = aoquVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set<aaoo> set = (Set) this.b.c.get();
        if (set == null || set.isEmpty()) {
            return;
        }
        for (Object obj : this.b.b.a(this.a)) {
            for (aaoo aaooVar : set) {
                aaooVar.a(obj);
            }
        }
    }
}
