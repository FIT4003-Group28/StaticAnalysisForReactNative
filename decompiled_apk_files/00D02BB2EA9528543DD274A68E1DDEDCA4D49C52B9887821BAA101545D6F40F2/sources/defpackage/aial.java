package defpackage;

import com.google.android.apps.gmm.locationsharing.interprocess.api.ReportingState;
/* compiled from: PG */
/* renamed from: aial  reason: default package */
/* loaded from: classes2.dex */
final class aial extends Exception {
    private final String a;

    public aial(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ReportingState a() {
        return new ReportingState(this.a, 2, dcdc.f(11));
    }
}
