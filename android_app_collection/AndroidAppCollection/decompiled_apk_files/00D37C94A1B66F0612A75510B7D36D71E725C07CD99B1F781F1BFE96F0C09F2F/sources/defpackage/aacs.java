package defpackage;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protos.youtube.api.innertube.LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aacs  reason: default package */
/* loaded from: classes.dex */
public final class aacs implements aafl {
    private final aacr a;

    public aacs(aacr aacrVar) {
        this.a = aacrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand logFirebaseEventCommandOuterClass$LogFirebaseEventCommand = (LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand) apzgVar.qm(LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.logFirebaseEventCommand);
        aacr aacrVar = this.a;
        String str = logFirebaseEventCommandOuterClass$LogFirebaseEventCommand.b;
        aopu<asmc> aopuVar = logFirebaseEventCommandOuterClass$LogFirebaseEventCommand.c;
        Bundle bundle = new Bundle();
        for (asmc asmcVar : aopuVar) {
            if ((asmcVar.b & 1) != 0) {
                int i = asmcVar.c;
                if (i == 2) {
                    bundle.putString(asmcVar.e, (String) asmcVar.d);
                } else if (i == 4) {
                    bundle.putInt(asmcVar.e, ((Integer) asmcVar.d).intValue());
                } else if (i == 6) {
                    bundle.putDouble(asmcVar.e, ((Double) asmcVar.d).doubleValue());
                } else if (i == 5) {
                    bundle.putBoolean(asmcVar.e, ((Boolean) asmcVar.d).booleanValue());
                }
            }
        }
        if (!aacrVar.b || !aacrVar.c) {
            return;
        }
        ((FirebaseAnalytics) aacrVar.a.get()).a.e(null, str, bundle, false);
    }
}
