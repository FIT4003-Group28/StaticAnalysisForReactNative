package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahjd  reason: default package */
/* loaded from: classes.dex */
public final class ahjd extends ajbg {
    private final Runnable a;

    public ahjd(long j, airr airrVar) {
        super(j, j + 1000, 1, 1, "PausingCueRange");
        this.a = new gdb(airrVar, 6);
    }

    @Override // defpackage.ajbg
    protected final void b(boolean z, boolean z2, boolean z3) {
        this.a.run();
    }
}
