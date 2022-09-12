package defpackage;
/* compiled from: PG */
/* renamed from: dssf  reason: default package */
/* loaded from: classes.dex */
final class dssf {
    public static final dsse a;
    public static final dsse b;

    static {
        dsse dsseVar;
        try {
            dsseVar = (dsse) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            dsseVar = null;
        }
        a = dsseVar;
        b = new dsse();
    }
}
