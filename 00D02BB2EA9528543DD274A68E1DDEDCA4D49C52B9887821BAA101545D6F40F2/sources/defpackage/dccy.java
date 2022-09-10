package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dccy  reason: default package */
/* loaded from: classes.dex */
public final class dccy<E> extends dbxh<E> {
    private final dcdc<E> a;

    public dccy(dcdc<E> dcdcVar, int i) {
        super(dcdcVar.size(), i);
        this.a = dcdcVar;
    }

    @Override // defpackage.dbxh
    protected final E a(int i) {
        return this.a.get(i);
    }
}
