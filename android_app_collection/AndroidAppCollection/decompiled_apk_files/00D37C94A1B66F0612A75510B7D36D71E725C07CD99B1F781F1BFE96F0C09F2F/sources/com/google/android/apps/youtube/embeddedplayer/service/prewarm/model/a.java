package com.google.android.apps.youtube.embeddedplayer.service.prewarm.model;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a {
    private Integer a;
    private String b;

    public final void b(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void c(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null videoId");
    }

    public final EmbedsPrewarmData a() {
        Integer num = this.a;
        if (num == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" playbackType");
            }
            if (this.b == null) {
                sb.append(" videoId");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_EmbedsPrewarmData(num.intValue(), this.b);
    }
}
