package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: duhy  reason: default package */
/* loaded from: classes6.dex */
public final class duhy {
    public final int a;
    public final duhx b;
    public final InputStream c;

    public duhy(int i, duhx duhxVar, InputStream inputStream) {
        this.a = i;
        this.b = duhxVar;
        this.c = inputStream;
    }

    public final String a() {
        String concat;
        String d = this.b.d("X-GUploader-UploadID");
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        if (d == null) {
            concat = "\n No upload id.";
        } else {
            concat = d.length() != 0 ? "\n Upload id: ".concat(d) : new String("\n Upload id: ");
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(concat).length());
        sb.append("HttpResponse:\n   ");
        sb.append(i);
        sb.append("  ");
        sb.append(valueOf);
        sb.append(concat);
        return sb.toString();
    }
}
