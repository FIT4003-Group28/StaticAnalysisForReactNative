package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awcn  reason: default package */
/* loaded from: classes3.dex */
public final class awcn {
    public final Runtime a;
    public final ckcw b;
    public boolean c;
    private final BroadcastReceiver d;

    public awcn(Application application, ckcw ckcwVar, Runtime runtime) {
        awcm awcmVar = new awcm(this);
        this.d = awcmVar;
        this.c = false;
        this.b = ckcwVar;
        this.a = runtime;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        application.registerReceiver(awcmVar, intentFilter);
    }

    public final synchronized void a(crzm<avzg> crzmVar, Executor executor) {
        crzmVar.d(new crzp(this) { // from class: awcl
            private final awcn a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar2) {
                awcn awcnVar = this.a;
                avzg avzgVar = (avzg) crzmVar2.l();
                dbsk.s(avzgVar);
                if (avzgVar.b().e()) {
                    awcnVar.c = true;
                }
            }
        }, executor);
    }
}
