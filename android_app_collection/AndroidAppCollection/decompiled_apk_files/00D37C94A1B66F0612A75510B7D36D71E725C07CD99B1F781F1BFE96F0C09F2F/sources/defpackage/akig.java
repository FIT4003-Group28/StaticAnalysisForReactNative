package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: akig  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akig implements Runnable {
    public final /* synthetic */ akiq a;
    private final /* synthetic */ int b;

    public /* synthetic */ akig(akiq akiqVar, int i) {
        this.b = i;
        this.a = akiqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.d.c();
        } else if (i != 1) {
            akiq akiqVar = this.a;
            if (akiqVar.v == null) {
                return;
            }
            akiqVar.v.a();
            akiqVar.v = null;
        } else {
            akiq akiqVar2 = this.a;
            if (akiqVar2.v == null) {
                return;
            }
            ((aynb) akiqVar2.v).d(Status.c.asException());
            akiqVar2.v = null;
        }
    }
}
