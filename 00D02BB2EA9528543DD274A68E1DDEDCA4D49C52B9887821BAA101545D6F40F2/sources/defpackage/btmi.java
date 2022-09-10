package defpackage;
/* compiled from: PG */
/* renamed from: btmi  reason: default package */
/* loaded from: classes.dex */
public final class btmi implements btmk {
    protected Boolean a = false;
    protected final ckcw b;
    private final ckgt c;

    public btmi(ckcw ckcwVar, ckgt ckgtVar) {
        this.b = ckcwVar;
        this.c = ckgtVar;
    }

    @Override // defpackage.btmk
    public final synchronized void a() {
        if (!this.a.booleanValue()) {
            this.a = true;
        }
        this.b.n(this.c, true);
    }

    @Override // defpackage.btmk
    public final synchronized void b() {
        if (this.a.booleanValue()) {
            this.b.n(this.c, false);
        }
    }
}
