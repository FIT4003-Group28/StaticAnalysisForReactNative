package defpackage;
/* compiled from: PG */
/* renamed from: bcdi  reason: default package */
/* loaded from: classes3.dex */
public class bcdi implements bcdf {
    private final dcdc<bcdh> a;
    private final boolean b;

    public bcdi(dcdc<bcdh> dcdcVar, boolean z) {
        this.a = dcdcVar;
        this.b = z;
    }

    @Override // defpackage.bcdf
    public dcdc<bcdh> a() {
        return this.a;
    }

    @Override // defpackage.bcdf
    public Boolean b() {
        return Boolean.valueOf(this.b);
    }
}
