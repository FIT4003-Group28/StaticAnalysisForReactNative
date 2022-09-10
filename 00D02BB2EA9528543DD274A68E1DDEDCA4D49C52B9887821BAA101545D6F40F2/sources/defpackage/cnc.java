package defpackage;

import android.os.Parcel;
import com.google.android.apps.auto.sdk.nav.ClientMode;
import com.google.android.apps.auto.sdk.nav.NavigationClientConfig;
import com.google.android.apps.auto.sdk.nav.NavigationProviderConfig;
/* compiled from: PG */
/* renamed from: cnc  reason: default package */
/* loaded from: classes.dex */
public abstract class cnc extends clb implements cnd {
    public cnc() {
        super("com.google.android.apps.auto.sdk.nav.INavigationProvider");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                NavigationProviderConfig b = b();
                parcel2.writeNoException();
                if (b == null) {
                    parcel2.writeInt(0);
                    break;
                } else {
                    parcel2.writeInt(1);
                    b.writeToParcel(parcel2, 1);
                    break;
                }
            case 2:
                c((NavigationClientConfig) clc.d(parcel, NavigationClientConfig.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                d((ClientMode) clc.d(parcel, ClientMode.CREATOR));
                break;
            case 4:
                e();
                parcel2.writeNoException();
                break;
            case 5:
                cnw f = f();
                parcel2.writeNoException();
                clc.f(parcel2, f);
                break;
            case 6:
                cob g = g();
                parcel2.writeNoException();
                clc.f(parcel2, g);
                break;
            default:
                return false;
        }
        return true;
    }
}
