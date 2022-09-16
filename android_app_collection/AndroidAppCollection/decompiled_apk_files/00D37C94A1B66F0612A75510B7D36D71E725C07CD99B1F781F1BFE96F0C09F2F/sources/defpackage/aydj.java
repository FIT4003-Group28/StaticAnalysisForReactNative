package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
/* compiled from: PG */
/* renamed from: aydj  reason: default package */
/* loaded from: classes2.dex */
public final class aydj extends aydp {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);
    @Deprecated
    static final axyc b = axyc.a("cronet-annotation");
    static final axyc c = axyc.a("cronet-annotations");
    private static volatile boolean r;
    private static volatile Method s;
    public final String d;
    public final String e;
    public final aymk f;
    public final Executor g;
    public final ayat h;
    public final aydm i;
    public final Runnable j;
    public BidirectionalStream k;
    public final boolean l;
    public final Object m;
    public final Collection n;
    public aydf o;
    public final ayhi p;
    private final aydi t;

    public aydj(String str, String str2, Executor executor, ayat ayatVar, aydm aydmVar, Runnable runnable, Object obj, int i, ayax ayaxVar, aymk aymkVar, axyd axydVar, aymt aymtVar) {
        super(aymkVar, ayatVar, axydVar);
        this.t = new aydi(this);
        str.getClass();
        this.d = str;
        str2.getClass();
        this.e = str2;
        this.f = aymkVar;
        this.g = executor;
        this.h = ayatVar;
        this.i = aydmVar;
        this.j = runnable;
        this.l = ayaxVar.a == ayaw.UNARY;
        this.m = axydVar.e(b);
        this.n = (Collection) axydVar.e(c);
        this.p = new ayhi(this, i, aymkVar, obj, aymtVar);
        f();
    }

    public static void q(ExperimentalBidirectionalStream.Builder builder, Object obj) {
        if (!r) {
            synchronized (aydj.class) {
                if (!r) {
                    try {
                        s = ExperimentalBidirectionalStream.Builder.class.getMethod("addRequestAnnotation", Object.class);
                        r = true;
                    } catch (NoSuchMethodException e) {
                        Log.w("grpc-java-cronet", "Failed to load method ExperimentalBidirectionalStream.Builder.addRequestAnnotation", e);
                        r = true;
                    }
                }
            }
        }
        if (s != null) {
            try {
                s.invoke(builder, obj);
            } catch (IllegalAccessException e2) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Failed to add request annotation: ");
                sb.append(valueOf);
                Log.w("grpc-java-cronet", sb.toString(), e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause() == null ? e3.getTargetException() : e3.getCause());
            }
        }
    }

    @Override // defpackage.ayeo
    public final axyb a() {
        return axyb.a;
    }

    @Override // defpackage.aydp, defpackage.aydu
    public final /* bridge */ /* synthetic */ aydt p() {
        return this.p;
    }

    public final void r(Status status) {
        this.i.a(this, status);
    }

    public final void s(ByteBuffer byteBuffer, boolean z, boolean z2) {
        BidirectionalStream bidirectionalStream = this.k;
        if (bidirectionalStream == null) {
            return;
        }
        bidirectionalStream.write(byteBuffer, z);
        if (!z2) {
            return;
        }
        this.k.flush();
    }

    @Override // defpackage.aydp
    protected final /* bridge */ /* synthetic */ aydt t() {
        return this.p;
    }

    @Override // defpackage.aydp
    protected final /* bridge */ /* synthetic */ aydi u() {
        return this.t;
    }
}
