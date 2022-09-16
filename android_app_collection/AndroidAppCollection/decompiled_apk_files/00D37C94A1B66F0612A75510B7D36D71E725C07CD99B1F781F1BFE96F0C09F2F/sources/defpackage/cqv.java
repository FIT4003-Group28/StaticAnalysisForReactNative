package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqv  reason: default package */
/* loaded from: classes3.dex */
public final class cqv implements cie {
    private static final cqu a = new cqu();
    private final Context b;
    private final List c;
    private final cqu d;
    private final cqw e;

    public cqv(Context context, List list, cld cldVar, clb clbVar) {
        cqu cquVar = a;
        this.b = context.getApplicationContext();
        this.c = list;
        this.e = new cqw(cldVar, clbVar);
        this.d = cquVar;
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ cku a(Object obj, int i, int i2, cic cicVar) {
        cgt cgtVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        cgu a2 = this.d.a(byteBuffer);
        try {
            cuy.b();
            if (a2.b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            cra craVar = null;
            int i3 = 0;
            if (a2.e()) {
                cgtVar = a2.c;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < 6; i4++) {
                    sb.append((char) a2.a());
                }
                if (sb.toString().startsWith("GIF")) {
                    a2.c.f = a2.b();
                    a2.c.g = a2.b();
                    int a3 = a2.a();
                    cgt cgtVar2 = a2.c;
                    cgtVar2.h = (a3 & 128) != 0;
                    cgtVar2.i = (int) Math.pow(2.0d, (a3 & 7) + 1);
                    a2.c.j = a2.a();
                    a2.c.k = a2.a();
                    if (a2.c.h && !a2.e()) {
                        cgt cgtVar3 = a2.c;
                        cgtVar3.a = a2.f(cgtVar3.i);
                        cgt cgtVar4 = a2.c;
                        cgtVar4.l = cgtVar4.a[cgtVar4.j];
                    }
                } else {
                    a2.c.b = 1;
                }
                if (!a2.e()) {
                    while (!a2.e()) {
                        int i5 = a2.c.c;
                        int a4 = a2.a();
                        if (a4 == 33) {
                            int a5 = a2.a();
                            if (a5 == 1) {
                                a2.d();
                            } else if (a5 == 249) {
                                a2.c.d = new cgs();
                                a2.a();
                                int a6 = a2.a();
                                cgs cgsVar = a2.c.d;
                                int i6 = (a6 & 28) >> 2;
                                cgsVar.g = i6;
                                if (i6 == 0) {
                                    cgsVar.g = 1;
                                }
                                cgsVar.f = 1 == (a6 & 1);
                                int b = a2.b();
                                if (b < 2) {
                                    b = 10;
                                }
                                cgs cgsVar2 = a2.c.d;
                                cgsVar2.i = b * 10;
                                cgsVar2.h = a2.a();
                                a2.a();
                            } else if (a5 == 254) {
                                a2.d();
                            } else if (a5 == 255) {
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
                                    } while (!a2.e());
                                } else {
                                    a2.d();
                                }
                            } else {
                                a2.d();
                            }
                        } else if (a4 == 44) {
                            cgt cgtVar5 = a2.c;
                            if (cgtVar5.d == null) {
                                cgtVar5.d = new cgs();
                            }
                            a2.c.d.a = a2.b();
                            a2.c.d.b = a2.b();
                            a2.c.d.c = a2.b();
                            a2.c.d.d = a2.b();
                            int a7 = a2.a();
                            int i8 = a7 & 128;
                            int pow = (int) Math.pow(2.0d, (a7 & 7) + 1);
                            cgs cgsVar3 = a2.c.d;
                            cgsVar3.e = (a7 & 64) != 0;
                            if (i8 == 0) {
                                cgsVar3.k = null;
                            } else {
                                cgsVar3.k = a2.f(pow);
                            }
                            a2.c.d.j = a2.b.position();
                            a2.a();
                            a2.d();
                            if (!a2.e()) {
                                cgt cgtVar6 = a2.c;
                                cgtVar6.c++;
                                cgtVar6.e.add(cgtVar6.d);
                            }
                        } else if (a4 == 59) {
                            break;
                        } else {
                            a2.c.b = 1;
                        }
                    }
                    cgt cgtVar7 = a2.c;
                    if (cgtVar7.c < 0) {
                        cgtVar7.b = 1;
                    }
                }
                cgtVar = a2.c;
            }
            if (cgtVar.c > 0 && cgtVar.b == 0) {
                Bitmap.Config config = cicVar.b(crh.a) == chm.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int min = Math.min(cgtVar.g / i2, cgtVar.f / i);
                if (min != 0) {
                    i3 = Integer.highestOneBit(min);
                }
                cgv cgvVar = new cgv(this.e, cgtVar, byteBuffer, Math.max(1, i3));
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
                cgvVar.i = config;
                cgvVar.b();
                Bitmap a8 = cgvVar.a();
                if (a8 != null) {
                    craVar = new cra(new cqy(new cqx(new crf(cfk.b(this.b), cgvVar, i, i2, cou.b, a8))));
                }
            }
            return craVar;
        } finally {
            this.d.b(a2);
        }
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cic cicVar) {
        return !((Boolean) cicVar.b(crh.b)).booleanValue() && acz.j(this.c, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}
