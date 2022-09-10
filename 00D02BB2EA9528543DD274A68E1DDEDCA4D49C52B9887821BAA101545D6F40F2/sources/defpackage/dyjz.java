package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyjz  reason: default package */
/* loaded from: classes6.dex */
public final class dyjz implements dykh {
    final /* synthetic */ dykb a;

    public dyjz(dykb dykbVar) {
        this.a = dykbVar;
    }

    @Override // defpackage.dykh
    public final void a(dyhw dyhwVar, byte[] bArr) {
        this.a.j.run();
        dykb dykbVar = this.a;
        if (dykbVar.q == null) {
            return;
        }
        dyjx dyjxVar = new dyjx(dykbVar);
        String str = this.a.d;
        dykb dykbVar2 = this.a;
        dyjv dyjvVar = (dyjv) dykbVar2.q;
        ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder = ((ExperimentalCronetEngine) dyjvVar.e).newBidirectionalStreamBuilder(str, dyjxVar, dykbVar2.g);
        if (dyjvVar.f) {
            int i = dyjvVar.g;
            if (!dyjv.a) {
                synchronized (dyjv.class) {
                    if (!dyjv.a) {
                        try {
                            dyjv.c = ExperimentalBidirectionalStream.Builder.class.getMethod("setTrafficStatsTag", Integer.TYPE);
                            dyjv.a = true;
                        } catch (NoSuchMethodException unused) {
                            dyjv.a = true;
                        }
                    }
                }
            }
            if (dyjv.c != null) {
                try {
                    dyjv.c.invoke(newBidirectionalStreamBuilder, Integer.valueOf(i));
                } catch (IllegalAccessException unused2) {
                    StringBuilder sb = new StringBuilder(44);
                    sb.append("Failed to set traffic stats tag: ");
                    sb.append(i);
                    sb.toString();
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause() == null ? e.getTargetException() : e.getCause());
                }
            }
        }
        if (dyjvVar.h) {
            int i2 = dyjvVar.i;
            if (!dyjv.b) {
                synchronized (dyjv.class) {
                    if (!dyjv.b) {
                        try {
                            dyjv.d = ExperimentalBidirectionalStream.Builder.class.getMethod("setTrafficStatsUid", Integer.TYPE);
                            dyjv.b = true;
                        } catch (NoSuchMethodException unused3) {
                            dyjv.b = true;
                        } catch (Throwable th) {
                            dyjv.b = true;
                            throw th;
                        }
                    }
                }
            }
            if (dyjv.d != null) {
                try {
                    dyjv.d.invoke(newBidirectionalStreamBuilder, Integer.valueOf(i2));
                } catch (IllegalAccessException unused4) {
                    StringBuilder sb2 = new StringBuilder(44);
                    sb2.append("Failed to set traffic stats uid: ");
                    sb2.append(i2);
                    sb2.toString();
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2.getCause() == null ? e2.getTargetException() : e2.getCause());
                }
            }
        }
        if (this.a.m) {
            newBidirectionalStreamBuilder.mo26delayRequestHeadersUntilFirstFlush(true);
        }
        dykb dykbVar3 = this.a;
        Object obj = dykbVar3.n;
        if (obj != null || dykbVar3.o != null) {
            if (obj != null) {
                dykb.p(newBidirectionalStreamBuilder, obj);
            }
            Collection<Object> collection = this.a.o;
            if (collection != null) {
                for (Object obj2 : collection) {
                    dykb.p(newBidirectionalStreamBuilder, obj2);
                }
            }
        }
        dykb dykbVar4 = this.a;
        newBidirectionalStreamBuilder.mo24addHeader(dyow.h.a, dykbVar4.e);
        newBidirectionalStreamBuilder.mo24addHeader(dyow.f.a, "application/grpc");
        newBidirectionalStreamBuilder.mo24addHeader("te", "trailers");
        byte[][] a = dyvo.a(dykbVar4.h);
        for (int i3 = 0; i3 < a.length; i3 += 2) {
            String str2 = new String(a[i3], Charset.forName("UTF-8"));
            if (!dyow.f.a.equalsIgnoreCase(str2) && !dyow.h.a.equalsIgnoreCase(str2) && !dyow.g.a.equalsIgnoreCase(str2)) {
                newBidirectionalStreamBuilder.mo24addHeader(str2, new String(a[i3 + 1], Charset.forName("UTF-8")));
            }
        }
        this.a.l = newBidirectionalStreamBuilder.mo25build();
        this.a.l.start();
    }

    @Override // defpackage.dykh
    public final void b(dyvs dyvsVar, boolean z, boolean z2, int i) {
        ByteBuffer byteBuffer;
        dyka dykaVar = this.a.p;
        int i2 = dyka.i;
        synchronized (dykaVar.a) {
            if (this.a.p.d) {
                return;
            }
            if (dyvsVar != null) {
                byteBuffer = ((dykf) dyvsVar).a;
                byteBuffer.flip();
            } else {
                byteBuffer = dykb.a;
            }
            this.a.x(byteBuffer.remaining());
            dykb dykbVar = this.a;
            dyka dykaVar2 = dykbVar.p;
            if (!dykaVar2.c) {
                dykaVar2.b.add(new dyjy(byteBuffer, z, z2));
            } else {
                dykbVar.q(byteBuffer, z, z2);
            }
        }
    }

    @Override // defpackage.dykh
    public final void c(dyjb dyjbVar) {
        dyka dykaVar = this.a.p;
        int i = dyka.i;
        synchronized (dykaVar.a) {
            dyka dykaVar2 = this.a.p;
            if (!dykaVar2.d) {
                dykaVar2.d = true;
                dykaVar2.e = dyjbVar;
                for (dyjy dyjyVar : dykaVar2.b) {
                    dyjyVar.a.clear();
                }
                dykaVar2.b.clear();
                dykb dykbVar = this.a;
                BidirectionalStream bidirectionalStream = dykbVar.l;
                if (bidirectionalStream != null) {
                    bidirectionalStream.cancel();
                } else {
                    dykbVar.i.b(dykbVar, dyjbVar);
                }
            }
        }
    }
}
