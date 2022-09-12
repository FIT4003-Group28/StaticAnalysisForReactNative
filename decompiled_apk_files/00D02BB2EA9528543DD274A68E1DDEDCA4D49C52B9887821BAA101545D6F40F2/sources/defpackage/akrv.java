package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: akrv  reason: default package */
/* loaded from: classes.dex */
public final class akrv extends akqn {
    private final aksb b;

    public akrv(aksb aksbVar) {
        this.b = aksbVar;
    }

    @Override // defpackage.akqn
    public final int b(dspd dspdVar) {
        return akqm.c(dspdVar.G(), this.b.d) / 2;
    }

    @Override // defpackage.akqn
    protected final int c(dspd dspdVar, int i) {
        return i == 0 ? b(dspdVar) : i;
    }

    @Override // defpackage.akqn
    public final void e(dspd dspdVar, int i, int i2, int[] iArr) {
        try {
            aksb aksbVar = this.b;
            int i3 = i2 + i2;
            int i4 = 2;
            int b = akqm.b(dspdVar, aksbVar.d, 2, iArr, i3);
            int i5 = aksbVar.e - 1;
            switch (i5) {
                case 1:
                    i4 = 0;
                    break;
                case 2:
                    break;
                case 3:
                    i4 = 1;
                    break;
                case 4:
                    i4 = -1;
                    break;
                case 5:
                    i4 = -2;
                    break;
                case 6:
                    i4 = -3;
                    break;
                default:
                    String valueOf = String.valueOf(Integer.toString(i5));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                    sb.append("Unknown vertex resolution: ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
            }
            int i6 = 1 << (12 - i4);
            int i7 = aksbVar.c + i4;
            int i8 = b + i3;
            while (i3 < i8) {
                int i9 = i3 + 1;
                int i10 = i6 - iArr[i9];
                if (i7 < 0) {
                    int i11 = -i7;
                    iArr[i3] = (iArr[i3] >> i11) + aksbVar.a;
                    iArr[i9] = (i10 >> i11) + aksbVar.b;
                } else {
                    iArr[i3] = (iArr[i3] << i7) + aksbVar.a;
                    iArr[i9] = (i10 << i7) + aksbVar.b;
                }
                i3 += 2;
            }
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.akqn
    public final void g(dspd dspdVar, int i, int i2, float[] fArr) {
        throw new UnsupportedOperationException("Tile-based geometry doesn't have float geometry.");
    }
}
