package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: ainj  reason: default package */
/* loaded from: classes.dex */
public final class ainj implements ayqe {
    private final aapv a;
    private final afvn b;
    private final aaoq c;

    public ainj(aapv aapvVar, afvn afvnVar, aaoq aaoqVar) {
        this.a = aapvVar;
        this.b = afvnVar;
        this.c = aaoqVar;
    }

    @Override // defpackage.ayqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        asgt asgtVar;
        asdd asddVar = (asdd) obj;
        int i = asddVar.d;
        if (i != 5) {
            if (i == 3) {
                asgtVar = (asgt) asddVar.e;
            } else {
                asgtVar = asgt.a;
            }
            if ((asgtVar.b & 33554432) != 0) {
                aapv aapvVar = this.a;
                afvm c = this.b.c();
                arbf arbfVar = asgtVar.x;
                if (arbfVar == null) {
                    arbfVar = arbf.a;
                }
                arpa arpaVar = asgtVar.c;
                if (arpaVar == null) {
                    arpaVar = arpa.a;
                }
                aapvVar.a(c, arbfVar, arpaVar);
            }
            this.c.a(asgtVar);
            return new WatchNextResponseModel(asgtVar);
        }
        throw new ExecutionException((String) asddVar.e, null);
    }
}
