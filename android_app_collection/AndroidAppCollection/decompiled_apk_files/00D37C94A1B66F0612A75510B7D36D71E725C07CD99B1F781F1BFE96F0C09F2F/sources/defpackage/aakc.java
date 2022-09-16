package defpackage;
/* compiled from: PG */
/* renamed from: aakc  reason: default package */
/* loaded from: classes.dex */
public final class aakc {
    public aajj a;
    private aajk b;
    private aorw c;

    public final void b(aorw aorwVar) {
        if (aorwVar != null) {
            this.c = aorwVar;
            return;
        }
        throw new NullPointerException("Null applicability");
    }

    public final void c(aajk aajkVar) {
        if (aajkVar != null) {
            this.b = aajkVar;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    public final aakd a() {
        aorw aorwVar;
        aajk aajkVar = this.b;
        if (aajkVar == null || (aorwVar = this.c) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" metadata");
            }
            if (this.c == null) {
                sb.append(" applicability");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aakd(this.a, aajkVar, aorwVar);
    }
}
