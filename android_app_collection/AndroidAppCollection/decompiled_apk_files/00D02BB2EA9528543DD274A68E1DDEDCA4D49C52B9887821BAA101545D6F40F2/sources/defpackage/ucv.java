package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ucv  reason: default package */
/* loaded from: classes7.dex */
public final class ucv {
    public final Activity a;
    public final ucy b = new ucy();

    public ucv(Activity activity) {
        this.a = activity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(dpkf dpkfVar) {
        int a = dpka.a(dpkfVar.d);
        if (a != 0 && a == 2) {
            return true;
        }
        int a2 = dpka.a(dpkfVar.d);
        return a2 != 0 && a2 == 3;
    }

    public final dbsg<amsz> a() {
        return dbsg.j(this.b.a);
    }

    public final void b(boolean z) {
        this.b.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        this.b.c = z;
    }
}
