package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmdy  reason: default package */
/* loaded from: classes5.dex */
public final class cmdy implements cmkg {
    private final cmkg a;
    private final int b;
    private final cmdx c;
    private final byte[] d;
    private int e;

    public cmdy(cmkg cmkgVar, int i, cmdx cmdxVar) {
        cmmn.a(i > 0);
        this.a = cmkgVar;
        this.b = i;
        this.c = cmdxVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.a.a(this.d, 0, 1) != -1) {
                int i5 = (this.d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int a = this.a.a(bArr2, i4, i6);
                        if (a != -1) {
                            i4 += a;
                            i6 -= a;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        cmdx cmdxVar = this.c;
                        cmnk cmnkVar = new cmnk(bArr2, i5);
                        cmew cmewVar = (cmew) cmdxVar;
                        long max = !cmewVar.m ? cmewVar.i : Math.max(cmewVar.n.w(), cmewVar.i);
                        int d = cmnkVar.d();
                        clvk clvkVar = cmewVar.l;
                        cmmn.f(clvkVar);
                        clvi.b(clvkVar, cmnkVar, d);
                        clvkVar.b(max, 1, d, 0, null);
                        cmewVar.m = true;
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int a2 = this.a.a(bArr, i, Math.min(i3, i2));
        if (a2 != -1) {
            this.e -= a2;
        }
        return a2;
    }

    @Override // defpackage.cmkg
    public final void b(cmlo cmloVar) {
        cmmn.f(cmloVar);
        this.a.b(cmloVar);
    }

    @Override // defpackage.cmkg
    public final long c(cmkj cmkjVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cmkg
    public final Uri d() {
        return this.a.d();
    }

    @Override // defpackage.cmkg
    public final Map<String, List<String>> e() {
        return this.a.e();
    }

    @Override // defpackage.cmkg
    public final void f() {
        throw new UnsupportedOperationException();
    }
}
