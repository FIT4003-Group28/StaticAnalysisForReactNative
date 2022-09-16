package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayhq  reason: default package */
/* loaded from: classes2.dex */
public final class ayhq implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayia b;
    private final /* synthetic */ int c;

    public ayhq(ayia ayiaVar, Status status) {
        this.b = ayiaVar;
        this.a = status;
    }

    public ayhq(ayia ayiaVar, Status status, int i) {
        this.c = i;
        this.b = ayiaVar;
        this.a = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            ArrayList arrayList = new ArrayList(this.b.l);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ayjt) arrayList.get(i)).k(this.a);
            }
        } else if (this.b.p.a != axyt.SHUTDOWN) {
            ayia ayiaVar = this.b;
            ayiaVar.q = this.a;
            ayjt ayjtVar = ayiaVar.o;
            ayia ayiaVar2 = this.b;
            ayez ayezVar = ayiaVar2.n;
            ayiaVar2.o = null;
            this.b.n = null;
            this.b.b(axyt.SHUTDOWN);
            this.b.f.b();
            if (this.b.l.isEmpty()) {
                this.b.e();
            }
            ayia ayiaVar3 = this.b;
            ayiaVar3.e.d();
            aybw aybwVar = ayiaVar3.i;
            if (aybwVar != null) {
                aybwVar.a();
                ayiaVar3.i = null;
                ayiaVar3.r = null;
            }
            aybw aybwVar2 = this.b.j;
            if (aybwVar2 != null) {
                aybwVar2.a();
                this.b.k.j(this.a);
                ayia ayiaVar4 = this.b;
                ayiaVar4.j = null;
                ayiaVar4.k = null;
            }
            if (ayjtVar != null) {
                ayjtVar.j(this.a);
            }
            if (ayezVar == null) {
                return;
            }
            ayezVar.j(this.a);
        }
    }
}
