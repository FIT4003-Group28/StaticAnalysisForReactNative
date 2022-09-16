package defpackage;

import java.io.IOException;
import java.io.StringWriter;
/* compiled from: PG */
/* renamed from: dgtc  reason: default package */
/* loaded from: classes6.dex */
public class dgtc {
    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final dgta e() {
        if (this instanceof dgta) {
            return (dgta) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public final dgth f() {
        if (this instanceof dgth) {
            return (dgth) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            dgxg dgxgVar = new dgxg(stringWriter);
            dgxgVar.c = true;
            dguy.b(this, dgxgVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
