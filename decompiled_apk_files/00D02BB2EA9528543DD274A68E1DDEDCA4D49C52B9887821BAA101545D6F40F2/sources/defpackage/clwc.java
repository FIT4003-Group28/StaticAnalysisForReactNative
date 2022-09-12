package defpackage;
/* compiled from: PG */
/* renamed from: clwc  reason: default package */
/* loaded from: classes5.dex */
abstract class clwc {
    protected final clvk d;

    /* JADX INFO: Access modifiers changed from: protected */
    public clwc(clvk clvkVar) {
        this.d = clvkVar;
    }

    protected abstract boolean a(cmnk cmnkVar);

    protected abstract boolean b(cmnk cmnkVar, long j);

    public final boolean c(cmnk cmnkVar, long j) {
        return a(cmnkVar) && b(cmnkVar, j);
    }
}
