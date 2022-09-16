package defpackage;
/* compiled from: PG */
/* renamed from: kue  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kue implements kuf {
    private final /* synthetic */ int f;
    public static final /* synthetic */ kue e = new kue(4);
    public static final /* synthetic */ kue d = new kue(3);
    public static final /* synthetic */ kue c = new kue(2);
    public static final /* synthetic */ kue b = new kue(1);
    public static final /* synthetic */ kue a = new kue();

    private /* synthetic */ kue() {
    }

    private /* synthetic */ kue(int i) {
        this.f = i;
    }

    @Override // defpackage.kuf
    public final Object a(Object obj) {
        int i = this.f;
        if (i == 0) {
            avhc avhcVar = (avhc) obj;
            if ((avhcVar.b & 32768) == 0) {
                return null;
            }
            avgz avgzVar = avhcVar.l;
            return avgzVar == null ? avgz.a : avgzVar;
        } else if (i == 1) {
            avhc avhcVar2 = (avhc) obj;
            if ((avhcVar2.b & 1) == 0) {
                return null;
            }
            avgr avgrVar = avhcVar2.c;
            return avgrVar == null ? avgr.a : avgrVar;
        } else if (i == 2) {
            avhc avhcVar3 = (avhc) obj;
            if ((avhcVar3.b & 128) == 0) {
                return null;
            }
            avha avhaVar = avhcVar3.f;
            return avhaVar == null ? avha.a : avhaVar;
        } else if (i == 3) {
            avhc avhcVar4 = (avhc) obj;
            if ((avhcVar4.b & 128) == 0) {
                return null;
            }
            avha avhaVar2 = avhcVar4.f;
            return avhaVar2 == null ? avha.a : avhaVar2;
        } else {
            avhc avhcVar5 = (avhc) obj;
            if ((avhcVar5.b & 16384) == 0) {
                return null;
            }
            avhe avheVar = avhcVar5.k;
            return avheVar == null ? avhe.a : avheVar;
        }
    }
}
