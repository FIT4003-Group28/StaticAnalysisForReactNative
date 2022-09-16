package defpackage;

import com.google.protos.youtube.api.innertube.RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abad  reason: default package */
/* loaded from: classes.dex */
public final class abad implements aafl {
    public static final /* synthetic */ int b = 0;
    public final azqb a;
    private final abab c;
    private final Executor d;

    public abad(abab ababVar, azqb azqbVar, Executor executor) {
        this.c = ababVar;
        this.a = azqbVar;
        this.d = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        final Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (I == null) {
            zep.l("recordNotificationServiceEndpointCommand did not have proper tag.");
        }
        abab ababVar = this.c;
        abae abaeVar = new abae(ababVar.e, ababVar.a.c());
        abaeVar.a = ((RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint) apzgVar.qm(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint)).b.I();
        abaeVar.j(apzgVar.c);
        ylx.k(ababVar.c.b(abaeVar, this.d), this.d, ngc.r, new ylw() { // from class: abac
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                azqb azqbVar;
                abad abadVar = abad.this;
                Object obj2 = I;
                aryj aryjVar = (aryj) obj;
                if (aryjVar.c && aryjVar.d.size() > 0 && (azqbVar = abadVar.a) != null) {
                    ((aafo) azqbVar.get()).e(aryjVar.d, obj2);
                }
            }
        });
        azqb azqbVar = this.a;
        if (azqbVar != null) {
            ((aafo) azqbVar.get()).e(((RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint) apzgVar.qm(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint)).c, I);
        }
    }
}
