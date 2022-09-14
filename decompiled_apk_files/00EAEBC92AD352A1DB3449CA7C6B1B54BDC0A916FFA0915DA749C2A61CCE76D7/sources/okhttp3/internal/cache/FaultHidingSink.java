package okhttp3.internal.cache;

import h.c;
import h.g;
import h.u;
import java.io.IOException;
/* loaded from: classes.dex */
class FaultHidingSink extends g {
    private boolean hasErrors;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FaultHidingSink(u uVar) {
        super(uVar);
    }

    @Override // h.g, h.u, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e2) {
            this.hasErrors = true;
            onException(e2);
        }
    }

    @Override // h.g, h.u, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e2) {
            this.hasErrors = true;
            onException(e2);
        }
    }

    protected void onException(IOException iOException) {
    }

    @Override // h.g, h.u
    public void write(c cVar, long j) {
        if (this.hasErrors) {
            cVar.skip(j);
            return;
        }
        try {
            super.write(cVar, j);
        } catch (IOException e2) {
            this.hasErrors = true;
            onException(e2);
        }
    }
}
