package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amml  reason: default package */
/* loaded from: classes.dex */
public final class amml implements aniq {
    final /* synthetic */ amlv a;
    final /* synthetic */ aniq b;

    public amml(amlv amlvVar, aniq aniqVar) {
        this.a = amlvVar;
        this.b = aniqVar;
    }

    @Override // defpackage.aniq
    public final ankt a() {
        amlv e = amna.e(this.a);
        try {
            return this.b.a();
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
