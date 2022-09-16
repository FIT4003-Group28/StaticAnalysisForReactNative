package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayvk  reason: default package */
/* loaded from: classes3.dex */
public class ayvk implements ayve {
    private final gga a;
    private final ahjq b;
    private final bvsl c;
    private final baal d;
    private final aywb e;
    private final ayvh f;
    private final aybq g;
    @dzsi
    private bnju h;
    @dzsi
    private ayde i;
    private final ges j;

    public ayvk(gga ggaVar, fd fdVar, ahjq ahjqVar, bvsl bvslVar, aydo aydoVar, aybq aybqVar, aywv aywvVar, baal baalVar, @dzsi ayfb ayfbVar, aywb aywbVar) {
        dqhy c;
        this.a = ggaVar;
        this.j = (ges) fdVar;
        this.b = ahjqVar;
        this.c = bvslVar;
        this.d = baalVar;
        gga a = aywvVar.a.a();
        aywv.a(a, 1);
        cjqy a2 = aywvVar.b.a();
        aywv.a(a2, 2);
        jmx a3 = aywvVar.c.a();
        aywv.a(a3, 3);
        aywv.a(aywbVar, 4);
        aywv.a(baalVar, 5);
        this.f = new aywu(a, a2, a3, aywbVar, baalVar);
        this.g = aybqVar;
        baab baabVar = baab.FAVORITES;
        baaj baajVar = baaj.PLACE;
        int ordinal = baalVar.x().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                String valueOf = String.valueOf(baalVar.x());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Item type not supported: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else if (ayfbVar == null || ayfbVar.b() == null) {
                if (ayfbVar == null) {
                    c = dqhy.OK;
                } else {
                    c = ayfbVar.c();
                }
                this.i = aydoVar.a(baalVar, c, false, true, dtxr.m);
            } else {
                diwb b = ayfbVar.b();
                dbsk.s(b);
                this.i = aydoVar.b(baalVar, b, false, true, dtxr.m);
            }
        } else if (ayfbVar != null) {
            this.h = ayfbVar.a();
        }
        this.e = aywbVar;
    }

    private final String t() {
        if (this.d.z() != null) {
            baak z = this.d.z();
            dbsk.s(z);
            if (akqi.d(z.a())) {
                return this.d.y(this.a.getApplicationContext());
            }
        }
        return this.a.getString(R.string.DROPPED_PIN);
    }

    private static int u(int i) {
        return i + 1;
    }

    @Override // defpackage.ayve
    public ayvh a() {
        return this.f;
    }

    @Override // defpackage.ayve
    public String b() {
        if (!this.e.D().booleanValue() || this.d.o() < 0) {
            return t();
        }
        return this.a.getString(R.string.NUMBERED_PLACE_TITLE, new Object[]{Integer.valueOf(u(this.d.o())), alp.a().b(t())});
    }

    @Override // defpackage.ayve
    public String c() {
        if (this.d.z() != null) {
            baak z = this.d.z();
            dbsk.s(z);
            if (akqi.d(z.a())) {
                return "";
            }
        }
        baak z2 = this.d.z();
        dbsk.s(z2);
        return z2.b().b();
    }

    @Override // defpackage.ayve
    public String d() {
        if (this.d.z() != null) {
            GmmLocation a = this.b.a();
            baak z = this.d.z();
            dbsk.s(z);
            return batx.b(batx.a(a, z.b()), this.c);
        }
        return "";
    }

    @Override // defpackage.ayve
    public cqkl e() {
        this.e.S(this);
        return cqkl.a;
    }

    @Override // defpackage.ayve
    public cjtd f() {
        ddho ddhoVar;
        if (axzh.a(this.d)) {
            ddhoVar = dtxo.N;
        } else {
            baad baadVar = this.e.i;
            dbsk.s(baadVar);
            baab o = baadVar.o();
            baab baabVar = baab.FAVORITES;
            baaj baajVar = baaj.PLACE;
            int ordinal = o.ordinal();
            if (ordinal == 0) {
                ddhoVar = dtxo.M;
            } else if (ordinal == 1) {
                ddhoVar = dtxo.P;
            } else if (ordinal != 5) {
                String valueOf = String.valueOf(o);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Unsupported list type ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else {
                ddhoVar = dtxo.L;
            }
        }
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.ayve
    public String g() {
        String b = b();
        if (this.a.getString(R.string.DROPPED_PIN).equals(b)) {
            String c = c();
            if (!c.isEmpty()) {
                return this.a.getString(R.string.ACCESSIBILITY_REMOVE_DESCRIPTION, new Object[]{c});
            }
        }
        return this.a.getString(R.string.ACCESSIBILITY_REMOVE_DESCRIPTION, new Object[]{b});
    }

    @Override // defpackage.ayve
    public String h() {
        return this.a.getString(R.string.CHOSEN_PHOTO_CONTENT_DESCRIPTION, new Object[]{b()});
    }

    @Override // defpackage.ayve
    @dzsi
    public ayde j() {
        return this.i;
    }

    @Override // defpackage.ayve
    public Boolean k() {
        ayde aydeVar = this.i;
        boolean z = false;
        if (aydeVar != null && aydeVar.e() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayve
    @dzsi
    public bfkm l() {
        bnju i = i();
        if (i != null) {
            bfkm ah = i.ah();
            ah.Pq(false);
            return ah;
        }
        return null;
    }

    @Override // defpackage.ayve
    public Boolean m() {
        bfkm l = l();
        boolean z = true;
        if (l == null || l.s().size() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r0.c() == false) goto L18;
     */
    @Override // defpackage.ayve
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean n() {
        /*
            r3 = this;
            baab r0 = defpackage.baab.FAVORITES
            baaj r0 = defpackage.baaj.PLACE
            baal r0 = r3.d
            baaj r0 = r0.x()
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            if (r0 == r1) goto L19
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L19:
            ayde r0 = r3.i
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L24:
            bnju r0 = r3.h
            if (r0 == 0) goto L40
            baal r0 = r3.d
            baak r0 = r0.z()
            if (r0 == 0) goto L40
            baal r0 = r3.d
            baak r0 = r0.z()
            defpackage.dbsk.s(r0)
            boolean r0 = r0.c()
            if (r0 != 0) goto L40
            goto L41
        L40:
            r1 = 0
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayvk.n():java.lang.Boolean");
    }

    @Override // defpackage.ayve
    public Boolean o() {
        return this.e.D();
    }

    @Override // defpackage.ayve
    @dzsi
    public izx p() {
        return this.g.a(this.d, this.h).a(this.j);
    }

    @Override // defpackage.ayve
    public CharSequence q() {
        return this.a.getString(R.string.ACCESSIBILITY_CUSTOM_ORDERING_ITEM_DRAGGER, new Object[]{t()});
    }

    public baal r() {
        return this.d;
    }

    @Override // defpackage.ayve
    @dzsi
    /* renamed from: s */
    public bnju i() {
        bnju bnjuVar = this.h;
        if (bnjuVar != null) {
            bnjs aK = bnjuVar.aK();
            begh beghVar = new begh();
            beghVar.c = true;
            if (this.e.D().booleanValue()) {
                beghVar.f = u(this.d.o());
            }
            if (this.d.j() != null) {
                dwfl j = this.d.j();
                dbsk.s(j);
                aK.p = j;
                beghVar.c = false;
            }
            aK.o = beghVar;
            aK.a = null;
            return aK.a();
        }
        return null;
    }
}
