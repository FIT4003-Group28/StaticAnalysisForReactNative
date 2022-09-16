package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
/* compiled from: PG */
/* renamed from: acxm  reason: default package */
/* loaded from: classes.dex */
final class acxm extends BroadcastReceiver {
    final /* synthetic */ acxn a;

    public acxm(acxn acxnVar) {
        this.a = acxnVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c;
        acwx acwxVar = this.a.d;
        if (acwxVar == null) {
            zep.m(acxn.a, "no action listener set, ignoring action");
            return;
        }
        InteractionLoggingScreen interactionLoggingScreen = (InteractionLoggingScreen) intent.getParcelableExtra("INTERACTION_SCREEN");
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        if (valueOf.length() != 0) {
            "action: ".concat(valueOf);
        }
        switch (action.hashCode()) {
            case -670475291:
                if (action.equals("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.CANCEL")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 685086653:
                if (action.equals("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.RETRY")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1446453054:
                if (action.equals("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.DISMISSED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1545822060:
                if (action.equals("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.HELP")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            acxl acxlVar = this.a.c;
            if (interactionLoggingScreen == null || ((acsx) acxlVar.g).i == null) {
                zep.m(acxl.a, "Interaction logging screen is not set");
            }
            acxlVar.g.B(interactionLoggingScreen);
            acxlVar.g.H(3, new acte(acxl.f), null);
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            String str = acxb.a;
            acwxVar.a.i.setFlags(268435456);
            acxb acxbVar = acwxVar.a;
            acxbVar.b.startActivity(acxbVar.i);
        } else if (c == 1) {
            acxl acxlVar2 = this.a.c;
            if (interactionLoggingScreen == null || ((acsx) acxlVar2.g).i == null) {
                zep.m(acxl.a, "Interaction logging screen is not set");
            }
            acxlVar2.g.B(interactionLoggingScreen);
            acxlVar2.g.H(3, new acte(acxl.e), null);
            acxk acxkVar = this.a.b;
            acxkVar.getClass();
            String str2 = acxb.a;
            acwxVar.a.f(acxkVar, true);
        } else if (c != 2) {
            if (c == 3) {
                String str3 = acxb.a;
                acwxVar.a.b();
                acwxVar.a.g.a();
                this.a.e();
                return;
            }
            String str4 = acxn.a;
            String valueOf2 = String.valueOf(action);
            zep.m(str4, valueOf2.length() != 0 ? "Unknown action:".concat(valueOf2) : new String("Unknown action:"));
        } else {
            acxl acxlVar3 = this.a.c;
            if (interactionLoggingScreen == null || ((acsx) acxlVar3.g).i == null) {
                zep.m(acxl.a, "Interaction logging screen is not set");
            }
            acxlVar3.g.B(interactionLoggingScreen);
            acxlVar3.g.H(3, new acte(acxl.d), null);
            String str5 = acxb.a;
            acwxVar.a.b();
            acwxVar.a.g.a();
        }
    }
}
