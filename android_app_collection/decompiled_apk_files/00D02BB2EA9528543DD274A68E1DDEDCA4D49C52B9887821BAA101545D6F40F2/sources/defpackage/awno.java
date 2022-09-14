package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: awno  reason: default package */
/* loaded from: classes.dex */
final class awno implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ awnr b;

    public awno(awnr awnrVar, Runnable runnable) {
        this.b = awnrVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<String> arrayList;
        awnr awnrVar = this.b;
        if (awnrVar.f == null) {
            awnrVar.e = awnrVar.c.a();
            awnr awnrVar2 = this.b;
            if (!awnrVar2.e) {
                arrayList = new ArrayList<>();
                arrayList.add("terms");
                arrayList.add("login");
                arrayList.add("ulr");
                arrayList.add("offline");
                arrayList.add("area_traffic");
                arrayList.add("traffic_to_place");
            } else {
                arrayList = new ArrayList<>();
                arrayList.add("terms");
            }
            awnrVar2.f = arrayList;
            ggg i = this.b.i();
            if (i == null) {
                this.b.b.a().q(ckgi.h);
                this.b.m();
                return;
            } else if (!this.b.a.g.a.a(j.STARTED)) {
                this.b.f = null;
                return;
            } else {
                this.b.a.D(i);
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
