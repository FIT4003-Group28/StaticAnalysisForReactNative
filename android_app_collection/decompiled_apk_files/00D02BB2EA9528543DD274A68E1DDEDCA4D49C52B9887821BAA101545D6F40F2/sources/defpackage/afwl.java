package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afwl  reason: default package */
/* loaded from: classes2.dex */
public final class afwl extends afwn {
    private final afwm a;
    private final boolean b;
    private final bvjk c;

    public afwl(afwm afwmVar, boolean z, @dzsi bvjk bvjkVar) {
        if (afwmVar != null) {
            this.a = afwmVar;
            this.b = z;
            this.c = bvjkVar;
            return;
        }
        throw new NullPointerException("Null layer");
    }

    @Override // defpackage.afwn
    public final afwm a() {
        return this.a;
    }

    @Override // defpackage.afwn
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.afwn
    @dzsi
    public final bvjk c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        bvjk bvjkVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof afwn) {
            afwn afwnVar = (afwn) obj;
            if (this.a.equals(afwnVar.a()) && this.b == afwnVar.b() && ((bvjkVar = this.c) != null ? bvjkVar.equals(afwnVar.c()) : afwnVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        bvjk bvjkVar = this.c;
        return hashCode ^ (bvjkVar == null ? 0 : bvjkVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49 + String.valueOf(valueOf2).length());
        sb.append("LayerStateOverride{layer=");
        sb.append(valueOf);
        sb.append(", value=");
        sb.append(z);
        sb.append(", setting=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
