package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: buin  reason: default package */
/* loaded from: classes4.dex */
final class buin {
    public final btzu a;
    final /* synthetic */ buip b;
    private final dssr c;

    public buin(buip buipVar, btzu btzuVar, dssr dssrVar) {
        this.b = buipVar;
        this.a = btzuVar;
        this.c = dssrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final dssj a(buio buioVar) {
        ByteBuffer byteBuffer;
        String valueOf = String.valueOf(this.b.j);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("GmmServerResponseReader readResponseBody ");
        sb.append(valueOf);
        sb.toString();
        try {
            ByteArrayOutputStream byteArrayOutputStream = buioVar.b;
            if (byteArrayOutputStream != null) {
                byteBuffer = ByteBuffer.allocate(byteArrayOutputStream.size());
                byteBuffer.put(ByteBuffer.wrap(buioVar.b.toByteArray()));
                byteBuffer.flip();
            } else {
                ByteBuffer byteBuffer2 = buioVar.a;
                if (byteBuffer2 != null) {
                    byteBuffer2.flip();
                    byteBuffer = buioVar.a;
                } else {
                    throw new NullPointerException("Neither the ByteBuffer nor the ByteArrayOutputStreamis non-null!");
                }
            }
            int position = byteBuffer.position();
            if (btut.b(byteBuffer, this.b.e) != 24) {
                throw new btzz(btzy.f);
            }
            if (dunt.b(btut.c(byteBuffer)) != dunt.CLIENT_PROPERTIES_2_REQUEST) {
                this.b.e.c(byteBuffer.position() - position);
                throw new btzz(btzy.g);
            }
            btto a = this.b.d.a();
            boolean z = this.b.k;
            duni duniVar = (duni) btut.a(byteBuffer, (dssr) duni.h.cu(7));
            if (duniVar != null) {
                synchronized (a.b) {
                    if ((duniVar.a & 1) != 0) {
                        a.e(duniVar.b);
                    }
                    if ((duniVar.a & 2) != 0) {
                        a.f(duniVar.c);
                    }
                    if (!z) {
                        if ((duniVar.a & 16) != 0) {
                            a.a.ac(bvjk.bt, duniVar.e);
                        }
                        if ((duniVar.a & 8) != 0) {
                            a.g(duniVar.d);
                        } else if (a.d) {
                            Thread.currentThread().getName();
                            synchronized (a.b) {
                                dune duneVar = a.b;
                                if (duneVar.c) {
                                    duneVar.bF();
                                    duneVar.c = false;
                                }
                                dung dungVar = (dung) duneVar.b;
                                dung dungVar2 = dung.R;
                                dungVar.a &= -4097;
                                dungVar.k = dung.R.k;
                            }
                            a.a.P(bvjk.br);
                            a.d = false;
                        }
                    }
                }
            }
            this.b.e.c(byteBuffer.position() - position);
            if (duniVar == null) {
                throw new btzz(btzy.g);
            }
            if (duniVar.f.size() != 2) {
                throw new btzz(btzy.c.c("Wrong number of status in ClientProperties"));
            }
            this.a.j = Long.valueOf(duniVar.g);
            int i = duniVar.f.get(1).b;
            if (i != 0) {
                throw new btzz(bvgo.a(i, null).c("Found individual request error status in ClientProperties."));
            }
            this.b.e.a(byteBuffer.position());
            dunt b = dunt.b(btut.c(byteBuffer));
            buip buipVar = this.b;
            if (b != buipVar.j) {
                throw new btzz(btzy.g);
            }
            ckcv e = buipVar.g.e();
            dssj a2 = btut.a(byteBuffer, this.c);
            if (a2 instanceof dwbc) {
                e.a((ckcr) this.b.g.a(ckeq.u));
            }
            this.b.e.c(byteBuffer.position());
            this.a.d(this.b.f.e());
            this.b.e.d();
            this.b.e.d();
            return a2;
        } catch (BufferUnderflowException e2) {
            throw new btzz(btzy.c.b(e2));
        }
    }
}
