package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: aesz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aesz implements Runnable {
    public final /* synthetic */ aetg a;
    private final /* synthetic */ int b;

    public /* synthetic */ aesz(aetg aetgVar, int i) {
        this.b = i;
        this.a = aetgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.d();
                return;
            case 1:
                aetg aetgVar = this.a;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = aetgVar.a;
                StringBuilder sb = new StringBuilder(35);
                sb.append("start_delta_ms.");
                sb.append(elapsedRealtime - j);
                aetgVar.i("empup", new aest(sb.toString()));
                return;
            case 2:
                this.a.f();
                return;
            case 3:
                this.a.m();
                return;
            case 4:
                this.a.n();
                return;
            case 5:
                this.a.q();
                return;
            case 6:
                this.a.r();
                return;
            default:
                this.a.v();
                return;
        }
    }
}
