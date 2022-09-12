package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
/* compiled from: PG */
/* renamed from: dykb  reason: default package */
/* loaded from: classes6.dex */
public final class dykb extends dykk {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);
    @Deprecated
    static final dyes<Object> b = dyes.a("cronet-annotation");
    static final dyes<Collection<Object>> c = dyes.a("cronet-annotations");
    private static volatile boolean u;
    private static volatile Method v;
    public final String d;
    public final String e;
    public final dyvi f;
    public final Executor g;
    public final dyhw h;
    public final dyke i;
    public final Runnable j;
    final boolean k;
    public BidirectionalStream l;
    public final boolean m;
    public final Object n;
    public final Collection<Object> o;
    public final dyka p;
    public dyju q;
    private final dyjz w;

    public dykb(String str, @dzsi String str2, Executor executor, dyhw dyhwVar, dyke dykeVar, Runnable runnable, Object obj, dyib<?, ?> dyibVar, dyvi dyviVar, dyet dyetVar, dyvr dyvrVar) {
        super(new dykg(), dyviVar, dyvrVar, dyhwVar, dyetVar);
        this.w = new dyjz(this);
        dbsk.t(str, "url");
        this.d = str;
        dbsk.t(str2, "userAgent");
        this.e = str2;
        dbsk.t(dyviVar, "statsTraceCtx");
        this.f = dyviVar;
        this.g = executor;
        dbsk.t(dyhwVar, "headers");
        this.h = dyhwVar;
        this.i = dykeVar;
        this.j = runnable;
        boolean z = false;
        this.k = false;
        this.m = dyibVar.a == dyhz.UNARY ? true : z;
        this.n = dyetVar.e(b);
        this.o = (Collection) dyetVar.e(c);
        this.p = new dyka(this, dyviVar, obj, dyvrVar);
        n();
    }

    public static dyet o(dyet dyetVar, Object obj) {
        ArrayList arrayList;
        dyes<Collection<Object>> dyesVar = c;
        Collection collection = (Collection) dyetVar.e(dyesVar);
        if (collection == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(collection);
        }
        arrayList.add(obj);
        return dyetVar.d(dyesVar, Collections.unmodifiableList(arrayList));
    }

    public static void p(ExperimentalBidirectionalStream.Builder builder, Object obj) {
        if (!u) {
            synchronized (dykb.class) {
                if (!u) {
                    try {
                        v = ExperimentalBidirectionalStream.Builder.class.getMethod("addRequestAnnotation", Object.class);
                        u = true;
                    } catch (NoSuchMethodException unused) {
                        u = true;
                    } catch (Throwable th) {
                        u = true;
                        throw th;
                    }
                }
            }
        }
        if (v != null) {
            try {
                v.invoke(builder, obj);
            } catch (IllegalAccessException unused2) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Failed to add request annotation: ");
                sb.append(valueOf);
                sb.toString();
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause() == null ? e.getTargetException() : e.getCause());
            }
        }
    }

    @Override // defpackage.dyls
    public final dyel f() {
        return dyel.b;
    }

    public final void q(ByteBuffer byteBuffer, boolean z, boolean z2) {
        BidirectionalStream bidirectionalStream = this.l;
        if (bidirectionalStream == null) {
            return;
        }
        bidirectionalStream.write(byteBuffer, z);
        if (!z2) {
            return;
        }
        this.l.flush();
    }

    public final void r(dyjb dyjbVar) {
        this.i.b(this, dyjbVar);
    }

    @Override // defpackage.dykk
    protected final /* bridge */ /* synthetic */ dykh s() {
        return this.w;
    }

    @Override // defpackage.dykk
    protected final /* bridge */ /* synthetic */ dykj t() {
        return this.p;
    }

    @Override // defpackage.dykk, defpackage.dykp
    protected final /* bridge */ /* synthetic */ dyko u() {
        return this.p;
    }
}
