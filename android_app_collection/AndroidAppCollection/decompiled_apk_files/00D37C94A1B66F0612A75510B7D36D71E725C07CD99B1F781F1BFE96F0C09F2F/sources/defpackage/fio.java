package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fio  reason: default package */
/* loaded from: classes3.dex */
public final class fio {
    public fin a;
    private boolean c = false;
    public boolean b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (!this.b || this.c == z) {
            return;
        }
        this.c = z;
        fin finVar = this.a;
        if (finVar == null) {
            return;
        }
        finVar.a(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(fin finVar) {
        if (this.a == finVar) {
            return;
        }
        if (finVar != null && this.b && this.c) {
            finVar.a(true);
        }
        this.a = finVar;
    }
}
