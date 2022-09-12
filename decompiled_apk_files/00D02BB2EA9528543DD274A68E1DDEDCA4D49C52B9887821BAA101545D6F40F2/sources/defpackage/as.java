package defpackage;
/* compiled from: PG */
/* renamed from: as  reason: default package */
/* loaded from: classes2.dex */
public class as implements aq {
    private static as a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static as a() {
        if (a == null) {
            a = new as();
        }
        return a;
    }

    @Override // defpackage.aq
    public <T extends an> T b(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        }
    }
}
