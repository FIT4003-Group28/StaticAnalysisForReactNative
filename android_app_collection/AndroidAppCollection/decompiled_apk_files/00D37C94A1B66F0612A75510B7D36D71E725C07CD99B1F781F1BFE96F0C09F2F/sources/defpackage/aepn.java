package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: aepn  reason: default package */
/* loaded from: classes.dex */
public final class aepn implements aepy {
    final ArrayList a;
    final ArrayList b;
    private final float d;
    private final int e;
    private final LinkedList f;
    private final afkw g;

    public aepn(int i, float f) {
        boolean z = true;
        afms.b(f > 0.0f);
        afms.b(f >= 1.0f ? false : z);
        this.e = i;
        this.d = f;
        this.f = new LinkedList();
        this.g = new afkw();
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    private final boolean a() {
        int size = this.a.size();
        int size2 = this.b.size();
        return size + size2 <= this.e || size2 < 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01df, code lost:
        r1.c = r9;
        r1.d = r11;
     */
    @Override // defpackage.aepy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b() {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepn.b():float");
    }

    @Override // defpackage.aepy
    public final void f(float f) {
        this.f.addFirst(new aepm(Math.log10(f)));
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
