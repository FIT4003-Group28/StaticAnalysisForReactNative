package defpackage;

import io.grpc.Status;
import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayho  reason: default package */
/* loaded from: classes2.dex */
final class ayho implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ ayia b;

    public ayho(ayia ayiaVar, List list) {
        this.b = ayiaVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayjt ayjtVar;
        SocketAddress a = this.b.f.a();
        ayhv ayhvVar = this.b.f;
        ayhvVar.a = this.a;
        ayhvVar.b();
        this.b.g = this.a;
        if (this.b.p.a == axyt.READY || this.b.p.a == axyt.CONNECTING) {
            ayhv ayhvVar2 = this.b.f;
            int i = 0;
            while (true) {
                if (i < ayhvVar2.a.size()) {
                    int indexOf = ((axzc) ayhvVar2.a.get(i)).b.indexOf(a);
                    if (indexOf != -1) {
                        ayhvVar2.b = i;
                        ayhvVar2.c = indexOf;
                        break;
                    }
                    i++;
                } else if (this.b.p.a == axyt.READY) {
                    ayjtVar = this.b.o;
                    this.b.o = null;
                    this.b.f.b();
                    this.b.b(axyt.IDLE);
                } else {
                    this.b.n.j(Status.o.withDescription("InternalSubchannel closed pending transport due to address change"));
                    this.b.n = null;
                    this.b.f.b();
                    this.b.h();
                }
            }
        }
        ayjtVar = null;
        if (ayjtVar != null) {
            ayia ayiaVar = this.b;
            if (ayiaVar.j != null) {
                ayiaVar.k.j(Status.o.withDescription("InternalSubchannel closed transport early due to address change"));
                this.b.j.a();
                ayia ayiaVar2 = this.b;
                ayiaVar2.j = null;
                ayiaVar2.k = null;
            }
            ayia ayiaVar3 = this.b;
            ayiaVar3.k = ayjtVar;
            ayiaVar3.j = ayiaVar3.e.a(new ayhn(this), 5L, TimeUnit.SECONDS, this.b.b);
        }
    }
}
