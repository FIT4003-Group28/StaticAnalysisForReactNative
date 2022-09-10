package defpackage;

import android.net.NetworkInfo;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bnyj  reason: default package */
/* loaded from: classes3.dex */
public final class bnyj {
    public final cztz a;
    private final btpc c;
    public boolean b = true;
    private final aa<NetworkInfo> d = new aa(this) { // from class: bnyi
        private final bnyj a;

        {
            this.a = this;
        }

        @Override // defpackage.aa
        public final void m(Object obj) {
            bnyj bnyjVar = this.a;
            NetworkInfo networkInfo = (NetworkInfo) obj;
            if (networkInfo != null) {
                boolean isConnected = networkInfo.isConnected();
                if (bnyjVar.b && !isConnected) {
                    cztq a = cztt.a(bnyjVar.a);
                    a.e(R.string.RAP_OFFLINE_SNACKBAR_TEXT, new Object[0]);
                    a.c();
                }
                bnyjVar.b = isConnected;
            }
        }
    };

    public bnyj(cztz cztzVar, btpc btpcVar) {
        this.a = cztzVar;
        this.c = btpcVar;
    }

    public final void a(m mVar) {
        this.c.c.b(mVar, this.d);
    }
}
