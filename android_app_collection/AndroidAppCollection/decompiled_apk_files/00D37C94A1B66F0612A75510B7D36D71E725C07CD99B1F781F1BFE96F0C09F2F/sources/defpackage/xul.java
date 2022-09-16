package defpackage;

import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: xul  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xul implements ayqb {
    public final /* synthetic */ xuz a;
    private final /* synthetic */ int b;

    public /* synthetic */ xul(xuz xuzVar) {
        this.a = xuzVar;
    }

    public /* synthetic */ xul(xuz xuzVar, int i) {
        this.b = i;
        this.a = xuzVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            xuz xuzVar = this.a;
            boolean booleanValue = ((aovf) obj).getShouldRequireViewerAck().booleanValue();
            xuzVar.bi = booleanValue;
            if (booleanValue) {
                return;
            }
            ylx.n(xuzVar, xuzVar.bk.b(new xuk(xuzVar), anjk.a), mbi.p, mbi.r);
        } else if (i == 1) {
            xuz xuzVar2 = this.a;
            avir avirVar = (avir) ((aajp) obj).c;
            if (avirVar != null) {
                xuzVar2.aT.setEnabled(false);
                TextView textView = xuzVar2.aU;
                Resources rh = xuzVar2.rh();
                bakk bakkVar = xuzVar2.aZ;
                long millis = TimeUnit.SECONDS.toMillis(avirVar.getTimestamp().c);
                StringBuffer stringBuffer = new StringBuffer(bakkVar.e().b());
                bakkVar.f(stringBuffer, millis, null);
                textView.setText(rh.getString(R.string.scheduled_time_local_format, stringBuffer.toString()));
                xuzVar2.aV = avirVar.getTimestamp();
                xuzVar2.aS.setVisibility(0);
                arag aragVar = xuzVar2.aX;
                if (aragVar == null) {
                    aragVar = xuzVar2.aW;
                }
                xuzVar2.aN(aragVar);
            } else {
                xuzVar2.aT.setEnabled(true);
                xuzVar2.aV = null;
                xuzVar2.aS.setVisibility(8);
                xuzVar2.aN(xuzVar2.aW);
            }
            xuzVar2.aL();
        } else {
            this.a.aQ(((aufm) obj).getPostCreationData());
        }
    }
}
