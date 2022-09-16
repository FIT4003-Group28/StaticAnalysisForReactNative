package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ayhn  reason: default package */
/* loaded from: classes2.dex */
final class ayhn implements Runnable {
    final /* synthetic */ ayho a;

    public ayhn(ayho ayhoVar) {
        this.a = ayhoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayia ayiaVar = this.a.b;
        ayjt ayjtVar = ayiaVar.k;
        ayiaVar.j = null;
        ayiaVar.k = null;
        ayjtVar.j(Status.o.withDescription("InternalSubchannel closed transport due to address change"));
    }
}
