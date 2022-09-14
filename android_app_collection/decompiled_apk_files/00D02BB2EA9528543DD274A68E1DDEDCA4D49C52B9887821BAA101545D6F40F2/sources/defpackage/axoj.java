package defpackage;
/* compiled from: PG */
/* renamed from: axoj  reason: default package */
/* loaded from: classes3.dex */
public final class axoj {
    public boolean a = false;
    public dqaw b;

    public axoj(dqaw dqawVar) {
        this.b = dqawVar;
    }

    public final void a(dqaw dqawVar) {
        long j = dqawVar.c;
        if (j == -1 || j >= this.b.c) {
            this.b = dqawVar;
        }
    }
}
