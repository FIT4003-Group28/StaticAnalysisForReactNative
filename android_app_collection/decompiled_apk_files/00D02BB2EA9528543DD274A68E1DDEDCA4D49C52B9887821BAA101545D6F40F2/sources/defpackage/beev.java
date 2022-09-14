package defpackage;
/* compiled from: PG */
/* renamed from: beev  reason: default package */
/* loaded from: classes3.dex */
public class beev implements bees {
    @dzsi
    private beey a;
    @dzsi
    private bkeq b;
    private final bego c;
    @dzsi
    private Float d;
    private boolean e;

    public beev(bego begoVar, int i) {
        this.c = begoVar;
        dbsk.a(true);
    }

    @Override // defpackage.bees
    public Boolean a() {
        boolean z = true;
        if (!this.c.e() || (!i().booleanValue() && !j().booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bees
    @dzsi
    public beer b() {
        if (!this.c.e()) {
            return null;
        }
        if (i().booleanValue()) {
            return this.b;
        }
        if (j().booleanValue()) {
            return this.a;
        }
        bkeq bkeqVar = this.b;
        if (bkeqVar == null || !bkeqVar.w().booleanValue()) {
            beey beeyVar = this.a;
            if (beeyVar != null && beeyVar.w().booleanValue()) {
                return this.a;
            }
            return null;
        }
        return this.b;
    }

    @Override // defpackage.bees
    public Integer c() {
        if (!this.c.e()) {
            return 0;
        }
        int i = this.c.f().b;
        if (i > 0 && i < 600) {
            return Integer.valueOf(i);
        }
        return 350;
    }

    @Override // defpackage.bees
    public Long d() {
        if (!this.c.e()) {
            return 0L;
        }
        long j = this.c.f().c;
        if (j > 0 && j < 150) {
            return Long.valueOf(j + 500);
        }
        return 550L;
    }

    @Override // defpackage.bees
    @dzsi
    public Float e() {
        if (this.e) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.bees
    public void f() {
        this.e = true;
        this.d = Float.valueOf(-1.0f);
    }

    @Override // defpackage.bees
    public Boolean g() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.bees
    public Boolean h() {
        return Boolean.valueOf(this.c.f().d);
    }

    public Boolean i() {
        bkeq bkeqVar = this.b;
        boolean z = false;
        if (bkeqVar != null && bkeqVar.v().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean j() {
        beey beeyVar = this.a;
        boolean z = false;
        if (beeyVar != null && beeyVar.v().booleanValue() && !i().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void k(@dzsi beey beeyVar, @dzsi bkeq bkeqVar) {
        this.e = false;
        this.a = beeyVar;
        this.b = bkeqVar;
    }

    public void l(@dzsi Float f) {
        this.d = f;
    }
}
