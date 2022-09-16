package defpackage;
/* compiled from: PG */
/* renamed from: ag  reason: default package */
/* loaded from: classes.dex */
public class ag implements ae {
    private static ag a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ag b() {
        if (a == null) {
            a = new ag();
        }
        return a;
    }

    @Override // defpackage.ae
    public ac a(Class cls) {
        try {
            return (ac) cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        }
    }
}
