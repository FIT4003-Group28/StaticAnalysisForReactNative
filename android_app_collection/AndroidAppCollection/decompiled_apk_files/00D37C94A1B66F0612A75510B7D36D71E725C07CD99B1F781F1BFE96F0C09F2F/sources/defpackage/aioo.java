package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog$CustomWebView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aioo  reason: default package */
/* loaded from: classes.dex */
public final class aioo implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    final /* synthetic */ aiop a;
    private final aion b;
    private final auag c;
    private final aior d;

    public aioo(aiop aiopVar, aior aiorVar, aion aionVar, auag auagVar) {
        this.a = aiopVar;
        this.d = aiorVar;
        this.c = auagVar;
        this.b = aionVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.d.b();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        auag auagVar = this.c;
        if (i == -2) {
            this.d.b();
            this.a.f = null;
        } else if (i != -1) {
        } else {
            aion aionVar = this.b;
            if (aionVar == null || auagVar == null) {
                this.d.a();
            } else {
                aior aiorVar = this.d;
                final aiom aiomVar = (aiom) aionVar;
                aqxo.y(aiomVar.c.t());
                aiomVar.h = aiorVar;
                Activity activity = (Activity) aiomVar.a.get();
                if (activity == null || activity.isFinishing()) {
                    afus.b(1, 10, "Attempted to start AgeVerificationDialog when the activity is destroyed");
                } else {
                    aiomVar.d = new Dialog(activity, 16973834);
                }
                aiomVar.d.setContentView(R.layout.age_verification_dialog);
                aiomVar.d.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: aioh
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        aiom.this.b();
                    }
                });
                View findViewById = aiomVar.d.findViewById(R.id.close);
                findViewById.setClickable(true);
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: aioi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        aiom.this.b();
                    }
                });
                aiomVar.e = (AgeVerificationDialog$CustomWebView) aiomVar.d.findViewById(R.id.webview);
                aiomVar.e.getSettings().setJavaScriptEnabled(true);
                aiomVar.e.setVisibility(0);
                aiomVar.e.getSettings().setSaveFormData(false);
                Account b = aiomVar.g.b(aiomVar.c.c());
                final String str = auagVar.c;
                final String str2 = b == null ? "" : b.name;
                aiomVar.e.setWebViewClient(new aiok(aiomVar, str));
                aiomVar.f = yiy.c(new aiol(aiomVar));
                final Activity activity2 = (Activity) aiomVar.a.get();
                if (activity2 == null || activity2.isFinishing()) {
                    afus.b(1, 10, "Attempted to loadVideoView for AgeVerificationDialog when the activity is destroyed");
                } else {
                    aiomVar.b.execute(new Runnable() { // from class: aioj
                        /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                r6 = this;
                                aiom r0 = defpackage.aiom.this
                                java.lang.String r1 = r2
                                java.lang.String r2 = r3
                                android.app.Activity r3 = r4
                                yiy r4 = r0.f
                                yit r3 = defpackage.yit.c(r3, r4)
                                java.lang.String r1 = android.net.Uri.encode(r1)
                                java.lang.String r1 = java.lang.String.valueOf(r1)
                                int r4 = r1.length()
                                java.lang.String r5 = "weblogin:continue="
                                if (r4 == 0) goto L23
                                java.lang.String r1 = r5.concat(r1)
                                goto L28
                            L23:
                                java.lang.String r1 = new java.lang.String
                                r1.<init>(r5)
                            L28:
                                r4 = 0
                                java.lang.ref.WeakReference r0 = r0.a     // Catch: java.lang.Exception -> L38
                                java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L38
                                android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Exception -> L38
                                if (r0 == 0) goto L3c
                                java.lang.String r0 = defpackage.qhz.k(r0, r2, r1)     // Catch: java.lang.Exception -> L38
                                goto L3d
                            L38:
                                r0 = move-exception
                                r3.a(r4, r0)
                            L3c:
                                r0 = r4
                            L3d:
                                if (r0 != 0) goto L48
                                java.lang.Exception r0 = new java.lang.Exception
                                r0.<init>()
                                r3.a(r4, r0)
                                return
                            L48:
                                r3.b(r4, r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.aioj.run():void");
                        }
                    });
                }
            }
            this.a.f = null;
        }
    }
}
