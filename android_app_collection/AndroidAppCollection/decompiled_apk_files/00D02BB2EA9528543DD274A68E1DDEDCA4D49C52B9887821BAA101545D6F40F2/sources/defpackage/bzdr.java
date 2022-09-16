package defpackage;
/* compiled from: PG */
/* renamed from: bzdr  reason: default package */
/* loaded from: classes4.dex */
public final class bzdr extends bzek {
    private final bzfm d;
    private final bzej e;

    public bzdr(dbsz<bzek> dbszVar, bzdg bzdgVar, bzfm bzfmVar, bzej bzejVar) {
        super(dbszVar, bzdgVar, null);
        this.d = bzfmVar;
        this.e = bzejVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final int a(amuo amuoVar) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final bzdh b() {
        return bzdh.a;
    }

    @Override // defpackage.bzek
    public final void c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final bzek d() {
        dqvj c = this.b.c();
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = c.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                return this.d.a(this.a, this.b);
            }
            String valueOf = String.valueOf(c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Can not handle first step travel mode:");
            sb.append(valueOf);
            return p(sb.toString());
        }
        return this.e.a(this.a, this.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final boolean e(cray crayVar) {
        throw new IllegalStateException();
    }

    @Override // defpackage.bzek
    public final eaow f() {
        return eaow.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final void g() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final boolean i() {
        return false;
    }

    @Override // defpackage.bzek
    protected final void j(int i) {
    }
}
