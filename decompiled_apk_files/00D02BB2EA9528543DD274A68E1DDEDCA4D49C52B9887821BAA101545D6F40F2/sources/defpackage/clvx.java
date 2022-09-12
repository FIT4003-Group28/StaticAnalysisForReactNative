package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: clvx  reason: default package */
/* loaded from: classes5.dex */
final class clvx extends clwc {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int e;

    public clvx(clvk clvkVar) {
        super(clvkVar);
    }

    @Override // defpackage.clwc
    protected final boolean a(cmnk cmnkVar) {
        if (!this.b) {
            int l = cmnkVar.l();
            int i = l >> 4;
            this.e = i;
            if (i == 2) {
                int i2 = a[(l >> 2) & 3];
                clnf clnfVar = new clnf();
                clnfVar.k = "audio/mpeg";
                clnfVar.x = 1;
                clnfVar.y = i2;
                this.d.a(clnfVar.a());
                this.c = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                clnf clnfVar2 = new clnf();
                clnfVar2.k = str;
                clnfVar2.x = 1;
                clnfVar2.y = 8000;
                this.d.a(clnfVar2.a());
                this.c = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new clwb(sb.toString());
            }
            this.b = true;
        } else {
            cmnkVar.h(1);
        }
        return true;
    }

    @Override // defpackage.clwc
    protected final boolean b(cmnk cmnkVar, long j) {
        if (this.e == 2) {
            int d = cmnkVar.d();
            this.d.d(cmnkVar, d);
            this.d.b(j, 1, d, 0, null);
            return true;
        }
        int l = cmnkVar.l();
        if (l != 0 || this.c) {
            if (this.e == 10 && l != 1) {
                return false;
            }
            int d2 = cmnkVar.d();
            this.d.d(cmnkVar, d2);
            this.d.b(j, 1, d2, 0, null);
            return true;
        }
        int d3 = cmnkVar.d();
        byte[] bArr = new byte[d3];
        cmnkVar.j(bArr, 0, d3);
        clqx a2 = clqy.a(bArr);
        clnf clnfVar = new clnf();
        clnfVar.k = "audio/mp4a-latm";
        clnfVar.h = a2.c;
        clnfVar.x = a2.b;
        clnfVar.y = a2.a;
        clnfVar.m = Collections.singletonList(bArr);
        this.d.a(clnfVar.a());
        this.c = true;
        return false;
    }
}
