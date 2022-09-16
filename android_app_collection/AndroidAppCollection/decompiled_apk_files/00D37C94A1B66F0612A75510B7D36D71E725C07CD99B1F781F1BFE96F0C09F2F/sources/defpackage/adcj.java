package defpackage;

import com.google.android.libraries.youtube.mdx.handoff.HandoffCoordinator;
/* compiled from: PG */
/* renamed from: adcj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adcj implements ylw {
    public final /* synthetic */ HandoffCoordinator a;
    public final /* synthetic */ adct b;
    private final /* synthetic */ int c;

    public /* synthetic */ adcj(HandoffCoordinator handoffCoordinator, adct adctVar) {
        this.a = handoffCoordinator;
        this.b = adctVar;
    }

    public /* synthetic */ adcj(HandoffCoordinator handoffCoordinator, adct adctVar, int i) {
        this.c = i;
        this.a = handoffCoordinator;
        this.b = adctVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        if (this.c == 0) {
            HandoffCoordinator handoffCoordinator = this.a;
            adct adctVar = this.b;
            handoffCoordinator.b.a((aruo) obj, adctVar);
            return;
        }
        HandoffCoordinator handoffCoordinator2 = this.a;
        adct adctVar2 = this.b;
        handoffCoordinator2.b.a((aruo) obj, adctVar2);
    }
}
