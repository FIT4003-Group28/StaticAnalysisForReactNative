package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service;

import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.AutoValue_SubscriptionNotificationMenuItem;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements d {
    public final aafo a;
    public avbh b = avbh.a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b c = com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b.V;
    private final yrj d;
    private final afvn e;
    private final abab f;
    private boolean g;

    public b(aafo aafoVar, yrj yrjVar, afvn afvnVar, abab ababVar) {
        this.a = aafoVar;
        this.d = yrjVar;
        this.e = afvnVar;
        this.f = ababVar;
    }

    public static SubscriptionNotificationButtonData a(avbi avbiVar) {
        apoj apojVar;
        avbj avbjVar = avbiVar.e;
        if (avbjVar == null) {
            avbjVar = avbj.a;
        }
        if (avbjVar.b == 65153809) {
            apojVar = (apoj) avbjVar.c;
        } else {
            apojVar = apoj.a;
        }
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.a e = SubscriptionNotificationButtonData.e();
        e.c(avbiVar.c);
        arhs arhsVar = apojVar.g;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        arhr b = arhr.b(arhsVar.c);
        if (b == null) {
            b = arhr.UNKNOWN;
        }
        e.b(f(b));
        aovr aovrVar = apojVar.r;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        e.a = aovrVar.c;
        e.d(apojVar.t);
        return e.a();
    }

    private static int f(arhr arhrVar) {
        arhr arhrVar2 = arhr.UNKNOWN;
        int ordinal = arhrVar.ordinal();
        if (ordinal != 249) {
            if (ordinal == 255) {
                return 2;
            }
            return ordinal != 256 ? 0 : 3;
        }
        return 1;
    }

    public final avbi b(int i) {
        for (avbi avbiVar : this.b.c) {
            if (avbiVar.c == i) {
                return avbiVar;
            }
        }
        afus.b(2, 4, "SubscriptionNotificationToggleState not found for given id.");
        return avbi.a;
    }

    public final void c() {
        ylr.c();
        this.c.w(SubscriptionNotificationButtonData.a);
        this.b = avbh.a;
    }

    public final void d(avbh avbhVar) {
        ylr.c();
        avbhVar.getClass();
        this.b = avbhVar;
        if ((avbhVar.b & 1) == 0 || avbhVar.c.size() == 0) {
            c();
            return;
        }
        this.c.w(a(b(avbhVar.d)));
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b bVar = this.c;
        ArrayList arrayList = new ArrayList();
        for (avbi avbiVar : this.b.c) {
            if ((avbiVar.b & 16) != 0) {
                aunb aunbVar = avbiVar.f;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                apoj apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
                arag aragVar = apojVar.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                String obj = ajgl.b(aragVar).toString();
                com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.b g = SubscriptionNotificationMenuItem.g();
                g.d(avbiVar.c);
                g.c(apojVar.h);
                arhs arhsVar = apojVar.g;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                g.b(f(b));
                g.a = obj;
                g.b = obj;
                g.e(apojVar.t);
                SubscriptionNotificationMenuItem a = g.a();
                if (!((AutoValue_SubscriptionNotificationMenuItem) a).a) {
                    arrayList.add(a);
                }
            }
        }
        bVar.pF(new SubscriptionNotificationMenuData(arrayList));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d
    public final void h(SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        ylr.c();
        if (this.g) {
            return;
        }
        if (!this.e.t()) {
            afus.b(2, 4, "Subscription notification button click but no user signed in.");
            return;
        }
        avbi b = b(subscriptionNotificationMenuItem.b());
        aunb aunbVar = b.f;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apzg apzgVar = ((apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer)).n;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aazx a = this.f.a();
        a.a = ((ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) apzgVar.qm(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint)).b;
        a.k(apzgVar.c.I());
        this.g = true;
        if (this.d.p()) {
            this.c.w(a(b));
        }
        this.f.b(a, new a(this));
    }
}
