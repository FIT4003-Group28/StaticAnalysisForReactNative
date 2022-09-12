package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bxqj  reason: default package */
/* loaded from: classes4.dex */
public class bxqj implements bxog {
    private List<bxoi> a = dcdc.e();
    private final bxoi b;
    private boolean c;
    private boolean d;

    public bxqj(bxoi bxoiVar) {
        this.b = bxoiVar;
    }

    @Override // defpackage.bxog
    public List<bxoi> a() {
        return this.a;
    }

    @Override // defpackage.bxog
    public bxoi b() {
        return this.b;
    }

    @Override // defpackage.bxog
    public boolean c() {
        return this.c;
    }

    @Override // defpackage.bxog
    public boolean d() {
        return this.d;
    }

    public void e(@dzsi String str, @dzsi dcdc<bxoi> dcdcVar, bxod bxodVar) {
        if (dcdcVar == null) {
            dcdcVar = dcdc.e();
        }
        this.a = dcdcVar;
        this.c = bxodVar.equals(bxod.OFFLINE);
        this.d = bxodVar.equals(bxod.PARTIAL);
    }
}
