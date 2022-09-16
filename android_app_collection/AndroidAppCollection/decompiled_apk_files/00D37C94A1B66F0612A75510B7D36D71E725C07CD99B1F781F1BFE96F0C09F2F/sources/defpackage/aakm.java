package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aakm  reason: default package */
/* loaded from: classes.dex */
public final class aakm implements aafl {
    private final Activity a;
    private final Map b;
    private final eyj c;

    public aakm(Activity activity, eyj eyjVar, Map map) {
        this.a = activity;
        this.c = eyjVar;
        this.b = map;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        String b;
        if (apzgVar == null || !apzgVar.qn(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint)) {
            if (!this.b.containsKey(this.a.getClass())) {
                zep.b("ApplicationHelpEndpoint resolved with no help context.");
                return;
            }
            b = ((oir) ((azqb) this.b.get(this.a.getClass())).get()).b();
        } else {
            b = ((aphv) apzgVar.qm(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint)).c;
        }
        this.c.a(this.a, b);
    }
}
