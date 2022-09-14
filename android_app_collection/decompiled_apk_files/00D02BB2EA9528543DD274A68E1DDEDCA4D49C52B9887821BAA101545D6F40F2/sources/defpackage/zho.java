package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zho  reason: default package */
/* loaded from: classes7.dex */
final class zho implements Runnable {
    final /* synthetic */ zhv a;

    public zho(zhv zhvVar) {
        this.a = zhvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.t(dndr.HOME);
        zhv zhvVar = this.a;
        zhvVar.v(zhvVar.a.getString(R.string.HOME_LOCATION));
    }
}
