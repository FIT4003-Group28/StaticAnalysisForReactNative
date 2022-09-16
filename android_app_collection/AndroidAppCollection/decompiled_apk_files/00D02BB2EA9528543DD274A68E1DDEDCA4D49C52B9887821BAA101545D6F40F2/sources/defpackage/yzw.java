package defpackage;
/* compiled from: PG */
/* renamed from: yzw  reason: default package */
/* loaded from: classes7.dex */
public final class yzw {
    @dzsi
    public cqtd a;
    @dzsi
    public cqtd b;
    private final vtk c;
    private final vtk d;
    private final vtk e;

    private yzw(String str, String str2, vtn vtnVar, vtk vtkVar) {
        yzu yzuVar = new yzu(this);
        this.d = yzuVar;
        yzv yzvVar = new yzv(this);
        this.e = yzvVar;
        this.c = vtkVar;
        this.a = vtnVar.f(str, bvlw.a, yzuVar);
        this.b = vtnVar.f(str2, bvlw.a, yzvVar);
    }

    @dzsi
    public static cqtd a(@dzsi String str, @dzsi String str2, vtn vtnVar, vtk vtkVar) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            return vtnVar.f(str, bvlw.a, vtkVar);
        }
        return new yzw(str, str2, vtnVar, vtkVar).c();
    }

    @dzsi
    private final cqtd c() {
        cqtd cqtdVar = this.a;
        if (cqtdVar == null) {
            return null;
        }
        cqtd cqtdVar2 = this.b;
        return cqtdVar2 == null ? cqtdVar : iva.e(cqtdVar, cqtdVar2);
    }

    public final void b() {
        cqtd c = c();
        if (c != null) {
            this.c.a(c);
        }
    }
}
