package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adfa  reason: default package */
/* loaded from: classes.dex */
public final class adfa {
    final /* synthetic */ adfb a;
    private boolean b = false;

    public adfa(adfb adfbVar) {
        this.a = adfbVar;
    }

    public final synchronized void a() {
        if (!this.b) {
            btrm btrmVar = this.a.b;
            dceq a = dcet.a();
            a.b(alhl.class, new adfc(0, alhl.class, this));
            a.b(alhy.class, new adfc(1, alhy.class, this));
            a.b(ardp.class, new adfc(2, ardp.class, this));
            btrmVar.g(this, a.a());
            this.b = true;
        }
    }

    public final synchronized void b() {
        if (this.b) {
            this.a.b.a(this);
            this.b = false;
        }
    }
}
