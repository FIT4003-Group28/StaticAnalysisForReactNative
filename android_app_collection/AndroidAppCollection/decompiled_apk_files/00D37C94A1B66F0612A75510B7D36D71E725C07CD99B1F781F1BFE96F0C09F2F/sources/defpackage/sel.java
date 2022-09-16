package defpackage;
/* compiled from: PG */
/* renamed from: sel  reason: default package */
/* loaded from: classes4.dex */
public final class sel implements sep {
    public final seo a;
    public boolean b;
    private sev c;
    private ser d;
    private final sem e;
    private final sen f;

    public sel() {
        this.c = sev.a();
        this.d = ser.a();
        this.b = true;
        this.a = new seo();
        this.e = new sem();
        this.f = new sen();
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q() {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sel.q():void");
    }

    @Override // defpackage.set
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        Double d = (Double) obj;
        if (this.b) {
            q();
        }
        return this.f.a(d.doubleValue());
    }

    @Override // defpackage.set
    public final /* bridge */ /* synthetic */ float b(Object obj, Object obj2) {
        if (this.b) {
            q();
        }
        double d = 0.0d;
        double doubleValue = obj != null ? ((Double) obj).doubleValue() : 0.0d;
        if (obj2 != null) {
            d = ((Double) obj2).doubleValue();
        }
        return this.f.a(doubleValue + d);
    }

    @Override // defpackage.set
    public final float c() {
        if (this.b) {
            q();
        }
        return this.f.a;
    }

    @Override // defpackage.set
    public final /* bridge */ /* synthetic */ int d(Object obj) {
        Double d = (Double) obj;
        sek sekVar = this.a.e;
        if (sekVar == null) {
            this.e.a();
            sekVar = this.e.e;
        }
        if (d.doubleValue() < ((Double) sekVar.a).doubleValue()) {
            return -1;
        }
        return d.doubleValue() > ((Double) sekVar.b).doubleValue() ? 1 : 0;
    }

    @Override // defpackage.set
    public final int e() {
        seo seoVar = this.a;
        return Math.abs(((Integer) seoVar.a.a).intValue() - ((Integer) seoVar.a.b).intValue());
    }

    @Override // defpackage.set
    public final sek f() {
        return this.a.a;
    }

    public final sek g() {
        if (this.b) {
            q();
        }
        return this.a.e;
    }

    @Override // defpackage.set
    public final /* bridge */ /* synthetic */ sep h() {
        sho.g(this.a.a, "Copying a scale with no range.");
        return new sel(this);
    }

    @Override // defpackage.sep
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        Double d = (Double) obj;
        sem semVar = this.e;
        if (d != null) {
            semVar.b(d);
            double doubleValue = d.doubleValue();
            if (!Double.isNaN(semVar.c)) {
                double abs = Math.abs(doubleValue - semVar.c);
                if (abs != 0.0d && abs < semVar.d) {
                    semVar.d = Math.abs(doubleValue - semVar.c);
                }
            }
            semVar.c = doubleValue;
        }
        this.b = true;
    }

    @Override // defpackage.sep
    public final /* bridge */ /* synthetic */ void j(Object obj) {
        this.b = this.e.b((Double) obj);
    }

    @Override // defpackage.sep
    public final void k() {
        seo seoVar = this.a;
        seoVar.f = false;
        seoVar.c = 1.0f;
        seoVar.d = 0.0f;
        seoVar.e = null;
        this.b = true;
        sem semVar = this.e;
        semVar.c = Double.NaN;
        semVar.a = Double.MAX_VALUE;
        semVar.b = -1.7976931348623157E308d;
        semVar.d = Double.MAX_VALUE;
        this.f.a = 0.0f;
    }

    @Override // defpackage.sep
    public final void l(sek sekVar) {
        sho.g(sekVar, "Attempt to set a null range.");
        this.a.a = sekVar;
        this.b = true;
    }

    @Override // defpackage.sep
    public final void m(ser serVar) {
        sho.g(serVar, "rangeBandConfig");
        if (!serVar.equals(this.d)) {
            this.d = serVar;
            this.b = true;
        }
    }

    @Override // defpackage.sep
    public final void n(sev sevVar) {
        sho.g(sevVar, "stepSizeConfig");
        this.c = sevVar;
    }

    @Override // defpackage.set
    public final /* bridge */ /* synthetic */ boolean o(Object obj) {
        Double d = (Double) obj;
        return true;
    }

    public final boolean p() {
        return this.a.b;
    }

    private sel(sel selVar) {
        this.c = sev.a();
        this.d = ser.a();
        this.b = true;
        this.c = selVar.c;
        this.d = selVar.d;
        this.a = new seo(selVar.a);
        this.e = new sem(selVar.e);
        this.f = new sen(selVar.f);
    }
}
