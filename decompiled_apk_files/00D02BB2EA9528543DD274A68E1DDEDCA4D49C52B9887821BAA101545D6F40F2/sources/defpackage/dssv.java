package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dssv  reason: default package */
/* loaded from: classes.dex */
public final class dssv implements dssg {
    public final dssj a;
    public final String b;
    public final Object[] c;
    private final int d;

    public dssv(dssj dssjVar, String str, Object[] objArr) {
        this.a = dssjVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    @Override // defpackage.dssg
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.dssg
    public final dssj b() {
        return this.a;
    }

    @Override // defpackage.dssg
    public final int c() {
        return (this.d & 1) == 1 ? 1 : 2;
    }
}