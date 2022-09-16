package defpackage;
/* compiled from: PG */
/* renamed from: seu  reason: default package */
/* loaded from: classes4.dex */
public final class seu implements sep {
    public seq a;
    private sek b;
    private float c;
    private ser d;
    private boolean e;
    private float f;
    private float g;
    private float h;

    public seu() {
        this.a = new seq();
        this.b = new sek(0, 1);
        this.c = 1.0f;
        this.d = ser.b();
        this.e = true;
    }

    @Override // defpackage.set
    public final float a(Object obj) {
        if (this.e) {
            g();
        }
        Integer b = this.a.b(obj);
        if (b != null) {
            return ((Integer) this.b.a).intValue() + 0.0f + this.g + (this.f * b.intValue());
        }
        return 0.0f;
    }

    @Override // defpackage.set
    public final float b(Object obj, Object obj2) {
        return a(obj);
    }

    @Override // defpackage.set
    public final float c() {
        if (this.e) {
            g();
        }
        return this.h;
    }

    @Override // defpackage.set
    public final int d(Object obj) {
        if (this.a.b(obj) == null || this.b == null) {
            return -1;
        }
        float a = a(obj);
        if (a < Math.min(((Integer) this.b.a).intValue(), ((Integer) this.b.b).intValue())) {
            return -1;
        }
        return a > ((float) Math.max(((Integer) this.b.a).intValue(), ((Integer) this.b.b).intValue())) ? 1 : 0;
    }

    @Override // defpackage.set
    public final int e() {
        return Math.abs(((Integer) this.b.a).intValue() - ((Integer) this.b.b).intValue());
    }

    @Override // defpackage.set
    public final sek f() {
        return this.b;
    }

    protected final void g() {
        float f;
        float e = this.a.a() > 0 ? this.c * (e() / this.a.a()) : 0.0f;
        ser serVar = this.d;
        int i = serVar.b - 1;
        if (i == 1) {
            f = (float) serVar.a;
        } else if (i == 3 || i == 4) {
            f = ((float) serVar.a) * e;
        } else {
            throw new IllegalStateException("rangeBandType is bad, must not be NO_RANGE_BAND or FIXED_DOMAIN_RANGE_BAND");
        }
        this.f = e;
        this.h = f;
        this.g = e / 2.0f;
        if (((Integer) this.b.a).intValue() > ((Integer) this.b.b).intValue()) {
            this.f = -this.f;
            this.g = -this.g;
        }
        this.e = false;
    }

    @Override // defpackage.set
    public final /* bridge */ /* synthetic */ sep h() {
        return new seu(this);
    }

    @Override // defpackage.sep
    public final void i(Object obj) {
        seq seqVar = this.a;
        if (!seqVar.a.containsKey(obj)) {
            seqVar.a.put(obj, Integer.valueOf(seqVar.b.size()));
            seqVar.b.add(obj);
        }
        this.e = true;
    }

    @Override // defpackage.sep
    public final void j(Object obj) {
        i(obj);
    }

    @Override // defpackage.sep
    public final void k() {
        seq seqVar = this.a;
        seqVar.a.clear();
        seqVar.b.clear();
        this.e = true;
    }

    @Override // defpackage.sep
    public final void l(sek sekVar) {
        this.b = sekVar;
        this.e = true;
    }

    @Override // defpackage.sep
    public final void m(ser serVar) {
        sho.g(serVar, "rangeBandConfig");
        int i = serVar.b;
        boolean z = false;
        if (i != 3 && i != 1) {
            z = true;
        }
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "STYLE_ASSIGNED_PERCENT_OF_STEP" : "FIXED_PERCENT_OF_STEP" : "FIXED_DOMAIN" : "FIXED_PIXEL" : "NONE";
        sho.a(z, str.length() != 0 ? "OrdinalScales cannot have a rangeBandType of ".concat(str) : new String("OrdinalScales cannot have a rangeBandType of "));
        this.d = serVar;
        this.e = true;
    }

    @Override // defpackage.sep
    public final void n(sev sevVar) {
        sho.g(sevVar, "stepSizeConfig");
        int i = sevVar.a;
        sho.a(true, "Ordinal scales only support StepSizeConfig of type Auto");
    }

    @Override // defpackage.set
    public final boolean o(Object obj) {
        return this.a.b(obj) != null;
    }

    protected seu(seu seuVar) {
        this.a = new seq();
        this.b = new sek(0, 1);
        this.c = 1.0f;
        this.d = ser.b();
        this.e = true;
        seq seqVar = seuVar.a;
        seq seqVar2 = new seq();
        seqVar2.a.putAll(seqVar.a);
        seqVar2.b.addAll(seqVar.b);
        this.a = seqVar2;
        this.b = seuVar.b.a();
        this.c = seuVar.c;
        this.d = seuVar.d;
    }
}
