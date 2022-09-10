package defpackage;
/* compiled from: PG */
/* renamed from: azwe  reason: default package */
/* loaded from: classes.dex */
public final class azwe extends azwd<azva> {
    @Override // defpackage.azwd
    public final dxby a() {
        return dxby.PLACE_ALIASES;
    }

    @Override // defpackage.azwd
    public final boolean b(dxci dxciVar) {
        if ((dxciVar.a & 4) != 0) {
            dxag dxagVar = dxciVar.b;
            if (dxagVar == null) {
                dxagVar = dxag.i;
            }
            int i = dxagVar.a;
            return (i & 4) == 0 && (i & 8) == 0;
        }
        return true;
    }

    @Override // defpackage.azwd
    public final long c(dxci dxciVar) {
        dxag dxagVar = dxciVar.b;
        if (dxagVar == null) {
            dxagVar = dxag.i;
        }
        if ((dxagVar.a & 16) != 0) {
            return dxagVar.f;
        }
        return 0L;
    }

    @Override // defpackage.azwd
    @dzsi
    public final akra d(dxci dxciVar) {
        dwzq dwzqVar;
        dxag dxagVar = dxciVar.b;
        if (dxagVar == null) {
            dxagVar = dxag.i;
        }
        if ((dxagVar.a & 8) != 0) {
            dwzqVar = dxagVar.e;
            if (dwzqVar == null) {
                dwzqVar = dwzq.d;
            }
        } else {
            dwzqVar = null;
        }
        if (dwzqVar != null) {
            return akra.c(dwzqVar.b, dwzqVar.c);
        }
        return null;
    }
}
