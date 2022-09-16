package defpackage;

import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: czio  reason: default package */
/* loaded from: classes5.dex */
public final class czio {
    public OutputStream a;
    public cziy b;

    public final void a() {
        if (this.b == null) {
            throw new cziz("Cannot sync underlying stream");
        }
        this.a.flush();
        this.b.b();
    }
}
