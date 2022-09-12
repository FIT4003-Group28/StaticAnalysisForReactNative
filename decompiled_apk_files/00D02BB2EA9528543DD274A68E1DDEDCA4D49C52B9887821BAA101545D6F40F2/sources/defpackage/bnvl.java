package defpackage;

import android.graphics.Bitmap;
import android.opengl.ETC1Util;
import android.opengl.GLUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bnvl  reason: default package */
/* loaded from: classes.dex */
public class bnvl {
    public final String a;
    @dzsi
    public bntv b;
    public final int f;
    @dzsi
    private bntb g;
    private final int i;
    bntc c = bntc.a;
    private int h = 0;
    public final bnvq d = new bnvq();
    public long e = -9223372036854775807L;

    public bnvl(String str, @dzsi bntv bntvVar, int i, int i2) {
        this.b = null;
        this.a = str;
        this.b = bntvVar;
        this.i = i;
        if (bntvVar == null || bntvVar.j) {
            this.f = i2;
        } else {
            this.f = 1;
        }
    }

    public final void b(bntv bntvVar) {
        if (!c()) {
            this.b = bntvVar;
            return;
        }
        throw new RuntimeException("Must be called BEFORE set live");
    }

    public final boolean c() {
        return this.h > 0;
    }

    public final void d(bntb bntbVar) {
        int i;
        int i2 = this.h + 1;
        this.h = i2;
        if (i2 == 1) {
            bntc f = bntbVar.f(this.a);
            this.c = f;
            bntv bntvVar = this.b;
            if (bntvVar != null) {
                int i3 = this.i;
                int i4 = this.f;
                bnrd bnrdVar = bntvVar.d;
                if (bnrdVar != null) {
                    bntvVar.a = bnrdVar.a();
                } else {
                    bnrt bnrtVar = bntvVar.k;
                    if (bnrtVar != null) {
                        bnru bnruVar = bnrtVar.a;
                        bnrtVar.a = null;
                        bntvVar.c = bnruVar;
                    }
                }
                Bitmap bitmap = bntvVar.a;
                if (bitmap != null) {
                    bntc bntcVar = bntbVar.l[0];
                    bntbVar.D(1, f);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    bntbVar.G(i3, i4);
                    bntbVar.D(1, bntcVar);
                    f.e = bitmap.getWidth() * bitmap.getHeight() * 4;
                    bnrd bnrdVar2 = bntvVar.d;
                    if (bnrdVar2 != null) {
                        bnrdVar2.c();
                        bntvVar.a = null;
                    }
                } else {
                    byte[] bArr = bntvVar.b;
                    if (bArr != null) {
                        int i5 = bntvVar.e;
                        if (i5 == 1) {
                            i = 6409;
                        } else if (i5 == 2) {
                            i = 6410;
                        } else if (i5 == 3) {
                            i = 6407;
                        } else if (i5 != 4) {
                            throw new IllegalArgumentException("Bad number of channels in ImageData buffer");
                        } else {
                            i = 6408;
                        }
                        bntbVar.E(f, i, bntvVar.h, bntvVar.i, i3, i4, bntbVar.H(bArr, bArr.length));
                    } else {
                        bnru bnruVar2 = bntvVar.c;
                        if (bnruVar2 != null) {
                            byte[] bArr2 = bnruVar2.c;
                            bntc bntcVar2 = bntbVar.l[0];
                            bntbVar.D(1, f);
                            try {
                                ETC1Util.loadTexture(3553, 0, 0, 6408, 33635, new ByteArrayInputStream(bArr2));
                            } catch (IOException e) {
                                bvoo.j(e);
                            }
                            bntbVar.G(i3, i4);
                            bntbVar.D(1, bntcVar2);
                            f.e = bArr2.length;
                            bntvVar.c = null;
                        } else {
                            bntbVar.F(f, bntvVar.f, bntvVar.g, i3, i4);
                        }
                    }
                }
            }
            this.g = bntbVar;
        }
    }

    public final void e(boolean z) {
        dbsk.l(this.h > 0);
        int i = this.h - 1;
        this.h = i;
        if (i != 0 || z) {
            return;
        }
        bntb bntbVar = this.g;
        dbsk.s(bntbVar);
        bntbVar.g(this.c);
    }
}
