package defpackage;
/* compiled from: PG */
/* renamed from: bauq  reason: default package */
/* loaded from: classes3.dex */
public final class bauq<T> extends btrh<T> {
    private final int d;

    public bauq(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        baup baupVar;
        bbag bbagVar;
        int i = this.d;
        if (i == 0) {
            baum baumVar = (baum) this.a;
            azrb azrbVar = (azrb) obj;
            bbcj bbcjVar = baumVar.a.ay;
            if (bbcjVar != null) {
                bbcjVar.j(azrbVar);
            }
            baad baadVar = azrbVar.a;
            if (baadVar == null || baadVar.o() != baab.LOCAL_FOLLOWING_STARRED_PLACES || (bbagVar = (baupVar = baumVar.a).ax) == null || !baupVar.aD) {
                return;
            }
            bbagVar.t(true);
        } else if (i == 1) {
            azrc azrcVar = (azrc) obj;
            bbcj bbcjVar2 = ((baum) this.a).a.ay;
            if (bbcjVar2 == null) {
                return;
            }
            bbcjVar2.k(azrcVar);
        } else if (i == 2) {
            ((baum) this.a).a.at.s((azqv) obj);
        } else if (i == 3) {
            azrh azrhVar = (azrh) obj;
            bbcj bbcjVar3 = ((baum) this.a).a.ay;
            if (bbcjVar3 == null) {
                return;
            }
            bbcjVar3.l(azrhVar);
        } else if (i != 4) {
            cjnw cjnwVar = (cjnw) obj;
            bbbv bbbvVar = ((baum) this.a).a.aw;
            if (bbbvVar == null) {
                return;
            }
            cqkx.p(bbbvVar);
        } else {
            azrg azrgVar = (azrg) obj;
            bbcj bbcjVar4 = ((baum) this.a).a.ay;
            if (bbcjVar4 == null) {
                return;
            }
            bbcjVar4.s(azrgVar);
        }
    }
}
