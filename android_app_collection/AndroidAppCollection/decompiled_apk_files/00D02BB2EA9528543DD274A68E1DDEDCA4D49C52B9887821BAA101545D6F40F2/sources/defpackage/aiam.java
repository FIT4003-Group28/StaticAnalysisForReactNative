package defpackage;

import com.google.android.apps.gmm.locationsharing.interprocess.api.ReportingState;
/* compiled from: PG */
/* renamed from: aiam  reason: default package */
/* loaded from: classes2.dex */
final class aiam extends Exception {
    public final String a;

    public aiam(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ReportingState a() {
        return new ReportingState(this.a, 0, dcdc.f(5));
    }
}
