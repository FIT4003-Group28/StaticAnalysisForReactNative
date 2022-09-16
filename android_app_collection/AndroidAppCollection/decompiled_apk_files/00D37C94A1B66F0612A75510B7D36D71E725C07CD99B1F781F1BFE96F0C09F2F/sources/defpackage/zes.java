package defpackage;
/* compiled from: PG */
/* renamed from: zes  reason: default package */
/* loaded from: classes4.dex */
public abstract class zes implements zeu {
    public final int a;

    public zes(int i) {
        this.a = i;
    }

    @Override // defpackage.zeu
    public final int a() {
        if (this.a == 4) {
            return 0;
        }
        return b();
    }

    public int b() {
        return e().size();
    }

    @Override // defpackage.zeu
    public final int c() {
        return this.a;
    }
}
