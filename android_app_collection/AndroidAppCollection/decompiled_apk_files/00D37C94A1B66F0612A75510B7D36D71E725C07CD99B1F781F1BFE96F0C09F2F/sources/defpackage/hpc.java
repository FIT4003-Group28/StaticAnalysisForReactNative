package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: hpc  reason: default package */
/* loaded from: classes3.dex */
public final class hpc extends Handler {
    private static final long f = TimeUnit.SECONDS.toMillis(2);
    public final abbr a;
    public final afvn b;
    public final hoz c;
    public final AtomicBoolean d = new AtomicBoolean();
    public apzg e;
    private boolean g;
    private boolean h;
    private boolean i;
    private RecordingInfo j;
    private int k;

    public hpc(abbr abbrVar, afvn afvnVar, hoz hozVar) {
        this.a = abbrVar;
        this.b = afvnVar;
        this.c = hozVar;
    }

    public final void a(RecordingInfo recordingInfo, int i) {
        this.k = i;
        sendMessage(obtainMessage(4, recordingInfo));
    }

    public final void b(apzg apzgVar) {
        if (apzgVar != null) {
            this.e = apzgVar;
            this.g = true;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.g = false;
            this.h = false;
            this.d.set(false);
            this.c.aF(null, null, null);
        } else if (i == 1) {
            b((apzg) message.obj);
            if (!this.i) {
                return;
            }
            sendEmptyMessage(5);
        } else if (i == 2) {
            this.h = true;
            if (!this.i) {
                return;
            }
            sendEmptyMessage(5);
        } else if (i == 3) {
            this.i = false;
        } else if (i == 4) {
            this.i = true;
            this.j = (RecordingInfo) message.obj;
            sendEmptyMessage(5);
        } else if (i != 5 || !this.i) {
        } else {
            if (this.g) {
                this.c.aT(this.j, this.e, this.k);
            } else if (message.arg1 == 1 || this.h) {
                if (message.arg1 == 1) {
                    afus.b(2, 9, "Reels: Opened edit screen due to timeout");
                }
                hoz hozVar = this.c;
                RecordingInfo recordingInfo = this.j;
                aopc aopcVar = (aopc) apzg.a.createBuilder();
                aopcVar.e(ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint, ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.a);
                hozVar.aT(recordingInfo, (apzg) aopcVar.mo39build(), this.k);
                this.d.set(true);
            } else {
                this.c.aU();
                sendMessageDelayed(obtainMessage(5, 1, 0), f);
            }
        }
    }
}
