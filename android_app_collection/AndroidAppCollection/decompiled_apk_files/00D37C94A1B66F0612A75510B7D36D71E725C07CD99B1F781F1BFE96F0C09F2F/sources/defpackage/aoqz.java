package defpackage;
/* compiled from: PG */
/* renamed from: aoqz  reason: default package */
/* loaded from: classes.dex */
final class aoqz {
    public static final apfb a;
    public static final apfb b;

    static {
        apfb apfbVar;
        try {
            apfbVar = (apfb) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            apfbVar = null;
        }
        a = apfbVar;
        b = new apfb();
    }
}
