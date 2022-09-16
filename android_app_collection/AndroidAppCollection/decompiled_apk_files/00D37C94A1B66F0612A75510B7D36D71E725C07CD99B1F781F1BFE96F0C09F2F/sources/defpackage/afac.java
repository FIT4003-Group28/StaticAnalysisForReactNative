package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
/* compiled from: PG */
/* renamed from: afac  reason: default package */
/* loaded from: classes.dex */
public final class afac extends afad {
    public final int a;
    public final String b;
    public final int c;
    private final Format d;
    private volatile transient TrackGroup e;
    private volatile transient pvf f;

    public afac(int i, int i2, Format format, String str) {
        if (i != 0) {
            this.c = i;
            this.a = i2;
            this.d = format;
            this.b = str;
            return;
        }
        throw new NullPointerException("Null trackRendererType");
    }

    @Override // defpackage.afad
    public final int a() {
        return this.a;
    }

    @Override // defpackage.afad
    public final Format b() {
        return this.d;
    }

    @Override // defpackage.afad
    public final String c() {
        return this.b;
    }

    @Override // defpackage.afad
    public final int d() {
        return this.c;
    }

    @Override // defpackage.afad
    public final TrackGroup e() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = new TrackGroup(this.d);
                    if (this.e == null) {
                        throw new NullPointerException("trackGroup() cannot return null");
                    }
                }
            }
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof afad) {
            afad afadVar = (afad) obj;
            if (this.c == afadVar.d() && this.a == afadVar.a() && this.d.equals(afadVar.b()) && ((str = this.b) != null ? str.equals(afadVar.c()) : afadVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.afad
    public final pvf f() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    this.f = new pvg(e());
                    if (this.f == null) {
                        throw new NullPointerException("trackSelection() cannot return null");
                    }
                }
            }
        }
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (((((this.c ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String a = afmg.a(this.c);
        int i = this.a;
        String valueOf = String.valueOf(this.d);
        String str = this.b;
        int length = a.length();
        StringBuilder sb = new StringBuilder(length + 94 + String.valueOf(valueOf).length() + String.valueOf(str).length());
        sb.append("FormatAndRendererInformation{trackRendererType=");
        sb.append(a);
        sb.append(", rendererIndex=");
        sb.append(i);
        sb.append(", format=");
        sb.append(valueOf);
        sb.append(", trackId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
