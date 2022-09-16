package defpackage;
/* compiled from: PG */
/* renamed from: ajqg  reason: default package */
/* loaded from: classes.dex */
final class ajqg implements ajql {
    final /* synthetic */ ajqh a;

    public ajqg(ajqh ajqhVar) {
        this.a = ajqhVar;
    }

    @Override // defpackage.ymy
    public final void d(int i, int i2) {
        int i3 = this.a.b;
        if (i >= i3) {
            return;
        }
        int min = Math.min(i2 + i, i3) - i;
        ajqh ajqhVar = this.a;
        int i4 = ajqhVar.b;
        int size = ((ync) ajqhVar.a).size();
        if (i4 < size + min) {
            this.a.b -= min;
        }
        this.a.z(i, min);
        ajqh ajqhVar2 = this.a;
        ajqhVar2.b = i4;
        int i5 = i4 - min;
        if (size <= i5) {
            return;
        }
        ajqhVar2.y(i5, Math.min(size, i4) - i5);
    }

    @Override // defpackage.ajql
    public final void pi() {
        this.a.v();
    }

    @Override // defpackage.ymy
    public final void pj(int i, int i2) {
        ajqh ajqhVar = this.a;
        int i3 = ajqhVar.b;
        if (i >= i3) {
            return;
        }
        ajqhVar.x(i, Math.min(i2 + i, i3) - i);
    }

    @Override // defpackage.ymy
    public final void pk(int i, int i2) {
        int i3 = this.a.b;
        if (i >= i3) {
            return;
        }
        int min = Math.min(i + i2, i3) - i;
        ajqh ajqhVar = this.a;
        int i4 = ajqhVar.b;
        int size = ((ync) ajqhVar.a).size() - i2;
        this.a.b = Math.max(i4, size + min);
        this.a.y(i, min);
        this.a.b = i4;
        int min2 = Math.min(size, i4) + min;
        ajqh ajqhVar2 = this.a;
        int i5 = ajqhVar2.b;
        if (min2 <= i5) {
            return;
        }
        ajqhVar2.z(i5, min2 - i5);
    }

    @Override // defpackage.ymy
    public final void e(int i, int i2) {
        ajqh ajqhVar = this.a;
        int i3 = ajqhVar.b;
        if (i < i3 || i2 < i3) {
            if (i >= i3 || i2 >= i3 || i + 1 > i3 || i2 + 1 > i3) {
                ajqhVar.v();
            } else {
                ajqhVar.A(i, i2);
            }
        }
    }
}
