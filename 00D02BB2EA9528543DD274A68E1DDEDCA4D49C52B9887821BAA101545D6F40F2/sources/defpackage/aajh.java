package defpackage;
/* compiled from: PG */
/* renamed from: aajh  reason: default package */
/* loaded from: classes2.dex */
public class aajh extends aajc {
    public aajh(final dnpq dnpqVar, ditv ditvVar, cjtd cjtdVar, final afha afhaVar) {
        super(k(ditvVar, 2131231775), !dnpqVar.d.isEmpty() ? dnpqVar.d : dnpqVar.c, cjtdVar, new Runnable(afhaVar, dnpqVar) { // from class: aajg
            private final afha a;
            private final dnpq b;

            {
                this.a = afhaVar;
                this.b = dnpqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.m(this.b.c, 1);
            }
        }, null);
    }
}
