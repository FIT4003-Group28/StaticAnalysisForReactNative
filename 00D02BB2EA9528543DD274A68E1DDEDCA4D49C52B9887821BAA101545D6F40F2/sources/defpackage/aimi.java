package defpackage;
/* compiled from: PG */
/* renamed from: aimi  reason: default package */
/* loaded from: classes2.dex */
public final class aimi extends dsqp<aimj, aimi> implements dssk {
    public aimi() {
        super(aimj.b);
    }

    public final void a(aiml aimlVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        aimj aimjVar = (aimj) this.b;
        aimj aimjVar2 = aimj.b;
        aimlVar.getClass();
        aimjVar.b();
        aimjVar.a.add(aimlVar);
    }

    public final void b(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        aimj aimjVar = (aimj) this.b;
        aimj aimjVar2 = aimj.b;
        aimjVar.b();
        aimjVar.a.remove(i);
    }
}
