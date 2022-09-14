package com.facebook.react.fabric.mounting.mountitems;
/* loaded from: classes.dex */
public class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private int[] f5514a;

    public h(int[] iArr) {
        this.f5514a = iArr;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f5514a;
            if (i2 >= iArr.length) {
                break;
            }
            if ((iArr[i2 + 3] & 1) != 0) {
                bVar.a(iArr[i2 + 1], iArr[i2 + 2]);
            }
            i2 += 4;
        }
        while (true) {
            int[] iArr2 = this.f5514a;
            if (i < iArr2.length) {
                if ((iArr2[i + 3] & 2) != 0) {
                    bVar.a(iArr2[i + 0]);
                }
                i += 4;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f5514a.length; i += 4) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append("RemoveDeleteMultiMountItem (");
            sb.append((i / 4) + 1);
            sb.append("/");
            sb.append(this.f5514a.length / 4);
            sb.append("): [");
            sb.append(this.f5514a[i + 0]);
            sb.append("] parent [");
            sb.append(this.f5514a[i + 1]);
            sb.append("] idx ");
            sb.append(this.f5514a[i + 2]);
            sb.append(" ");
            sb.append(this.f5514a[i + 3]);
        }
        return sb.toString();
    }
}
