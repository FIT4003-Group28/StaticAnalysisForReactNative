package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: dxeh  reason: default package */
/* loaded from: classes.dex */
public final class dxeh {
    public InputStream a = null;
    private boolean c = false;
    public boolean b = false;

    public final dxee a() {
        InputStream inputStream = this.a;
        if (inputStream == null) {
            throw new IllegalStateException("No input SVG provided");
        }
        dxee f = dxer.f(inputStream, null, null, this.c);
        if (this.b) {
            try {
                this.a.close();
            } catch (IOException e) {
                deki.b(e);
            }
        }
        return f;
    }

    public final void b() {
        this.c = true;
    }
}
