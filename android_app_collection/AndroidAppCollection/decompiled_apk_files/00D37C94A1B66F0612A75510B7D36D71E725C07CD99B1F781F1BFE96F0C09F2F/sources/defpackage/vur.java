package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: vur  reason: default package */
/* loaded from: classes4.dex */
public final class vur implements Closeable {
    private final axje a;
    private final axjl b;
    private volatile boolean c;
    private final ArrayList d;

    vur() {
        this.c = false;
        this.d = new ArrayList();
        this.a = null;
        this.b = null;
        this.c = true;
    }

    public final cvx a() {
        cvx c;
        synchronized (this.d) {
            if (this.c) {
                throw new IOException("Unable to build container with closed resources");
            }
            c = this.b.c(this.a);
        }
        return c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (!this.c) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    try {
                        ((Closeable) it.next()).close();
                    } catch (IOException e) {
                        vqy.c("Exception while closing resource", e);
                    }
                }
                this.d.clear();
                this.c = true;
            }
        }
    }

    public vur(axje axjeVar, axjl axjlVar, List list) {
        this.c = false;
        this.d = new ArrayList();
        this.b = axjlVar;
        this.a = axjeVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Closeable closeable = (Closeable) it.next();
            closeable.getClass();
            this.d.add(closeable);
        }
    }
}
