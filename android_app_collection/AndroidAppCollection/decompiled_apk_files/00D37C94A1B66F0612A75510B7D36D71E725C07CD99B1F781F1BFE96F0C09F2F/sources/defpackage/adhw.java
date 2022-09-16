package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.AutoValue_AppStatus;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import java.util.Map;
/* compiled from: PG */
/* renamed from: adhw  reason: default package */
/* loaded from: classes.dex */
public final class adhw {
    public Uri a;
    public ScreenId b;
    public String c;
    public ampq d;
    public adit e;
    private Integer f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Map j;

    public adhw() {
    }

    public adhw(byte[] bArr) {
        this.d = amon.a;
    }

    public final void b(Map map) {
        if (map != null) {
            this.j = map;
            return;
        }
        throw new NullPointerException("Null additionalData");
    }

    public final void c(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void e(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void f(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final AppStatus a() {
        Integer num = this.f;
        if (num == null || this.g == null || this.h == null || this.i == null || this.j == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" status");
            }
            if (this.g == null) {
                sb.append(" stopAllowed");
            }
            if (this.h == null) {
                sb.append(" inAppDial");
            }
            if (this.i == null) {
                sb.append(" castSupported");
            }
            if (this.j == null) {
                sb.append(" additionalData");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_AppStatus(num.intValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.a, this.b, this.e, this.c, this.j, this.d);
    }
}
