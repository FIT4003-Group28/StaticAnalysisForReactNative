package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: buhs  reason: default package */
/* loaded from: classes4.dex */
public final class buhs<T> extends btrh<T> {
    private final int d;

    public buhs(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        buab<List<ahnc>> c;
        deig<buab<List<ahnc>>> deigVar;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                ((buhr) this.a).d = ((ahmu) obj).a;
                return;
            }
            ((buhr) this.a).c = (ahmv) ((ahmw) obj).a;
            return;
        }
        buhr buhrVar = (buhr) this.a;
        ahmo ahmoVar = (ahmo) obj;
        synchronized (buhrVar) {
            buhrVar.b = ahmoVar.a();
            c = buhrVar.c();
            deigVar = null;
            if (c != null) {
                deig<buab<List<ahnc>>> deigVar2 = buhrVar.a;
                buhrVar.a = null;
                deigVar = deigVar2;
            }
        }
        if (deigVar == null) {
            return;
        }
        deigVar.j(c);
    }
}
