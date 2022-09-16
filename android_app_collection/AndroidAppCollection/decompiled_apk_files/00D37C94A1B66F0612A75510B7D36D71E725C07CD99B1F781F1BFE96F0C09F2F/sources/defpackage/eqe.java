package defpackage;
/* compiled from: PG */
/* renamed from: eqe  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eqe implements ylw {
    public final /* synthetic */ eqj a;
    public final /* synthetic */ apzg b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    private final /* synthetic */ int e;

    public /* synthetic */ eqe(eqj eqjVar, apzg apzgVar, Object obj, boolean z) {
        this.a = eqjVar;
        this.b = apzgVar;
        this.c = obj;
        this.d = z;
    }

    public /* synthetic */ eqe(eqj eqjVar, apzg apzgVar, Object obj, boolean z, int i) {
        this.e = i;
        this.a = eqjVar;
        this.b = apzgVar;
        this.c = obj;
        this.d = z;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        int i = this.e;
        if (i == 0) {
            eqj eqjVar = this.a;
            apzg apzgVar = this.b;
            Object obj2 = this.c;
            boolean z = this.d;
            arvl arvlVar = (arvl) obj;
            apzg apzgVar2 = null;
            aopu aopuVar = arvlVar.d.size() > 0 ? arvlVar.d : null;
            if ((arvlVar.b & 2) != 0) {
                apzg apzgVar3 = arvlVar.e;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                apzgVar2 = apzgVar3;
            }
            eqjVar.e(apzgVar, obj2, aopuVar, apzgVar2, aspb.LIKE, z);
        } else if (i == 1) {
            eqj eqjVar2 = this.a;
            apzg apzgVar4 = this.b;
            Object obj3 = this.c;
            boolean z2 = this.d;
            arvj arvjVar = (arvj) obj;
            aopu aopuVar2 = arvjVar.c;
            apzg apzgVar5 = arvjVar.d;
            if (apzgVar5 == null) {
                apzgVar5 = apzg.a;
            }
            eqjVar2.e(apzgVar4, obj3, aopuVar2, apzgVar5, aspb.DISLIKE, z2);
        } else {
            eqj eqjVar3 = this.a;
            apzg apzgVar6 = this.b;
            Object obj4 = this.c;
            boolean z3 = this.d;
            arvn arvnVar = (arvn) obj;
            aopu aopuVar3 = arvnVar.c;
            apzg apzgVar7 = arvnVar.d;
            if (apzgVar7 == null) {
                apzgVar7 = apzg.a;
            }
            eqjVar3.e(apzgVar6, obj4, aopuVar3, apzgVar7, aspb.INDIFFERENT, z3);
        }
    }
}
