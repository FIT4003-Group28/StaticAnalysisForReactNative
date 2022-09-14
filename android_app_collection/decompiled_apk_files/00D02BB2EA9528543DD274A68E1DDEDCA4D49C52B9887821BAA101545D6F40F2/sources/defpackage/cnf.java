package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cnf  reason: default package */
/* loaded from: classes.dex */
public abstract class cnf extends cnc {
    private final Context a;

    public cnf(Context context) {
        this.a = context;
    }

    @Override // defpackage.clb, android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        String[] packagesForUid;
        try {
            str = cmxl.b(this.a);
        } catch (IllegalStateException unused) {
            str = null;
        }
        if (str != null && (packagesForUid = this.a.getPackageManager().getPackagesForUid(Binder.getCallingUid())) != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
            }
        }
        String valueOf = String.valueOf(this.a.getPackageManager().getNameForUid(Binder.getCallingUid()));
        throw new SecurityException(valueOf.length() != 0 ? "Unknown caller: ".concat(valueOf) : new String("Unknown caller: "));
    }
}
