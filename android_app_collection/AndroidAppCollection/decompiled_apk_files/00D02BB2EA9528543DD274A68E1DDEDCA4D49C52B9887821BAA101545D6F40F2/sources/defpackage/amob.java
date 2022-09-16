package defpackage;
/* compiled from: PG */
/* renamed from: amob  reason: default package */
/* loaded from: classes.dex */
public class amob extends amog {
    public final akrw a;
    public final alyl b;
    public final amzz c;
    public final alwn d;
    public final Integer e;

    public amob(akrw akrwVar, alyl alylVar, amzz amzzVar, @dzsi alwn alwnVar, Integer num) {
        if (akrwVar != null) {
            this.a = akrwVar;
            if (alylVar != null) {
                this.b = alylVar;
                if (amzzVar != null) {
                    this.c = amzzVar;
                    this.d = alwnVar;
                    this.e = num;
                    return;
                }
                throw new NullPointerException("Null bitmask");
            }
            throw new NullPointerException("Null tileLayerState");
        }
        throw new NullPointerException("Null tileLayerId");
    }

    @Override // defpackage.amog
    public final akrw a() {
        return this.a;
    }

    @Override // defpackage.amog
    public final alyl b() {
        return this.b;
    }

    @Override // defpackage.amog
    public final amzz c() {
        return this.c;
    }

    @Override // defpackage.amog
    @dzsi
    public final alwn d() {
        return this.d;
    }

    @Override // defpackage.amog
    public final Integer e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        alwn alwnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof amog) {
            amog amogVar = (amog) obj;
            if (this.a.equals(amogVar.a()) && this.b.equals(amogVar.b()) && this.c.equals(amogVar.c()) && ((alwnVar = this.d) != null ? alwnVar.equals(amogVar.d()) : amogVar.d() == null) && this.e.equals(amogVar.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        alwn alwnVar = this.d;
        return ((hashCode ^ (alwnVar == null ? 0 : alwnVar.hashCode())) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 77 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("TileCacheKey{tileLayerId=");
        sb.append(valueOf);
        sb.append(", tileLayerState=");
        sb.append(valueOf2);
        sb.append(", bitmask=");
        sb.append(valueOf3);
        sb.append(", legend=");
        sb.append(valueOf4);
        sb.append(", glStateToken=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
