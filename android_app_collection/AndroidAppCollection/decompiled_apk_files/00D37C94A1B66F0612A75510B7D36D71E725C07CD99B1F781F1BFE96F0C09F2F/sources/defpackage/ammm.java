package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ammm  reason: default package */
/* loaded from: classes.dex */
public final class ammm implements ampg {
    final /* synthetic */ amlv a;
    final /* synthetic */ ampg b;

    public ammm(amlv amlvVar, ampg ampgVar) {
        this.a = amlvVar;
        this.b = ampgVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        amlv e = amna.e(this.a);
        try {
            return this.b.apply(obj);
        } finally {
            amna.e(e);
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
