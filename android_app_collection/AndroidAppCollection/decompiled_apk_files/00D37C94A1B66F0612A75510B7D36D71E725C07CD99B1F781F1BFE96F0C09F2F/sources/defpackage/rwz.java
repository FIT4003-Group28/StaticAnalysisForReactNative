package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rwz  reason: default package */
/* loaded from: classes4.dex */
public final class rwz extends rwr {
    public rwz(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT", "flow_im");
    }

    @Override // defpackage.rwr
    protected final void f() {
        byte[] byteArrayExtra = this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        boolean z = true;
        boolean z2 = byteArrayExtra != null && byteArrayExtra.length > 0;
        byte[] byteArrayExtra2 = this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        boolean z3 = byteArrayExtra2 != null && byteArrayExtra2.length > 0;
        if (!z2 && !z3) {
            z = false;
        }
        qnm.d(z, "Either Instrument Manager params or initialization token is required");
    }
}
