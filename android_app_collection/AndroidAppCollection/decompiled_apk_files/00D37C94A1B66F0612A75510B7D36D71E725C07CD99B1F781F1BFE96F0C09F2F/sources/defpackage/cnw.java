package defpackage;
/* compiled from: PG */
/* renamed from: cnw  reason: default package */
/* loaded from: classes2.dex */
public final class cnw implements cnq {
    public static final cnw a = new cnw(2, null);
    private final /* synthetic */ int b;

    public cnw() {
    }

    public cnw(int i) {
        this.b = i;
    }

    @Deprecated
    public cnw(int i, byte[] bArr) {
        this.b = i;
    }

    @Override // defpackage.cnq
    public final boolean b(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return obj.toString().startsWith("data:image");
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.cnq
    public final cnp a(Object obj, int i, int i2, cic cicVar) {
        int i3 = this.b;
        if (i3 != 0) {
            if (i3 == 1) {
                return new cnp(new cup(obj), new cmy(obj.toString()));
            }
            return new cnp(new cup(obj), new coc(obj));
        }
        return null;
    }
}
