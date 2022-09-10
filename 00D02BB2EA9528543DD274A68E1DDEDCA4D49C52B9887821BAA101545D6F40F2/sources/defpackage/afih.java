package defpackage;

import android.app.Application;
import android.content.Intent;
import java.util.List;
/* compiled from: PG */
/* renamed from: afih  reason: default package */
/* loaded from: classes.dex */
public final class afih implements afip {
    private final List<afip> a;

    public afih(Application application, btvo btvoVar) {
        dccx F = dcdc.F();
        F.h(new afil(application.getResources()), new afin(), new afiq(), new afit(), new afiw(), new afii(application));
        this.a = F.f();
    }

    @Override // defpackage.afip
    public final boolean a(Intent intent) {
        if (intent.getData() == null) {
            return false;
        }
        for (afip afipVar : this.a) {
            if (afipVar.a(intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.afip
    public final afia b(Intent intent, @dzsi String str) {
        if (intent != null && intent.getData() != null) {
            for (afip afipVar : this.a) {
                if (afipVar.a(intent)) {
                    return afipVar.b(intent, str);
                }
            }
        }
        return null;
    }
}
