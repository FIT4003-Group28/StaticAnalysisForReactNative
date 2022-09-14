package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dazt  reason: default package */
/* loaded from: classes5.dex */
public final class dazt implements dbrn {
    final /* synthetic */ dazn a;
    final /* synthetic */ dbrn b;

    public dazt(dazn daznVar, dbrn dbrnVar) {
        this.a = daznVar;
        this.b = dbrnVar;
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
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
