package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ab implements ayqb {
    private final /* synthetic */ int u;
    public static final /* synthetic */ ab t = new ab(20);
    public static final /* synthetic */ ab s = new ab(19);
    public static final /* synthetic */ ab r = new ab(18);
    public static final /* synthetic */ ab q = new ab(17);
    public static final /* synthetic */ ab p = new ab(16);
    public static final /* synthetic */ ab o = new ab(14);
    public static final /* synthetic */ ab n = new ab(13);
    public static final /* synthetic */ ab m = new ab(12);
    public static final /* synthetic */ ab l = new ab(11);
    public static final /* synthetic */ ab k = new ab(10);
    public static final /* synthetic */ ab j = new ab(9);
    public static final /* synthetic */ ab i = new ab(8);
    public static final /* synthetic */ ab h = new ab(7);
    public static final /* synthetic */ ab g = new ab(6);
    public static final /* synthetic */ ab f = new ab(5);
    public static final /* synthetic */ ab e = new ab(4);
    public static final /* synthetic */ ab d = new ab(3);
    public static final /* synthetic */ ab c = new ab(2);
    public static final /* synthetic */ ab b = new ab(1);
    public static final /* synthetic */ ab a = new ab();

    private /* synthetic */ ab() {
    }

    public /* synthetic */ ab(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        SimplePlaybackDescriptor simplePlaybackDescriptor;
        switch (this.u) {
            case 0:
                ax axVar = (ax) obj;
                SimplePlaybackDescriptor simplePlaybackDescriptor2 = axVar.q;
                if (simplePlaybackDescriptor2 == null) {
                    return;
                }
                axVar.l(simplePlaybackDescriptor2.a(1));
                return;
            case 1:
                Throwable th = (Throwable) obj;
                aqvb.k("Failed to receive hot config data", new Object[0]);
                return;
            case 2:
                ax axVar2 = (ax) obj;
                Context context = (Context) axVar2.e.get();
                if (axVar2.q == null || context == null || zdg.e(context)) {
                    return;
                }
                axVar2.l(axVar2.q.a(2));
                return;
            case 3:
                ((ax) obj).f();
                return;
            case 4:
                ax axVar3 = (ax) obj;
                if (axVar3.n()) {
                    return;
                }
                axVar3.g.w(axVar3);
                return;
            case 5:
                ax axVar4 = (ax) obj;
                if (axVar4.n() || axVar4.g.t(axVar4) || (simplePlaybackDescriptor = axVar4.q) == null) {
                    return;
                }
                axVar4.l(simplePlaybackDescriptor.a(1));
                return;
            case 6:
                ax axVar5 = (ax) obj;
                if (axVar5.n()) {
                    return;
                }
                axVar5.g.m(axVar5);
                return;
            case 7:
                ((ax) obj).m();
                return;
            case 8:
                ax axVar6 = (ax) obj;
                return;
            case 9:
                ax axVar7 = (ax) obj;
                if (axVar7.n()) {
                    return;
                }
                axVar7.g.s();
                return;
            case 10:
                String valueOf = String.valueOf(((Throwable) obj).getMessage());
                aqvb.k(valueOf.length() != 0 ? "Could not access YouTube service: ".concat(valueOf) : new String("Could not access YouTube service: "), new Object[0]);
                return;
            case 11:
                pcu.g((Throwable) obj);
                return;
            case 12:
                pcu.g((Throwable) obj);
                return;
            case 13:
                zna.q((Throwable) obj);
                return;
            case 14:
                zna.q((Throwable) obj);
                return;
            case 15:
                afus.c(2, 1, "AdNotificationController failed unexpectedly while receiving an RX event.", (Throwable) obj);
                return;
            case 16:
                zna.q((Throwable) obj);
                return;
            case 17:
                zna.q((Throwable) obj);
                return;
            case 18:
                Throwable th2 = (Throwable) obj;
                return;
            case 19:
                Throwable th3 = (Throwable) obj;
                zep.b("Failed to get media items from local storage");
                return;
            default:
                Throwable th4 = (Throwable) obj;
                throw new IllegalStateException("Unable to update account link state");
        }
    }
}
