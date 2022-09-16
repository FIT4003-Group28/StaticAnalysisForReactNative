package defpackage;
/* compiled from: PG */
/* renamed from: jjk  reason: default package */
/* loaded from: classes3.dex */
public final class jjk {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    private jjk(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
    }

    public static jjk a(agqi agqiVar) {
        return new jjk(agqiVar == null, agqiVar != null && agqiVar.e(), true, true, false, agqiVar == null ? 0 : agqiVar.b());
    }

    public static jjk b(agqv agqvVar) {
        return new jjk(agqvVar == null || agqvVar.s(), agqvVar != null && agqvVar.i() == agqp.PLAYABLE, agqvVar != null && !agqvVar.s() && (agqvVar.D() || !agqvVar.C()), agqvVar != null && agqvVar.B(), agqvVar != null && agqvVar.C(), agqvVar == null ? 0 : agqvVar.c());
    }
}
