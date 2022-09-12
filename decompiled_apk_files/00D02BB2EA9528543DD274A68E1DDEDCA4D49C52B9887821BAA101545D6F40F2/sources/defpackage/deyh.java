package defpackage;

import android.os.Binder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: deyh  reason: default package */
/* loaded from: classes6.dex */
final class deyh extends Binder {
    @dzsi
    public deyg a;

    public deyh(deyg deygVar) {
        this.a = deygVar;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        deyg deygVar = this.a;
        if (deygVar != null) {
            try {
                return deygVar.p(i, parcel);
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.a != null;
    }
}
