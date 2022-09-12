package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dypk  reason: default package */
/* loaded from: classes6.dex */
public final class dypk implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ dypz b;

    public dypk(dypz dypzVar, List list) {
        this.b = dypzVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dysm dysmVar;
        List<dyfw> unmodifiableList = Collections.unmodifiableList(new ArrayList(this.a));
        SocketAddress b = this.b.f.b();
        dypt dyptVar = this.b.f;
        dyptVar.a = unmodifiableList;
        dyptVar.a();
        this.b.g = unmodifiableList;
        if (this.b.p.a == dyfk.READY || this.b.p.a == dyfk.CONNECTING) {
            dypt dyptVar2 = this.b.f;
            int i = 0;
            while (true) {
                if (i < dyptVar2.a.size()) {
                    int indexOf = dyptVar2.a.get(i).b.indexOf(b);
                    if (indexOf != -1) {
                        dyptVar2.b = i;
                        dyptVar2.c = indexOf;
                        break;
                    }
                    i++;
                } else if (this.b.p.a == dyfk.READY) {
                    dysmVar = this.b.o;
                    this.b.o = null;
                    this.b.f.a();
                    this.b.c(dyfk.IDLE);
                } else {
                    this.b.n.e(dyjb.m.g("InternalSubchannel closed pending transport due to address change"));
                    this.b.n = null;
                    this.b.f.a();
                    this.b.b();
                }
            }
        }
        dysmVar = null;
        if (dysmVar != null) {
            dypz dypzVar = this.b;
            if (dypzVar.j != null) {
                dypzVar.k.e(dyjb.m.g("InternalSubchannel closed transport early due to address change"));
                this.b.j.a();
                dypz dypzVar2 = this.b;
                dypzVar2.j = null;
                dypzVar2.k = null;
            }
            dypz dypzVar3 = this.b;
            dypzVar3.k = dysmVar;
            dypzVar3.j = dypzVar3.e.d(new dypj(this), 5L, TimeUnit.SECONDS, this.b.b);
        }
    }
}
