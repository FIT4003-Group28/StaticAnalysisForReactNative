package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyhu  reason: default package */
/* loaded from: classes6.dex */
public final class dyhu<T> extends dyhs<T> {
    private final dyhv<T> c;

    public dyhu(String str, boolean z, dyhv<T> dyhvVar) {
        super(str, z);
        dbsk.j(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        dbsk.t(dyhvVar, "marshaller");
        this.c = dyhvVar;
    }

    @Override // defpackage.dyhs
    public final byte[] a(T t) {
        return this.c.a(t);
    }

    @Override // defpackage.dyhs
    public final T b(byte[] bArr) {
        return this.c.b(bArr);
    }
}
