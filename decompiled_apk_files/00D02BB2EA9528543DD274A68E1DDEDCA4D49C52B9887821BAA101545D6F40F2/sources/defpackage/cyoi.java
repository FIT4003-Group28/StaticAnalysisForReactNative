package defpackage;

import com.google.android.libraries.social.populous.logging.AutoValue_LogEvent;
import com.google.android.libraries.social.populous.logging.LogEntity;
import com.google.android.libraries.social.populous.logging.LogEvent;
/* compiled from: PG */
/* renamed from: cyoi  reason: default package */
/* loaded from: classes5.dex */
public final class cyoi extends cypc {
    public Long a;
    public Long b;
    public Integer c;
    private Long d;
    private Long e;
    private Integer f;
    private dcdc<LogEntity> g;
    private Boolean h;
    private int i;

    @Override // defpackage.cypc
    public final void b(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.cypc
    public final void c(dcdc<LogEntity> dcdcVar) {
        if (dcdcVar != null) {
            this.g = dcdcVar;
            return;
        }
        throw new NullPointerException("Null logEntities");
    }

    @Override // defpackage.cypc
    public final void d(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.cypc
    public final void e(long j) {
        this.d = Long.valueOf(j);
    }

    @Override // defpackage.cypc
    public final void f(long j) {
        this.e = Long.valueOf(j);
    }

    @Override // defpackage.cypc
    public final void g(int i) {
        if (i != 0) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null eventType");
    }

    @Override // defpackage.cypc
    public final LogEvent a() {
        String str = this.i == 0 ? " eventType" : "";
        if (this.d == null) {
            str = str.concat(" selectSessionId");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" submitSessionId");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" queryLength");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" logEntities");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" hadDeviceContactsPermission");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_LogEvent(this.i, this.a, this.d.longValue(), this.e.longValue(), this.f.intValue(), this.g, this.b, this.h.booleanValue(), this.c);
    }
}
