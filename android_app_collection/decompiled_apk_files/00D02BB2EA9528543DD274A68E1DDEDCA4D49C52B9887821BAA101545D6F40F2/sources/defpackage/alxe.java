package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alxe  reason: default package */
/* loaded from: classes2.dex */
public final class alxe {
    public int a;
    public int b;
    public int c;
    public int d;

    public alxe(akra akraVar) {
        int i = akraVar.a;
        this.a = i;
        int i2 = akraVar.b;
        this.b = i2;
        this.c = i;
        this.d = i2;
    }

    public alxe(alxe alxeVar) {
        this.a = alxeVar.a;
        this.b = alxeVar.b;
        this.c = alxeVar.c;
        this.d = alxeVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        if (i < this.a) {
            this.a = i;
        }
        if (i2 < this.b) {
            this.b = i2;
        }
        if (i > this.c) {
            this.c = i;
        }
        if (i2 > this.d) {
            this.d = i2;
        }
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(53);
        sb.append("[(");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append("),(");
        sb.append(i3);
        sb.append(",");
        sb.append(i4);
        sb.append(")]");
        return sb.toString();
    }
}
