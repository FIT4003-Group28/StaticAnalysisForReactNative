package defpackage;
/* compiled from: PG */
/* renamed from: bwl  reason: default package */
/* loaded from: classes.dex */
public final class bwl implements bws, byo, bwu {
    public final bwz a;
    public final bwi b;
    public final bxh c;
    public final bwg d;
    public final bvn e;
    public final byn f;
    private final bwj g;

    public bwl(byn bynVar, byd bydVar, bza bzaVar, bza bzaVar2, bza bzaVar3, bza bzaVar4) {
        this.f = bynVar;
        bwj bwjVar = new bwj(bydVar);
        this.g = bwjVar;
        bvn bvnVar = new bvn();
        this.e = bvnVar;
        synchronized (this) {
            synchronized (bvnVar) {
            }
        }
        this.a = new bwz();
        this.b = new bwi(bzaVar, bzaVar2, bzaVar3, bzaVar4, this, this);
        this.d = new bwg(bwjVar);
        this.c = new bxh();
        bynVar.a = this;
    }

    @Override // defpackage.bws
    public final synchronized void a(bwr<?> bwrVar, btw btwVar, bwv<?> bwvVar) {
        if (bwvVar != null) {
            if (bwvVar.a) {
                this.e.a(btwVar, bwvVar);
            }
        }
        this.a.a(btwVar, bwrVar);
    }

    @Override // defpackage.bws
    public final synchronized void b(bwr<?> bwrVar, btw btwVar) {
        this.a.a(btwVar, bwrVar);
    }

    @Override // defpackage.bwu
    public final void c(btw btwVar, bwv<?> bwvVar) {
        this.e.b(btwVar);
        if (bwvVar.a) {
            this.f.d(btwVar, bwvVar);
        } else {
            this.c.a(bwvVar, false);
        }
    }
}
