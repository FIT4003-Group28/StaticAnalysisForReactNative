package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: srs  reason: default package */
/* loaded from: classes4.dex */
public final class srs {
    public String a;
    public String b;
    public String c;
    public String d;
    public awmt e;
    public awmt f;
    public tcs g;
    public DialogInterface.OnKeyListener h;
    public srt i;
    public Object j;
    public aoob k;
    public int l;
    private Integer m;

    public final void b(int i) {
        this.m = Integer.valueOf(i);
    }

    public final sru a() {
        Integer num;
        int i = this.l;
        if (i == 0 || (num = this.m) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.l == 0) {
                sb.append(" dialogType");
            }
            if (this.m == null) {
                sb.append(" requestedOrientation");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new sru(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, i, num.intValue(), this.i, this.j, this.k);
    }
}
