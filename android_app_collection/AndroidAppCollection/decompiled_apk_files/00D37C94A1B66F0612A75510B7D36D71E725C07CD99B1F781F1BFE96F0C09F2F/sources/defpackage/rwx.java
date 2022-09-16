package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rwx  reason: default package */
/* loaded from: classes4.dex */
public final class rwx extends rwr {
    public rwx(Context context) {
        super(context, "com.google.android.gms.wallet.ACTION_CHECKOUT", "flow_checkout", false);
    }

    @Override // defpackage.rwr
    protected final void f() {
        boolean z = true;
        if (this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS") == null && this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN") == null) {
            z = false;
        }
        qnm.d(z, "Either buyflow params or initialization token is required");
    }
}
