package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyho  reason: default package */
/* loaded from: classes6.dex */
public final class dyho<T> extends dyhs<T> {
    private final dyhp<T> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyho(String str, dyhp<T> dyhpVar) {
        super(str, false);
        boolean z = false;
        dbsk.j(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        dbsk.b(str.length() > 4 ? true : z, "empty key name");
        dbsk.t(dyhpVar, "marshaller is null");
        this.c = dyhpVar;
    }

    @Override // defpackage.dyhs
    public final byte[] a(T t) {
        return this.c.b(t);
    }

    @Override // defpackage.dyhs
    public final T b(byte[] bArr) {
        return this.c.a(bArr);
    }
}
