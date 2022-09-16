package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aatk  reason: default package */
/* loaded from: classes.dex */
public final class aatk implements aatn {
    private final aprq a;
    private List b;

    public aatk(aprq aprqVar) {
        aprqVar.getClass();
        this.a = aprqVar;
    }

    @Override // defpackage.aatn
    public final CharSequence a() {
        arag aragVar;
        aprq aprqVar = this.a;
        if ((aprqVar.b & 32) != 0) {
            aragVar = aprqVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.aatn
    public final CharSequence b() {
        arag aragVar;
        aprq aprqVar = this.a;
        if ((aprqVar.b & 2) != 0) {
            aragVar = aprqVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.aatn
    public final String c() {
        return this.a.g;
    }

    @Override // defpackage.aatn
    public final String d() {
        return this.a.d;
    }

    @Override // defpackage.aatn
    public final List e(aafo aafoVar) {
        if (this.b == null) {
            this.b = new ArrayList();
            for (arag aragVar : this.a.i) {
                this.b.add(aafv.a(aragVar, aafoVar, false));
            }
        }
        return this.b;
    }

    @Override // defpackage.aatn
    public final boolean f() {
        return this.a.h;
    }

    @Override // defpackage.aatn
    public final boolean g() {
        return this.a.e;
    }

    @Override // defpackage.aatn
    public final CharSequence h(int i) {
        arag aragVar;
        if (i - 1 != 0) {
            return "";
        }
        aprq aprqVar = this.a;
        if ((aprqVar.b & 512) != 0) {
            aragVar = aprqVar.j;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }
}
