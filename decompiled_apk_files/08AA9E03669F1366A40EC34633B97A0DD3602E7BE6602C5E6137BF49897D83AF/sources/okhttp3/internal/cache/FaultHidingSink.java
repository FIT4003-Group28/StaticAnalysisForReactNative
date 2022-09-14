package okhttp3.internal.cache;

import c.c;
import c.g;
import c.s;
import java.io.IOException;
/* loaded from: classes.dex */
class FaultHidingSink extends g {
    private boolean hasErrors;

    protected void onException(IOException iOException) {
    }

    public FaultHidingSink(s sVar) {
        super(sVar);
    }

    @Override // c.g, c.s
    public void write(c cVar, long j) {
        if (this.hasErrors) {
            cVar.i(j);
            return;
        }
        try {
            super.write(cVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }

    @Override // c.g, c.s, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }

    @Override // c.g, c.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }
}
