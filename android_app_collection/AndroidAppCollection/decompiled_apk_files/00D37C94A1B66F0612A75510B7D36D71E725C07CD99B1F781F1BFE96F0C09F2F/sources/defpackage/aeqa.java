package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: aeqa  reason: default package */
/* loaded from: classes.dex */
public final class aeqa implements aepy {
    private static final Comparator a = new wd(18);
    private static final Comparator b = new wd(19);
    private final int d;
    private final float f;
    private int i;
    private int j;
    private final aepz[] g = new aepz[5];
    private final ArrayList e = new ArrayList();
    private int h = -1;

    public aeqa(int i, float f) {
        this.d = i;
        this.f = f;
    }

    @Override // defpackage.aepy
    public final float b() {
        if (!this.e.isEmpty()) {
            if (this.h != 0) {
                Collections.sort(this.e, b);
                this.h = 0;
            }
            int size = this.e.size();
            float f = this.f;
            float f2 = size + 1;
            if (f <= 1.0f / f2) {
                return ((aepz) this.e.get(0)).b;
            }
            float f3 = size;
            if (f < f3 / (f3 + 1.0f)) {
                float f4 = (f2 * f) - 1.0f;
                int i = (int) f4;
                float f5 = ((aepz) this.e.get(i)).b;
                return f5 + ((f4 % 1.0f) * (((aepz) this.e.get(i + 1)).b - f5));
            }
            return ((aepz) this.e.get(size - 1)).b;
        }
        return Float.NaN;
    }

    @Override // defpackage.aepy
    public final void f(float f) {
        aepz aepzVar;
        if (this.h != 1) {
            Collections.sort(this.e, a);
            this.h = 1;
        }
        int i = this.j;
        if (i > 0) {
            aepz[] aepzVarArr = this.g;
            int i2 = i - 1;
            this.j = i2;
            aepzVar = aepzVarArr[i2];
        } else {
            aepzVar = new aepz();
        }
        int i3 = this.i;
        this.i = i3 + 1;
        aepzVar.a = i3;
        aepzVar.b = f;
        while (this.e.size() >= this.d) {
            aepz aepzVar2 = (aepz) this.e.get(0);
            this.e.remove(0);
            int i4 = this.j;
            if (i4 < 5) {
                aepz[] aepzVarArr2 = this.g;
                this.j = i4 + 1;
                aepzVarArr2[i4] = aepzVar2;
            }
        }
        this.e.add(aepzVar);
    }

    @Override // defpackage.aepy
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aepy
    public final void h() {
    }

    @Override // defpackage.aepy
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ int j() {
        return 1;
    }
}
