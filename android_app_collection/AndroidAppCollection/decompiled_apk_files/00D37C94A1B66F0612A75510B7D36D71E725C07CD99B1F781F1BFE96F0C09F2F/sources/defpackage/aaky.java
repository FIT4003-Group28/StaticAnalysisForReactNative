package defpackage;
/* compiled from: PG */
/* renamed from: aaky  reason: default package */
/* loaded from: classes.dex */
public final class aaky {
    public avfo a;
    private aakw b;

    public aaky(avfo avfoVar) {
        avfoVar.getClass();
        this.a = avfoVar;
    }

    public final aakw a() {
        if (this.b == null) {
            avfk avfkVar = this.a.k;
            if (avfkVar == null) {
                avfkVar = avfk.a;
            }
            if ((avfkVar.b & 1) != 0) {
                avfk avfkVar2 = this.a.k;
                if (avfkVar2 == null) {
                    avfkVar2 = avfk.a;
                }
                auqh auqhVar = avfkVar2.c;
                if (auqhVar == null) {
                    auqhVar = auqh.a;
                }
                this.b = new aakw(auqhVar);
            }
        }
        return this.b;
    }

    public final void b(avfo avfoVar) {
        avfoVar.getClass();
        this.a = avfoVar;
        this.b = null;
    }
}
