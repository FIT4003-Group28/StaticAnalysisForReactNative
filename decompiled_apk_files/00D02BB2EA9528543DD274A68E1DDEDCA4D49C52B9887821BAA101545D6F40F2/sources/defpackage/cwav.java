package defpackage;
/* compiled from: PG */
/* renamed from: cwav  reason: default package */
/* loaded from: classes5.dex */
final class cwav<AccountT> extends cwbj<AccountT> {
    private final cwbo<AccountT, ? extends cwau> b;
    private cwau c;

    public cwav(cwbo<AccountT, ? extends cwau> cwboVar) {
        this.b = cwboVar;
    }

    @Override // defpackage.cwbj
    public final void a() {
        if (this.c == null) {
            cwau a = this.b.a();
            this.c = a;
            if (a != null) {
                throw null;
            }
            return;
        }
        throw null;
    }
}
