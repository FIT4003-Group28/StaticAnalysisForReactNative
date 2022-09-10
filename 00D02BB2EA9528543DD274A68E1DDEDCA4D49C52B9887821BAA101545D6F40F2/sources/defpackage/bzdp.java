package defpackage;
/* compiled from: PG */
/* renamed from: bzdp  reason: default package */
/* loaded from: classes4.dex */
public abstract class bzdp extends bzek {
    public bzdp(dbsz<bzek> dbszVar, bzdg bzdgVar) {
        super(dbszVar, bzdgVar, null);
    }

    @Override // defpackage.bzek
    public final void c() {
        throw new UnsupportedOperationException("End states cannot be closed");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final bzek d() {
        throw new UnsupportedOperationException("No expected next state");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final boolean e(cray crayVar) {
        throw new UnsupportedOperationException("No support for route state event handling");
    }

    @Override // defpackage.bzek
    public final eaow f() {
        return eaow.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final void g() {
    }

    @Override // defpackage.bzek
    public final boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final boolean i() {
        return false;
    }

    @Override // defpackage.bzek
    protected final void j(int i) {
        throw new UnsupportedOperationException("End state cannot be completed");
    }
}
