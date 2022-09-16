package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rwy  reason: default package */
/* loaded from: classes4.dex */
public final class rwy extends rwr {
    public rwy(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_FIX_INSTRUMENT", "flow_fix_instrument");
    }

    @Override // defpackage.rwr
    protected final void f() {
        byte[] byteArrayExtra = this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        byte[] byteArrayExtra2 = this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        boolean z = true;
        boolean z2 = byteArrayExtra != null && byteArrayExtra.length > 0;
        boolean z3 = byteArrayExtra2 != null && byteArrayExtra2.length > 0;
        qnm.d(!z2 || !z3, "Only one of encrypted parameters or initialization token should be set");
        if (!z2 && !z3) {
            z = false;
        }
        qnm.d(z, "Either encrypted parameters or initialization token should be set");
    }
}
