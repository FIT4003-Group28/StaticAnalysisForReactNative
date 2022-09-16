package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: whe  reason: default package */
/* loaded from: classes4.dex */
public final class whe {
    public final afvn a;
    public final vzv b;
    public final Executor c;
    private final acrq d;

    public whe(acrq acrqVar, afvn afvnVar, vzv vzvVar, Executor executor) {
        this.d = acrqVar;
        this.a = afvnVar;
        this.b = vzvVar;
        this.c = executor;
    }

    public final void a(aowo aowoVar, aowm aowmVar, aown aownVar) {
        aowp a = aowq.a();
        a.copyOnWrite();
        aowq.c((aowq) a.instance, aowoVar);
        a.copyOnWrite();
        aowq.d((aowq) a.instance, aowmVar);
        a.copyOnWrite();
        aowq.e((aowq) a.instance, aownVar);
        acrq acrqVar = this.d;
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).bS((aowq) a.mo39build());
        acrqVar.a((arrh) a2.mo39build());
    }

    public final void b(int i, int i2, int i3) {
        aopa createBuilder = aowv.a.createBuilder();
        createBuilder.copyOnWrite();
        aowv aowvVar = (aowv) createBuilder.instance;
        aowvVar.c = i - 1;
        aowvVar.b |= 1;
        createBuilder.copyOnWrite();
        aowv aowvVar2 = (aowv) createBuilder.instance;
        aowvVar2.d = i2 - 1;
        aowvVar2.b |= 2;
        createBuilder.copyOnWrite();
        aowv aowvVar3 = (aowv) createBuilder.instance;
        aowvVar3.e = i3 - 1;
        aowvVar3.b |= 4;
        acrq acrqVar = this.d;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).bV((aowv) createBuilder.mo39build());
        acrqVar.a((arrh) a.mo39build());
    }

    public final void c(int i, Throwable th) {
        int i2;
        if (th instanceof alzy) {
            i2 = 7;
        } else if (th instanceof alzz) {
            i2 = 4;
        } else if (th instanceof amab) {
            i2 = 3;
        } else if (th instanceof amac) {
            i2 = 5;
        } else {
            i2 = th instanceof amaa ? 6 : 1;
        }
        b(i, 3, i2);
    }
}
