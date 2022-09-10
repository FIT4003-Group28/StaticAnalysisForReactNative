package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zhr  reason: default package */
/* loaded from: classes7.dex */
final class zhr implements Runnable {
    final /* synthetic */ zhv a;

    public zhr(zhv zhvVar) {
        this.a = zhvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string = this.a.a.getString(R.string.GYM_LOCATION);
        this.a.u(string, "/m/016yx7");
        this.a.v(string);
    }
}
