package defpackage;

import org.webrtc.Logging;
/* compiled from: PG */
/* renamed from: baoh  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class baoh implements Runnable {
    public final /* synthetic */ baom a;
    private final /* synthetic */ int b;

    public /* synthetic */ baoh(baom baomVar) {
        this.a = baomVar;
    }

    public /* synthetic */ baoh(baom baomVar, int i) {
        this.b = i;
        this.a = baomVar;
    }

    public baoh(baom baomVar, int i, byte[] bArr) {
        this.b = i;
        this.a = baomVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            baom baomVar = this.a;
            baomVar.e = false;
            if (baomVar.f) {
                baomVar.a();
            } else {
                baomVar.b();
            }
        } else if (i == 1) {
            baom baomVar2 = this.a;
            baomVar2.f = true;
            if (baomVar2.e) {
                return;
            }
            baomVar2.a();
        } else if (i == 2) {
            baom baomVar3 = this.a;
            baomVar3.c = null;
            baomVar3.j = null;
        } else {
            String valueOf = String.valueOf(this.a.j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Setting listener to ");
            sb.append(valueOf);
            Logging.a("SurfaceTextureHelper", sb.toString());
            baom baomVar4 = this.a;
            baomVar4.c = baomVar4.j;
            baomVar4.j = null;
            if (!baomVar4.d) {
                return;
            }
            baomVar4.c();
            this.a.d = false;
        }
    }
}
