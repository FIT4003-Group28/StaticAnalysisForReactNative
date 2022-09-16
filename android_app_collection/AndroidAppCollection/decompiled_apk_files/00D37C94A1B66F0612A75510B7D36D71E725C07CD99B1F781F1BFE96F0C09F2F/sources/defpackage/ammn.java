package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ammn  reason: default package */
/* loaded from: classes.dex */
public final class ammn implements anir {
    final /* synthetic */ amlv a;
    final /* synthetic */ anir b;

    public ammn(amlv amlvVar, anir anirVar) {
        this.a = amlvVar;
        this.b = anirVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        amlv e = amna.e(this.a);
        try {
            return this.b.a(obj);
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
