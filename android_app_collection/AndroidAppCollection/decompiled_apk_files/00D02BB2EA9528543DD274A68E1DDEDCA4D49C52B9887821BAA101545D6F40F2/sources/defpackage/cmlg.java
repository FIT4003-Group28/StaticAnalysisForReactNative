package defpackage;
/* compiled from: PG */
/* renamed from: cmlg  reason: default package */
/* loaded from: classes5.dex */
public final class cmlg implements Runnable {
    private final cmlf a;

    public cmlg(cmlf cmlfVar) {
        this.a = cmlfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cmfj[] cmfjVarArr;
        cmfb cmfbVar = (cmfb) this.a;
        for (cmfj cmfjVar : cmfbVar.l) {
            cmfjVar.h(true);
            cmfjVar.r();
        }
        cmdk cmdkVar = cmfbVar.y;
        if (cmdkVar.a != null) {
            cmdkVar.a = null;
        }
        cmdkVar.b = null;
    }
}
