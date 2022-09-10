package defpackage;

import com.google.ar.sceneform.rendering.Material;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dbhe  reason: default package */
/* loaded from: classes5.dex */
public abstract class dbhe {
    public final dbex c;
    public final ArrayList<Material> d = new ArrayList<>();
    public final ArrayList<String> e = new ArrayList<>();
    public int f;
    public boolean g;
    public boolean h;
    public dbdr i;
    public final dbiy j;

    static {
        TimeUnit.DAYS.toSeconds(14L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dbhe(dbhd<? extends dbhe, ? extends dbhd<?, ?>> dbhdVar) {
        new ArrayList();
        this.f = 4;
        this.g = true;
        this.h = true;
        this.j = new dbiy();
        this.c = new dbho();
        dbhi dbhiVar = dbhdVar.e;
        if (dbhiVar != null) {
            k(dbhiVar);
        }
    }

    public abstract dbhe d();

    public final Material e() {
        return f(0);
    }

    public final Material f(int i) {
        if (i >= this.d.size()) {
            int i2 = i();
            StringBuilder sb = new StringBuilder(96);
            sb.append("submeshIndex (");
            sb.append(i);
            sb.append(") is out of range. It must be less than the submeshCount (");
            sb.append(i2);
            sb.append(").");
            throw new IllegalArgumentException(sb.toString());
        }
        return this.d.get(i);
    }

    public final void g(boolean z) {
        this.g = z;
        this.j.c();
    }

    public final void h(boolean z) {
        this.h = z;
        this.j.c();
    }

    public final int i() {
        return ((dbho) this.c).j.size();
    }

    public final dbhl j(dbdx dbdxVar) {
        return new dbhl(dbdxVar, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.dbhi r26) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbhe.k(dbhi):void");
    }

    public void l() {
    }

    public void m(dbhq dbhqVar) {
    }

    public void n() {
    }

    public dbdz o(dbdz dbdzVar) {
        dbjb.d(dbdzVar, "Parameter \"originalMatrix\" was null.");
        return dbdzVar;
    }

    public final void p() {
        this.i = null;
        this.j.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dbhe(dbhe dbheVar) {
        new ArrayList();
        this.f = 4;
        boolean z = true;
        this.g = true;
        this.h = true;
        this.j = new dbiy();
        if (!dbheVar.j.a()) {
            this.c = dbheVar.c;
            dbjb.a(dbheVar.e.size() != dbheVar.d.size() ? false : z);
            for (int i = 0; i < dbheVar.d.size(); i++) {
                this.d.add(dbheVar.d.get(i).a());
                this.e.add(dbheVar.e.get(i));
            }
            this.f = dbheVar.f;
            this.g = dbheVar.g;
            this.h = dbheVar.h;
            dbdr dbdrVar = dbheVar.i;
            if (dbdrVar != null) {
                this.i = dbdrVar.i();
            }
            this.j.c();
            return;
        }
        throw new AssertionError("Cannot copy uninitialized Renderable.");
    }
}
