package defpackage;
/* compiled from: PG */
/* renamed from: ban  reason: default package */
/* loaded from: classes2.dex */
abstract class ban {
    protected final bab d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ban(bab babVar) {
        this.d = babVar;
    }

    protected abstract boolean a(pwu pwuVar);

    protected abstract boolean b(pwu pwuVar, long j);

    public final boolean c(pwu pwuVar, long j) {
        return a(pwuVar) && b(pwuVar, j);
    }
}
