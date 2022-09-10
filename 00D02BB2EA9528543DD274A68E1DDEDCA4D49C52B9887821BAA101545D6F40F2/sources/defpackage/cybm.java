package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cybm  reason: default package */
/* loaded from: classes5.dex */
public final class cybm implements dbty {
    volatile cybo a;
    final /* synthetic */ cybn b;

    public cybm(cybn cybnVar) {
        this.b = cybnVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = this.b.c();
                }
            }
        }
        return this.a;
    }
}
