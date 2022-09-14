package c.d.j.n;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class v extends z {

    /* renamed from: c  reason: collision with root package name */
    private final AssetManager f3598c;

    public v(Executor executor, c.d.d.g.h hVar, AssetManager assetManager) {
        super(executor, hVar);
        this.f3598c = assetManager;
    }

    private static String b(c.d.j.o.c cVar) {
        return cVar.p().getPath().substring(1);
    }

    private int c(c.d.j.o.c cVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f3598c.openFd(b(cVar));
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (IOException unused2) {
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

    @Override // c.d.j.n.z
    protected c.d.j.k.d a(c.d.j.o.c cVar) {
        return b(this.f3598c.open(b(cVar), 2), c(cVar));
    }

    @Override // c.d.j.n.z
    protected String a() {
        return "LocalAssetFetchProducer";
    }
}
