package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arzr  reason: default package */
/* loaded from: classes2.dex */
public final class arzr implements Runnable {
    final /* synthetic */ arzs a;

    public arzr(arzs arzsVar) {
        this.a = arzsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        atxz atxzVar = this.a.p;
        if (atxzVar != null) {
            atxzVar.Ob();
            this.a.a();
        }
    }
}
