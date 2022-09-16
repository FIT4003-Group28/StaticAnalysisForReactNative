package defpackage;

import android.view.View;
import j$.time.Duration;
/* compiled from: PG */
/* renamed from: ixf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ixf implements View.OnClickListener {
    public final /* synthetic */ ixk a;
    private final /* synthetic */ int b;

    public /* synthetic */ ixf(ixk ixkVar) {
        this.a = ixkVar;
    }

    public /* synthetic */ ixf(ixk ixkVar, int i) {
        this.b = i;
        this.a = ixkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            ixk ixkVar = this.a;
            ixkVar.aa.H(3, new acte(actj.MEDIA_ROUTE_DISCONNECT_BUTTON), null);
            if (ixkVar.Y.m()) {
                ixkVar.Z.S();
            }
            ixkVar.dismiss();
        } else if (i == 1) {
            ixk ixkVar2 = this.a;
            ixkVar2.aa.H(3, new acte(actj.CAST_DIALOG_CLOSE_BUTTON), null);
            ixkVar2.dismiss();
        } else if (i != 2) {
            if (i == 3) {
                ixk ixkVar3 = this.a;
                ixkVar3.aa.H(3, new acte(actj.VOICE_SEARCH_IN_CAST_DIALOG), null);
                ixkVar3.A(2);
                return;
            }
            ixk ixkVar4 = this.a;
            ixkVar4.aa.H(3, new acte(actj.SMART_REMOTE_DPAD_IN_CAST_DIALOG), null);
            ixkVar4.A(4);
        } else {
            ixk ixkVar5 = this.a;
            ixkVar5.aa.H(3, new acte(acuo.b(132424)), null);
            ixkVar5.ab.j(new ixj(ixkVar5), Duration.ofSeconds(10L));
            ixkVar5.ad.setVisibility(4);
            ixkVar5.af.setVisibility(0);
            ixkVar5.af.performAccessibilityAction(64, null);
            final advc advcVar = ixkVar5.ab;
            advcVar.getClass();
            ixkVar5.ag = new Runnable() { // from class: ixh
                @Override // java.lang.Runnable
                public final void run() {
                    advc.this.h();
                }
            };
        }
    }
}
