package defpackage;
/* compiled from: PG */
/* renamed from: clwd  reason: default package */
/* loaded from: classes5.dex */
final class clwd extends clwc {
    private final cmnk a;
    private final cmnk b;
    private int c;
    private boolean e;
    private boolean f;
    private int g;

    public clwd(clvk clvkVar) {
        super(clvkVar);
        this.a = new cmnk(cmni.a);
        this.b = new cmnk(4);
    }

    @Override // defpackage.clwc
    protected final boolean a(cmnk cmnkVar) {
        int l = cmnkVar.l();
        int i = l >> 4;
        int i2 = l & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new clwb(sb.toString());
    }

    @Override // defpackage.clwc
    protected final boolean b(cmnk cmnkVar, long j) {
        int l = cmnkVar.l();
        byte[] bArr = cmnkVar.a;
        int i = cmnkVar.b;
        int i2 = i + 1;
        cmnkVar.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        cmnkVar.b = i3;
        byte b2 = bArr[i2];
        cmnkVar.b = i3 + 1;
        long j2 = j + (((bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8)) * 1000);
        if (l == 0) {
            if (!this.e) {
                cmnk cmnkVar2 = new cmnk(new byte[cmnkVar.d()]);
                cmnkVar.j(cmnkVar2.a, 0, cmnkVar.d());
                cmoa a = cmoa.a(cmnkVar2);
                this.c = a.b;
                clnf clnfVar = new clnf();
                clnfVar.k = "video/avc";
                clnfVar.p = a.c;
                clnfVar.q = a.d;
                clnfVar.t = a.e;
                clnfVar.m = a.a;
                this.d.a(clnfVar.a());
                this.e = true;
                return false;
            }
        } else if (l == 1 && this.e) {
            int i4 = this.g == 1 ? 1 : 0;
            if (!this.f && i4 == 0) {
                return false;
            }
            byte[] bArr2 = this.b.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i5 = 4 - this.c;
            int i6 = 0;
            while (cmnkVar.d() > 0) {
                cmnkVar.j(this.b.a, i5, this.c);
                this.b.f(0);
                int v = this.b.v();
                this.a.f(0);
                this.d.d(this.a, 4);
                this.d.d(cmnkVar, v);
                i6 = i6 + 4 + v;
            }
            this.d.b(j2, i4, i6, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}
