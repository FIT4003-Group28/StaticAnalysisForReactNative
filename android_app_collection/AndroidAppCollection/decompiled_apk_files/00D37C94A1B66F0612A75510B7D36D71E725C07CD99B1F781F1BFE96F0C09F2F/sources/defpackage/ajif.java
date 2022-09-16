package defpackage;

import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
/* compiled from: PG */
/* renamed from: ajif  reason: default package */
/* loaded from: classes.dex */
public final class ajif implements srw {
    private final acrr a;

    public ajif(acrr acrrVar) {
        this.a = acrrVar;
    }

    @Override // defpackage.srw
    public final void a(int i, aoob aoobVar, boolean z, float f, int i2, tcs tcsVar) {
        aufw aufwVar;
        tdq tdqVar = tcsVar.f;
        if (tdqVar instanceof ajjk) {
            acti actiVar = ((ajjk) tdqVar).a;
            if (!z) {
                int i3 = i - 1;
                if (i3 == 1) {
                    actiVar.u(new acte(aoobVar), null);
                    return;
                } else if (i3 != 2) {
                    return;
                } else {
                    actiVar.q(new acte(aoobVar), null);
                    return;
                }
            }
            InteractionLoggingScreen c = actiVar.c();
            if (c == null) {
                return;
            }
            int i4 = i - 1;
            if (i4 == 1) {
                aufwVar = aufw.POST_IMPRESSION_EVENT_TYPE_ENTER;
            } else if (i4 == 2) {
                aufwVar = aufw.POST_IMPRESSION_EVENT_TYPE_LEAVE;
            } else {
                aufwVar = aufw.POST_IMPRESSION_EVENT_TYPE_UNKNOWN;
            }
            if (aufwVar == aufw.POST_IMPRESSION_EVENT_TYPE_UNKNOWN) {
                return;
            }
            arrf a = arrh.a();
            aufx a2 = aufy.a();
            String str = c.a;
            a2.copyOnWrite();
            ((aufy) a2.instance).h(str);
            aopa createBuilder = awbs.a.createBuilder();
            createBuilder.copyOnWrite();
            awbs awbsVar = (awbs) createBuilder.instance;
            aoobVar.getClass();
            awbsVar.b = 1 | awbsVar.b;
            awbsVar.c = aoobVar;
            a2.copyOnWrite();
            ((aufy) a2.instance).k((awbs) createBuilder.mo39build());
            a2.copyOnWrite();
            ((aufy) a2.instance).j(aufwVar);
            a2.copyOnWrite();
            ((aufy) a2.instance).l(f);
            a2.copyOnWrite();
            ((aufy) a2.instance).i(i2);
            a.copyOnWrite();
            ((arrh) a.instance).dw((aufy) a2.mo39build());
            this.a.c((arrh) a.mo39build());
        }
    }
}
