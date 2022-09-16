package defpackage;
/* compiled from: PG */
/* renamed from: r  reason: default package */
/* loaded from: classes4.dex */
public abstract class r {
    public final u c;
    boolean d;
    int e = -1;
    final /* synthetic */ s f;

    public r(s sVar, u uVar) {
        this.f = sVar;
        this.c = uVar;
    }

    public void b() {
    }

    public boolean c(apy apyVar) {
        return false;
    }

    public final void d(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        s sVar = this.f;
        int i = 1;
        if (true != z) {
            i = -1;
        }
        sVar.c(i);
        if (!this.d) {
            return;
        }
        this.f.d(this);
    }

    public abstract boolean jz();
}
