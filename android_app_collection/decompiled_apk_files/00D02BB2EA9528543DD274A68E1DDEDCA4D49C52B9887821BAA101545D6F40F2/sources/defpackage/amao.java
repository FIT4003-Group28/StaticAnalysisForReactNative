package defpackage;
/* compiled from: PG */
/* renamed from: amao  reason: default package */
/* loaded from: classes2.dex */
public final class amao implements Runnable {
    final /* synthetic */ btzy a;
    final /* synthetic */ amap b;

    public amao(amap amapVar, btzy btzyVar) {
        this.b = amapVar;
        this.a = btzyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amap amapVar = this.b;
        amaw amawVar = amapVar.b;
        ambv ambvVar = amapVar.a;
        btzy btzyVar = this.a;
        if (btzyVar.equals(btzy.m) || btzyVar.equals(btzy.h) || btzyVar.equals(btzy.j) || btzyVar.equals(btzy.o)) {
            amawVar.t(ambvVar, btzyVar);
        } else if (ambvVar.m()) {
            amawVar.G(ambvVar, 6, null, null);
        } else {
            amawVar.e.a(ambvVar.b());
        }
    }
}
