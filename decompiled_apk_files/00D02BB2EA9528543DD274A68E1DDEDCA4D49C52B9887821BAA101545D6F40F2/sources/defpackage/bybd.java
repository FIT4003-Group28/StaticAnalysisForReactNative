package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bybd  reason: default package */
/* loaded from: classes4.dex */
public final class bybd implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ bybe b;

    public bybd(bybe bybeVar, String str) {
        this.b = bybeVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bybl byblVar = this.b.a.h;
        if (byblVar != null) {
            String str = this.a;
            for (bybp bybpVar : byblVar.a.c) {
                boolean z = false;
                for (byay byayVar : bybpVar.d()) {
                    if (bybpVar.a(byayVar) && dbsd.a(str, byayVar.e)) {
                        if (byayVar.d != null) {
                            byayVar.a();
                        }
                        z = true;
                    }
                }
                if (z) {
                    byblVar.a.a(bybpVar);
                }
            }
        }
    }
}
