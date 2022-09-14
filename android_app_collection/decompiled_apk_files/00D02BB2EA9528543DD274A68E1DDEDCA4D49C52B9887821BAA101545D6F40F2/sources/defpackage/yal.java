package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: yal  reason: default package */
/* loaded from: classes7.dex */
public class yal implements xyy {
    public boolean a;
    private final List<xyx> b;
    private final cjta c;
    private final boolean d;
    @dzsi
    private xyz e;

    private yal(List<xyx> list, cjta cjtaVar, boolean z, boolean z2) {
        this.b = list;
        this.c = cjtaVar;
        this.d = z;
        this.a = z2;
        for (xyx xyxVar : list) {
            xyxVar.f(this);
        }
    }

    public static yal f(List<xyx> list, cjta cjtaVar, boolean z, boolean z2) {
        return new yal(list, cjtaVar, z, z2);
    }

    @Override // defpackage.xyy
    public List<xyx> a() {
        return this.b;
    }

    @Override // defpackage.xyy
    public Boolean b() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.xyy
    public void c() {
        xyz xyzVar = this.e;
        if (xyzVar != null) {
            xyzVar.d(true);
        }
    }

    @Override // defpackage.xyy
    public cjtd d() {
        return this.c.b(dtxn.ax);
    }

    @Override // defpackage.xyy
    public boolean e() {
        return this.d;
    }

    public void g(@dzsi xyz xyzVar) {
        this.e = xyzVar;
    }
}
