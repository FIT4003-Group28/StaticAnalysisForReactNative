package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jnm  reason: default package */
/* loaded from: classes7.dex */
public final class jnm implements bbb {
    final /* synthetic */ jnq a;

    public jnm(jnq jnqVar) {
        this.a = jnqVar;
    }

    @Override // defpackage.bbb
    public final void b(int i) {
        jnq jnqVar = this.a;
        jnqVar.E(jnqVar.F(i));
    }

    @Override // defpackage.bbb
    public final void c(int i) {
        jnq jnqVar = this.a;
        bbb bbbVar = jnqVar.x;
        if (bbbVar != null) {
            bbbVar.c(i);
        }
        ArrayList<bbb> arrayList = jnqVar.y;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).c(i);
        }
    }

    @Override // defpackage.bbb
    public final void a(int i, float f, int i2) {
        jnq jnqVar = this.a;
        if (jnqVar.r) {
            int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            i = jnqVar.F(i);
            if (i3 == 0) {
                f = 0.0f;
                i2 = 0;
            } else {
                i--;
                f = 1.0f - f;
                i2 = this.a.getWidth() - i2;
            }
        }
        jnq jnqVar2 = this.a;
        bbb bbbVar = jnqVar2.x;
        if (bbbVar != null) {
            bbbVar.a(i, f, i2);
        }
        ArrayList<bbb> arrayList = jnqVar2.y;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.get(i4).a(i, f, i2);
        }
    }
}
