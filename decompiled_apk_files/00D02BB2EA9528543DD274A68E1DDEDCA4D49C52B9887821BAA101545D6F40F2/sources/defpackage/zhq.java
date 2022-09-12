package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zhq  reason: default package */
/* loaded from: classes7.dex */
final class zhq implements Runnable {
    final /* synthetic */ zhv a;

    public zhq(zhv zhvVar) {
        this.a = zhvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string = this.a.a.getString(R.string.SCHOOL_LOCATION);
        this.a.u(string, "/m/06zdj");
        this.a.v(string);
    }
}
