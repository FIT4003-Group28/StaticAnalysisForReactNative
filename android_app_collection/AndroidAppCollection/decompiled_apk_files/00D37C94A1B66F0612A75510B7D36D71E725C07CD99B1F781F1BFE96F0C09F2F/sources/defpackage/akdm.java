package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akdm  reason: default package */
/* loaded from: classes.dex */
public final class akdm extends dh {
    public static akdm aE(int i) {
        akdm akdmVar = new akdm();
        Bundle bundle = new Bundle();
        bundle.putInt("messageId", i);
        akdmVar.ae(bundle);
        return akdmVar;
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Bundle bundle2 = this.m;
        bundle2.getClass();
        int i = bundle2.getInt("messageId");
        aqxo.y(i != 0);
        nw nwVar = new nw(mJ());
        nwVar.f(i);
        nwVar.k(R.string.permission_open_settings_button, new akdl(this));
        nwVar.h(R.string.permissions_not_now, null);
        return nwVar.b();
    }
}
