package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: qoc  reason: default package */
/* loaded from: classes4.dex */
final class qoc implements qoe {
    final /* synthetic */ Status a;
    private final /* synthetic */ int b;

    public qoc(Status status) {
        this.a = status;
    }

    public qoc(Status status, int i) {
        this.b = i;
        this.a = status;
    }

    @Override // defpackage.qte
    public final Status a() {
        return this.b != 0 ? this.a : this.a;
    }
}
