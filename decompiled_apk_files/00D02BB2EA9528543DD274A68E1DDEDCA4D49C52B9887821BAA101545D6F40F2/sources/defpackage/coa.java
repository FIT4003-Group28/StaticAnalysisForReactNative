package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion;
/* compiled from: PG */
/* renamed from: coa  reason: default package */
/* loaded from: classes5.dex */
public abstract class coa extends clb implements cob {
    public coa() {
        super("com.google.android.apps.auto.sdk.nav.suggestion.INavigationSuggestionManager");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        cnz cnzVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                cnzVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.nav.suggestion.INavigationSuggestionCallback");
                if (queryLocalInterface instanceof cnz) {
                    cnzVar = (cnz) queryLocalInterface;
                } else {
                    cnzVar = new cnz(readStrongBinder);
                }
            }
            e(cnzVar);
        } else if (i == 2) {
            b((NavigationSuggestion) clc.d(parcel, NavigationSuggestion.CREATOR));
        } else if (i == 3) {
            c();
        } else if (i == 4) {
            d();
        } else if (i != 5) {
            return false;
        } else {
            NavigationSuggestion navigationSuggestion = (NavigationSuggestion) clc.d(parcel, NavigationSuggestion.CREATOR);
            f();
        }
        return true;
    }
}
