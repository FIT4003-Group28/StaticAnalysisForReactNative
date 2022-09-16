package defpackage;
/* compiled from: PG */
/* renamed from: azxv  reason: default package */
/* loaded from: classes2.dex */
public abstract class azxv extends azyc {
    public final azxw c;
    public azxw d;

    public azxv(azxw azxwVar) {
        super(null);
        this.c = azxwVar;
    }

    @Override // defpackage.azyc
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        azxw azxwVar = (azxw) obj;
        azxwVar.getClass();
        azxw azxwVar2 = obj2 == null ? this.c : this.d;
        if (azxwVar2 == null || !azxwVar.c.c(this, azxwVar2) || obj2 != null) {
            return;
        }
        azxw azxwVar3 = this.c;
        azxw azxwVar4 = this.d;
        azxwVar4.getClass();
        azxwVar3.k(azxwVar4);
    }
}
