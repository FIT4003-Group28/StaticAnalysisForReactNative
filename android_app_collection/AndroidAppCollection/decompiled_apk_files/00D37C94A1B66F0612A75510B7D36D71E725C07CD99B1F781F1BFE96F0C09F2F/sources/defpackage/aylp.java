package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: aylp  reason: default package */
/* loaded from: classes2.dex */
final class aylp implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayep b;
    final /* synthetic */ ayat c;
    final /* synthetic */ ayls d;
    private final /* synthetic */ int e;

    public aylp(ayls aylsVar, Status status, ayep ayepVar, ayat ayatVar) {
        this.d = aylsVar;
        this.a = status;
        this.b = ayepVar;
        this.c = ayatVar;
    }

    public aylp(ayls aylsVar, Status status, ayep ayepVar, ayat ayatVar, int i) {
        this.e = i;
        this.d = aylsVar;
        this.a = status;
        this.b = ayepVar;
        this.c = ayatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e == 0) {
            this.d.b.y = true;
            this.d.b.u.a(this.a, this.b, this.c);
            return;
        }
        this.d.b.y = true;
        this.d.b.u.a(this.a, this.b, this.c);
    }
}
