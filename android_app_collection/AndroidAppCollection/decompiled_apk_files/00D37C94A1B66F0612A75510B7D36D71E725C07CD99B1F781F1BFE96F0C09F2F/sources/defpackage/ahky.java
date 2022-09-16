package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: ahky  reason: default package */
/* loaded from: classes.dex */
public final class ahky {
    public final Handler a;
    public final ahlb b;
    public final Runnable c;

    public ahky(ahlb ahlbVar, ahne ahneVar, Handler handler, ahoo ahooVar, ahof ahofVar, String str) {
        this.a = handler;
        ahlb ahlbVar2 = new ahlb();
        this.b = ahlbVar2;
        ahnh a = ahneVar.a(ahooVar, 0.0f, 0.0f);
        a.B(true, true);
        a.y(str);
        a.z(-1);
        a.r();
        ahon a2 = ahon.a(1.0f, 1.0f, ahon.c);
        ahjv ahjvVar = new ahjv(a2, ahooVar.clone(), ahjv.s(new float[]{0.0f, 0.0f, 0.0f, 0.5f}, a2.f), ahofVar.a.a());
        ahjvVar.t();
        ahjvVar.r();
        a.g(new ahkw(ahjvVar));
        ahlbVar2.q(ahjvVar);
        ahlbVar2.q(a);
        ahlbVar.q(ahlbVar2);
        ahlbVar2.l = true;
        this.c = new ahkx(this);
    }
}
