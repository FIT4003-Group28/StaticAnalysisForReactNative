package defpackage;

import com.google.cardboard.sdk.R;
/* compiled from: PG */
/* renamed from: amig  reason: default package */
/* loaded from: classes.dex */
public final class amig {
    public final String a;
    public final aoqu b;
    public final amie c;
    public final amuk d;
    public final vkt e;
    public final boolean f;
    public final ankw g;

    public amig() {
    }

    public amig(String str, aoqu aoquVar, amie amieVar, amuk amukVar, vkt vktVar, boolean z, ankw ankwVar) {
        this.a = str;
        this.b = aoquVar;
        this.c = amieVar;
        this.d = amukVar;
        this.e = vktVar;
        this.f = z;
        this.g = ankwVar;
    }

    public static amif a() {
        amif amifVar = new amif();
        amifVar.b = new amie(null);
        amifVar.d = vnh.a;
        amifVar.e = false;
        return amifVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amig) {
            amig amigVar = (amig) obj;
            if (this.a.equals(amigVar.a) && this.b.equals(amigVar.b) && this.c.equals(amigVar.c) && amxp.v(this.d, amigVar.d) && this.e.equals(amigVar.e) && this.f == amigVar.f) {
                ankw ankwVar = this.g;
                ankw ankwVar2 = amigVar.g;
                if (ankwVar != null ? ankwVar.equals(ankwVar2) : ankwVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        ankw ankwVar = this.g;
        return (hashCode ^ (ankwVar == null ? 0 : ankwVar.hashCode())) * 1000003;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        boolean z = this.f;
        String valueOf5 = String.valueOf(this.g);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowMinWidthMinor + length2 + length3 + length4 + length5 + length6 + "null".length());
        sb.append("ProtoDataStoreConfig{name=");
        sb.append(str);
        sb.append(", schema=");
        sb.append(valueOf);
        sb.append(", storage=");
        sb.append(valueOf2);
        sb.append(", migrations=");
        sb.append(valueOf3);
        sb.append(", handler=");
        sb.append(valueOf4);
        sb.append(", updateSequencingBugFix=");
        sb.append(z);
        sb.append(", ioExecutor=");
        sb.append(valueOf5);
        sb.append(", lamsConfig=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
