package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cryf  reason: default package */
/* loaded from: classes5.dex */
public final class cryf extends crym {
    private final cryl a;
    private final float b;
    private final String c;
    private final long d;
    private final int e;

    public cryf(cryl crylVar, float f, String str, long j, int i) {
        this.a = crylVar;
        this.b = f;
        this.c = str;
        this.d = j;
        this.e = i;
    }

    @Override // defpackage.crym
    public final cryl a() {
        return this.a;
    }

    @Override // defpackage.crym
    public final float b() {
        return this.b;
    }

    @Override // defpackage.crym
    public final String c() {
        return this.c;
    }

    @Override // defpackage.crym
    public final long d() {
        return this.d;
    }

    @Override // defpackage.crym
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crym) {
            crym crymVar = (crym) obj;
            if (this.a.equals(crymVar.a()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(crymVar.b()) && this.c.equals(crymVar.c()) && this.d == crymVar.d() && this.e == crymVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int floatToIntBits = Float.floatToIntBits(this.b);
        int hashCode2 = this.c.hashCode();
        long j = this.d;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ floatToIntBits) * 1000003) ^ hashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        float f = this.b;
        String str = this.c;
        long j = this.d;
        int i = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowFixedWidthMinor + String.valueOf(str).length());
        sb.append("Suggestion{type=");
        sb.append(valueOf);
        sb.append(", confidence=");
        sb.append(f);
        sb.append(", text=");
        sb.append(str);
        sb.append(", recencyInMillis=");
        sb.append(j);
        sb.append(", sourceLengthInChars=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
