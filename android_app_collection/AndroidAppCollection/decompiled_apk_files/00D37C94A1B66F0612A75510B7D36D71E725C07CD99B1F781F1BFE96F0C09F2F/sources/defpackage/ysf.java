package defpackage;
/* compiled from: PG */
/* renamed from: ysf  reason: default package */
/* loaded from: classes4.dex */
public final class ysf extends ysd {
    public final azqb a;
    public final azqb b;
    public final azqb c;
    public final yqj d;
    public volatile transient boolean e;
    public volatile transient zav f;
    private final yme g;

    public ysf() {
    }

    public ysf(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, yme ymeVar, yqj yqjVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.g = ymeVar;
        this.d = yqjVar;
    }

    @Override // defpackage.ysd
    public final yme a() {
        throw null;
    }

    @Override // defpackage.ysd
    public final azqb b() {
        throw null;
    }

    @Override // defpackage.ysd
    public final azqb c() {
        throw null;
    }

    @Override // defpackage.ysd
    public final azqb d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ysf) {
            ysf ysfVar = (ysf) obj;
            if (this.a.equals(ysfVar.a) && this.b.equals(ysfVar.b) && this.c.equals(ysfVar.c) && this.g.equals(ysfVar.g) && this.d.equals(ysfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 120 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("CronetHttpClientConfig{cronetEngineProvider=");
        sb.append(valueOf);
        sb.append(", headerDecoratorProvider=");
        sb.append(valueOf2);
        sb.append(", uriRewriter=");
        sb.append(valueOf3);
        sb.append(", commonConfigs=");
        sb.append(valueOf4);
        sb.append(", httpClientConfig=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
