package defpackage;
/* compiled from: PG */
/* renamed from: bmvp  reason: default package */
/* loaded from: classes3.dex */
final class bmvp {
    final ckcq a;
    final ckcq b;
    boolean c = false;

    public bmvp(ckcq ckcqVar, ckcq ckcqVar2) {
        this.a = ckcqVar;
        this.b = ckcqVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a.b();
        this.b.a();
        this.c = true;
    }

    public final void c() {
        if (!this.c) {
            return;
        }
        this.b.b();
        this.c = false;
    }
}
