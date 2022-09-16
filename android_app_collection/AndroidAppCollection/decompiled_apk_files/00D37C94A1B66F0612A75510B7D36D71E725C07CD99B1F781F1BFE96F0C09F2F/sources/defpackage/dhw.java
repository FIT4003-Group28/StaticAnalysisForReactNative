package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: dhw  reason: default package */
/* loaded from: classes3.dex */
public final class dhw extends daq {
    private final WeakReference d;

    public dhw(dhv dhvVar) {
        super(null);
        this.d = new WeakReference(dhvVar);
    }

    @Override // defpackage.daq
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dhi dhiVar = (dhi) obj;
        dhv dhvVar = (dhv) this.d.get();
        if (dhvVar == null) {
            return;
        }
        dhh dhhVar = dhiVar.b;
        if (dhvVar.e != null) {
            boolean z = dhiVar.a;
            dhh dhhVar2 = dhh.INITIAL_LOAD;
            int ordinal = dhhVar.ordinal();
            if (ordinal == 1) {
                dhvVar.e.a(z ? dik.LOADING : dik.LOADED);
            } else if (ordinal == 2) {
                dgz dgzVar = dhvVar.e;
                dgzVar.a(z ? dik.EMPTY : dik.LOADED);
                dgzVar.a.b();
            } else if (ordinal == 3) {
                dgz dgzVar2 = dhvVar.e;
                dgzVar2.a(z ? dik.ERROR : dik.LOADED);
                dgzVar2.a.b();
            }
        }
        if (czu.y()) {
            dhvVar.g(dhhVar);
        } else {
            ((dbx) dhvVar.b).post(new dhm(dhvVar, dhhVar));
        }
    }
}
