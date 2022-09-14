package defpackage;

import android.car.drivingstate.CarUxRestrictions;
import com.google.android.gms.car.CarSensorEvent;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: kfj  reason: default package */
/* loaded from: classes7.dex */
public final class kfj implements kfm, bvqg {
    private cmwr a;
    private final kly b;

    public kfj(kly klyVar) {
        this.b = klyVar;
    }

    @Override // defpackage.bvqg
    public final /* bridge */ /* synthetic */ void NU(Object obj) {
        int activeRestrictions = ((CarUxRestrictions) obj).getActiveRestrictions();
        kly klyVar = this.b;
        boolean z = true;
        boolean z2 = (activeRestrictions & 8) != 0;
        if ((activeRestrictions & 64) == 0) {
            z = false;
        }
        klyVar.b(z2, z);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.kfm
    public final int a() {
        return 11;
    }

    @Override // defpackage.kfm
    @dzsi
    public final /* bridge */ /* synthetic */ Object b(CarSensorEvent carSensorEvent) {
        cmwr cmwrVar = this.a;
        carSensorEvent.a(11);
        if (cmwrVar == null) {
            cmwrVar = new cmwr();
        }
        boolean z = false;
        cmwrVar.a = carSensorEvent.e[0];
        this.a = cmwrVar;
        byte b = cmwrVar.a;
        if (b == -1) {
            this.b.b(false, false);
            return null;
        }
        kly klyVar = this.b;
        boolean z2 = (b & 2) != 0;
        if ((b & 8) != 0) {
            z = true;
        }
        klyVar.b(z2, z);
        return null;
    }

    @Override // defpackage.kfm
    @dzsi
    public final /* bridge */ /* synthetic */ Object d() {
        this.b.b(false, false);
        return null;
    }
}
