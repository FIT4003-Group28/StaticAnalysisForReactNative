package defpackage;

import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: vjk  reason: default package */
/* loaded from: classes4.dex */
public final class vjk {
    public OutputStream a;
    public vjv b;

    public final void a() {
        if (this.b == null) {
            throw new vjw("Cannot sync underlying stream");
        }
        this.a.flush();
        this.b.b();
    }
}
