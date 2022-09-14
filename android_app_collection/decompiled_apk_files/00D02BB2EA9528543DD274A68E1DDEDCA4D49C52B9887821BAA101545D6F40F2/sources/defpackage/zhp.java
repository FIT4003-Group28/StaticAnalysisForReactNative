package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zhp  reason: default package */
/* loaded from: classes7.dex */
final class zhp implements Runnable {
    final /* synthetic */ zhv a;

    public zhp(zhv zhvVar) {
        this.a = zhvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.t(dndr.WORK);
        zhv zhvVar = this.a;
        zhvVar.v(zhvVar.a.getString(R.string.WORK_LOCATION));
    }
}
