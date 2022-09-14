package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vmo  reason: default package */
/* loaded from: classes7.dex */
public final class vmo {
    public final avij a;
    public final avzm b;
    public final Executor c;
    public final awby d;

    public vmo(awby awbyVar, avij avijVar, avzm avzmVar, Executor executor) {
        this.d = awbyVar;
        this.a = avijVar;
        this.b = avzmVar;
        this.c = executor;
    }

    public final synchronized dehn<Boolean> a(akrk akrkVar) {
        vmn vmnVar;
        vmnVar = new vmn(this, akrkVar);
        vmnVar.d.a.t(vmnVar);
        return vmnVar.a;
    }
}
