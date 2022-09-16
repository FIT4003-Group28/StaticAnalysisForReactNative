package defpackage;
/* compiled from: PG */
/* renamed from: aevi  reason: default package */
/* loaded from: classes.dex */
public final class aevi extends pbe {
    private final aevh w;
    private byte[] x;
    private int y;
    private int z;

    public aevi(int i, aevh aevhVar) {
        super(i);
        this.w = aevhVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pbe
    public final int b(int i) {
        if (i != 165) {
            if (i == 166) {
                return 1;
            }
            if (i == 238) {
                return 2;
            }
            if (i == 30113) {
                return 1;
            }
            return super.b(i);
        }
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pbe
    public final void h(int i, long j) {
        if (i != 238) {
            super.h(i, j);
        } else if (this.z != 3) {
        } else {
            this.y = (int) j;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pbe
    public final void i(int i, long j, long j2) {
        if (i == 166) {
            if (this.z == 2) {
                this.z = 3;
            }
            this.y = -1;
        } else if (i != 30113) {
            super.i(i, j, j2);
        } else {
            this.z = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pbe
    public final void j(int i, int i2, oxn oxnVar) {
        if (i != 165) {
            super.j(i, i2, oxnVar);
        } else if (this.z != 3 || this.y != 4) {
        } else {
            byte[] bArr = new byte[i2 + 1];
            this.x = bArr;
            bArr[0] = 0;
            oxnVar.h(bArr, 1, i2);
            aevh aevhVar = this.w;
            afgm afgmVar = (afgm) aevhVar;
            afgmVar.d.post(new afgk(afgmVar, this.x, this.r));
        }
    }
}
