package defpackage;

import android.util.Log;
import android.view.View;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
/* compiled from: PG */
/* renamed from: acew  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acew implements View.OnClickListener {
    public final /* synthetic */ acfh a;
    private final /* synthetic */ int b;

    public /* synthetic */ acew(acfh acfhVar) {
        this.a = acfhVar;
    }

    public /* synthetic */ acew(acfh acfhVar, int i) {
        this.b = i;
        this.a = acfhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        acfs acfsVar;
        acfq acfqVar;
        switch (this.b) {
            case 0:
                acfh acfhVar = this.a;
                acfhVar.j();
                acfe acfeVar = acfhVar.y;
                if (acfeVar == null) {
                    return;
                }
                acfs acfsVar2 = (acfs) acfeVar;
                if (acfhVar == acfsVar2.c) {
                    if (acfs.m(acfsVar2)) {
                        return;
                    }
                    acfsVar2.f.i();
                    return;
                }
                String valueOf = String.valueOf(acfhVar);
                String valueOf2 = String.valueOf(acfsVar2.c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
                sb.append("Unexpected control window: ");
                sb.append(valueOf);
                sb.append(" != ");
                sb.append(valueOf2);
                Log.e("ScreencastControls", sb.toString());
                acfsVar2.f.i();
                return;
            case 1:
                this.a.j();
                return;
            case 2:
                acfh acfhVar2 = this.a;
                acfhVar2.j();
                if (!acfhVar2.I) {
                    acfhVar2.q(true);
                    acfhVar2.o.H(3, new acte(actj.SCREENCAST_CONTROLLER_PAUSE_STREAM_BUTTON), null);
                    acet acetVar = acfhVar2.z;
                    if (acetVar == null) {
                        return;
                    }
                    ScreencastHostService screencastHostService = (ScreencastHostService) ((acfs) acetVar).f;
                    if (!screencastHostService.n) {
                        return;
                    }
                    screencastHostService.p.z(new aceg(screencastHostService));
                    return;
                }
                acfhVar2.q(false);
                acfhVar2.o.H(3, new acte(actj.SCREENCAST_CONTROLLER_RESUME_STREAM_BUTTON), null);
                acet acetVar2 = acfhVar2.z;
                if (acetVar2 == null) {
                    return;
                }
                ScreencastHostService screencastHostService2 = (ScreencastHostService) ((acfs) acetVar2).f;
                if (!screencastHostService2.n) {
                    return;
                }
                abyk abykVar = screencastHostService2.p;
                aceg acegVar = new aceg(screencastHostService2);
                if (!abykVar.U) {
                    zep.b("Cannot resume. Capture stream not active");
                    return;
                } else {
                    abykVar.k.g(new abxh(abykVar, acegVar));
                    return;
                }
            case 3:
                acfh acfhVar3 = this.a;
                acfhVar3.j();
                if (acfhVar3.s()) {
                    acfhVar3.b();
                    return;
                } else {
                    acfhVar3.t.start();
                    return;
                }
            case 4:
                acfh acfhVar4 = this.a;
                acfhVar4.j();
                acfhVar4.e(true);
                return;
            case 5:
                acfh acfhVar5 = this.a;
                acfhVar5.j();
                acfhVar5.o.H(3, new acte(actj.SCREENCAST_CONTROLLER_START_STREAM_BUTTON), null);
                acet acetVar3 = acfhVar5.z;
                if (acetVar3 == null) {
                    return;
                }
                acfs acfsVar3 = (acfs) acetVar3;
                if (!acfs.n(acfsVar3.i) || acfsVar3.i == 4) {
                    return;
                }
                acgd acgdVar = acfsVar3.b;
                if (acfs.n(acgdVar.u) && acgdVar.u != 4) {
                    acgdVar.g(false);
                    acgdVar.c();
                    acgdVar.d.setVisibility(8);
                    acgdVar.a();
                    acgdVar.u = 4;
                }
                acfsVar3.c.b();
                acfsVar3.c.k();
                acfsVar3.c.d();
                acfsVar3.c.m.setVisibility(8);
                acfsVar3.c.c();
                acfsVar3.h(acfsVar3.g);
                acfsVar3.k();
                acfsVar3.i = 4;
                ScreencastHostService screencastHostService3 = (ScreencastHostService) acfsVar3.f;
                if (screencastHostService3.n) {
                    Log.w("ScreencastHostServ", "Unexpectedly entered launching state while capture active. Switching to active");
                    if (!acfs.m(screencastHostService3.o)) {
                        return;
                    }
                    screencastHostService3.o.c();
                    return;
                }
                screencastHostService3.q.h();
                screencastHostService3.p.p();
                return;
            case 6:
                this.a.m.performClick();
                return;
            case 7:
                this.a.N.show();
                return;
            case 8:
                acfh acfhVar6 = this.a;
                acfhVar6.j();
                if (!acfhVar6.G) {
                    acek acekVar = acfhVar6.B;
                    if (acekVar != null) {
                        ((acfs) acekVar).b.e(true, new acex(acfhVar6, 3));
                    } else {
                        acfhVar6.l(true);
                    }
                    acfhVar6.o.H(3, new acte(actj.SCREENCAST_CONTROLLER_ENABLE_CAMERA_BUTTON), null);
                    return;
                }
                acek acekVar2 = acfhVar6.B;
                if (acekVar2 != null) {
                    ((acfs) acekVar2).b.e(false, new acex(acfhVar6, 2));
                } else {
                    acfhVar6.l(false);
                }
                acfhVar6.o.H(3, new acte(actj.SCREENCAST_CONTROLLER_DISABLE_CAMERA_BUTTON), null);
                return;
            case 9:
                acfh acfhVar7 = this.a;
                acfhVar7.j();
                if (!acfhVar7.F) {
                    acfhVar7.p(true);
                    acfj acfjVar = acfhVar7.A;
                    if (acfjVar != null) {
                        acfs acfsVar4 = (acfs) acfjVar;
                        acfsVar4.b.f(true);
                        ((ScreencastHostService) acfsVar4.f).j(true);
                    }
                    acfhVar7.o.H(3, new acte(actj.SCREENCAST_CONTROLLER_ENABLE_MIC_BUTTON), null);
                    return;
                }
                acfhVar7.p(false);
                acfj acfjVar2 = acfhVar7.A;
                if (acfjVar2 != null) {
                    acfs acfsVar5 = (acfs) acfjVar2;
                    acfsVar5.b.f(false);
                    ((ScreencastHostService) acfsVar5.f).j(false);
                }
                acfhVar7.o.H(3, new acte(actj.SCREENCAST_CONTROLLER_DISABLE_MIC_BUTTON), null);
                return;
            default:
                acfh acfhVar8 = this.a;
                acfhVar8.j();
                if (!acfhVar8.H) {
                    acfhVar8.n(true);
                    aceu aceuVar = acfhVar8.C;
                    if (aceuVar == null) {
                        return;
                    }
                    aceuVar.a();
                    return;
                }
                acfhVar8.n(false);
                aceu aceuVar2 = acfhVar8.C;
                if (aceuVar2 == null || (acfqVar = (acfsVar = (acfs) aceuVar2).d) == null) {
                    return;
                }
                acfqVar.b();
                acfsVar.d.d.setVisibility(8);
                return;
        }
    }
}
