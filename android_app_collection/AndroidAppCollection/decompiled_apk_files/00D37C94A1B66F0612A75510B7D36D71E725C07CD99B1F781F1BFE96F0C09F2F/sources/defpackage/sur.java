package defpackage;

import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentObserver;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.youtube.android.libraries.elements.StatusOr;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: sur  reason: default package */
/* loaded from: classes4.dex */
final class sur extends ComponentObserver {
    final /* synthetic */ tda a;
    final /* synthetic */ tff b;
    final /* synthetic */ ByteBuffer c;
    final /* synthetic */ Component d;
    final /* synthetic */ tbq e;
    final /* synthetic */ sus f;
    final /* synthetic */ azeh g;

    public sur(sus susVar, tda tdaVar, tff tffVar, ByteBuffer byteBuffer, Component component, tbq tbqVar, azeh azehVar) {
        this.f = susVar;
        this.a = tdaVar;
        this.b = tffVar;
        this.c = byteBuffer;
        this.d = component;
        this.e = tbqVar;
        this.g = azehVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.ComponentObserver
    public final void componentDidUpdate(Component component) {
        aodt aodtVar;
        awqm k;
        awrg f = ((tdc) this.f.m.get()).b() ? tbs.f(this.a) : null;
        try {
            sus susVar = this.f;
            tff tffVar = this.b;
            ByteBuffer byteBuffer = this.c;
            tffVar.j();
            if (f != null) {
                awrm a = awrn.a();
                a.copyOnWrite();
                ((awrn) a.instance).e(f);
                String c = sus.c(byteBuffer);
                a.copyOnWrite();
                ((awrn) a.instance).f(c);
                awro a2 = awrp.a();
                aorw e = tbs.e();
                a2.copyOnWrite();
                ((awrp) a2.instance).p(e);
                a2.copyOnWrite();
                ((awrp) a2.instance).o((awrn) a.mo39build());
                ((DebuggerClient) susVar.l.get()).sendTimelineEvent(((awrp) a2.mo39build()).toByteArray());
            }
            StatusOr materialize = this.d.materialize(true);
            byte[] bArr = (byte[]) materialize.value;
            if (bArr == null) {
                String valueOf = String.valueOf(materialize.status);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb.append("Error materializing SharedComponentType: ");
                sb.append(valueOf);
                throw new ted(sb.toString(), materialize.status.asException());
            }
            aodtVar = aodt.au(ByteBuffer.wrap(bArr));
            try {
                sus susVar2 = this.f;
                Component component2 = this.d;
                tbq tbqVar = this.e;
                if (((tdc) susVar2.m.get()).a() && tbqVar != null && (k = tbs.k(aodtVar, tet.b(component2.latestModel()), component2.latestEntitiesConfig(), tbqVar.c)) != null) {
                    tbqVar.a(k);
                }
                this.g.a(swr.a(aodtVar, this.e));
                this.f.d(this.b, f, this.d, aodtVar, this.a);
            } catch (Throwable th) {
                th = th;
                this.f.d(this.b, f, this.d, aodtVar, this.a);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            aodtVar = null;
        }
    }
}
