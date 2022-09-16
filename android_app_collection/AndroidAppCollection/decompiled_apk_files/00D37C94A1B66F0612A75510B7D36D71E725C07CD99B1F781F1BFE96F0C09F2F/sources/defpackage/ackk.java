package defpackage;

import android.os.Handler;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BroadcastParticipantJoinScreenRendererOuterClass;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ackk  reason: default package */
/* loaded from: classes.dex */
public final class ackk implements abzg {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ ackp c;

    public ackk(ackp ackpVar, String str, int i) {
        this.c = ackpVar;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.abzg
    public final void a(arsg arsgVar) {
        ackp ackpVar = this.c;
        aunb aunbVar = arsgVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        ackpVar.ak = (apns) aunbVar.qm(BroadcastParticipantJoinScreenRendererOuterClass.broadcastParticipantJoinScreenRenderer);
        ackp ackpVar2 = this.c;
        ackpVar2.aE(ackpVar2.O);
    }

    @Override // defpackage.abzg
    public final void b(int i, aqft aqftVar) {
        if (i != 4) {
            Handler handler = this.c.a;
            final String str = this.a;
            final int i2 = this.b;
            handler.postDelayed(new Runnable() { // from class: ackj
                @Override // java.lang.Runnable
                public final void run() {
                    ackk ackkVar = ackk.this;
                    ackkVar.c.p(str, i2 - 1);
                }
            }, 400L);
            return;
        }
        if (aqftVar != null) {
            this.c.s(aqftVar);
        } else {
            Toast.makeText(this.c.mJ(), (int) R.string.lc_join_stream_failed, 1).show();
        }
        this.c.e.T();
    }
}
