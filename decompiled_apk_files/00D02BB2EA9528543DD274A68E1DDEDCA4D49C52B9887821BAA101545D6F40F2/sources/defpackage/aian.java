package defpackage;

import com.google.android.apps.gmm.locationsharing.interprocess.api.ReportingState;
/* compiled from: PG */
/* renamed from: aian  reason: default package */
/* loaded from: classes2.dex */
final class aian extends Exception {
    public final String a;

    public aian(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ReportingState a() {
        return new ReportingState(this.a, 3, dcdc.f(1));
    }
}
