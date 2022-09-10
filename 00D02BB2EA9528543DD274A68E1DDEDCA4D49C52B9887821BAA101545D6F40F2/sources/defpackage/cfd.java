package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: PG */
/* renamed from: cfd  reason: default package */
/* loaded from: classes.dex */
public final class cfd implements buc<ByteBuffer, cfg> {
    private static final cfb a = new cfb();
    private static final cfc b = new cfc();
    private final Context c;
    private final List<btn> d;
    private final cfc e;
    private final cfe f;

    public cfd(Context context, List<btn> list, bxn bxnVar, bxl bxlVar) {
        cfc cfcVar = b;
        this.c = context.getApplicationContext();
        this.d = list;
        this.f = new cfe(bxnVar, bxlVar);
        this.e = cfcVar;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, bua buaVar) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!((Boolean) buaVar.c(cfp.b)).booleanValue()) {
            return (byteBuffer2 == null ? ImageHeaderParser$ImageType.UNKNOWN : btv.b(this.d, new btp(byteBuffer2))) == ImageHeaderParser$ImageType.GIF;
        }
        return false;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ bxd<cfg> b(ByteBuffer byteBuffer, int i, int i2, bua buaVar) {
        ByteBuffer byteBuffer2 = byteBuffer;
        bso a2 = this.e.a(byteBuffer2);
        try {
            SystemClock.elapsedRealtimeNanos();
            if (a2.b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            cfi cfiVar = null;
            int i3 = 0;
            if (!a2.f()) {
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < 6; i4++) {
                    sb.append((char) a2.d());
                }
                if (!sb.toString().startsWith("GIF")) {
                    a2.c.b = 1;
                } else {
                    a2.c.f = a2.e();
                    a2.c.g = a2.e();
                    int d = a2.d();
                    bsn bsnVar = a2.c;
                    bsnVar.h = (d & 128) != 0;
                    bsnVar.i = (int) Math.pow(2.0d, (d & 7) + 1);
                    a2.c.j = a2.d();
                    a2.c.k = a2.d();
                    if (a2.c.h && !a2.f()) {
                        bsn bsnVar2 = a2.c;
                        bsnVar2.a = a2.a(bsnVar2.i);
                        bsn bsnVar3 = a2.c;
                        bsnVar3.l = bsnVar3.a[bsnVar3.j];
                    }
                }
                if (!a2.f()) {
                    while (!a2.f()) {
                        int i5 = a2.c.c;
                        int d2 = a2.d();
                        if (d2 == 33) {
                            int d3 = a2.d();
                            if (d3 != 1) {
                                if (d3 == 249) {
                                    a2.c.d = new bsm();
                                    a2.d();
                                    int d4 = a2.d();
                                    bsm bsmVar = a2.c.d;
                                    int i6 = (d4 & 28) >> 2;
                                    bsmVar.g = i6;
                                    if (i6 == 0) {
                                        bsmVar.g = 1;
                                    }
                                    bsmVar.f = 1 == (d4 & 1);
                                    int e = a2.e();
                                    if (e < 2) {
                                        e = 10;
                                    }
                                    bsm bsmVar2 = a2.c.d;
                                    bsmVar2.i = e * 10;
                                    bsmVar2.h = a2.d();
                                    a2.d();
                                } else if (d3 != 254 && d3 == 255) {
                                    a2.c();
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i7 = 0; i7 < 11; i7++) {
                                        sb2.append((char) a2.a[i7]);
                                    }
                                    if (sb2.toString().equals("NETSCAPE2.0")) {
                                        do {
                                            a2.c();
                                            byte[] bArr = a2.a;
                                            if (bArr[0] == 1) {
                                                a2.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                            }
                                            if (a2.d > 0) {
                                            }
                                        } while (!a2.f());
                                    }
                                }
                            }
                            a2.b();
                        } else if (d2 == 44) {
                            bsn bsnVar4 = a2.c;
                            if (bsnVar4.d == null) {
                                bsnVar4.d = new bsm();
                            }
                            a2.c.d.a = a2.e();
                            a2.c.d.b = a2.e();
                            a2.c.d.c = a2.e();
                            a2.c.d.d = a2.e();
                            int d5 = a2.d();
                            int i8 = d5 & 128;
                            int pow = (int) Math.pow(2.0d, (d5 & 7) + 1);
                            bsm bsmVar3 = a2.c.d;
                            bsmVar3.e = (d5 & 64) != 0;
                            if (i8 != 0) {
                                bsmVar3.k = a2.a(pow);
                            } else {
                                bsmVar3.k = null;
                            }
                            a2.c.d.j = a2.b.position();
                            a2.d();
                            a2.b();
                            if (!a2.f()) {
                                bsn bsnVar5 = a2.c;
                                bsnVar5.c++;
                                bsnVar5.e.add(bsnVar5.d);
                            }
                        } else if (d2 == 59) {
                            break;
                        } else {
                            a2.c.b = 1;
                        }
                    }
                    bsn bsnVar6 = a2.c;
                    if (bsnVar6.c < 0) {
                        bsnVar6.b = 1;
                    }
                }
            }
            bsn bsnVar7 = a2.c;
            if (bsnVar7.c > 0 && bsnVar7.b == 0) {
                Bitmap.Config config = buaVar.c(cfp.a) == btk.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int min = Math.min(bsnVar7.g / i2, bsnVar7.f / i);
                if (min != 0) {
                    i3 = Integer.highestOneBit(min);
                }
                bsp bspVar = new bsp(this.f, bsnVar7, byteBuffer2, Math.max(1, i3));
                if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
                    String valueOf = String.valueOf(config);
                    String valueOf2 = String.valueOf(Bitmap.Config.ARGB_8888);
                    String valueOf3 = String.valueOf(Bitmap.Config.RGB_565);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
                    sb3.append("Unsupported format: ");
                    sb3.append(valueOf);
                    sb3.append(", must be one of ");
                    sb3.append(valueOf2);
                    sb3.append(" or ");
                    sb3.append(valueOf3);
                    throw new IllegalArgumentException(sb3.toString());
                }
                bspVar.i = config;
                bspVar.a();
                Bitmap b2 = bspVar.b();
                if (b2 != null) {
                    cfiVar = new cfi(new cfg(new cff(new cfn(brc.a(this.c), bspVar, i, i2, ccl.b, b2))));
                }
            }
            return cfiVar;
        } finally {
            this.e.b(a2);
        }
    }
}
