package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyhm  reason: default package */
/* loaded from: classes6.dex */
public final class dyhm<T> extends dyhs<T> {
    private final dyhn<T> c;

    public dyhm(String str, dyhn<T> dyhnVar) {
        super(str, false);
        dbsk.j(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        dbsk.t(dyhnVar, "marshaller");
        this.c = dyhnVar;
    }

    @Override // defpackage.dyhs
    public final byte[] a(T t) {
        return this.c.b(t).getBytes(dbrc.a);
    }

    @Override // defpackage.dyhs
    public final T b(byte[] bArr) {
        return this.c.a(new String(bArr, dbrc.a));
    }
}
