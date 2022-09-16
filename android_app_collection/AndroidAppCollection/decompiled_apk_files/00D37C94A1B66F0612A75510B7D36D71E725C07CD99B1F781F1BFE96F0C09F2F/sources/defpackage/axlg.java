package defpackage;
/* compiled from: PG */
/* renamed from: axlg  reason: default package */
/* loaded from: classes2.dex */
public abstract class axlg {
    public static axlg d(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new axlb(cls.getSimpleName());
        }
        return new axld(cls.getSimpleName());
    }

    public abstract void a(String str);

    public abstract void b(String str);

    public abstract void c(String str);
}
