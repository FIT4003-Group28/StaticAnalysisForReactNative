package defpackage;
/* compiled from: PG */
/* renamed from: aidh  reason: default package */
/* loaded from: classes2.dex */
final class aidh {
    public final akzh a;
    public final cqat b;
    public final ajsc c;
    public final float d;
    public final boolean e;

    public aidh(akzh akzhVar, cqat cqatVar, ajsc ajscVar, float f, boolean z) {
        this.a = akzhVar;
        this.b = cqatVar;
        this.c = ajscVar;
        this.e = z;
        this.d = f;
    }

    @dzsi
    public final aidg a(int[] iArr, boolean z) {
        int i = (int) ((true != z ? 14 : 20) * this.d);
        if (iArr == null) {
            return null;
        }
        return new aidg(new akra(iArr[0], iArr[1] - (i + i)), i);
    }
}
