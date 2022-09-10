package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cois  reason: default package */
/* loaded from: classes5.dex */
final class cois extends cnrs {
    final /* synthetic */ cpct a;
    final /* synthetic */ coif b;

    public cois(cpct cpctVar, coif coifVar) {
        this.a = cpctVar;
        this.b = coifVar;
    }

    @Override // defpackage.cnrt
    public final void b(Status status) {
        if (status.g == 0) {
            this.a.a(new coiu(this.b));
        } else {
            this.a.c(new cnob(status));
        }
    }
}
