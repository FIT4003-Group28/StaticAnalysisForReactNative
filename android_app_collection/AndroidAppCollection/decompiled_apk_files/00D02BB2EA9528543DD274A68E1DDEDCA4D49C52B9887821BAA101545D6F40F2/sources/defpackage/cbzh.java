package defpackage;

import android.text.TextPaint;
/* compiled from: PG */
/* renamed from: cbzh  reason: default package */
/* loaded from: classes4.dex */
public final class cbzh extends cbzm {
    public final CharSequence a;
    public final dbsg<CharSequence> b;
    public final TextPaint c;

    public cbzh(CharSequence charSequence, dbsg<CharSequence> dbsgVar, TextPaint textPaint) {
        if (charSequence != null) {
            this.a = charSequence;
            if (dbsgVar != null) {
                this.b = dbsgVar;
                if (textPaint != null) {
                    this.c = textPaint;
                    return;
                }
                throw new NullPointerException("Null paint");
            }
            throw new NullPointerException("Null textToTruncate");
        }
        throw new NullPointerException("Null fixedText");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cbzm
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.cbzm
    public final dbsg<CharSequence> b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cbzm
    public final TextPaint c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbzm) {
            cbzm cbzmVar = (cbzm) obj;
            if (this.a.equals(cbzmVar.a()) && this.b.equals(cbzmVar.b()) && this.c.equals(cbzmVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 52 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("EllipsizingText{fixedText=");
        sb.append(valueOf);
        sb.append(", textToTruncate=");
        sb.append(valueOf2);
        sb.append(", paint=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
