package defpackage;

import android.content.Context;
import com.google.android.gms.net.GmsCoreCronetProvider;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: bufs  reason: default package */
/* loaded from: classes.dex */
public final class bufs extends bufr {
    public bufs(Context context, Context context2, btuh btuhVar, bubu bubuVar, btpa btpaVar, Executor executor, dxio<btup> dxioVar, dxio<bttx> dxioVar2, dxio<buft> dxioVar3, btyd btydVar, ckcw ckcwVar) {
        super(context, context2, btuhVar, bubuVar, btpaVar, executor, dxioVar, dxioVar2, dxioVar3, btydVar, ckcwVar);
        dbsk.l(true);
    }

    private final boolean g() {
        try {
            cotz.a(this.a);
            return true;
        } catch (cnni unused) {
            this.f.set(false);
            return false;
        } catch (cnnj e) {
            cnmq.a.b(this.a, e.a);
            this.f.set(false);
            return false;
        }
    }

    @Override // defpackage.bufr
    public final ExperimentalCronetEngine b() {
        g();
        return super.b();
    }

    @Override // defpackage.bufr
    public final ExperimentalCronetEngine c() {
        if (!g()) {
            bvoo.k(new RuntimeException("Failed to install the Cronet provider"));
        }
        return super.c();
    }

    @Override // defpackage.bufr
    protected final ExperimentalCronetEngine.Builder d() {
        try {
            return (ExperimentalCronetEngine.Builder) new GmsCoreCronetProvider(this.b).createBuilder();
        } catch (RuntimeException | UnsatisfiedLinkError | VerifyError e) {
            if (e instanceof UnsatisfiedLinkError) {
                ((ckco) this.e.a(ckip.an)).a(ckim.a(1));
            } else if (e instanceof RuntimeException) {
                ((ckco) this.e.a(ckip.an)).a(ckim.a(2));
            } else {
                ((ckco) this.e.a(ckip.an)).a(ckim.a(3));
            }
            return f();
        }
    }
}
