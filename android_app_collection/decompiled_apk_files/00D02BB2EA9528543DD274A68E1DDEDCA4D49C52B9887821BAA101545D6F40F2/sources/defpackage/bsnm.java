package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: bsnm  reason: default package */
/* loaded from: classes4.dex */
final class bsnm extends bsnp {
    private final int a;
    private final bssu b;
    private final brwk c;
    private final dbsg<ghs<brve>> d;

    public bsnm(int i, bssu bssuVar, brwk brwkVar, dbsg<ghs<brve>> dbsgVar) {
        this.a = i;
        this.b = bssuVar;
        if (brwkVar != null) {
            this.c = brwkVar;
            this.d = dbsgVar;
            return;
        }
        throw new NullPointerException("Null searchListPlaceTileViewModel");
    }

    @Override // defpackage.bsnp
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bsnp
    public final bssu b() {
        return this.b;
    }

    @Override // defpackage.bsnp
    public final brwk c() {
        return this.c;
    }

    @Override // defpackage.bsnp
    public final dbsg<ghs<brve>> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsnp) {
            bsnp bsnpVar = (bsnp) obj;
            if (this.a == bsnpVar.a() && this.b.equals(bsnpVar.b()) && this.c.equals(bsnpVar.c()) && this.d.equals(bsnpVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowActionBar + length2 + String.valueOf(valueOf3).length());
        sb.append("TraversalCardCreatedEvent{traversalCardIndex=");
        sb.append(i);
        sb.append(", searchListViewModel=");
        sb.append(valueOf);
        sb.append(", searchListPlaceTileViewModel=");
        sb.append(valueOf2);
        sb.append(", card=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
