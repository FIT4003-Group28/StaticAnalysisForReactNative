package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: amqy  reason: default package */
/* loaded from: classes2.dex */
final class amqy extends amrc {
    private final aktc a;
    private final amrl b;
    private final amsb c;
    private final int d;
    private final dcdc<dmlo> e;

    public amqy(aktc aktcVar, amrl amrlVar, amsb amsbVar, int i, dcdc<dmlo> dcdcVar) {
        this.a = aktcVar;
        this.b = amrlVar;
        this.c = amsbVar;
        this.d = i;
        this.e = dcdcVar;
    }

    @Override // defpackage.amrc
    public final aktc a() {
        return this.a;
    }

    @Override // defpackage.amrc
    public final amrl b() {
        return this.b;
    }

    @Override // defpackage.amrc
    public final amsb c() {
        return this.c;
    }

    @Override // defpackage.amrc
    public final int d() {
        return this.d;
    }

    @Override // defpackage.amrc
    public final dcdc<dmlo> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amrc) {
            amrc amrcVar = (amrc) obj;
            if (this.a.equals(amrcVar.a()) && this.b.equals(amrcVar.b()) && this.c.equals(amrcVar.c()) && this.d == amrcVar.d() && dchl.m(this.e, amrcVar.e()) && amrcVar.f() == null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amrc
    @dzsi
    public final amra f() {
        return null;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_tooltipForegroundColor + length2 + length3 + length4 + "null".length());
        sb.append("CalloutManagerParameters{callout=");
        sb.append(valueOf);
        sb.append(", positioner=");
        sb.append(valueOf2);
        sb.append(", useCase=");
        sb.append(valueOf3);
        sb.append(", priority=");
        sb.append(i);
        sb.append(", supportedAnchors=");
        sb.append(valueOf4);
        sb.append(", calloutLogger=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
