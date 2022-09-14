package defpackage;
/* compiled from: PG */
/* renamed from: cvjl  reason: default package */
/* loaded from: classes5.dex */
public final class cvjl implements cvnq {
    @Override // defpackage.cvnq
    public final void a(String str, dssj dssjVar, dssj dssjVar2) {
        cvlw.a("DeleteUserSubscriptionCallback", "Successfully unsubscribed from topics for account: %s.", str);
    }

    @Override // defpackage.cvnq
    public final void b(String str, @dzsi dssj dssjVar) {
        cvlw.f("DeleteUserSubscriptionCallback", "Failed to unsubscribe from topics for account: %s.", str);
    }
}
