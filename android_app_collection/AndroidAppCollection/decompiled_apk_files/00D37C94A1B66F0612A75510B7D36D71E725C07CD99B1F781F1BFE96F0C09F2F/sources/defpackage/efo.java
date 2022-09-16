package defpackage;
/* compiled from: PG */
/* renamed from: efo  reason: default package */
/* loaded from: classes3.dex */
public final class efo implements Runnable {
    final /* synthetic */ efq a;
    private final /* synthetic */ int b;

    public efo(efq efqVar) {
        this.a = efqVar;
    }

    public /* synthetic */ efo(efq efqVar, int i) {
        this.b = i;
        this.a = efqVar;
    }

    public efo(efq efqVar, int i, byte[] bArr) {
        this.b = i;
        this.a = efqVar;
    }

    public efo(efq efqVar, int i, char[] cArr) {
        this.b = i;
        this.a = efqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            ((zej) this.a.g.get()).a();
        } else if (i == 1) {
            this.a.b();
        } else if (i == 2) {
            long d = ((snc) this.a.h.get()).d();
            ((wwl) this.a.i.get()).f();
            this.a.d.d();
            yni yniVar = (yni) this.a.j.get();
            yniVar.d(new wyd(d));
            yniVar.d(new wyc());
        } else {
            atfw atfwVar = ((aacz) this.a.e.get()).b().k;
            if (atfwVar == null) {
                atfwVar = atfw.a;
            }
            apfn apfnVar = atfwVar.p;
            if (apfnVar == null) {
                apfnVar = apfn.a;
            }
            if (!apfnVar.d || apfnVar.e.size() == 0) {
                return;
            }
            yqg yqgVar = (yqg) this.a.m.get();
            for (String str : apfnVar.e) {
                yqgVar.a(str);
            }
        }
    }
}
