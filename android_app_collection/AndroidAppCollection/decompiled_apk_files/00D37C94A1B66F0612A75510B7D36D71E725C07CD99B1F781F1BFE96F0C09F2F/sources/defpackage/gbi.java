package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
/* compiled from: PG */
/* renamed from: gbi  reason: default package */
/* loaded from: classes3.dex */
public final class gbi {
    public PaneDescriptor a;
    private Integer b;
    private Boolean c;

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    public final gbj a() {
        Integer num = this.b;
        if (num == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" navigationType");
            }
            if (this.c == null) {
                sb.append(" clearHistory");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new gbj(this.a, num.intValue(), this.c.booleanValue());
    }
}
