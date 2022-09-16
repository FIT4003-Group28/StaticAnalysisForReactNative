package com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a {
    public String a;
    public String b;
    private Integer c;
    private aoob d;

    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void c(aoob aoobVar) {
        if (aoobVar != null) {
            this.d = aoobVar;
            return;
        }
        throw new NullPointerException("Null trackingParams");
    }

    public final SubscribeButtonData a() {
        Integer num = this.c;
        if (num == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" state");
            }
            if (this.d == null) {
                sb.append(" trackingParams");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_SubscribeButtonData(num.intValue(), this.a, this.b, this.d);
    }
}
