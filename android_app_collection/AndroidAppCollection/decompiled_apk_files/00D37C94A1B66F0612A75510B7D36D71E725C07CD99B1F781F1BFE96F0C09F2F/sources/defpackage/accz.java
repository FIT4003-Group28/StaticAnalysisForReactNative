package defpackage;

import android.util.Log;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: accz  reason: default package */
/* loaded from: classes.dex */
public final class accz implements Runnable {
    final /* synthetic */ acdh a;

    public accz(acdh acdhVar) {
        this.a = acdhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            acdh acdhVar = this.a;
            while (!acdhVar.c) {
                byte a = acdhVar.a();
                int i = (a >> 6) & 3;
                int i2 = a & 63;
                int i3 = acdi.a;
                if (i2 == 0) {
                    i2 = acdi.a(acdhVar.a());
                } else if (i2 == 1) {
                    i2 = acdi.a(acdhVar.a()) + (acdhVar.a() * 256);
                }
                acde acdeVar = (acde) acdhVar.d.get(i2);
                if (acdeVar == null) {
                    acdeVar = new acde();
                    acdeVar.a = i2;
                    acdeVar.d = -1;
                    acdeVar.c = -1;
                    acdeVar.h = -1L;
                    acdeVar.e = -1;
                    acdeVar.b = -1;
                    acdhVar.d.put(i2, acdeVar);
                }
                if (i == 0) {
                    acdhVar.k(acdhVar.a, 0, 11);
                    int b = acdi.b(acdhVar.a, 0);
                    if (acdi.c(b)) {
                        b = acdhVar.d();
                    }
                    acdeVar.h = b;
                    acdeVar.e = 0;
                    acdeVar.b = acdi.b(acdhVar.a, 3);
                    acdeVar.c = acdhVar.a.get(6) & 255;
                    acdeVar.d = (acdhVar.a.get(7) & 255) | ((acdhVar.a.get(8) & 255) << 8) | ((acdhVar.a.get(9) & 255) << 16) | (acdhVar.a.get(10) << 24);
                } else if (i == 1) {
                    acdhVar.k(acdhVar.a, 0, 7);
                    if (acdeVar.d < 0) {
                        throw new ProtocolException("Missing message stream ID from earlier chunk");
                    }
                    if (acdeVar.h < 0) {
                        throw new ProtocolException("Missing timestamp from earlier chunk");
                    }
                    int b2 = acdi.b(acdhVar.a, 0);
                    if (acdi.c(b2)) {
                        b2 = acdhVar.d();
                    }
                    acdeVar.e = b2;
                    acdeVar.h += b2;
                    acdeVar.b = acdi.b(acdhVar.a, 3);
                    acdeVar.c = acdhVar.a.get(6) & 255;
                } else if (i == 2) {
                    acdhVar.k(acdhVar.a, 0, 3);
                    if (acdeVar.d < 0) {
                        throw new ProtocolException("Missing message stream ID from earlier chunk");
                    }
                    if (acdeVar.c < 0) {
                        throw new ProtocolException("Missing message type ID from earlier chunk");
                    }
                    if (acdeVar.h < 0) {
                        throw new ProtocolException("Missing timestamp from earlier chunk");
                    }
                    if (acdeVar.b < 0) {
                        throw new ProtocolException("Missing length from earlier chunk");
                    }
                    int b3 = acdi.b(acdhVar.a, 0);
                    acdeVar.e = b3;
                    acdeVar.h += b3;
                } else if (acdeVar.d < 0) {
                    throw new ProtocolException("Missing message stream ID from earlier chunk");
                } else {
                    if (acdeVar.c < 0) {
                        throw new ProtocolException("Missing message type ID from earlier chunk");
                    }
                    long j = acdeVar.h;
                    if (j < 0) {
                        throw new ProtocolException("Missing timestamp from earlier chunk");
                    }
                    int i4 = acdeVar.e;
                    if (i4 < 0) {
                        throw new ProtocolException("Missing timestamp delta from earlier chunk");
                    }
                    if (acdeVar.b < 0) {
                        throw new ProtocolException("Missing length from earlier chunk");
                    }
                    acdeVar.h = j + i4;
                }
                int i5 = 5;
                if (acdeVar.f) {
                    i5 = acdhVar.b(acdeVar);
                } else if (acdeVar.a == 2 && acdeVar.d == 0) {
                    int i6 = acdeVar.c;
                    if (i6 == 1) {
                        int i7 = acdeVar.b;
                        if (i7 != 4) {
                            StringBuilder sb = new StringBuilder(54);
                            sb.append("Invalid message length for set chunk size: ");
                            sb.append(i7);
                            throw new ProtocolException(sb.toString());
                        }
                        int d = acdhVar.d();
                        acdhVar.e = d;
                        if (!acdi.d(d)) {
                            int i8 = acdhVar.e;
                            StringBuilder sb2 = new StringBuilder(31);
                            sb2.append("Invalid chunk size: ");
                            sb2.append(i8);
                            throw new ProtocolException(sb2.toString());
                        }
                        acdhVar.f = ByteBuffer.allocate(acdhVar.e);
                    } else if (i6 == 2) {
                        int i9 = acdeVar.b;
                        if (i9 != 4) {
                            StringBuilder sb3 = new StringBuilder(45);
                            sb3.append("Invalid message length for abort: ");
                            sb3.append(i9);
                            throw new ProtocolException(sb3.toString());
                        }
                        acde acdeVar2 = (acde) acdhVar.d.get(acdhVar.d());
                        if (acdeVar2 == null) {
                            Log.e("RtmpInputStream", "Ignoring request to abort unrecognized message");
                        } else {
                            acdeVar2.f = true;
                        }
                    } else if (i6 == 3) {
                        int i10 = acdeVar.b;
                        if (i10 != 4) {
                            StringBuilder sb4 = new StringBuilder(43);
                            sb4.append("Invalid message length for ack: ");
                            sb4.append(i10);
                            throw new ProtocolException(sb4.toString());
                        }
                        acdhVar.i(acdhVar.d());
                    } else if (i6 == 5) {
                        int i11 = acdeVar.b;
                        if (i11 != 4) {
                            StringBuilder sb5 = new StringBuilder(55);
                            sb5.append("Invalid message length for window ack size: ");
                            sb5.append(i11);
                            throw new ProtocolException(sb5.toString());
                        }
                        acdhVar.j = acdhVar.d();
                    } else if (i6 != 6) {
                        StringBuilder sb6 = new StringBuilder(47);
                        sb6.append("Skipping unrecognized message type: ");
                        sb6.append(i6);
                        Log.e("RtmpInputStream", sb6.toString());
                        i5 = acdhVar.b(acdeVar);
                    } else {
                        int i12 = acdeVar.b;
                        if (i12 != 5) {
                            StringBuilder sb7 = new StringBuilder(58);
                            sb7.append("Invalid message length for set peer bandwidth: ");
                            sb7.append(i12);
                            throw new ProtocolException(sb7.toString());
                        }
                        acdhVar.j(acdhVar.d(), acdhVar.a());
                    }
                    i5 = 4;
                } else {
                    int i13 = acdeVar.c;
                    if (i13 == 20) {
                        i5 = acdhVar.c(acdeVar);
                    } else {
                        StringBuilder sb8 = new StringBuilder(43);
                        sb8.append("Skipping unknown message: type= ");
                        sb8.append(i13);
                        Log.e("RtmpInputStream", sb8.toString());
                        i5 = acdhVar.b(acdeVar);
                    }
                }
                acdhVar.m(i5);
            }
            synchronized (this.a.k) {
                this.a.b = null;
            }
        } catch (Throwable th) {
            try {
                if (!this.a.c) {
                    Log.e("RtmpInputStream", "Unexpected throwable in reader loop", th);
                    this.a.h(th);
                }
                synchronized (this.a.k) {
                    this.a.b = null;
                }
            } catch (Throwable th2) {
                synchronized (this.a.k) {
                    this.a.b = null;
                    throw th2;
                }
            }
        }
    }
}
