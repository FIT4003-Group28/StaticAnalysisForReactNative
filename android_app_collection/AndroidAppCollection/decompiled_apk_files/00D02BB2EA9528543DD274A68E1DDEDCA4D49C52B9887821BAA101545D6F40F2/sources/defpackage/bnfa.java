package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bnfa  reason: default package */
/* loaded from: classes3.dex */
public final class bnfa implements bnei {
    public static final /* synthetic */ int a = 0;
    private static final dboe e = dboe.STANDARD;
    private final boolean b;
    private final View.OnClickListener c;
    private final cjtd d;

    public bnfa(apup apupVar, bhhf bhhfVar, bwrs<ilo> bwrsVar) {
        this.b = bhhfVar.j(bwrsVar, e);
        this.c = new bnez(apupVar, bwrsVar);
        cjtd cjtdVar = cjtd.b;
        dzvx.b(cjtdVar, "Ue3LoggingCommonParams.EMPTY");
        this.d = cjtdVar;
    }

    @Override // defpackage.bnei
    public View.OnClickListener b() {
        return this.c;
    }

    @Override // defpackage.bnei
    public cjtd c() {
        return this.d;
    }

    @Override // defpackage.bnei
    /* renamed from: d */
    public boolean a() {
        return this.b;
    }
}
