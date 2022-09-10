package defpackage;

import android.os.Parcel;
import com.google.android.gms.contextmanager.ContextData;
/* compiled from: PG */
/* renamed from: cnze  reason: default package */
/* loaded from: classes5.dex */
public abstract class cnze extends clb implements cnzf {
    public cnze() {
        super("com.google.android.gms.contextmanager.internal.IContextListener");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((ContextData) clc.d(parcel, ContextData.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
