package defpackage;
/* compiled from: PG */
/* renamed from: dssq  reason: default package */
/* loaded from: classes.dex */
final class dssq {
    public static final dssp a;
    public static final dssp b;

    static {
        dssp dsspVar;
        try {
            dsspVar = (dssp) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            dsspVar = null;
        }
        a = dsspVar;
        b = new dssp();
    }
}
