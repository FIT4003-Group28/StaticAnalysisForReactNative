package c.d.j.n;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class b0 extends z {

    /* renamed from: c  reason: collision with root package name */
    private final Resources f3396c;

    public b0(Executor executor, c.d.d.g.h hVar, Resources resources) {
        super(executor, hVar);
        this.f3396c = resources;
    }

    private int b(c.d.j.o.c cVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f3396c.openRawResourceFd(c(cVar));
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private static int c(c.d.j.o.c cVar) {
        return Integer.parseInt(cVar.p().getPath().substring(1));
    }

    @Override // c.d.j.n.z
    protected c.d.j.k.d a(c.d.j.o.c cVar) {
        return b(this.f3396c.openRawResource(c(cVar)), b(cVar));
    }

    @Override // c.d.j.n.z
    protected String a() {
        return "LocalResourceFetchProducer";
    }
}
