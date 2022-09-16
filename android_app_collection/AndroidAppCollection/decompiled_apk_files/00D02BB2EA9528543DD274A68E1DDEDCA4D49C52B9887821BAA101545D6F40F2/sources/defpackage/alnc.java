package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: alnc  reason: default package */
/* loaded from: classes.dex */
final class alnc implements alkw {
    public static final amfu a = new amfu(new Object());
    public final Executor b;
    public final amfi c;
    public final amlm d;
    public volatile amky e = amky.f;

    public alnc(Executor executor, amfi amfiVar, amlm amlmVar) {
        this.b = executor;
        this.c = amfiVar;
        this.d = amlmVar;
    }

    public static void a(amlm amlmVar, int i, dmph dmphVar, dmpn dmpnVar, List<alnb> list) {
        int a2 = alwl.a(dmpnVar);
        for (int i2 = 0; i2 < dmphVar.b.size(); i2++) {
            dmpd dmpdVar = dmphVar.b.get(i2);
            alxo a3 = amlmVar.a(dmpdVar, dmpnVar, i, a2);
            if (a3.d()) {
                list.add(new alnb(dmpdVar.b, a3.s, a3));
            }
        }
    }
}
