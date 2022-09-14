package defpackage;

import com.google.android.apps.gmm.location.events.CarHeadingEvent;
import com.google.android.apps.gmm.location.navigation.InertialsMonitorJni;
/* compiled from: PG */
/* renamed from: ahod  reason: default package */
/* loaded from: classes2.dex */
public final class ahod {
    private static final dcqe h = dcqe.c("ahod");
    public final cqat a;
    public final btrm b;
    public final ckcw c;
    public final ahpt d;
    public final InertialsMonitorJni e = new InertialsMonitorJni();
    public float f;
    public long g;

    public ahod(cqat cqatVar, btrm btrmVar, ckcw ckcwVar, ahpt ahptVar) {
        this.a = cqatVar;
        this.b = btrmVar;
        this.c = ckcwVar;
        this.d = ahptVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CarHeadingEvent b(byte[] bArr, ckcw ckcwVar, ahpt ahptVar) {
        if (bArr != null) {
            try {
                dlye dlyeVar = (dlye) dsqw.cr(dlye.m, bArr, dsqa.c());
                if (ckcwVar != null) {
                    ahof.c(ckcwVar, dlyeVar.h);
                }
                if (ahptVar != null) {
                    if ((dlyeVar.a & 64) != 0) {
                        ahptVar.a(new ahqi(dlyeVar.b, dlyeVar.i, dlyeVar.j));
                    }
                    if ((dlyeVar.a & 256) != 0) {
                        ahptVar.a(new ahqk(dlyeVar.b, dlyeVar.k, dlyeVar.l));
                    }
                }
                int i = dlyeVar.a;
                if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0 || (i & 8) == 0 || (i & 16) == 0) {
                    return null;
                }
                ahmm bZ = ahmn.h.bZ();
                long j = dlyeVar.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ahmn ahmnVar = (ahmn) bZ.b;
                int i2 = ahmnVar.a | 1;
                ahmnVar.a = i2;
                ahmnVar.b = j;
                float f = dlyeVar.c;
                int i3 = i2 | 2;
                ahmnVar.a = i3;
                ahmnVar.c = f;
                float f2 = dlyeVar.d;
                int i4 = i3 | 4;
                ahmnVar.a = i4;
                ahmnVar.d = f2;
                float f3 = dlyeVar.e;
                int i5 = i4 | 8;
                ahmnVar.a = i5;
                ahmnVar.e = f3;
                boolean z = dlyeVar.f;
                ahmnVar.a = i5 | 16;
                ahmnVar.f = z;
                if ((dlyeVar.a & 32) != 0) {
                    dlzb dlzbVar = dlyeVar.g;
                    if (dlzbVar == null) {
                        dlzbVar = dlzb.e;
                    }
                    duhh bZ2 = duhi.e.bZ();
                    double d = dlzbVar.a;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    duhi duhiVar = (duhi) bZ2.b;
                    duhiVar.a = d;
                    duhiVar.b = dlzbVar.b;
                    duhiVar.c = dlzbVar.c;
                    duhiVar.d = dlzbVar.d;
                    duhi bK = bZ2.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ahmn ahmnVar2 = (ahmn) bZ.b;
                    bK.getClass();
                    ahmnVar2.g = bK;
                    ahmnVar2.a |= 32;
                }
                return new CarHeadingEvent(bZ.bK(), false);
            } catch (dsrm e) {
                bvoo.h("Failed to parse CarHeadingEventProto %s", e);
            }
        }
        return null;
    }

    public final void a() {
        bvrj.LOCATION_DISPATCHER.c();
        this.e.b();
    }
}
