package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: sed  reason: default package */
/* loaded from: classes7.dex */
public class sed implements sam, sao {
    public final List<sap> a = new ArrayList();
    @dzsi
    private sao b;
    private boolean c;

    private final void i(sap sapVar) {
        sapVar.i(this);
        j();
    }

    @Override // defpackage.sam
    public List<sap> a() {
        return this.a;
    }

    public Boolean b() {
        if (this.c || this.a.isEmpty()) {
            return false;
        }
        for (sap sapVar : this.a) {
            if (!sapVar.h().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public void c(@dzsi sao saoVar) {
        this.b = saoVar;
    }

    public void d(sap sapVar) {
        this.a.add(sapVar);
        sapVar.q(this.a.size() - 1);
        i(sapVar);
    }

    public void e(int i, sap sapVar) {
        this.a.add(i, sapVar);
        i(sapVar);
        h();
    }

    public void f() {
        if (this.c) {
            return;
        }
        this.c = true;
        j();
    }

    public void g() {
        if (!this.c) {
            return;
        }
        this.c = false;
        j();
    }

    public final void h() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).q(i);
        }
    }

    @Override // defpackage.sao
    public void j() {
        sao saoVar = this.b;
        if (saoVar != null) {
            saoVar.j();
        }
    }
}
