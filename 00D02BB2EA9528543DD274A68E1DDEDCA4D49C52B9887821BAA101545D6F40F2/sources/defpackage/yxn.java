package defpackage;
/* compiled from: PG */
/* renamed from: yxn  reason: default package */
/* loaded from: classes7.dex */
public final class yxn {
    public final bvrb a;
    public final clcl b;
    public final clcb c;
    @dzsi
    public yxm e;
    public boolean d = false;
    public final yxh f = new yxh(this);

    public yxn(bvrb bvrbVar, clcl clclVar, clcb clcbVar) {
        this.a = bvrbVar;
        this.b = clclVar;
        this.c = clcbVar;
    }

    public static float a(float f) {
        if (f > 1.0f) {
            return 1.0f;
        }
        float numberOfLeadingZeros = 1.0f / (1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(1.0f / f)) - 1)));
        float f2 = numberOfLeadingZeros + numberOfLeadingZeros;
        return Math.abs(numberOfLeadingZeros - f) < Math.abs(f2 - f) ? numberOfLeadingZeros : f2;
    }
}
