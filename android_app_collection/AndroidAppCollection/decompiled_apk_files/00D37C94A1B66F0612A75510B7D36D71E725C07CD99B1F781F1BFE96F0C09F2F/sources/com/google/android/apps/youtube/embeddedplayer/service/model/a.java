package com.google.android.apps.youtube.embeddedplayer.service.model;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a {
    public String a;
    private Integer b;
    private Integer c;

    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    public final AdEventData a() {
        Integer num = this.b;
        if (num == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" adEventType");
            }
            if (this.c == null) {
                sb.append(" adBreakType");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_AdEventData(num.intValue(), this.c.intValue(), this.a);
    }
}
