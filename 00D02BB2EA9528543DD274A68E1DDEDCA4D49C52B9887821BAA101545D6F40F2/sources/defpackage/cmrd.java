package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cmrd  reason: default package */
/* loaded from: classes5.dex */
public final class cmrd implements cmrg<Void> {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public cmrd(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.cmrg
    public final /* bridge */ /* synthetic */ Void a(IBinder iBinder) {
        clcm clcmVar;
        if (iBinder == null) {
            clcmVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            clcmVar = queryLocalInterface instanceof clcm ? (clcm) queryLocalInterface : new clcm(iBinder);
        }
        Bundle e = clcmVar.e(this.a, this.b);
        cmrh.o(e);
        String string = e.getString("Error");
        if (e.getBoolean("booleanResult")) {
            return null;
        }
        throw new cmra(string);
    }
}
