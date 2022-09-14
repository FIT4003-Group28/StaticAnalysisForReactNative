package b.a.a.a.a.b;

import android.content.Context;
/* compiled from: InstallerPackageNameProvider.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final b.a.a.a.a.a.d<String> f1093a = new b.a.a.a.a.a.d<String>() { // from class: b.a.a.a.a.b.q.1
        @Override // b.a.a.a.a.a.d
        /* renamed from: a */
        public String load(Context context) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final b.a.a.a.a.a.b<String> f1094b = new b.a.a.a.a.a.b<>();

    public String a(Context context) {
        try {
            String a2 = this.f1094b.a(context, this.f1093a);
            if (!"".equals(a2)) {
                return a2;
            }
            return null;
        } catch (Exception e) {
            b.a.a.a.c.h().e("Fabric", "Failed to determine installer package name", e);
            return null;
        }
    }
}
