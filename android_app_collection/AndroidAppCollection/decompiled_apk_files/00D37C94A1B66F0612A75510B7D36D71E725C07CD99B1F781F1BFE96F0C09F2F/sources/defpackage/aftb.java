package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aftb  reason: default package */
/* loaded from: classes.dex */
public final class aftb implements afsv {
    private static final int a = (int) TimeUnit.DAYS.toHours(30);
    private static final amuk b = amuk.q();
    private final atxf c;
    private afsw d;
    private afsw e;

    public aftb(yme ymeVar) {
        atfw atfwVar = ymeVar.a().k;
        atxf atxfVar = (atfwVar == null ? atfw.a : atfwVar).i;
        this.c = atxfVar == null ? atxf.a : atxfVar;
    }

    @Override // defpackage.afsv
    public final int a() {
        atxf atxfVar = this.c;
        if ((atxfVar.b & 2) != 0) {
            return atxfVar.d;
        }
        return 100;
    }

    @Override // defpackage.afsv
    public final int b() {
        atxf atxfVar = this.c;
        return (atxfVar.b & 32) != 0 ? atxfVar.f : a;
    }

    @Override // defpackage.afsv
    public final int c() {
        atxf atxfVar = this.c;
        if ((atxfVar.b & 1) != 0) {
            return atxfVar.c;
        }
        return 1000;
    }

    @Override // defpackage.afsv
    public final int d() {
        atxf atxfVar = this.c;
        if ((atxfVar.b & 16) != 0) {
            return atxfVar.e;
        }
        return 60;
    }

    @Override // defpackage.afsv
    public final boolean g() {
        atxf atxfVar = this.c;
        if ((atxfVar.b & 512) != 0) {
            return atxfVar.g;
        }
        return true;
    }

    @Override // defpackage.afsv
    public final boolean h() {
        return this.c.h;
    }

    @Override // defpackage.afsv
    public final boolean i() {
        atxf atxfVar = this.c;
        if ((atxfVar.b & 131072) != 0) {
            return atxfVar.k;
        }
        return false;
    }

    @Override // defpackage.afsv
    public final afsw e() {
        aftc aftcVar;
        if (this.e == null) {
            atxf atxfVar = this.c;
            if ((atxfVar.b & 4096) == 0) {
                aftcVar = new aftc(a, b);
            } else {
                atxg atxgVar = atxfVar.j;
                if (atxgVar == null) {
                    atxgVar = atxg.a;
                }
                aftcVar = new aftc(atxgVar);
            }
            this.e = aftcVar;
        }
        return this.e;
    }

    @Override // defpackage.afsv
    public final afsw f() {
        aftc aftcVar;
        if (this.d == null) {
            atxf atxfVar = this.c;
            if ((atxfVar.b & 2048) == 0) {
                aftcVar = new aftc(a, b);
            } else {
                atxg atxgVar = atxfVar.i;
                if (atxgVar == null) {
                    atxgVar = atxg.a;
                }
                aftcVar = new aftc(atxgVar);
            }
            this.d = aftcVar;
        }
        return this.d;
    }
}
