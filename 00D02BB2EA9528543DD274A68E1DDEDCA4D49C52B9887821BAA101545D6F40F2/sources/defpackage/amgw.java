package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: amgw  reason: default package */
/* loaded from: classes2.dex */
final class amgw extends amka {
    public final akzh a;
    public final float b;
    public final alwn c;
    public final amky d;
    public final boolean e;
    public final amld f;

    public amgw(akzh akzhVar, float f, alwn alwnVar, amky amkyVar, amld amldVar, boolean z) {
        this.a = akzhVar;
        this.b = f;
        if (alwnVar != null) {
            this.c = alwnVar;
            if (amkyVar != null) {
                this.d = amkyVar;
                this.f = amldVar;
                this.e = z;
                return;
            }
            throw new NullPointerException("Null theme");
        }
        throw new NullPointerException("Null legend");
    }

    @Override // defpackage.amka
    public final akzh a() {
        return this.a;
    }

    @Override // defpackage.amka
    public final float b() {
        return this.b;
    }

    @Override // defpackage.amka
    public final alwn c() {
        return this.c;
    }

    @Override // defpackage.amka
    public final amky d() {
        return this.d;
    }

    @Override // defpackage.amka
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amka) {
            amka amkaVar = (amka) obj;
            if (this.a.equals(amkaVar.a()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(amkaVar.b()) && this.c.equals(amkaVar.c()) && this.d.equals(amkaVar.d()) && this.f.equals(amkaVar.f()) && this.e == amkaVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amka
    public final amld f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        float f = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        boolean z = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_viewInflaterClass + length2 + length3 + String.valueOf(valueOf4).length());
        sb.append("PlacementContext{camera=");
        sb.append(valueOf);
        sb.append(", zoomFloat=");
        sb.append(f);
        sb.append(", legend=");
        sb.append(valueOf2);
        sb.append(", theme=");
        sb.append(valueOf3);
        sb.append(", collisionResolver=");
        sb.append(valueOf4);
        sb.append(", hasRenderingStarted=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
