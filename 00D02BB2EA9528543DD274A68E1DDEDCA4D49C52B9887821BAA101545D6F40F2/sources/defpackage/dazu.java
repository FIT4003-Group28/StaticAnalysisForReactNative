package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dazu  reason: default package */
/* loaded from: classes5.dex */
public final class dazu implements defg {
    final /* synthetic */ dazn a;
    final /* synthetic */ defg b;

    public dazu(dazn daznVar, defg defgVar) {
        this.a = daznVar;
        this.b = defgVar;
    }

    @Override // defpackage.defg
    public final dehn a(Object obj) {
        dazn g = dbaa.g(this.a);
        try {
            return this.b.a(obj);
        } finally {
            dbaa.g(g);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
