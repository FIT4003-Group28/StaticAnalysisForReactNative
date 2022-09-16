package defpackage;
/* compiled from: PG */
/* renamed from: aidk  reason: default package */
/* loaded from: classes.dex */
public final class aidk extends ajbg {
    final /* synthetic */ aidl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aidk(aidl aidlVar, long j, long j2) {
        super(j, j2, 1, 1, null);
        this.a = aidlVar;
    }

    @Override // defpackage.ajbg
    protected final void a() {
        this.a.c = false;
    }

    @Override // defpackage.ajbg
    public final void b(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.a.c = false;
            return;
        }
        this.a.c = true;
        this.a.a();
    }
}
