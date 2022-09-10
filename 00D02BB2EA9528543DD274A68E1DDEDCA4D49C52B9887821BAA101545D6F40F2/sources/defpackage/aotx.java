package defpackage;
/* compiled from: PG */
/* renamed from: aotx  reason: default package */
/* loaded from: classes2.dex */
public final class aotx implements angz {
    private final angz a;
    private boolean b;
    @dzsi
    private aogm c = null;

    public aotx(angz angzVar) {
        this.a = angzVar;
    }

    @Override // defpackage.angz
    public final void a(aogm aogmVar) {
        if (this.b) {
            this.a.a(aogmVar);
        } else {
            this.c = aogmVar;
        }
    }

    @Override // defpackage.angz
    public final void b() {
        this.a.b();
        this.c = null;
    }

    public final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        aogm aogmVar = this.c;
        if (aogmVar == null) {
            return;
        }
        this.a.a(aogmVar);
        this.c = null;
    }

    public final void d() {
        if (!this.b) {
            return;
        }
        this.b = false;
    }
}
