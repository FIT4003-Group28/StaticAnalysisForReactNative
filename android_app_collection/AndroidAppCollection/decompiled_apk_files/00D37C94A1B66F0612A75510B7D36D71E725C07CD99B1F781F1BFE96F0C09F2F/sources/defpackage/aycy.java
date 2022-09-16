package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: aycy  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class aycy implements Runnable {
    public final /* synthetic */ aycz a;
    public final /* synthetic */ Status b;
    private final /* synthetic */ int c;

    public /* synthetic */ aycy(aycz ayczVar, Status status) {
        this.a = ayczVar;
        this.b = status;
    }

    public /* synthetic */ aycy(aycz ayczVar, Status status, int i) {
        this.c = i;
        this.a = ayczVar;
        this.b = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.b(this.b);
        } else {
            this.a.b(this.b);
        }
    }
}
