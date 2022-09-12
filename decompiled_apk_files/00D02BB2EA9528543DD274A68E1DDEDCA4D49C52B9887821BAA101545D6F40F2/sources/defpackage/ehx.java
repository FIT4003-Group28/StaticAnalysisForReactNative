package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: ehx  reason: default package */
/* loaded from: classes6.dex */
final class ehx {
    public acl a;
    public acl b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public ehx(acl aclVar, acl aclVar2, int i, int i2, int i3, int i4) {
        this.a = aclVar;
        this.b = aclVar2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearancePopupMenuHeader + String.valueOf(valueOf2).length());
        sb.append("ChangeInfo{oldHolder=");
        sb.append(valueOf);
        sb.append(", newHolder=");
        sb.append(valueOf2);
        sb.append(", fromX=");
        sb.append(i);
        sb.append(", fromY=");
        sb.append(i2);
        sb.append(", toX=");
        sb.append(i3);
        sb.append(", toY=");
        sb.append(i4);
        sb.append('}');
        return sb.toString();
    }
}
