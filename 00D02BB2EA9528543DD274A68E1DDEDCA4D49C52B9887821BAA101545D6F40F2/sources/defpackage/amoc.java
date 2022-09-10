package defpackage;
/* compiled from: PG */
/* renamed from: amoc  reason: default package */
/* loaded from: classes.dex */
final class amoc extends amob {
    private volatile transient int f;
    private volatile transient boolean g;
    private volatile transient String h;

    public amoc(akrw akrwVar, alyl alylVar, amzz amzzVar, alwn alwnVar, Integer num) {
        super(akrwVar, alylVar, amzzVar, alwnVar, num);
    }

    @Override // defpackage.amob
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amoc) || hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof amog)) {
                return false;
            }
            amog amogVar = (amog) obj;
            if (!this.a.equals(amogVar.a()) || !this.b.equals(amogVar.b()) || !this.c.equals(amogVar.c())) {
                return false;
            }
            alwn alwnVar = this.d;
            if (alwnVar == null) {
                if (amogVar.d() != null) {
                    return false;
                }
            } else if (!alwnVar.equals(amogVar.d())) {
                return false;
            }
            if (!this.e.equals(amogVar.e())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.amob
    public final int hashCode() {
        if (!this.g) {
            synchronized (this) {
                if (!this.g) {
                    int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
                    alwn alwnVar = this.d;
                    this.f = ((hashCode ^ (alwnVar == null ? 0 : alwnVar.hashCode())) * 1000003) ^ this.e.hashCode();
                    this.g = true;
                }
            }
        }
        return this.f;
    }

    @Override // defpackage.amob
    public final String toString() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    String valueOf = String.valueOf(this.a);
                    String valueOf2 = String.valueOf(this.b);
                    String valueOf3 = String.valueOf(this.c);
                    String valueOf4 = String.valueOf(this.d);
                    String valueOf5 = String.valueOf(this.e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
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
                    this.h = sb.toString();
                    if (this.h == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }
}
