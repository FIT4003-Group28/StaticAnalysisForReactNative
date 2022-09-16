package defpackage;
/* compiled from: PG */
/* renamed from: isp  reason: default package */
/* loaded from: classes3.dex */
public final class isp implements abcf {
    private final aaru a;

    public isp(aaru aaruVar) {
        this.a = aaruVar;
    }

    @Override // defpackage.abcf
    public final void b(abce abceVar) {
        amuk a = this.a.a();
        int i = ((amxx) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            abceVar.u.add(Integer.valueOf(((Integer) a.get(i2)).intValue()));
        }
    }
}
